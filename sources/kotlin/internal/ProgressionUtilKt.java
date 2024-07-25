package kotlin.internal;
public final class ProgressionUtilKt {
    private static final int mod(int i, int i2) {
        int i3 = i % i2;
        return i3 >= 0 ? i3 : i3 + i2;
    }

    private static final int differenceModulo(int i, int i2, int i3) {
        return mod(mod(i, i3) - mod(i2, i3), i3);
    }

    public static final int getProgressionLastElement(int i, int i2, int i3) {
        if (i3 > 0) {
            return i >= i2 ? i2 : i2 - differenceModulo(i2, i, i3);
        } else if (i3 < 0) {
            return i <= i2 ? i2 : i2 + differenceModulo(i, i2, -i3);
        } else {
            throw new IllegalArgumentException("Step is zero.");
        }
    }
}
