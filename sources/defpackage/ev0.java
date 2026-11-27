package defpackage;
public final class ev0 implements pcc {
    public final byte a;
    public final xt3 b;

    public ev0(xt3 xt3Var, byte b) {
        this.a = b;
        this.b = xt3Var;
    }

    @Override
    public final void a(Object obj) {
        byte b = this.a;
        xt3 xt3Var = this.b;
        switch (b) {
            case 0:
                hl.t1(xt3Var);
                hl.d3((Runnable) obj, 80L);
                return;
            default:
                xt3Var.H(((Integer) obj).intValue());
                return;
        }
    }
}
