package f2;

import java.util.ArrayList;
public abstract class o1 extends t0 {
    public boolean f5818m;
    public boolean f5819n;

    public o1() {
        this.f5835a = null;
        this.f5836b = new ArrayList();
        this.f5837c = 120L;
        this.d = 120L;
        this.e = 250L;
        this.f5838f = 250L;
        this.f5839g = 250L;
        this.f5843l = 0L;
        this.f5818m = true;
    }

    @Override
    public boolean a(l1 l1Var, c5.e eVar, c5.e eVar2) {
        int i10;
        int i11;
        if (eVar != null && ((i10 = eVar.f2085a) != (i11 = eVar2.f2085a) || eVar.f2086b != eVar2.f2086b || this.f5819n)) {
            return r(l1Var, eVar, i10, eVar.f2086b, i11, eVar2.f2086b);
        }
        p(l1Var);
        return true;
    }

    public abstract void p(l1 l1Var);

    public abstract boolean q(l1 l1Var, l1 l1Var2, c5.e eVar, int i10, int i11, int i12, int i13);

    public abstract boolean r(l1 l1Var, c5.e eVar, int i10, int i11, int i12, int i13);

    public abstract void s(l1 l1Var, c5.e eVar);

    public boolean t(l1 l1Var) {
        if (this.f5818m && !l1Var.h()) {
            return false;
        }
        return true;
    }

    public final void u(l1 l1Var) {
        w(l1Var);
        d(l1Var);
    }

    public final void v(l1 l1Var) {
        x(l1Var);
        d(l1Var);
    }

    public void y() {
    }

    public void w(l1 l1Var) {
    }

    public void x(l1 l1Var) {
    }
}
