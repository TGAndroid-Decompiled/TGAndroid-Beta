package m4;

import java.util.List;
public final class q0 implements e1, f1, e2.j {
    public final i1 f16683a;
    public final int f16684b;
    public final int f16685c;

    public q0(i1 i1Var, int i10, int i11) {
        this.f16683a = i1Var;
        this.f16684b = i10;
        this.f16685c = i11;
    }

    @Override
    public void a(m1 m1Var, v vVar, List list) {
        i1 i1Var = this.f16683a;
        m1Var.O(i1Var.K0(vVar, m1Var, this.f16684b), i1Var.K0(vVar, m1Var, this.f16685c), list);
    }

    @Override
    public void accept(Object obj) {
        m1 m1Var = (m1) obj;
        i1 i1Var = this.f16683a;
        ((f0) i1Var.f16564a.get()).getClass();
        h1 h1Var = i1Var.f16568i;
        if (h1Var != null) {
            h1Var.setFixedSize(this.f16684b, this.f16685c);
        }
    }

    @Override
    public void d(m1 m1Var, v vVar) {
        i1 i1Var = this.f16683a;
        m1Var.R(i1Var.K0(vVar, m1Var, this.f16684b), i1Var.K0(vVar, m1Var, this.f16685c));
    }
}
