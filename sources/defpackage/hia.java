package defpackage;

import java.util.ArrayList;
public abstract class hia extends b49 {
    public boolean m;
    public boolean n;

    public hia() {
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
    public boolean a(s49 s49Var, zw8 zw8Var, zw8 zw8Var2) {
        int i;
        int i2;
        if (zw8Var != null && ((i = zw8Var.b) != (i2 = zw8Var2.b) || zw8Var.c != zw8Var2.c || this.n)) {
            return r(s49Var, zw8Var, i, zw8Var.c, i2, zw8Var2.c);
        }
        p(s49Var);
        return true;
    }

    public abstract void p(s49 s49Var);

    public abstract boolean q(s49 s49Var, s49 s49Var2, zw8 zw8Var, int i, int i2, int i3, int i4);

    public abstract boolean r(s49 s49Var, zw8 zw8Var, int i, int i2, int i3, int i4);

    public abstract void s(s49 s49Var, zw8 zw8Var);

    public boolean t(s49 s49Var) {
        if (this.m && !s49Var.h()) {
            return false;
        }
        return true;
    }

    public final void u(s49 s49Var) {
        w(s49Var);
        d(s49Var);
    }

    public final void v(s49 s49Var) {
        x(s49Var);
        d(s49Var);
    }

    public abstract void y();

    public void w(s49 s49Var) {
    }

    public void x(s49 s49Var) {
    }
}
