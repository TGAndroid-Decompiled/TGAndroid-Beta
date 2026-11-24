package defpackage;
public final class n52 implements p8c {
    public final byte a;
    public final k62 b;
    public final int c;

    public n52(k62 k62Var, int i, byte b) {
        this.a = b;
        this.b = k62Var;
        this.c = i;
    }

    @Override
    public final void a(Object obj) {
        byte b = this.a;
        int i = this.c;
        k62 k62Var = this.b;
        switch (b) {
            case 0:
                k62Var.h0(i, (ld8) obj);
                return;
            default:
                k62Var.h0(i, new qd8((String) obj));
                return;
        }
    }
}
