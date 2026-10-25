package m4;

import java.util.List;
public final class q0 implements f1, g1, e2.j {
    public final j1 f18202a;
    public final int f18203b;
    public final int f18204c;

    public q0(j1 j1Var, int i10, int i11) {
        this.f18202a = j1Var;
        this.f18203b = i10;
        this.f18204c = i11;
    }

    @Override
    public void accept(Object obj) {
        n1 n1Var = (n1) obj;
        j1 j1Var = this.f18202a;
        ((f0) j1Var.f18091a.get()).getClass();
        i1 i1Var = j1Var.f18095i;
        if (i1Var != null) {
            i1Var.setFixedSize(this.f18203b, this.f18204c);
        }
    }

    @Override
    public void b(n1 n1Var, w wVar, List list) {
        j1 j1Var = this.f18202a;
        n1Var.O(j1Var.K0(wVar, n1Var, this.f18203b), j1Var.K0(wVar, n1Var, this.f18204c), list);
    }

    @Override
    public void e(n1 n1Var, w wVar) {
        j1 j1Var = this.f18202a;
        n1Var.R(j1Var.K0(wVar, n1Var, this.f18203b), j1Var.K0(wVar, n1Var, this.f18204c));
    }
}
