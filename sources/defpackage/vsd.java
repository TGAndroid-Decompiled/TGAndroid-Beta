package defpackage;
public abstract class vsd {
    public static boolean a(int i, int i2) {
        if ((i & i2) != 0) {
            return true;
        }
        return false;
    }

    public static int b(int i, int i2, boolean z) {
        if (z) {
            return i | i2;
        }
        return i & (~i2);
    }
}
