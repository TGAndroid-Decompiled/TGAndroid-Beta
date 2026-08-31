package ld;
public final class l1 extends m {
    public final u1 f12327r;

    public l1(u1 u1Var, uc.c cVar) {
        super(1, cVar);
        this.f12327r = u1Var;
    }

    @Override
    public final Throwable q(u1 u1Var) {
        Throwable b10;
        Object u10 = this.f12327r.u();
        if ((u10 instanceof n1) && (b10 = ((n1) u10).b()) != null) {
            return b10;
        }
        if (u10 instanceof v) {
            return ((v) u10).f12368a;
        }
        return u1Var.getCancellationException();
    }

    @Override
    public final String z() {
        return "AwaitContinuation";
    }
}
