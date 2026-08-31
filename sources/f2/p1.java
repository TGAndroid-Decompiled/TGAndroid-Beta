package f2;

import java.util.ArrayList;
public abstract class p1 extends u0 {
    public boolean f5910m;
    public boolean f5911n;

    public p1() {
        this.f5928a = null;
        this.f5929b = new ArrayList();
        this.f5930c = 120L;
        this.d = 120L;
        this.f5931e = 250L;
        this.f5932f = 250L;
        this.f5933g = 250L;
        this.f5937l = 0L;
        this.f5910m = true;
    }

    @Override
    public boolean a(m1 m1Var, c5.e eVar, c5.e eVar2) {
        int i10;
        int i11;
        if (eVar != null && ((i10 = eVar.f2268a) != (i11 = eVar2.f2268a) || eVar.f2269b != eVar2.f2269b || this.f5911n)) {
            return r(m1Var, eVar, i10, eVar.f2269b, i11, eVar2.f2269b);
        }
        p(m1Var);
        return true;
    }

    public abstract void p(m1 m1Var);

    public abstract boolean q(m1 m1Var, m1 m1Var2, c5.e eVar, int i10, int i11, int i12, int i13);

    public abstract boolean r(m1 m1Var, c5.e eVar, int i10, int i11, int i12, int i13);

    public abstract void s(m1 m1Var, c5.e eVar);

    public boolean t(m1 m1Var) {
        if (this.f5910m && !m1Var.h()) {
            return false;
        }
        return true;
    }

    public final void u(m1 m1Var) {
        w(m1Var);
        d(m1Var);
    }

    public final void v(m1 m1Var) {
        x(m1Var);
        d(m1Var);
    }

    public void y() {
    }

    public void w(m1 m1Var) {
    }

    public void x(m1 m1Var) {
    }
}
