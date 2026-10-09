package ae;
public final class n1 extends m {
    public final w1 f478r;

    public n1(w1 w1Var, jd.c cVar) {
        super(1, cVar);
        this.f478r = w1Var;
    }

    @Override
    public final Throwable q(w1 w1Var) {
        Throwable b10;
        Object u10 = this.f478r.u();
        if ((u10 instanceof p1) && (b10 = ((p1) u10).b()) != null) {
            return b10;
        }
        if (u10 instanceof v) {
            return ((v) u10).f509a;
        }
        return w1Var.getCancellationException();
    }

    @Override
    public final String z() {
        return "AwaitContinuation";
    }
}
