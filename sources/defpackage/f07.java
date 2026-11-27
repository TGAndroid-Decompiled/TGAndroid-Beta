package defpackage;

import android.util.Pair;
import java.io.IOException;
public final class f07 implements zz6, nr3 {
    public final h07 a;
    public final i07 b;

    public f07(i07 i07Var, h07 h07Var) {
        this.b = i07Var;
        this.a = h07Var;
    }

    @Override
    public final void I(int i, vz6 vz6Var) {
        Pair a = a(i, vz6Var);
        if (a != null) {
            this.b.j.e(new e07(this, a, (byte) 0));
        }
    }

    @Override
    public final void N(int i, vz6 vz6Var, rj2 rj2Var) {
        Pair a = a(i, vz6Var);
        if (a != null) {
            this.b.j.e(new yg6(this, a, rj2Var, (byte) 13));
        }
    }

    @Override
    public final void O(int i, vz6 vz6Var, ja6 ja6Var, jt6 jt6Var, int i2) {
        Pair a = a(i, vz6Var);
        if (a != null) {
            this.b.j.e(new l77(this, a, ja6Var, jt6Var, i2, (byte) 21));
        }
    }

    public final Pair a(int i, vz6 vz6Var) {
        vz6 vz6Var2;
        h07 h07Var = this.a;
        vz6 vz6Var3 = null;
        if (vz6Var != null) {
            int i2 = 0;
            while (true) {
                if (i2 < h07Var.c.size()) {
                    if (((vz6) h07Var.c.get(i2)).d == vz6Var.d) {
                        Object obj = vz6Var.a;
                        Object obj2 = h07Var.b;
                        int i3 = rg8.n;
                        vz6Var2 = vz6Var.a(Pair.create(obj2, obj));
                        break;
                    }
                    i2++;
                } else {
                    vz6Var2 = null;
                    break;
                }
            }
            if (vz6Var2 == null) {
                return null;
            }
            vz6Var3 = vz6Var2;
        }
        return Pair.create(Integer.valueOf(i + h07Var.d), vz6Var3);
    }

    @Override
    public final void i(int i, vz6 vz6Var, Exception exc) {
        Pair a = a(i, vz6Var);
        if (a != null) {
            this.b.j.e(new yg6(this, a, exc, (byte) 14));
        }
    }

    @Override
    public final void j(int i, vz6 vz6Var, jt6 jt6Var) {
        Pair a = a(i, vz6Var);
        if (a != null) {
            this.b.j.e(new c07(this, a, jt6Var, (byte) 1));
        }
    }

    @Override
    public final void k(int i, vz6 vz6Var, jt6 jt6Var) {
        Pair a = a(i, vz6Var);
        if (a != null) {
            this.b.j.e(new c07(this, a, jt6Var, (byte) 0));
        }
    }

    @Override
    public final void n(int i, vz6 vz6Var, int i2) {
        Pair a = a(i, vz6Var);
        if (a != null) {
            this.b.j.e(new sb4(this, a, i2, (byte) 9));
        }
    }

    @Override
    public final void s(int i, vz6 vz6Var, ja6 ja6Var, jt6 jt6Var) {
        Pair a = a(i, vz6Var);
        if (a != null) {
            this.b.j.e(new d07(this, a, ja6Var, jt6Var, (byte) 0));
        }
    }

    @Override
    public final void u(int i, vz6 vz6Var, ja6 ja6Var, jt6 jt6Var) {
        Pair a = a(i, vz6Var);
        if (a != null) {
            this.b.j.e(new d07(this, a, ja6Var, jt6Var, (byte) 1));
        }
    }

    @Override
    public final void w(int i, vz6 vz6Var, ja6 ja6Var, jt6 jt6Var, IOException iOException, boolean z) {
        Pair a = a(i, vz6Var);
        if (a != null) {
            this.b.j.e(new y6a(this, a, ja6Var, jt6Var, iOException, z, (byte) 10));
        }
    }

    @Override
    public final void y(int i, vz6 vz6Var) {
        Pair a = a(i, vz6Var);
        if (a != null) {
            this.b.j.e(new e07(this, a, (byte) 1));
        }
    }
}
