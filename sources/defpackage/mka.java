package defpackage;
public final class mka extends xrb {
    public final short c;
    public final short d;

    public mka(xrb xrbVar, int i, int i2) {
        super(xrbVar);
        this.c = (short) i;
        this.d = (short) i2;
    }

    @Override
    public final void a(pk0 pk0Var, byte[] bArr) {
        pk0Var.b(this.c, this.d);
    }

    public final String toString() {
        short s = this.d;
        return "<" + Integer.toBinaryString((this.c & ((1 << s) - 1)) | (1 << s) | (1 << s)).substring(1) + '>';
    }
}
