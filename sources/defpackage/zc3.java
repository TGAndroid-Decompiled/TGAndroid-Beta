package defpackage;
public final class zc3 extends zo {
    public final byte c;

    @Override
    public final int h(int i, int i2) {
        switch (this.c) {
            case 1:
                return i % i2;
            default:
                return super.h(i, i2);
        }
    }

    @Override
    public final int i(int i) {
        byte b = this.c;
        return 1;
    }
}
