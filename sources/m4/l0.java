package m4;

import java.util.List;
public final class l0 implements x0, y0 {
    public final a1 f16244a;
    public final int f16245b;
    public final int f16246c;

    public l0(a1 a1Var, int i10, int i11) {
        this.f16244a = a1Var;
        this.f16245b = i10;
        this.f16246c = i11;
    }

    @Override
    public void a(e1 e1Var, r rVar, List list) {
        a1 a1Var = this.f16244a;
        e1Var.P(a1Var.K0(rVar, e1Var, this.f16245b), a1Var.K0(rVar, e1Var, this.f16246c), list);
    }

    @Override
    public void c(e1 e1Var, r rVar) {
        a1 a1Var = this.f16244a;
        e1Var.S(a1Var.K0(rVar, e1Var, this.f16245b), a1Var.K0(rVar, e1Var, this.f16246c));
    }
}
