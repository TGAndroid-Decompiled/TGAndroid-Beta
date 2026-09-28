package g9;

import java.math.RoundingMode;
public abstract class d {
    public static final int[] f9513a;

    static {
        int[] iArr = new int[RoundingMode.values().length];
        f9513a = iArr;
        try {
            iArr[RoundingMode.UNNECESSARY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f9513a[RoundingMode.DOWN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f9513a[RoundingMode.FLOOR.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f9513a[RoundingMode.UP.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f9513a[RoundingMode.CEILING.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f9513a[RoundingMode.HALF_DOWN.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            f9513a[RoundingMode.HALF_UP.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            f9513a[RoundingMode.HALF_EVEN.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
    }
}
