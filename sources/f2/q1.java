package f2;

import java.util.ArrayList;
public abstract class q1 extends u0 {
    public boolean f6463m;
    public boolean f6464n;

    public q1() {
        this.f6484a = null;
        this.f6485b = new ArrayList();
        this.f6486c = 120L;
        this.d = 120L;
        this.f6487e = 250L;
        this.f6488f = 250L;
        this.f6489g = 250L;
        this.f6493l = 0L;
        this.f6463m = true;
    }

    @Override
    public boolean a(n1 n1Var, a5.e eVar, a5.e eVar2) {
        int i10;
        int i11;
        if (eVar != null && ((i10 = eVar.f165a) != (i11 = eVar2.f165a) || eVar.f166b != eVar2.f166b || this.f6464n)) {
            return r(n1Var, eVar, i10, eVar.f166b, i11, eVar2.f166b);
        }
        p(n1Var);
        return true;
    }

    public abstract void p(n1 n1Var);

    public abstract boolean q(n1 n1Var, n1 n1Var2, a5.e eVar, int i10, int i11, int i12, int i13);

    public abstract boolean r(n1 n1Var, a5.e eVar, int i10, int i11, int i12, int i13);

    public abstract void s(n1 n1Var, a5.e eVar);

    public boolean t(n1 n1Var) {
        if (this.f6463m && !n1Var.h()) {
            return false;
        }
        return true;
    }

    public final void u(n1 n1Var) {
        w(n1Var);
        d(n1Var);
    }

    public final void v(n1 n1Var) {
        x(n1Var);
        d(n1Var);
    }

    public void y() {
    }

    public void w(n1 n1Var) {
    }

    public void x(n1 n1Var) {
    }
}
