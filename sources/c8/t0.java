package c8;
public abstract class t0 {
    public static void a(long j3, String str) {
        if (j3 >= 0) {
            return;
        }
        throw new IllegalArgumentException(str + " (" + j3 + ") must be >= 0");
    }

    public static void b(boolean z9) {
        if (z9) {
            return;
        }
        throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
    }
}
