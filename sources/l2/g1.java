package l2;

import android.util.Pair;
import bi.l4;
import bi.ub;
import java.io.IOException;
public final class g1 implements x2.k0, q2.k {
    public final i1 f17820a;
    public final j1 f17821b;

    public g1(j1 j1Var, i1 i1Var) {
        this.f17821b = j1Var;
        this.f17820a = i1Var;
    }

    @Override
    public final void A(int i7, x2.g0 g0Var, x2.u uVar, x2.c0 c0Var) {
        Pair a10 = a(i7, g0Var);
        if (a10 != null) {
            this.f17821b.f17905i.d(new e1(this, a10, uVar, c0Var, 0));
        }
    }

    @Override
    public final void E(int i7, x2.g0 g0Var, x2.c0 c0Var) {
        Pair a10 = a(i7, g0Var);
        if (a10 != null) {
            this.f17821b.f17905i.d(new d1(this, a10, c0Var, 0));
        }
    }

    @Override
    public final void G(int i7, x2.g0 g0Var, x2.u uVar, x2.c0 c0Var) {
        Pair a10 = a(i7, g0Var);
        if (a10 != null) {
            this.f17821b.f17905i.d(new e1(this, a10, uVar, c0Var, 1));
        }
    }

    @Override
    public final void I(int i7, x2.g0 g0Var, x2.u uVar, x2.c0 c0Var, int i10) {
        Pair a10 = a(i7, g0Var);
        if (a10 != null) {
            this.f17821b.f17905i.d(new ub(this, a10, uVar, c0Var, i10, 6));
        }
    }

    @Override
    public final void K(int i7, x2.g0 g0Var, Exception exc) {
        Pair a10 = a(i7, g0Var);
        if (a10 != null) {
            this.f17821b.f17905i.d(new z0(this, a10, exc, 2));
        }
    }

    @Override
    public final void N(int i7, x2.g0 g0Var, int i10) {
        Pair a10 = a(i7, g0Var);
        if (a10 != null) {
            this.f17821b.f17905i.d(new ai.e0(this, a10, i10, 19));
        }
    }

    public final Pair a(int i7, x2.g0 g0Var) {
        x2.g0 g0Var2;
        i1 i1Var = this.f17820a;
        x2.g0 g0Var3 = null;
        if (g0Var != null) {
            int i10 = 0;
            while (true) {
                if (i10 < i1Var.f17892c.size()) {
                    if (((x2.g0) i1Var.f17892c.get(i10)).d == g0Var.d) {
                        Object obj = g0Var.f58235a;
                        Object obj2 = i1Var.f17891b;
                        int i11 = a.f17734g;
                        g0Var2 = g0Var.a(Pair.create(obj2, obj));
                        break;
                    }
                    i10++;
                } else {
                    g0Var2 = null;
                    break;
                }
            }
            if (g0Var2 == null) {
                return null;
            }
            g0Var3 = g0Var2;
        }
        return Pair.create(Integer.valueOf(i7 + i1Var.d), g0Var3);
    }

    @Override
    public final void b(int i7, x2.g0 g0Var, qb.a aVar) {
        Pair a10 = a(i7, g0Var);
        if (a10 != null) {
            this.f17821b.f17905i.d(new z0(this, a10, aVar, 1));
        }
    }

    @Override
    public final void d(int i7, x2.g0 g0Var, x2.c0 c0Var) {
        Pair a10 = a(i7, g0Var);
        if (a10 != null) {
            this.f17821b.f17905i.d(new d1(this, a10, c0Var, 1));
        }
    }

    @Override
    public final void r(int i7, x2.g0 g0Var, x2.u uVar, x2.c0 c0Var, IOException iOException, boolean z9) {
        Pair a10 = a(i7, g0Var);
        if (a10 != null) {
            this.f17821b.f17905i.d(new l4(this, a10, uVar, c0Var, iOException, z9, 1));
        }
    }

    @Override
    public final void w(int i7, x2.g0 g0Var) {
        Pair a10 = a(i7, g0Var);
        if (a10 != null) {
            this.f17821b.f17905i.d(new f1(this, a10, 1));
        }
    }

    @Override
    public final void z(int i7, x2.g0 g0Var) {
        Pair a10 = a(i7, g0Var);
        if (a10 != null) {
            this.f17821b.f17905i.d(new f1(this, a10, 0));
        }
    }
}
