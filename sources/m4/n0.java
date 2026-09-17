package m4;

import java.util.List;
public final class n0 implements d1, e1 {
    public final int f14633a;
    public final g1 f14634b;
    public final int f14635c;

    public n0(g1 g1Var, int i10, int i11) {
        this.f14633a = i11;
        this.f14634b = g1Var;
        this.f14635c = i10;
    }

    @Override
    public void a(k1 k1Var, r rVar, List list) {
        switch (this.f14633a) {
            case 1:
                k1Var.b0(this.f14634b.K0(rVar, k1Var, this.f14635c), list);
                return;
            case 2:
                g1 g1Var = this.f14634b;
                g1Var.getClass();
                int size = list.size();
                int i10 = this.f14635c;
                if (size == 1) {
                    k1Var.s0((b2.k0) list.get(0), g1Var.K0(rVar, k1Var, i10));
                    return;
                }
                k1Var.P(g1Var.K0(rVar, k1Var, i10), g1Var.K0(rVar, k1Var, i10 + 1), list);
                return;
            default:
                k1Var.b0(this.f14634b.K0(rVar, k1Var, this.f14635c), list);
                return;
        }
    }

    @Override
    public void g(k1 k1Var, r rVar) {
        switch (this.f14633a) {
            case 0:
                k1Var.Y(this.f14634b.K0(rVar, k1Var, this.f14635c));
                return;
            default:
                k1Var.R(this.f14634b.K0(rVar, k1Var, this.f14635c));
                return;
        }
    }
}
