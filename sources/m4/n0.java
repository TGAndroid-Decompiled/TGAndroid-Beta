package m4;

import java.util.List;
public final class n0 implements e1, f1 {
    public final int f13453a;
    public final h1 f13454b;
    public final int f13455c;

    public n0(h1 h1Var, int i10, int i11) {
        this.f13453a = i11;
        this.f13454b = h1Var;
        this.f13455c = i10;
    }

    @Override
    public void a(l1 l1Var, r rVar, List list) {
        switch (this.f13453a) {
            case 1:
                l1Var.b0(this.f13454b.K0(rVar, l1Var, this.f13455c), list);
                return;
            case 2:
                h1 h1Var = this.f13454b;
                h1Var.getClass();
                int size = list.size();
                int i10 = this.f13455c;
                if (size == 1) {
                    l1Var.s0((b2.k0) list.get(0), h1Var.K0(rVar, l1Var, i10));
                    return;
                }
                l1Var.P(h1Var.K0(rVar, l1Var, i10), h1Var.K0(rVar, l1Var, i10 + 1), list);
                return;
            default:
                l1Var.b0(this.f13454b.K0(rVar, l1Var, this.f13455c), list);
                return;
        }
    }

    @Override
    public void e(l1 l1Var, r rVar) {
        switch (this.f13453a) {
            case 0:
                l1Var.Y(this.f13454b.K0(rVar, l1Var, this.f13455c));
                return;
            default:
                l1Var.R(this.f13454b.K0(rVar, l1Var, this.f13455c));
                return;
        }
    }
}
