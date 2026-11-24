package defpackage;
public final class xbc {
    public final byte a;
    public final byte b;

    public xbc(int i) {
        this.a = (byte) (i & 224);
        this.b = (byte) (i & 31);
    }

    public xbc(int i, int i2) {
        this.a = i;
        this.b = i2;
    }
}
