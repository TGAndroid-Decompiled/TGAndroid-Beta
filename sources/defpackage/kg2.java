package defpackage;
public final class kg2 extends sc3 {
    public final po F = new po(null);
    public final wg2 G;

    public kg2(wg2 wg2Var) {
        this.G = wg2Var;
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
    public final void P(u69 u69Var) {
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
