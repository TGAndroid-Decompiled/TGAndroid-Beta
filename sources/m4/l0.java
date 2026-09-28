package m4;

import java.util.List;
public final class l0 implements x0, y0 {
    public final a1 f14877a;
    public final int f14878b;
    public final int f14879c;

    public l0(a1 a1Var, int i10, int i11) {
        this.f14877a = a1Var;
        this.f14878b = i10;
        this.f14879c = i11;
    }

    @Override
    public void a(e1 e1Var, r rVar, List list) {
        a1 a1Var = this.f14877a;
        e1Var.P(a1Var.K0(rVar, e1Var, this.f14878b), a1Var.K0(rVar, e1Var, this.f14879c), list);
    }

    @Override
    public void d(e1 e1Var, r rVar) {
        a1 a1Var = this.f14877a;
        e1Var.S(a1Var.K0(rVar, e1Var, this.f14878b), a1Var.K0(rVar, e1Var, this.f14879c));
    }
}
