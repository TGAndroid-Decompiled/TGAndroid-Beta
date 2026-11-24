package defpackage;
public final class ew0 implements qac {
    public final byte a;
    public final qu3 b;

    public ew0(qu3 qu3Var, byte b) {
        this.a = b;
        this.b = qu3Var;
    }

    @Override
    public final void a(Object obj) {
        byte b = this.a;
        qu3 qu3Var = this.b;
        switch (b) {
            case 0:
                gm.t1(qu3Var);
                gm.d3((Runnable) obj, 80L);
                return;
            default:
                qu3Var.H(((Integer) obj).intValue());
                return;
        }
    }
}
