package m4;

import java.util.List;
public final class q0 implements f1, g1, e2.j {
    public final j1 f12900a;
    public final int f12901b;
    public final int f12902c;

    public q0(j1 j1Var, int i10, int i11) {
        this.f12900a = j1Var;
        this.f12901b = i10;
        this.f12902c = i11;
    }

    @Override
    public void a(n1 n1Var, w wVar, List list) {
        j1 j1Var = this.f12900a;
        n1Var.r0(list, j1Var.M0(wVar, n1Var, this.f12901b), j1Var.M0(wVar, n1Var, this.f12902c));
    }

    @Override
    public void accept(Object obj) {
        n1 n1Var = (n1) obj;
        j1 j1Var = this.f12900a;
        ((f0) j1Var.f12789a.get()).getClass();
        i1 i1Var = j1Var.f12793i;
        if (i1Var != null) {
            i1Var.setFixedSize(this.f12901b, this.f12902c);
        }
    }

    @Override
    public void g(n1 n1Var, w wVar) {
        j1 j1Var = this.f12900a;
        n1Var.Q(j1Var.M0(wVar, n1Var, this.f12901b), j1Var.M0(wVar, n1Var, this.f12902c));
    }
}
