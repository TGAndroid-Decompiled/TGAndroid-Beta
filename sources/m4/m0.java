package m4;

import java.util.List;
public final class m0 implements d1, e1 {
    public final g1 f14612a;
    public final int f14613b;
    public final int f14614c;

    public m0(g1 g1Var, int i10, int i11) {
        this.f14612a = g1Var;
        this.f14613b = i10;
        this.f14614c = i11;
    }

    @Override
    public void a(k1 k1Var, r rVar, List list) {
        g1 g1Var = this.f14612a;
        k1Var.P(g1Var.K0(rVar, k1Var, this.f14613b), g1Var.K0(rVar, k1Var, this.f14614c), list);
    }

    @Override
    public void g(k1 k1Var, r rVar) {
        g1 g1Var = this.f14612a;
        k1Var.S(g1Var.K0(rVar, k1Var, this.f14613b), g1Var.K0(rVar, k1Var, this.f14614c));
    }
}
