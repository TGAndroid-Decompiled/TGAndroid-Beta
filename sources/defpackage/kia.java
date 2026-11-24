package defpackage;
public final class kia extends wpb {
    public final short c;
    public final short d;

    public kia(wpb wpbVar, int i, int i2) {
        super(wpbVar);
        this.c = (short) i;
        this.d = (short) i2;
    }

    @Override
    public final void a(pj0 pj0Var, byte[] bArr) {
        pj0Var.b(this.c, this.d);
    }

    public final String toString() {
        short s = this.d;
        return "<" + Integer.toBinaryString((this.c & ((1 << s) - 1)) | (1 << s) | (1 << s)).substring(1) + '>';
    }
}
