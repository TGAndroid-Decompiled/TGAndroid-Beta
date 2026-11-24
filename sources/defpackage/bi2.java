package defpackage;
public final class bi2 implements eja {
    public final zh2 a;
    public final di2 b;

    public bi2(di2 di2Var, zh2 zh2Var) {
        this.b = di2Var;
        this.a = zh2Var;
    }

    @Override
    public final void k(int i) {
        di2 di2Var = this.b;
        di2Var.t1 = i;
        di2Var.E0(true);
    }

    @Override
    public final void n() {
        int measuredHeight = this.b.n1.getMeasuredHeight();
        zh2 zh2Var = this.a;
        zh2Var.z(0 - zh2Var.getScrollX(), measuredHeight - zh2Var.getScrollY(), false);
    }
}
