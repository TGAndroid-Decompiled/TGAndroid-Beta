package defpackage;
public final class y62 implements qac {
    public final byte a;
    public final v72 b;
    public final int c;

    public y62(v72 v72Var, int i, byte b) {
        this.a = b;
        this.b = v72Var;
        this.c = i;
    }

    @Override
    public final void a(Object obj) {
        byte b = this.a;
        int i = this.c;
        v72 v72Var = this.b;
        switch (b) {
            case 0:
                v72Var.h0(i, (nf8) obj);
                return;
            default:
                v72Var.h0(i, new sf8((String) obj));
                return;
        }
    }
}
