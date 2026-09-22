package m4;

import java.util.List;
public final class m0 implements d1, e1 {
    public final g1 f14610a;
    public final int f14611b;
    public final int f14612c;

    public m0(g1 g1Var, int i10, int i11) {
        this.f14610a = g1Var;
        this.f14611b = i10;
        this.f14612c = i11;
    }

    @Override
    public void a(k1 k1Var, r rVar, List list) {
        g1 g1Var = this.f14610a;
        k1Var.P(g1Var.K0(rVar, k1Var, this.f14611b), g1Var.K0(rVar, k1Var, this.f14612c), list);
    }

    @Override
    public void g(k1 k1Var, r rVar) {
        g1 g1Var = this.f14610a;
        k1Var.S(g1Var.K0(rVar, k1Var, this.f14611b), g1Var.K0(rVar, k1Var, this.f14612c));
    }
}
