package defpackage;

import android.util.Pair;
import java.io.IOException;
public final class b07 implements vz6, gs3 {
    public final d07 a;
    public final e07 b;

    public b07(e07 e07Var, d07 d07Var) {
        this.b = e07Var;
        this.a = d07Var;
    }

    @Override
    public final void I(int i, rz6 rz6Var) {
        Pair a = a(i, rz6Var);
        if (a != null) {
            this.b.j.e(new a07(this, a, (byte) 0));
        }
    }

    @Override
    public final void N(int i, rz6 rz6Var, jk2 jk2Var) {
        Pair a = a(i, rz6Var);
        if (a != null) {
            this.b.j.e(new fp6(this, a, jk2Var, (byte) 10));
        }
    }

    @Override
    public final void O(int i, rz6 rz6Var, ea6 ea6Var, ft6 ft6Var, int i2) {
        Pair a = a(i, rz6Var);
        if (a != null) {
            this.b.j.e(new i77(this, a, ea6Var, ft6Var, i2, (byte) 21));
        }
    }

    public final Pair a(int i, rz6 rz6Var) {
        rz6 rz6Var2;
        d07 d07Var = this.a;
        rz6 rz6Var3 = null;
        if (rz6Var != null) {
            int i2 = 0;
            while (true) {
                if (i2 < d07Var.c.size()) {
                    if (((rz6) d07Var.c.get(i2)).d == rz6Var.d) {
                        Object obj = rz6Var.a;
                        Object obj2 = d07Var.b;
                        int i3 = ff8.n;
                        rz6Var2 = rz6Var.a(Pair.create(obj2, obj));
                        break;
                    }
                    i2++;
                } else {
                    rz6Var2 = null;
                    break;
                }
            }
            if (rz6Var2 == null) {
                return null;
            }
            rz6Var3 = rz6Var2;
        }
        return Pair.create(Integer.valueOf(i + d07Var.d), rz6Var3);
    }

    @Override
    public final void i(int i, rz6 rz6Var, Exception exc) {
        Pair a = a(i, rz6Var);
        if (a != null) {
            this.b.j.e(new fp6(this, a, exc, (byte) 11));
        }
    }

    @Override
    public final void j(int i, rz6 rz6Var, ft6 ft6Var) {
        Pair a = a(i, rz6Var);
        if (a != null) {
            this.b.j.e(new yz6(this, a, ft6Var, (byte) 1));
        }
    }

    @Override
    public final void k(int i, rz6 rz6Var, ft6 ft6Var) {
        Pair a = a(i, rz6Var);
        if (a != null) {
            this.b.j.e(new yz6(this, a, ft6Var, (byte) 0));
        }
    }

    @Override
    public final void n(int i, rz6 rz6Var, int i2) {
        Pair a = a(i, rz6Var);
        if (a != null) {
            this.b.j.e(new ob4(this, a, i2, (byte) 9));
        }
    }

    @Override
    public final void s(int i, rz6 rz6Var, ea6 ea6Var, ft6 ft6Var) {
        Pair a = a(i, rz6Var);
        if (a != null) {
            this.b.j.e(new zz6(this, a, ea6Var, ft6Var, (byte) 0));
        }
    }

    @Override
    public final void u(int i, rz6 rz6Var, ea6 ea6Var, ft6 ft6Var) {
        Pair a = a(i, rz6Var);
        if (a != null) {
            this.b.j.e(new zz6(this, a, ea6Var, ft6Var, (byte) 1));
        }
    }

    @Override
    public final void w(int i, rz6 rz6Var, ea6 ea6Var, ft6 ft6Var, IOException iOException, boolean z) {
        Pair a = a(i, rz6Var);
        if (a != null) {
            this.b.j.e(new b5a(this, a, ea6Var, ft6Var, iOException, z, (byte) 10));
        }
    }

    @Override
    public final void y(int i, rz6 rz6Var) {
        Pair a = a(i, rz6Var);
        if (a != null) {
            this.b.j.e(new a07(this, a, (byte) 1));
        }
    }
}
