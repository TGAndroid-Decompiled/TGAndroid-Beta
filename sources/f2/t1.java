package f2;

import java.util.ArrayList;
public abstract class t1 extends w0 {
    public boolean f5532m;
    public boolean f5533n;

    public t1() {
        this.f5546a = null;
        this.f5547b = new ArrayList();
        this.f5548c = 120L;
        this.d = 120L;
        this.f5549e = 250L;
        this.f5550f = 250L;
        this.f5551g = 250L;
        this.f5555l = 0L;
        this.f5532m = true;
    }

    @Override
    public boolean a(q1 q1Var, d5.p pVar, d5.p pVar2) {
        int i9;
        int i10;
        if (pVar != null && ((i9 = pVar.f4376a) != (i10 = pVar2.f4376a) || pVar.f4377b != pVar2.f4377b || this.f5533n)) {
            return r(q1Var, pVar, i9, pVar.f4377b, i10, pVar2.f4377b);
        }
        p(q1Var);
        return true;
    }

    public abstract void p(q1 q1Var);

    public abstract boolean q(q1 q1Var, q1 q1Var2, d5.p pVar, int i9, int i10, int i11, int i12);

    public abstract boolean r(q1 q1Var, d5.p pVar, int i9, int i10, int i11, int i12);

    public abstract void s(q1 q1Var, d5.p pVar);

    public boolean t(q1 q1Var) {
        if (this.f5532m && !q1Var.h()) {
            return false;
        }
        return true;
    }

    public final void u(q1 q1Var) {
        w(q1Var);
        d(q1Var);
    }

    public final void v(q1 q1Var) {
        x(q1Var);
        d(q1Var);
    }

    public void y() {
    }

    public void w(q1 q1Var) {
    }

    public void x(q1 q1Var) {
    }
}
