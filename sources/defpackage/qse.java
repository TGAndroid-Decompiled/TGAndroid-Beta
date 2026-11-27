package defpackage;

import java.math.RoundingMode;
public abstract class qse {
    public static long a(long j, long j2) {
        boolean z;
        long j3 = j + j2;
        boolean z2 = false;
        if ((j ^ j2) < 0) {
            z = true;
        } else {
            z = false;
        }
        if ((j ^ j3) >= 0) {
            z2 = true;
        }
        if (z | z2) {
            return j3;
        }
        throw new ArithmeticException(qu6.p(ik8.o(j, "overflow: checkedAdd(", ", "), j2, ")"));
    }

    public static long b(long j, long j2, RoundingMode roundingMode) {
        roundingMode.getClass();
        long j3 = j / j2;
        long j4 = j - (j2 * j3);
        int i = (j4 > 0L ? 1 : (j4 == 0L ? 0 : -1));
        if (i == 0) {
            return j3;
        }
        boolean z = true;
        int i2 = ((int) ((j ^ j2) >> 63)) | 1;
        switch (wh6.a[roundingMode.ordinal()]) {
            case 1:
                if (i != 0) {
                    z = false;
                }
                cte.b(z);
                return j3;
            case 2:
                return j3;
            case 3:
                if (i2 >= 0) {
                    return j3;
                }
                return j3 + i2;
            case 4:
                return j3 + i2;
            case 5:
                if (i2 <= 0) {
                    return j3;
                }
                return j3 + i2;
            case 6:
            case 7:
            case 8:
                long abs = Math.abs(j4);
                int i3 = ((abs - (Math.abs(j2) - abs)) > 0L ? 1 : ((abs - (Math.abs(j2) - abs)) == 0L ? 0 : -1));
                if (i3 == 0) {
                    if (roundingMode != RoundingMode.HALF_UP && (roundingMode != RoundingMode.HALF_EVEN || (1 & j3) == 0)) {
                        return j3;
                    }
                } else if (i3 <= 0) {
                    return j3;
                }
                return j3 + i2;
            default:
                lq5.f();
                return 0L;
        }
    }

    public static long c(long j, long j2) {
        cte.a(j, "a");
        cte.a(j2, "b");
        if (j == 0) {
            return j2;
        }
        if (j2 == 0) {
            return j;
        }
        int numberOfTrailingZeros = Long.numberOfTrailingZeros(j);
        long j3 = j >> numberOfTrailingZeros;
        int numberOfTrailingZeros2 = Long.numberOfTrailingZeros(j2);
        long j4 = j2 >> numberOfTrailingZeros2;
        while (j3 != j4) {
            long j5 = j3 - j4;
            long j6 = (j5 >> 63) & j5;
            long j7 = (j5 - j6) - j6;
            j4 += j6;
            j3 = j7 >> Long.numberOfTrailingZeros(j7);
        }
        return j3 << Math.min(numberOfTrailingZeros, numberOfTrailingZeros2);
    }

    public static long d(long j, long j2) {
        boolean z;
        boolean z2;
        int numberOfLeadingZeros = Long.numberOfLeadingZeros(~j2) + Long.numberOfLeadingZeros(j2) + Long.numberOfLeadingZeros(~j) + Long.numberOfLeadingZeros(j);
        if (numberOfLeadingZeros > 65) {
            return j * j2;
        }
        long j3 = ((j ^ j2) >>> 63) + Long.MAX_VALUE;
        boolean z3 = false;
        if (numberOfLeadingZeros < 64) {
            z = true;
        } else {
            z = false;
        }
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i < 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (j2 == Long.MIN_VALUE) {
            z3 = true;
        }
        if (!(z | (z2 & z3))) {
            long j4 = j * j2;
            if (i == 0 || j4 / j == j2) {
                return j4;
            }
        }
        return j3;
    }
}
