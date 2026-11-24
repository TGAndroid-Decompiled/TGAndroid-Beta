package defpackage;

import android.util.Pair;
import java.io.IOException;
public final class by6 implements vx6, wq3 {
    public final dy6 a;
    public final ey6 b;

    public by6(ey6 ey6Var, dy6 dy6Var) {
        this.b = ey6Var;
        this.a = dy6Var;
    }

    @Override
    public final void I(int i, rx6 rx6Var) {
        Pair a = a(i, rx6Var);
        if (a != null) {
            this.b.j.e(new ay6(this, a, (byte) 0));
        }
    }

    @Override
    public final void N(int i, rx6 rx6Var, vi2 vi2Var) {
        Pair a = a(i, rx6Var);
        if (a != null) {
            this.b.j.e(new lo6(this, a, vi2Var, (byte) 8));
        }
    }

    @Override
    public final void O(int i, rx6 rx6Var, f86 f86Var, fr6 fr6Var, int i2) {
        Pair a = a(i, rx6Var);
        if (a != null) {
            this.b.j.e(new i57(this, a, f86Var, fr6Var, i2, (byte) 20));
        }
    }

    public final Pair a(int i, rx6 rx6Var) {
        rx6 rx6Var2;
        dy6 dy6Var = this.a;
        rx6 rx6Var3 = null;
        if (rx6Var != null) {
            int i2 = 0;
            while (true) {
                if (i2 < dy6Var.c.size()) {
                    if (((rx6) dy6Var.c.get(i2)).d == rx6Var.d) {
                        Object obj = rx6Var.a;
                        Object obj2 = dy6Var.b;
                        int i3 = dd8.n;
                        rx6Var2 = rx6Var.a(Pair.create(obj2, obj));
                        break;
                    }
                    i2++;
                } else {
                    rx6Var2 = null;
                    break;
                }
            }
            if (rx6Var2 == null) {
                return null;
            }
            rx6Var3 = rx6Var2;
        }
        return Pair.create(Integer.valueOf(i + dy6Var.d), rx6Var3);
    }

    @Override
    public final void i(int i, rx6 rx6Var, Exception exc) {
        Pair a = a(i, rx6Var);
        if (a != null) {
            this.b.j.e(new lo6(this, a, exc, (byte) 9));
        }
    }

    @Override
    public final void j(int i, rx6 rx6Var, fr6 fr6Var) {
        Pair a = a(i, rx6Var);
        if (a != null) {
            this.b.j.e(new yx6(this, a, fr6Var, (byte) 1));
        }
    }

    @Override
    public final void k(int i, rx6 rx6Var, fr6 fr6Var) {
        Pair a = a(i, rx6Var);
        if (a != null) {
            this.b.j.e(new yx6(this, a, fr6Var, (byte) 0));
        }
    }

    @Override
    public final void n(int i, rx6 rx6Var, int i2) {
        Pair a = a(i, rx6Var);
        if (a != null) {
            this.b.j.e(new o94(this, a, i2, (byte) 9));
        }
    }

    @Override
    public final void s(int i, rx6 rx6Var, f86 f86Var, fr6 fr6Var) {
        Pair a = a(i, rx6Var);
        if (a != null) {
            this.b.j.e(new zx6(this, a, f86Var, fr6Var, (byte) 0));
        }
    }

    @Override
    public final void u(int i, rx6 rx6Var, f86 f86Var, fr6 fr6Var) {
        Pair a = a(i, rx6Var);
        if (a != null) {
            this.b.j.e(new zx6(this, a, f86Var, fr6Var, (byte) 1));
        }
    }

    @Override
    public final void w(int i, rx6 rx6Var, f86 f86Var, fr6 fr6Var, IOException iOException, boolean z) {
        Pair a = a(i, rx6Var);
        if (a != null) {
            this.b.j.e(new z2a(this, a, f86Var, fr6Var, iOException, z, (byte) 10));
        }
    }

    @Override
    public final void y(int i, rx6 rx6Var) {
        Pair a = a(i, rx6Var);
        if (a != null) {
            this.b.j.e(new ay6(this, a, (byte) 1));
        }
    }
}
