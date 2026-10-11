package m4;

import java.util.List;
public final class m0 implements z0, a1 {
    public final c1 f16195a;
    public final int f16196b;
    public final int f16197c;

    public m0(c1 c1Var, int i10, int i11) {
        this.f16195a = c1Var;
        this.f16196b = i10;
        this.f16197c = i11;
    }

    @Override
    public void a(g1 g1Var, r rVar, List list) {
        c1 c1Var = this.f16195a;
        g1Var.P(c1Var.J0(rVar, g1Var, this.f16196b), c1Var.J0(rVar, g1Var, this.f16197c), list);
    }

    @Override
    public void g(g1 g1Var, r rVar) {
        c1 c1Var = this.f16195a;
        g1Var.S(c1Var.J0(rVar, g1Var, this.f16196b), c1Var.J0(rVar, g1Var, this.f16197c));
    }
}
