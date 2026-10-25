package a8;
public abstract class oc {
    public static void a(long j10, String str) {
        if (j10 >= 0) {
            return;
        }
        throw new IllegalArgumentException(str + " (" + j10 + ") must be >= 0");
    }

    public static void b(boolean z10) {
        if (z10) {
            return;
        }
        throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
    }
}
