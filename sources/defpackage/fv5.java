package defpackage;
public final class fv5 extends vb1 {
    public final ov5 r;

    public fv5(px2 px2Var, ov5 ov5Var) {
        super(1, px2Var);
        this.r = ov5Var;
    }

    @Override
    public final Throwable p(ov5 ov5Var) {
        Throwable c;
        Object v = this.r.v();
        if ((v instanceof hv5) && (c = ((hv5) v).c()) != null) {
            return c;
        }
        if (v instanceof qq2) {
            return ((qq2) v).a;
        }
        return ov5Var.getCancellationException();
    }

    @Override
    public final String y() {
        return "AwaitContinuation";
    }
}
