package m4;

import java.util.List;
public final class l0 implements c1, d1 {
    public final f1 f14827a;
    public final int f14828b;
    public final int f14829c;

    public l0(f1 f1Var, int i10, int i11) {
        this.f14827a = f1Var;
        this.f14828b = i10;
        this.f14829c = i11;
    }

    @Override
    public void a(j1 j1Var, r rVar, List list) {
        f1 f1Var = this.f14827a;
        j1Var.P(f1Var.K0(rVar, j1Var, this.f14828b), f1Var.K0(rVar, j1Var, this.f14829c), list);
    }

    @Override
    public void d(j1 j1Var, r rVar) {
        f1 f1Var = this.f14827a;
        j1Var.S(f1Var.K0(rVar, j1Var, this.f14828b), f1Var.K0(rVar, j1Var, this.f14829c));
    }
}
