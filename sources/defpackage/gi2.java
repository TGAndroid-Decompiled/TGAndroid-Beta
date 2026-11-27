package defpackage;
public abstract class gi2 extends vu7 {
    public abstract int j();

    public final int k(int i) {
        int size = ((dt8) this).c.size();
        int j = j();
        if (i < j) {
            return ((size - (j << 1)) - ((j - i) - 1)) - 1;
        }
        int i2 = size - j;
        if (i >= i2) {
            return i - i2;
        }
        return i - j;
    }
}
