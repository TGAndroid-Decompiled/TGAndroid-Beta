package org.telegram.messenger.time;

import java.util.Calendar;
import java.util.TimeZone;
public class SunDate {
    private static final double DEGRAD = 0.017453292519943295d;
    private static final double INV360 = 0.002777777777777778d;
    private static final double RADEG = 57.29577951308232d;

    private static long days_since_2000_Jan_0(int i, int i2, int i3) {
        return ((((i * 367) - (((i + ((i2 + 9) / 12)) * 7) / 4)) + ((i2 * 275) / 9)) + i3) - 730530;
    }

    private static double revolution(double d) {
        return d - (Math.floor(INV360 * d) * 360.0d);
    }

    private static double rev180(double d) {
        return d - (Math.floor((INV360 * d) + 0.5d) * 360.0d);
    }

    private static double GMST0(double d) {
        return revolution((d * 0.985647352d) + 818.9874d);
    }

    private static double sind(double d) {
        return Math.sin(d * DEGRAD);
    }

    private static double cosd(double d) {
        return Math.cos(d * DEGRAD);
    }

    private static double tand(double d) {
        return Math.tan(d * DEGRAD);
    }

    private static double acosd(double d) {
        return Math.acos(d) * RADEG;
    }

    private static double atan2d(double d, double d2) {
        return Math.atan2(d, d2) * RADEG;
    }

    private static void sunposAtDay(double d, double[] dArr, double[] dArr2) {
        double revolution = revolution((0.9856002585d * d) + 356.047d);
        double d2 = 0.016709d - (d * 1.151E-9d);
        double sind = (RADEG * d2 * sind(revolution) * ((cosd(revolution) * d2) + 1.0d)) + revolution;
        double cosd = cosd(sind) - d2;
        double sqrt = Math.sqrt(1.0d - (d2 * d2)) * sind(sind);
        dArr2[0] = Math.sqrt((cosd * cosd) + (sqrt * sqrt));
        dArr[0] = atan2d(sqrt, cosd) + (4.70935E-5d * d) + 282.9404d;
        if (dArr[0] >= 360.0d) {
            dArr[0] = dArr[0] - 360.0d;
        }
    }

    private static void sun_RA_decAtDay(double d, double[] dArr, double[] dArr2, double[] dArr3) {
        double[] dArr4 = new double[1];
        sunposAtDay(d, dArr4, dArr3);
        double cosd = dArr3[0] * cosd(dArr4[0]);
        double sind = dArr3[0] * sind(dArr4[0]);
        double d2 = 23.4393d - (d * 3.563E-7d);
        double cosd2 = cosd(d2) * sind;
        double sind2 = sind * sind(d2);
        dArr[0] = atan2d(cosd2, cosd);
        dArr2[0] = atan2d(sind2, Math.sqrt((cosd * cosd) + (cosd2 * cosd2)));
    }

    private static int sunRiseSetHelperForYear(int i, int i2, int i3, double d, double d2, double d3, int i4, double[] dArr) {
        int i5;
        double[] dArr2 = new double[1];
        double[] dArr3 = new double[1];
        double[] dArr4 = new double[1];
        double days_since_2000_Jan_0 = days_since_2000_Jan_0(i, i2, i3);
        Double.isNaN(days_since_2000_Jan_0);
        double d4 = (days_since_2000_Jan_0 + 0.5d) - (d / 360.0d);
        double revolution = revolution(GMST0(d4) + 180.0d + d);
        sun_RA_decAtDay(d4, dArr2, dArr3, dArr4);
        double d5 = 12.0d;
        double rev180 = 12.0d - (rev180(revolution - dArr2[0]) / 15.0d);
        double sind = (sind(i4 != 0 ? d3 - (0.2666d / dArr4[0]) : d3) - (sind(d2) * sind(dArr3[0]))) / (cosd(d2) * cosd(dArr3[0]));
        if (sind >= 1.0d) {
            i5 = -1;
            d5 = 0.0d;
        } else if (sind <= -1.0d) {
            i5 = 1;
        } else {
            d5 = acosd(sind) / 15.0d;
            i5 = 0;
        }
        dArr[0] = rev180 - d5;
        dArr[1] = rev180 + d5;
        return i5;
    }

    private static int sunRiseSetForYear(int i, int i2, int i3, double d, double d2, double[] dArr) {
        return sunRiseSetHelperForYear(i, i2, i3, d, d2, -0.5833333333333334d, 1, dArr);
    }

    public static int[] calculateSunriseSunset(double d, double d2) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        double[] dArr = new double[2];
        sunRiseSetForYear(calendar.get(1), calendar.get(2) + 1, calendar.get(5), d2, d, dArr);
        int offset = (TimeZone.getDefault().getOffset(System.currentTimeMillis()) / 1000) / 60;
        int i = ((int) (dArr[0] * 60.0d)) + offset;
        int i2 = ((int) (dArr[1] * 60.0d)) + offset;
        if (i < 0) {
            i += 1440;
        } else if (i > 1440) {
            i -= 1440;
        }
        if (i2 < 0 || i2 > 1440) {
            i2 += 1440;
        }
        return new int[]{i, i2};
    }
}
