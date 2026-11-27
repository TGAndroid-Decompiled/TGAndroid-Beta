package defpackage;
public final class wdc {
    public final byte a;
    public final byte b;

    public wdc(int i) {
        this.a = (byte) (i & 224);
        this.b = (byte) (i & 31);
    }

    public wdc(int i, int i2) {
        this.a = i;
        this.b = i2;
    }
}
