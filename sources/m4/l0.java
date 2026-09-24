package m4;

import java.util.List;
public final class l0 implements x0, y0 {
    public final a1 f14861a;
    public final int f14862b;
    public final int f14863c;

    public l0(a1 a1Var, int i10, int i11) {
        this.f14861a = a1Var;
        this.f14862b = i10;
        this.f14863c = i11;
    }

    @Override
    public void a(e1 e1Var, r rVar, List list) {
        a1 a1Var = this.f14861a;
        e1Var.P(a1Var.K0(rVar, e1Var, this.f14862b), a1Var.K0(rVar, e1Var, this.f14863c), list);
    }

    @Override
    public void d(e1 e1Var, r rVar) {
        a1 a1Var = this.f14861a;
        e1Var.S(a1Var.K0(rVar, e1Var, this.f14862b), a1Var.K0(rVar, e1Var, this.f14863c));
    }
}
