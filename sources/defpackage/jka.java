package defpackage;

import java.util.ArrayList;
public abstract class jka extends d69 {
    public boolean m;
    public boolean n;

    public jka() {
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
    public boolean a(u69 u69Var, az8 az8Var, az8 az8Var2) {
        int i;
        int i2;
        if (az8Var != null && ((i = az8Var.b) != (i2 = az8Var2.b) || az8Var.c != az8Var2.c || this.n)) {
            return r(u69Var, az8Var, i, az8Var.c, i2, az8Var2.c);
        }
        p(u69Var);
        return true;
    }

    public abstract void p(u69 u69Var);

    public abstract boolean q(u69 u69Var, u69 u69Var2, az8 az8Var, int i, int i2, int i3, int i4);

    public abstract boolean r(u69 u69Var, az8 az8Var, int i, int i2, int i3, int i4);

    public abstract void s(u69 u69Var, az8 az8Var);

    public boolean t(u69 u69Var) {
        if (this.m && !u69Var.h()) {
            return false;
        }
        return true;
    }

    public final void u(u69 u69Var) {
        w(u69Var);
        d(u69Var);
    }

    public final void v(u69 u69Var) {
        x(u69Var);
        d(u69Var);
    }

    public abstract void y();

    public void w(u69 u69Var) {
    }

    public void x(u69 u69Var) {
    }
}
