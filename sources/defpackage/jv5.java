package defpackage;
public final class jv5 extends va1 {
    public final sv5 r;

    public jv5(zw2 zw2Var, sv5 sv5Var) {
        super(1, zw2Var);
        this.r = sv5Var;
    }

    @Override
    public final Throwable p(sv5 sv5Var) {
        Throwable c;
        Object v = this.r.v();
        if ((v instanceof lv5) && (c = ((lv5) v).c()) != null) {
            return c;
        }
        if (v instanceof yp2) {
            return ((yp2) v).a;
        }
        return sv5Var.getCancellationException();
    }

    @Override
    public final String y() {
        return "AwaitContinuation";
    }
}
