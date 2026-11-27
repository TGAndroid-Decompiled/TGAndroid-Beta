package defpackage;
public final class xi2 implements yma {
    public final vi2 a;
    public final zi2 b;

    public xi2(zi2 zi2Var, vi2 vi2Var) {
        this.b = zi2Var;
        this.a = vi2Var;
    }

    @Override
    public final void j(int i) {
        zi2 zi2Var = this.b;
        zi2Var.t1 = i;
        zi2Var.F0(true);
    }

    @Override
    public final void m() {
        int measuredHeight = this.b.n1.getMeasuredHeight();
        vi2 vi2Var = this.a;
        vi2Var.z(0 - vi2Var.getScrollX(), measuredHeight - vi2Var.getScrollY(), false);
    }
}
