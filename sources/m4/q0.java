package m4;

import java.util.List;
public final class q0 implements e1, f1, e2.j {
    public final i1 f16682a;
    public final int f16683b;
    public final int f16684c;

    public q0(i1 i1Var, int i10, int i11) {
        this.f16682a = i1Var;
        this.f16683b = i10;
        this.f16684c = i11;
    }

    @Override
    public void a(m1 m1Var, v vVar, List list) {
        i1 i1Var = this.f16682a;
        m1Var.O(i1Var.K0(vVar, m1Var, this.f16683b), i1Var.K0(vVar, m1Var, this.f16684c), list);
    }

    @Override
    public void accept(Object obj) {
        m1 m1Var = (m1) obj;
        i1 i1Var = this.f16682a;
        ((f0) i1Var.f16563a.get()).getClass();
        h1 h1Var = i1Var.f16567i;
        if (h1Var != null) {
            h1Var.setFixedSize(this.f16683b, this.f16684c);
        }
    }

    @Override
    public void d(m1 m1Var, v vVar) {
        i1 i1Var = this.f16682a;
        m1Var.R(i1Var.K0(vVar, m1Var, this.f16683b), i1Var.K0(vVar, m1Var, this.f16684c));
    }
}
