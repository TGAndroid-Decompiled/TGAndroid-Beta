package m4;

import java.util.List;
public final class l0 implements x0, y0 {
    public final a1 f16234a;
    public final int f16235b;
    public final int f16236c;

    public l0(a1 a1Var, int i10, int i11) {
        this.f16234a = a1Var;
        this.f16235b = i10;
        this.f16236c = i11;
    }

    @Override
    public void a(e1 e1Var, r rVar, List list) {
        a1 a1Var = this.f16234a;
        e1Var.P(a1Var.K0(rVar, e1Var, this.f16235b), a1Var.K0(rVar, e1Var, this.f16236c), list);
    }

    @Override
    public void c(e1 e1Var, r rVar) {
        a1 a1Var = this.f16234a;
        e1Var.S(a1Var.K0(rVar, e1Var, this.f16235b), a1Var.K0(rVar, e1Var, this.f16236c));
    }
}
