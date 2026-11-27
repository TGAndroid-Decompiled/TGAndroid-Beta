package defpackage;

import java.util.ArrayList;
public abstract class cma extends o79 {
    public boolean m;
    public boolean n;

    public cma() {
        this.a = null;
        this.b = new ArrayList();
        this.c = (short) 120;
        this.d = (short) 120;
        this.e = (short) 250;
        this.f = (short) 250;
        this.g = (short) 250;
        this.l = (short) 0;
        this.m = true;
    }

    @Override
    public boolean a(f89 f89Var, l09 l09Var, l09 l09Var2) {
        int i;
        int i2;
        if (l09Var != null && ((i = l09Var.b) != (i2 = l09Var2.b) || l09Var.c != l09Var2.c || this.n)) {
            return r(f89Var, l09Var, i, l09Var.c, i2, l09Var2.c);
        }
        p(f89Var);
        return true;
    }

    public abstract void p(f89 f89Var);

    public abstract boolean q(f89 f89Var, f89 f89Var2, l09 l09Var, int i, int i2, int i3, int i4);

    public abstract boolean r(f89 f89Var, l09 l09Var, int i, int i2, int i3, int i4);

    public abstract void s(f89 f89Var, l09 l09Var);

    public boolean t(f89 f89Var) {
        if (this.m && !f89Var.h()) {
            return false;
        }
        return true;
    }

    public final void u(f89 f89Var) {
        w(f89Var);
        d(f89Var);
    }

    public final void v(f89 f89Var) {
        x(f89Var);
        d(f89Var);
    }

    public abstract void y();

    public void w(f89 f89Var) {
    }

    public void x(f89 f89Var) {
    }
}
