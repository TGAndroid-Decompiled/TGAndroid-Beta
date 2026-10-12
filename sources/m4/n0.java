package m4;

import java.util.List;
public final class n0 implements z0, a1 {
    public final c1 f15928a;
    public final int f15929b;
    public final int f15930c;

    public n0(c1 c1Var, int i10, int i11) {
        this.f15928a = c1Var;
        this.f15929b = i10;
        this.f15930c = i11;
    }

    @Override
    public void a(g1 g1Var, r rVar, List list) {
        c1 c1Var = this.f15928a;
        g1Var.P(c1Var.J0(rVar, g1Var, this.f15929b), c1Var.J0(rVar, g1Var, this.f15930c), list);
    }

    @Override
    public void g(g1 g1Var, r rVar) {
        c1 c1Var = this.f15928a;
        g1Var.S(c1Var.J0(rVar, g1Var, this.f15929b), c1Var.J0(rVar, g1Var, this.f15930c));
    }
}
