package k7;
public abstract class x8 {
    public static boolean a(int i10, int i11) {
        if ((i10 & i11) != 0) {
            return true;
        }
        return false;
    }

    public static int b(int i10, int i11, boolean z4) {
        if (z4) {
            return i10 | i11;
        }
        return i10 & (~i11);
    }
}
