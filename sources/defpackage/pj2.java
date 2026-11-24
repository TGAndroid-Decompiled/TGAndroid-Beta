package defpackage;
public final class pj2 implements gla {
    public final nj2 a;
    public final rj2 b;

    public pj2(rj2 rj2Var, nj2 nj2Var) {
        this.b = rj2Var;
        this.a = nj2Var;
    }

    @Override
    public final void i(int i) {
        rj2 rj2Var = this.b;
        rj2Var.t1 = i;
        rj2Var.E0(true);
    }

    @Override
    public final void m() {
        int measuredHeight = this.b.n1.getMeasuredHeight();
        nj2 nj2Var = this.a;
        nj2Var.z(0 - nj2Var.getScrollX(), measuredHeight - nj2Var.getScrollY(), false);
    }
}
