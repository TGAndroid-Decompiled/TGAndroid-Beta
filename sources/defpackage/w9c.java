package defpackage;
public final class w9c {
    public final byte a;
    public final byte b;

    public w9c(int i) {
        this.a = (byte) (i & 224);
        this.b = (byte) (i & 31);
    }

    public w9c(int i, int i2) {
        this.a = i;
        this.b = i2;
    }
}
