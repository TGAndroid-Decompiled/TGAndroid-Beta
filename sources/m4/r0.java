package m4;

import java.util.List;
public final class r0 implements f1, g1, e2.j {
    public final j1 f15594a;
    public final int f15595b;
    public final int f15596c;

    public r0(j1 j1Var, int i10, int i11) {
        this.f15594a = j1Var;
        this.f15595b = i10;
        this.f15596c = i11;
    }

    @Override
    public void a(n1 n1Var, w wVar, List list) {
        j1 j1Var = this.f15594a;
        n1Var.O(j1Var.K0(wVar, n1Var, this.f15595b), j1Var.K0(wVar, n1Var, this.f15596c), list);
    }

    @Override
    public void accept(Object obj) {
        n1 n1Var = (n1) obj;
        j1 j1Var = this.f15594a;
        ((f0) j1Var.f15474a.get()).getClass();
        i1 i1Var = j1Var.f15478i;
        if (i1Var != null) {
            i1Var.setFixedSize(this.f15595b, this.f15596c);
        }
    }

    @Override
    public void e(n1 n1Var, w wVar) {
        j1 j1Var = this.f15594a;
        n1Var.R(j1Var.K0(wVar, n1Var, this.f15595b), j1Var.K0(wVar, n1Var, this.f15596c));
    }
}
