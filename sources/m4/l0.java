package m4;

import java.util.List;
public final class l0 implements x0, y0 {
    public final a1 f14892a;
    public final int f14893b;
    public final int f14894c;

    public l0(a1 a1Var, int i10, int i11) {
        this.f14892a = a1Var;
        this.f14893b = i10;
        this.f14894c = i11;
    }

    @Override
    public void a(e1 e1Var, r rVar, List list) {
        a1 a1Var = this.f14892a;
        e1Var.P(a1Var.K0(rVar, e1Var, this.f14893b), a1Var.K0(rVar, e1Var, this.f14894c), list);
    }

    @Override
    public void d(e1 e1Var, r rVar) {
        a1 a1Var = this.f14892a;
        e1Var.S(a1Var.K0(rVar, e1Var, this.f14893b), a1Var.K0(rVar, e1Var, this.f14894c));
    }
}
