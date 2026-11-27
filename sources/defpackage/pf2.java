package defpackage;
public final class pf2 extends zb3 {
    public final pn F = new pn(null);
    public final bg2 G;

    public pf2(bg2 bg2Var) {
        this.G = bg2Var;
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
    public final void P(f89 f89Var) {
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
