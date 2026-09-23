package m4;

import java.util.List;
public final class m0 implements y0, z0 {
    public final b1 f14626a;
    public final int f14627b;
    public final int f14628c;

    public m0(b1 b1Var, int i10, int i11) {
        this.f14626a = b1Var;
        this.f14627b = i10;
        this.f14628c = i11;
    }

    @Override
    public void a(f1 f1Var, r rVar, List list) {
        b1 b1Var = this.f14626a;
        f1Var.P(b1Var.K0(rVar, f1Var, this.f14627b), b1Var.K0(rVar, f1Var, this.f14628c), list);
    }

    @Override
    public void g(f1 f1Var, r rVar) {
        b1 b1Var = this.f14626a;
        f1Var.S(b1Var.K0(rVar, f1Var, this.f14627b), b1Var.K0(rVar, f1Var, this.f14628c));
    }
}
