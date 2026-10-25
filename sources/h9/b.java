package h9;

import java.math.RoundingMode;
public abstract class b {
    public static final int[] f12720a;

    static {
        int[] iArr = new int[RoundingMode.values().length];
        f12720a = iArr;
        try {
            iArr[RoundingMode.UNNECESSARY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f12720a[RoundingMode.FLOOR.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f12720a[RoundingMode.CEILING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f12720a[RoundingMode.DOWN.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f12720a[RoundingMode.UP.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f12720a[RoundingMode.HALF_EVEN.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            f12720a[RoundingMode.HALF_UP.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            f12720a[RoundingMode.HALF_DOWN.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
    }
}
