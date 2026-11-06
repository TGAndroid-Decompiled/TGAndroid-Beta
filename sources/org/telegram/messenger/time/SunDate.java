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
        int i7 = ((int) (dArr[0] * 60.0d)) + offset;
        int i10 = ((int) (dArr[1] * 60.0d)) + offset;
        if (i7 < 0) {
            i7 += 1440;
        } else if (i7 > 1440) {
            i7 -= 1440;
        }
        if (i10 < 0 || i10 > 1440) {
            i10 += 1440;
        }
        return new int[]{i7, i10};
    }

    private static double cosd(double d) {
        return Math.cos(d * 0.017453292519943295d);
    }

    private static long days_since_2000_Jan_0(int i7, int i10, int i11) {
        return ((((i7 * 367) - (((((i10 + 9) / 12) + i7) * 7) / 4)) + ((i10 * 275) / 9)) + i11) - 730530;
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

    private static int sunRiseSetForYear(int i7, int i10, int i11, double d, double d2, double[] dArr) {
        return sunRiseSetHelperForYear(i7, i10, i11, d, d2, -0.5833333333333334d, 1, dArr);
    }

    private static int sunRiseSetHelperForYear(int i7, int i10, int i11, double d, double d2, double d10, int i12, double[] dArr) {
        double d11;
        int i13;
        double[] dArr2 = new double[1];
        double[] dArr3 = new double[1];
        double[] dArr4 = new double[1];
        double days_since_2000_Jan_0 = (days_since_2000_Jan_0(i7, i10, i11) + 0.5d) - (d / 360.0d);
        double revolution = revolution(GMST0(days_since_2000_Jan_0) + 180.0d + d);
        sun_RA_decAtDay(days_since_2000_Jan_0, dArr2, dArr3, dArr4);
        double d12 = 12.0d;
        double rev180 = 12.0d - (rev180(revolution - dArr2[0]) / 15.0d);
        double d13 = 0.2666d / dArr4[0];
        if (i12 != 0) {
            d11 = d10 - d13;
        } else {
            d11 = d10;
        }
        double sind = (sind(d11) - (sind(d2) * sind(dArr3[0]))) / (cosd(d2) * cosd(dArr3[0]));
        if (sind >= 1.0d) {
            i13 = -1;
            d12 = 0.0d;
        } else if (sind <= -1.0d) {
            i13 = 1;
        } else {
            d12 = acosd(sind) / 15.0d;
            i13 = 0;
        }
        dArr[0] = rev180 - d12;
        dArr[1] = rev180 + d12;
        return i13;
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
        dArr2[0] = atan2d(sind2, Math.sqrt((cosd2 * cosd2) + (cosd * cosd)));
    }

    private static void sunposAtDay(double d, double[] dArr, double[] dArr2) {
        double revolution = revolution((0.9856002585d * d) + 356.047d);
        double d2 = 0.016709d - (d * 1.151E-9d);
        double cosd = (((cosd(revolution) * d2) + 1.0d) * 57.29577951308232d * d2 * sind(revolution)) + revolution;
        double cosd2 = cosd(cosd) - d2;
        double sqrt = Math.sqrt(1.0d - (d2 * d2)) * sind(cosd);
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
