package l2;

import android.util.Pair;
import di.o3;
import java.io.IOException;
public final class c1 implements x2.k0, q2.k {
    public final e1 f19275a;
    public final f1 f19276b;

    public c1(f1 f1Var, e1 e1Var) {
        this.f19276b = f1Var;
        this.f19275a = e1Var;
    }

    @Override
    public final void A(int i7, x2.g0 g0Var, x2.u uVar, x2.c0 c0Var) {
        Pair a10 = a(i7, g0Var);
        if (a10 != null) {
            this.f19276b.f19362i.d(new a1(this, a10, uVar, c0Var, 0));
        }
    }

    @Override
    public final void C(int i7, x2.g0 g0Var, x2.c0 c0Var) {
        Pair a10 = a(i7, g0Var);
        if (a10 != null) {
            this.f19276b.f19362i.d(new z0(this, a10, c0Var, 0));
        }
    }

    @Override
    public final void G(int i7, x2.g0 g0Var, x2.u uVar, x2.c0 c0Var) {
        Pair a10 = a(i7, g0Var);
        if (a10 != null) {
            this.f19276b.f19362i.d(new a1(this, a10, uVar, c0Var, 1));
        }
    }

    @Override
    public final void I(int i7, x2.g0 g0Var, x2.u uVar, x2.c0 c0Var, int i10) {
        Pair a10 = a(i7, g0Var);
        if (a10 != null) {
            this.f19276b.f19362i.d(new ai.g1(this, a10, uVar, c0Var, i10, 8));
        }
    }

    @Override
    public final void K(int i7, x2.g0 g0Var, Exception exc) {
        Pair a10 = a(i7, g0Var);
        if (a10 != null) {
            this.f19276b.f19362i.d(new kg.i0(this, a10, exc, 11));
        }
    }

    @Override
    public final void N(int i7, x2.g0 g0Var, int i10) {
        Pair a10 = a(i7, g0Var);
        if (a10 != null) {
            this.f19276b.f19362i.d(new ai.a1(this, a10, i10, 23));
        }
    }

    public final Pair a(int i7, x2.g0 g0Var) {
        x2.g0 g0Var2;
        e1 e1Var = this.f19275a;
        x2.g0 g0Var3 = null;
        if (g0Var != null) {
            int i10 = 0;
            while (true) {
                if (i10 < e1Var.f19301c.size()) {
                    if (((x2.g0) e1Var.f19301c.get(i10)).d == g0Var.d) {
                        Object obj = g0Var.f60087a;
                        Object obj2 = e1Var.f19300b;
                        int i11 = a.f19246g;
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
        return Pair.create(Integer.valueOf(i7 + e1Var.d), g0Var3);
    }

    @Override
    public final void b(int i7, x2.g0 g0Var, x2.c0 c0Var) {
        Pair a10 = a(i7, g0Var);
        if (a10 != null) {
            this.f19276b.f19362i.d(new z0(this, a10, c0Var, 1));
        }
    }

    @Override
    public final void c(int i7, x2.g0 g0Var, nb.a aVar) {
        Pair a10 = a(i7, g0Var);
        if (a10 != null) {
            this.f19276b.f19362i.d(new kg.i0(this, a10, aVar, 10));
        }
    }

    @Override
    public final void r(int i7, x2.g0 g0Var, x2.u uVar, x2.c0 c0Var, IOException iOException, boolean z10) {
        Pair a10 = a(i7, g0Var);
        if (a10 != null) {
            this.f19276b.f19362i.d(new o3(this, a10, uVar, c0Var, iOException, z10, 1));
        }
    }

    @Override
    public final void w(int i7, x2.g0 g0Var) {
        Pair a10 = a(i7, g0Var);
        if (a10 != null) {
            this.f19276b.f19362i.d(new b1(this, a10, 1));
        }
    }

    @Override
    public final void z(int i7, x2.g0 g0Var) {
        Pair a10 = a(i7, g0Var);
        if (a10 != null) {
            this.f19276b.f19362i.d(new b1(this, a10, 0));
        }
    }
}
