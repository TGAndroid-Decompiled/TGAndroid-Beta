package defpackage;
public final class gt5 extends na1 {
    public final pt5 r;

    public gt5(fw2 fw2Var, pt5 pt5Var) {
        super(1, fw2Var);
        this.r = pt5Var;
    }

    @Override
    public final Throwable p(pt5 pt5Var) {
        Throwable c;
        Object v = this.r.v();
        if ((v instanceof it5) && (c = ((it5) v).c()) != null) {
            return c;
        }
        if (v instanceof fp2) {
            return ((fp2) v).a;
        }
        return pt5Var.getCancellationException();
    }

    @Override
    public final String y() {
        return "AwaitContinuation";
    }
}
