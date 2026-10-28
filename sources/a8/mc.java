package a8;

import java.math.RoundingMode;
public abstract class mc {
    public static int a(int i10, int i11) {
        boolean z10;
        long j10 = i10 + i11;
        int i12 = (int) j10;
        if (j10 == i12) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return i12;
        }
        throw new ArithmeticException("overflow: checkedAdd(" + i10 + ", " + i11 + ")");
    }

    public static int b(int i10, int i11) {
        RoundingMode roundingMode = RoundingMode.CEILING;
        roundingMode.getClass();
        if (i11 != 0) {
            int i12 = i10 / i11;
            int i13 = i10 - (i11 * i12);
            if (i13 != 0) {
                boolean z10 = true;
                int i14 = ((i10 ^ i11) >> 31) | 1;
                switch (h9.d.f12721a[roundingMode.ordinal()]) {
                    case 1:
                        if (i13 != 0) {
                            z10 = false;
                        }
                        oc.b(z10);
                        return i12;
                    case 2:
                        return i12;
                    case 3:
                        if (i14 >= 0) {
                            return i12;
                        }
                        break;
                    case 4:
                        break;
                    case 5:
                        if (i14 <= 0) {
                            return i12;
                        }
                        break;
                    case 6:
                    case 7:
                    case 8:
                        int abs = Math.abs(i13);
                        int abs2 = abs - (Math.abs(i11) - abs);
                        if (abs2 == 0) {
                            RoundingMode roundingMode2 = RoundingMode.HALF_UP;
                            RoundingMode roundingMode3 = RoundingMode.HALF_EVEN;
                            return i12;
                        } else if (abs2 <= 0) {
                            return i12;
                        }
                        break;
                    default:
                        throw new AssertionError();
                }
                return i12 + i14;
            }
            return i12;
        }
        throw new ArithmeticException("/ by zero");
    }

    public static int c(int i10) {
        boolean z10;
        RoundingMode roundingMode = RoundingMode.UNNECESSARY;
        if (i10 > 0) {
            boolean z11 = true;
            switch (h9.d.f12721a[roundingMode.ordinal()]) {
                case 1:
                    if (i10 > 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (((i10 - 1) & i10) != 0) {
                        z11 = false;
                    }
                    oc.b(z10 & z11);
                    break;
                case 2:
                case 3:
                    break;
                case 4:
                case 5:
                    return 32 - Integer.numberOfLeadingZeros(i10 - 1);
                case 6:
                case 7:
                case 8:
                    int numberOfLeadingZeros = Integer.numberOfLeadingZeros(i10);
                    return (31 - numberOfLeadingZeros) + ((~(~(((-1257966797) >>> numberOfLeadingZeros) - i10))) >>> 31);
                default:
                    throw new AssertionError();
            }
            return 31 - Integer.numberOfLeadingZeros(i10);
        }
        throw new IllegalArgumentException(ic.a.j(i10, "x (", ") must be > 0"));
    }
}
