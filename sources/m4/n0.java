package m4;

import java.util.List;
public final class n0 implements z0, a1 {
    public final c1 f15929a;
    public final int f15930b;
    public final int f15931c;

    public n0(c1 c1Var, int i10, int i11) {
        this.f15929a = c1Var;
        this.f15930b = i10;
        this.f15931c = i11;
    }

    @Override
    public void a(g1 g1Var, r rVar, List list) {
        c1 c1Var = this.f15929a;
        g1Var.P(c1Var.J0(rVar, g1Var, this.f15930b), c1Var.J0(rVar, g1Var, this.f15931c), list);
    }

    @Override
    public void g(g1 g1Var, r rVar) {
        c1 c1Var = this.f15929a;
        g1Var.S(c1Var.J0(rVar, g1Var, this.f15930b), c1Var.J0(rVar, g1Var, this.f15931c));
    }
}
