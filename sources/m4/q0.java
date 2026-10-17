package m4;

import java.util.List;
public final class q0 implements e1, f1, e2.j {
    public final i1 f16676a;
    public final int f16677b;
    public final int f16678c;

    public q0(i1 i1Var, int i10, int i11) {
        this.f16676a = i1Var;
        this.f16677b = i10;
        this.f16678c = i11;
    }

    @Override
    public void a(m1 m1Var, v vVar, List list) {
        i1 i1Var = this.f16676a;
        m1Var.O(i1Var.K0(vVar, m1Var, this.f16677b), i1Var.K0(vVar, m1Var, this.f16678c), list);
    }

    @Override
    public void accept(Object obj) {
        m1 m1Var = (m1) obj;
        i1 i1Var = this.f16676a;
        ((f0) i1Var.f16557a.get()).getClass();
        h1 h1Var = i1Var.f16561i;
        if (h1Var != null) {
            h1Var.setFixedSize(this.f16677b, this.f16678c);
        }
    }

    @Override
    public void d(m1 m1Var, v vVar) {
        i1 i1Var = this.f16676a;
        m1Var.R(i1Var.K0(vVar, m1Var, this.f16677b), i1Var.K0(vVar, m1Var, this.f16678c));
    }
}
