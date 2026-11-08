package c8;

import java.math.RoundingMode;
public abstract class s0 {
    public static long a(long j3, long j10) {
        boolean z9;
        long j11 = j3 + j10;
        boolean z10 = false;
        if ((j3 ^ j10) < 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        if ((j3 ^ j11) >= 0) {
            z10 = true;
        }
        if (z9 | z10) {
            return j11;
        }
        throw new ArithmeticException(a8.p0.r(a8.p0.t(j3, "overflow: checkedAdd(", ", "), j10, ")"));
    }

    public static long b(long j3, long j10, RoundingMode roundingMode) {
        roundingMode.getClass();
        long j11 = j3 / j10;
        long j12 = j3 - (j10 * j11);
        int i7 = (j12 > 0L ? 1 : (j12 == 0L ? 0 : -1));
        if (i7 == 0) {
            return j11;
        }
        boolean z9 = true;
        int i10 = ((int) ((j3 ^ j10) >> 63)) | 1;
        switch (j9.e.f16603a[roundingMode.ordinal()]) {
            case 1:
                if (i7 != 0) {
                    z9 = false;
                }
                t0.b(z9);
                return j11;
            case 2:
                return j11;
            case 3:
                if (i10 >= 0) {
                    return j11;
                }
                return j11 + i10;
            case 4:
                return j11 + i10;
            case 5:
                if (i10 <= 0) {
                    return j11;
                }
                return j11 + i10;
            case 6:
            case 7:
            case 8:
                long abs = Math.abs(j12);
                int i11 = ((abs - (Math.abs(j10) - abs)) > 0L ? 1 : ((abs - (Math.abs(j10) - abs)) == 0L ? 0 : -1));
                if (i11 == 0) {
                    if (roundingMode != RoundingMode.HALF_UP && (roundingMode != RoundingMode.HALF_EVEN || (1 & j11) == 0)) {
                        return j11;
                    }
                } else if (i11 <= 0) {
                    return j11;
                }
                return j11 + i10;
            default:
                throw new AssertionError();
        }
    }

    public static long c(long j3, long j10) {
        t0.a(j3, "a");
        t0.a(j10, "b");
        if (j3 == 0) {
            return j10;
        }
        if (j10 == 0) {
            return j3;
        }
        int numberOfTrailingZeros = Long.numberOfTrailingZeros(j3);
        long j11 = j3 >> numberOfTrailingZeros;
        int numberOfTrailingZeros2 = Long.numberOfTrailingZeros(j10);
        long j12 = j10 >> numberOfTrailingZeros2;
        while (j11 != j12) {
            long j13 = j11 - j12;
            long j14 = (j13 >> 63) & j13;
            long j15 = (j13 - j14) - j14;
            j12 += j14;
            j11 = j15 >> Long.numberOfTrailingZeros(j15);
        }
        return j11 << Math.min(numberOfTrailingZeros, numberOfTrailingZeros2);
    }

    public static long d(long j3, long j10) {
        boolean z9;
        boolean z10;
        int numberOfLeadingZeros = Long.numberOfLeadingZeros(~j10) + Long.numberOfLeadingZeros(j10) + Long.numberOfLeadingZeros(~j3) + Long.numberOfLeadingZeros(j3);
        if (numberOfLeadingZeros > 65) {
            return j3 * j10;
        }
        long j11 = ((j3 ^ j10) >>> 63) + Long.MAX_VALUE;
        boolean z11 = false;
        if (numberOfLeadingZeros < 64) {
            z9 = true;
        } else {
            z9 = false;
        }
        int i7 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        if (i7 < 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (j10 == Long.MIN_VALUE) {
            z11 = true;
        }
        if (!(z9 | (z11 & z10))) {
            long j12 = j3 * j10;
            if (i7 == 0 || j12 / j3 == j10) {
                return j12;
            }
        }
        return j11;
    }
}
