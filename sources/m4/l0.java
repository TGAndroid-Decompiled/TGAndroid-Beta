package m4;

import java.util.List;
public final class l0 implements c1, d1 {
    public final f1 f15992a;
    public final int f15993b;
    public final int f15994c;

    public l0(f1 f1Var, int i10, int i11) {
        this.f15992a = f1Var;
        this.f15993b = i10;
        this.f15994c = i11;
    }

    @Override
    public void a(j1 j1Var, r rVar, List list) {
        f1 f1Var = this.f15992a;
        j1Var.P(f1Var.K0(rVar, j1Var, this.f15993b), f1Var.K0(rVar, j1Var, this.f15994c), list);
    }

    @Override
    public void j(j1 j1Var, r rVar) {
        f1 f1Var = this.f15992a;
        j1Var.S(f1Var.K0(rVar, j1Var, this.f15993b), f1Var.K0(rVar, j1Var, this.f15994c));
    }
}
