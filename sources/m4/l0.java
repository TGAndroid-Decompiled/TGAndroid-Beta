package m4;

import java.util.List;
public final class l0 implements c1, d1 {
    public final f1 f16019a;
    public final int f16020b;
    public final int f16021c;

    public l0(f1 f1Var, int i10, int i11) {
        this.f16019a = f1Var;
        this.f16020b = i10;
        this.f16021c = i11;
    }

    @Override
    public void a(j1 j1Var, r rVar, List list) {
        f1 f1Var = this.f16019a;
        j1Var.P(f1Var.K0(rVar, j1Var, this.f16020b), f1Var.K0(rVar, j1Var, this.f16021c), list);
    }

    @Override
    public void j(j1 j1Var, r rVar) {
        f1 f1Var = this.f16019a;
        j1Var.S(f1Var.K0(rVar, j1Var, this.f16020b), f1Var.K0(rVar, j1Var, this.f16021c));
    }
}
