package id;

public final class m1 extends m {

    public final v1 f11169r;

    public m1(v1 v1Var, rc.c cVar) {
        super(1, cVar);
        this.f11169r = v1Var;
    }

    @Override
    public final Throwable q(v1 v1Var) {
        Throwable thB;
        Object objU = this.f11169r.u();
        if (!(objU instanceof o1) || (thB = ((o1) objU).b()) == null) {
            return objU instanceof v ? ((v) objU).f11204a : v1Var.getCancellationException();
        }
        return thB;
    }

    @Override
    public final String z() {
        return "AwaitContinuation";
    }
}
