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

    private static double atan2d(double d, double d10) {
        return Math.atan2(d, d10) * 57.29577951308232d;
    }

    public static int[] calculateSunriseSunset(double d, double d10) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        double[] dArr = new double[2];
        sunRiseSetForYear(calendar.get(1), calendar.get(2) + 1, calendar.get(5), d10, d, dArr);
        int offset = (TimeZone.getDefault().getOffset(System.currentTimeMillis()) / 1000) / 60;
        int i10 = ((int) (dArr[0] * 60.0d)) + offset;
        int i11 = ((int) (dArr[1] * 60.0d)) + offset;
        if (i10 < 0) {
            i10 += 1440;
        } else if (i10 > 1440) {
            i10 -= 1440;
        }
        if (i11 < 0 || i11 > 1440) {
            i11 += 1440;
        }
        return new int[]{i10, i11};
    }

    private static double cosd(double d) {
        return Math.cos(d * 0.017453292519943295d);
    }

    private static long days_since_2000_Jan_0(int i10, int i11, int i12) {
        return ((((i10 * 367) - (((((i11 + 9) / 12) + i10) * 7) / 4)) + ((i11 * 275) / 9)) + i12) - 730530;
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

    private static int sunRiseSetForYear(int i10, int i11, int i12, double d, double d10, double[] dArr) {
        return sunRiseSetHelperForYear(i10, i11, i12, d, d10, -0.5833333333333334d, 1, dArr);
    }

    private static int sunRiseSetHelperForYear(int i10, int i11, int i12, double d, double d10, double d11, int i13, double[] dArr) {
        double d12;
        int i14;
        double[] dArr2 = new double[1];
        double[] dArr3 = new double[1];
        double[] dArr4 = new double[1];
        double days_since_2000_Jan_0 = (days_since_2000_Jan_0(i10, i11, i12) + 0.5d) - (d / 360.0d);
        double revolution = revolution(GMST0(days_since_2000_Jan_0) + 180.0d + d);
        sun_RA_decAtDay(days_since_2000_Jan_0, dArr2, dArr3, dArr4);
        double d13 = 12.0d;
        double rev180 = 12.0d - (rev180(revolution - dArr2[0]) / 15.0d);
        double d14 = 0.2666d / dArr4[0];
        if (i13 != 0) {
            d12 = d11 - d14;
        } else {
            d12 = d11;
        }
        double sind = (sind(d12) - (sind(d10) * sind(dArr3[0]))) / (cosd(d10) * cosd(dArr3[0]));
        if (sind >= 1.0d) {
            i14 = -1;
            d13 = 0.0d;
        } else if (sind <= -1.0d) {
            i14 = 1;
        } else {
            d13 = acosd(sind) / 15.0d;
            i14 = 0;
        }
        dArr[0] = rev180 - d13;
        dArr[1] = rev180 + d13;
        return i14;
    }

    private static void sun_RA_decAtDay(double d, double[] dArr, double[] dArr2, double[] dArr3) {
        double[] dArr4 = new double[1];
        sunposAtDay(d, dArr4, dArr3);
        double cosd = dArr3[0] * cosd(dArr4[0]);
        double sind = dArr3[0] * sind(dArr4[0]);
        double d10 = 23.4393d - (d * 3.563E-7d);
        double cosd2 = cosd(d10) * sind;
        double sind2 = sind * sind(d10);
        dArr[0] = atan2d(cosd2, cosd);
        dArr2[0] = atan2d(sind2, Math.sqrt((cosd2 * cosd2) + (cosd * cosd)));
    }

    private static void sunposAtDay(double d, double[] dArr, double[] dArr2) {
        double revolution = revolution((0.9856002585d * d) + 356.047d);
        double d10 = 0.016709d - (d * 1.151E-9d);
        double cosd = (((cosd(revolution) * d10) + 1.0d) * 57.29577951308232d * d10 * sind(revolution)) + revolution;
        double cosd2 = cosd(cosd) - d10;
        double sqrt = Math.sqrt(1.0d - (d10 * d10)) * sind(cosd);
        dArr2[0] = Math.sqrt((sqrt * sqrt) + (cosd2 * cosd2));
        double atan2d = atan2d(sqrt, cosd2) + (4.70935E-5d * d) + 282.9404d;
        dArr[0] = atan2d;
        if (atan2d >= 360.0d) {
            dArr[0] = atan2d - 360.0d;
        }
    }

    private static double tand(double d) {
        return Math.tan(d * 0.017453292519943295d);
    }
}
