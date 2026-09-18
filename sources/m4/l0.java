package m4;

import java.util.List;
public final class l0 implements c1, d1 {
    public final f1 f14791a;
    public final int f14792b;
    public final int f14793c;

    public l0(f1 f1Var, int i10, int i11) {
        this.f14791a = f1Var;
        this.f14792b = i10;
        this.f14793c = i11;
    }

    @Override
    public void a(j1 j1Var, r rVar, List list) {
        f1 f1Var = this.f14791a;
        j1Var.P(f1Var.K0(rVar, j1Var, this.f14792b), f1Var.K0(rVar, j1Var, this.f14793c), list);
    }

    @Override
    public void d(j1 j1Var, r rVar) {
        f1 f1Var = this.f14791a;
        j1Var.S(f1Var.K0(rVar, j1Var, this.f14792b), f1Var.K0(rVar, j1Var, this.f14793c));
    }
}
