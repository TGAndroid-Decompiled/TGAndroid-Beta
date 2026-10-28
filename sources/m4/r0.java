package m4;

import java.util.List;
public final class r0 implements f1, g1 {
    public final int f18209a;
    public final j1 f18210b;
    public final int f18211c;

    public r0(j1 j1Var, int i10, int i11) {
        this.f18209a = i11;
        this.f18210b = j1Var;
        this.f18211c = i10;
    }

    @Override
    public void b(n1 n1Var, w wVar, List list) {
        switch (this.f18209a) {
            case 1:
                n1Var.b0(this.f18210b.K0(wVar, n1Var, this.f18211c), list);
                return;
            case 2:
                j1 j1Var = this.f18210b;
                j1Var.getClass();
                int size = list.size();
                int i10 = this.f18211c;
                if (size == 1) {
                    n1Var.u0((b2.p0) list.get(0), j1Var.K0(wVar, n1Var, i10));
                    return;
                }
                n1Var.O(j1Var.K0(wVar, n1Var, i10), j1Var.K0(wVar, n1Var, i10 + 1), list);
                return;
            default:
                n1Var.b0(this.f18210b.K0(wVar, n1Var, this.f18211c), list);
                return;
        }
    }

    @Override
    public void e(n1 n1Var, w wVar) {
        switch (this.f18209a) {
            case 0:
                n1Var.Y(this.f18210b.K0(wVar, n1Var, this.f18211c));
                return;
            default:
                n1Var.Q(this.f18210b.K0(wVar, n1Var, this.f18211c));
                return;
        }
    }
}
