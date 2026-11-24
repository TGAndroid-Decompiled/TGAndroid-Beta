package defpackage;
public final class ye2 extends gb3 {
    public final on F = new on(null);
    public final kf2 G;

    public ye2(kf2 kf2Var) {
        this.G = kf2Var;
    }

    @Override
    public final void N() {
        this.F.e();
    }

    @Override
    public final void O() {
        this.G.c.invalidate();
    }

    @Override
    public final void P(s49 s49Var) {
        this.G.c.invalidate();
    }

    @Override
    public final void m() {
        boolean isEmpty = this.p.isEmpty();
        boolean isEmpty2 = this.r.isEmpty();
        boolean isEmpty3 = this.s.isEmpty();
        boolean isEmpty4 = this.q.isEmpty();
        if (!isEmpty || !isEmpty2 || !isEmpty4 || !isEmpty3) {
            this.F.d();
        }
        super.m();
    }
}
