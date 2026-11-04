package org.telegram.messenger;

import android.icu.text.RelativeDateTimeFormatter;
import java.util.Locale;
public abstract class ad {
    public static String a(long j10, Locale locale) {
        boolean z10;
        RelativeDateTimeFormatter.RelativeUnit relativeUnit;
        RelativeDateTimeFormatter relativeDateTimeFormatter = RelativeDateTimeFormatter.getInstance(locale);
        if (j10 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        long max = Math.max(1L, Math.round(Math.abs(j10) / 1000.0d));
        if (max < 60) {
            relativeUnit = RelativeDateTimeFormatter.RelativeUnit.SECONDS;
        } else if (max < 3600) {
            relativeUnit = RelativeDateTimeFormatter.RelativeUnit.MINUTES;
            max = Math.round(max / 60.0d);
        } else if (max < 86400) {
            relativeUnit = RelativeDateTimeFormatter.RelativeUnit.HOURS;
            max = Math.round(max / 3600.0d);
        } else if (max < 2592000) {
            relativeUnit = RelativeDateTimeFormatter.RelativeUnit.DAYS;
            max = Math.round(max / 86400.0d);
        } else if (max < 31536000) {
            relativeUnit = RelativeDateTimeFormatter.RelativeUnit.MONTHS;
            max = Math.round(max / 2592000.0d);
        } else {
            relativeUnit = RelativeDateTimeFormatter.RelativeUnit.YEARS;
            max = Math.round(max / 3.1536E7d);
        }
        return relativeDateTimeFormatter.format(max, z10 ? RelativeDateTimeFormatter.Direction.NEXT : RelativeDateTimeFormatter.Direction.LAST, relativeUnit);
    }
}
