package f2;

import java.util.ArrayList;

public abstract class r1 extends v0 {

    public boolean f5819m;

    public boolean f5820n;

    public r1() {
        this.f5840a = null;
        this.f5841b = new ArrayList();
        this.f5842c = 120L;
        this.d = 120L;
        this.f5843e = 250L;
        this.f5844f = 250L;
        this.f5845g = 250L;
        this.f5849l = 0L;
        this.f5819m = true;
    }

    @Override
    public boolean a(o1 o1Var, d5.p pVar, d5.p pVar2) {
        int i10;
        int i11;
        if (pVar != null && ((i10 = pVar.f4821a) != (i11 = pVar2.f4821a) || pVar.f4822b != pVar2.f4822b || this.f5820n)) {
            return r(o1Var, pVar, i10, pVar.f4822b, i11, pVar2.f4822b);
        }
        p(o1Var);
        return true;
    }

    public abstract void p(o1 o1Var);

    public abstract boolean q(o1 o1Var, o1 o1Var2, d5.p pVar, int i10, int i11, int i12, int i13);

    public abstract boolean r(o1 o1Var, d5.p pVar, int i10, int i11, int i12, int i13);

    public abstract void s(o1 o1Var, d5.p pVar);

    public boolean t(o1 o1Var) {
        return !this.f5819m || o1Var.h();
    }

    public final void u(o1 o1Var) {
        w(o1Var);
        d(o1Var);
    }

    public final void v(o1 o1Var) {
        x(o1Var);
        d(o1Var);
    }

    public void y() {
    }

    public void w(o1 o1Var) {
    }

    public void x(o1 o1Var) {
    }
}
