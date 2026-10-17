package be;
public final class m1 extends m {
    public final v1 f4303r;

    public m1(v1 v1Var, kd.c cVar) {
        super(1, cVar);
        this.f4303r = v1Var;
    }

    @Override
    public final Throwable q(v1 v1Var) {
        Throwable b10;
        Object u10 = this.f4303r.u();
        if ((u10 instanceof o1) && (b10 = ((o1) u10).b()) != null) {
            return b10;
        }
        if (u10 instanceof v) {
            return ((v) u10).f4331a;
        }
        return v1Var.getCancellationException();
    }

    @Override
    public final String z() {
        return "AwaitContinuation";
    }
}
