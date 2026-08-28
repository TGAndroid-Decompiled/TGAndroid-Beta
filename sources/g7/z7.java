package g7;
public abstract class z7 {
    public static boolean a(int i9, int i10) {
        if ((i9 & i10) != 0) {
            return true;
        }
        return false;
    }

    public static int b(int i9, int i10, boolean z10) {
        if (z10) {
            return i9 | i10;
        }
        return i9 & (~i10);
    }
}
