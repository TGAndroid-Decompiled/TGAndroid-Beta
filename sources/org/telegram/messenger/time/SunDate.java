package org.telegram.messenger.time;

import java.util.Calendar;
import java.util.TimeZone;

public class SunDate {
    private static final double DEGRAD = 0.017453292519943295d;
    private static final double INV360 = 0.002777777777777778d;
    private static final double RADEG = 57.29577951308232d;

    private static double GMST0(double d) {
        return revolution((d * 0.985647352d) + 818.9874d);
    }

    private static double acosd(double d) {
        return Math.acos(d) * 57.29577951308232d;
    }

    private static double atan2d(double d, double d2) {
        return Math.atan2(d, d2) * 57.29577951308232d;
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

    private static double cosd(double d) {
        return Math.cos(d * 0.017453292519943295d);
    }

    private static long days_since_2000_Jan_0(int i, int i2, int i3) {
        return ((((((long) i) * 367) - ((long) (((((i2 + 9) / 12) + i) * 7) / 4))) + ((long) ((i2 * 275) / 9))) + ((long) i3)) - 730530;
    }

    private static double rev180(double d) {
        return d - (Math.floor((0.002777777777777778d * d) + 0.5d) * 360.0d);
    }

    private static double revolution(double d) {
        return d - (Math.floor(0.002777777777777778d * d) * 360.0d);
    }

    private static double sind(double d) {
        return Math.sin(d * 0.017453292519943295d);
    }

    private static int sunRiseSetForYear(int i, int i2, int i3, double d, double d2, double[] dArr) {
        return sunRiseSetHelperForYear(i, i2, i3, d, d2, -0.5833333333333334d, 1, dArr);
    }

    private static int sunRiseSetHelperForYear(int i, int i2, int i3, double d, double d2, double d3, int i4, double[] dArr) {
        int i5;
        double[] dArr2 = new double[1];
        double[] dArr3 = new double[1];
        double[] dArr4 = new double[1];
        double dDays_since_2000_Jan_0 = (days_since_2000_Jan_0(i, i2, i3) + 0.5d) - (d / 360.0d);
        double dRevolution = revolution(GMST0(dDays_since_2000_Jan_0) + 180.0d + d);
        sun_RA_decAtDay(dDays_since_2000_Jan_0, dArr2, dArr3, dArr4);
        double dAcosd = 12.0d;
        double dRev180 = 12.0d - (rev180(dRevolution - dArr2[0]) / 15.0d);
        double dSind = (sind(i4 != 0 ? d3 - (0.2666d / dArr4[0]) : d3) - (sind(d2) * sind(dArr3[0]))) / (cosd(d2) * cosd(dArr3[0]));
        if (dSind >= 1.0d) {
            i5 = -1;
            dAcosd = 0.0d;
        } else if (dSind <= -1.0d) {
            i5 = 1;
        } else {
            dAcosd = acosd(dSind) / 15.0d;
            i5 = 0;
        }
        dArr[0] = dRev180 - dAcosd;
        dArr[1] = dRev180 + dAcosd;
        return i5;
    }

    private static void sun_RA_decAtDay(double d, double[] dArr, double[] dArr2, double[] dArr3) {
        double[] dArr4 = new double[1];
        sunposAtDay(d, dArr4, dArr3);
        double dCosd = dArr3[0] * cosd(dArr4[0]);
        double dSind = dArr3[0] * sind(dArr4[0]);
        double d2 = 23.4393d - (d * 3.563E-7d);
        double dCosd2 = cosd(d2) * dSind;
        double dSind2 = dSind * sind(d2);
        dArr[0] = atan2d(dCosd2, dCosd);
        dArr2[0] = atan2d(dSind2, Math.sqrt((dCosd2 * dCosd2) + (dCosd * dCosd)));
    }

    private static void sunposAtDay(double d, double[] dArr, double[] dArr2) {
        double dRevolution = revolution((0.9856002585d * d) + 356.047d);
        double d2 = (4.70935E-5d * d) + 282.9404d;
        double d3 = 0.016709d - (d * 1.151E-9d);
        double dCosd = (((cosd(dRevolution) * d3) + 1.0d) * 57.29577951308232d * d3 * sind(dRevolution)) + dRevolution;
        double dCosd2 = cosd(dCosd) - d3;
        double dSqrt = Math.sqrt(1.0d - (d3 * d3)) * sind(dCosd);
        dArr2[0] = Math.sqrt((dSqrt * dSqrt) + (dCosd2 * dCosd2));
        double dAtan2d = atan2d(dSqrt, dCosd2) + d2;
        dArr[0] = dAtan2d;
        if (dAtan2d >= 360.0d) {
            dArr[0] = dAtan2d - 360.0d;
        }
    }

    private static double tand(double d) {
        return Math.tan(d * 0.017453292519943295d);
    }
}
