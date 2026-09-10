package m4;

import java.util.List;
public final class m0 implements e1, f1 {
    public final h1 f13445a;
    public final int f13446b;
    public final int f13447c;

    public m0(h1 h1Var, int i10, int i11) {
        this.f13445a = h1Var;
        this.f13446b = i10;
        this.f13447c = i11;
    }

    @Override
    public void a(l1 l1Var, r rVar, List list) {
        h1 h1Var = this.f13445a;
        l1Var.P(h1Var.K0(rVar, l1Var, this.f13446b), h1Var.K0(rVar, l1Var, this.f13447c), list);
    }

    @Override
    public void e(l1 l1Var, r rVar) {
        h1 h1Var = this.f13445a;
        l1Var.S(h1Var.K0(rVar, l1Var, this.f13446b), h1Var.K0(rVar, l1Var, this.f13447c));
    }
}
