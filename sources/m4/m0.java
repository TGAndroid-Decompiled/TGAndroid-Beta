package m4;

import java.util.List;
public final class m0 implements z0, a1 {
    public final c1 f16231a;
    public final int f16232b;
    public final int f16233c;

    public m0(c1 c1Var, int i10, int i11) {
        this.f16231a = c1Var;
        this.f16232b = i10;
        this.f16233c = i11;
    }

    @Override
    public void a(g1 g1Var, r rVar, List list) {
        c1 c1Var = this.f16231a;
        g1Var.P(c1Var.J0(rVar, g1Var, this.f16232b), c1Var.J0(rVar, g1Var, this.f16233c), list);
    }

    @Override
    public void g(g1 g1Var, r rVar) {
        c1 c1Var = this.f16231a;
        g1Var.S(c1Var.J0(rVar, g1Var, this.f16232b), c1Var.J0(rVar, g1Var, this.f16233c));
    }
}
