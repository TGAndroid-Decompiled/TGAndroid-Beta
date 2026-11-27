package defpackage;
public final class fma extends xtb {
    public final short c;
    public final short d;

    public fma(xtb xtbVar, int i, int i2) {
        super(xtbVar);
        this.c = (short) i;
        this.d = (short) i2;
    }

    @Override
    public final void a(qj0 qj0Var, byte[] bArr) {
        qj0Var.b(this.c, this.d);
    }

    public final String toString() {
        short s = this.d;
        return "<" + Integer.toBinaryString((this.c & ((1 << s) - 1)) | (1 << s) | (1 << s)).substring(1) + '>';
    }
}
