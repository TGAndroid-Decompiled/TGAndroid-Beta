package m4;

import java.util.List;
public final class m0 implements y0, z0 {
    public final b1 f16180a;
    public final int f16181b;
    public final int f16182c;

    public m0(b1 b1Var, int i10, int i11) {
        this.f16180a = b1Var;
        this.f16181b = i10;
        this.f16182c = i11;
    }

    @Override
    public void a(f1 f1Var, r rVar, List list) {
        b1 b1Var = this.f16180a;
        f1Var.P(b1Var.J0(rVar, f1Var, this.f16181b), b1Var.J0(rVar, f1Var, this.f16182c), list);
    }

    @Override
    public void g(f1 f1Var, r rVar) {
        b1 b1Var = this.f16180a;
        f1Var.S(b1Var.J0(rVar, f1Var, this.f16181b), b1Var.J0(rVar, f1Var, this.f16182c));
    }
}
