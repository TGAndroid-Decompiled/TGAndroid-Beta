package m4;

import java.util.List;
public final class q0 implements e1, f1, e2.j {
    public final i1 f16745a;
    public final int f16746b;
    public final int f16747c;

    public q0(i1 i1Var, int i10, int i11) {
        this.f16745a = i1Var;
        this.f16746b = i10;
        this.f16747c = i11;
    }

    @Override
    public void accept(Object obj) {
        m1 m1Var = (m1) obj;
        i1 i1Var = this.f16745a;
        ((f0) i1Var.f16626a.get()).getClass();
        h1 h1Var = i1Var.f16630i;
        if (h1Var != null) {
            h1Var.setFixedSize(this.f16746b, this.f16747c);
        }
    }

    @Override
    public void b(m1 m1Var, v vVar, List list) {
        i1 i1Var = this.f16745a;
        m1Var.O(i1Var.K0(vVar, m1Var, this.f16746b), i1Var.K0(vVar, m1Var, this.f16747c), list);
    }

    @Override
    public void c(m1 m1Var, v vVar) {
        i1 i1Var = this.f16745a;
        m1Var.R(i1Var.K0(vVar, m1Var, this.f16746b), i1Var.K0(vVar, m1Var, this.f16747c));
    }
}
