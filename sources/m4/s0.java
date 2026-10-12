package m4;

import java.util.List;
public final class s0 implements f1, g1 {
    public final int f15612a;
    public final j1 f15613b;
    public final int f15614c;

    public s0(j1 j1Var, int i10, int i11) {
        this.f15612a = i11;
        this.f15613b = j1Var;
        this.f15614c = i10;
    }

    @Override
    public void a(n1 n1Var, w wVar, List list) {
        switch (this.f15612a) {
            case 1:
                n1Var.b0(this.f15613b.K0(wVar, n1Var, this.f15614c), list);
                return;
            case 2:
                j1 j1Var = this.f15613b;
                j1Var.getClass();
                int size = list.size();
                int i10 = this.f15614c;
                if (size == 1) {
                    n1Var.u0((b2.p0) list.get(0), j1Var.K0(wVar, n1Var, i10));
                    return;
                }
                n1Var.O(j1Var.K0(wVar, n1Var, i10), j1Var.K0(wVar, n1Var, i10 + 1), list);
                return;
            default:
                n1Var.b0(this.f15613b.K0(wVar, n1Var, this.f15614c), list);
                return;
        }
    }

    @Override
    public void e(n1 n1Var, w wVar) {
        switch (this.f15612a) {
            case 0:
                n1Var.Y(this.f15613b.K0(wVar, n1Var, this.f15614c));
                return;
            default:
                n1Var.Q(this.f15613b.K0(wVar, n1Var, this.f15614c));
                return;
        }
    }
}
