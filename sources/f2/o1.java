package f2;

import java.util.ArrayList;
public abstract class o1 extends t0 {
    public boolean f5807m;
    public boolean f5808n;

    public o1() {
        this.f5824a = null;
        this.f5825b = new ArrayList();
        this.f5826c = 120L;
        this.d = 120L;
        this.e = 250L;
        this.f5827f = 250L;
        this.f5828g = 250L;
        this.f5832l = 0L;
        this.f5807m = true;
    }

    @Override
    public boolean a(l1 l1Var, c5.e eVar, c5.e eVar2) {
        int i10;
        int i11;
        if (eVar != null && ((i10 = eVar.f2108a) != (i11 = eVar2.f2108a) || eVar.f2109b != eVar2.f2109b || this.f5808n)) {
            return r(l1Var, eVar, i10, eVar.f2109b, i11, eVar2.f2109b);
        }
        p(l1Var);
        return true;
    }

    public abstract void p(l1 l1Var);

    public abstract boolean q(l1 l1Var, l1 l1Var2, c5.e eVar, int i10, int i11, int i12, int i13);

    public abstract boolean r(l1 l1Var, c5.e eVar, int i10, int i11, int i12, int i13);

    public abstract void s(l1 l1Var, c5.e eVar);

    public boolean t(l1 l1Var) {
        if (this.f5807m && !l1Var.h()) {
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
