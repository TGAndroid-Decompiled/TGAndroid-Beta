package c8;
public abstract class dd {
    public static boolean a(int i7, int i10) {
        if ((i7 & i10) != 0) {
            return true;
        }
        return false;
    }

    public static int b(int i7, int i10, boolean z10) {
        if (z10) {
            return i7 | i10;
        }
        return i7 & (~i10);
    }
}
