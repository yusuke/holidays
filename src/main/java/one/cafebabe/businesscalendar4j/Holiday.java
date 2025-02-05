/*
   Copyright 2021 the original author or authors.

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
 */
package one.cafebabe.businesscalendar4j;

import org.jetbrains.annotations.NotNull;

import java.io.Serial;
import java.time.LocalDate;

/**
 * Represents a holiday with a specific date and name.
 * This record is used to store information about public holidays.
 *
 * @param date the date of the holiday
 * @param name the name of the holiday
 */
public record Holiday(@NotNull LocalDate date, @NotNull String name) implements Comparable<Holiday>, java.io.Serializable {
    @Serial
    private static final long serialVersionUID = 3372083406725976821L;

    @Override
    public int compareTo(Holiday o) {
        return this.date.compareTo(o.date);
    }
}
