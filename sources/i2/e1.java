package i2;

import ai.tb;
import android.util.Pair;
import ei.z1;
import java.io.IOException;
public final class e1 implements u2.k0, n2.l {
    public final g1 f12355a;
    public final h1 f12356b;

    public e1(h1 h1Var, g1 g1Var) {
        this.f12356b = h1Var;
        this.f12355a = g1Var;
    }

    @Override
    public final void a(int i10, u2.g0 g0Var, int i11) {
        Pair l4 = l(i10, g0Var);
        if (l4 != null) {
            this.f12356b.f12442i.d(new ah.o(this, l4, i11, 17));
        }
    }

    @Override
    public final void b(int i10, u2.g0 g0Var, Exception exc) {
        Pair l4 = l(i10, g0Var);
        if (l4 != null) {
            this.f12356b.f12442i.d(new z1(this, l4, exc, 22));
        }
    }

    @Override
    public final void c(int i10, u2.g0 g0Var, oa.d dVar) {
        Pair l4 = l(i10, g0Var);
        if (l4 != null) {
            this.f12356b.f12442i.d(new z1(this, l4, dVar, 21));
        }
    }

    @Override
    public final void d(int i10, u2.g0 g0Var, u2.c0 c0Var) {
        Pair l4 = l(i10, g0Var);
        if (l4 != null) {
            this.f12356b.f12442i.d(new a1(this, l4, c0Var, 0));
        }
    }

    @Override
    public final void e(int i10, u2.g0 g0Var, u2.c0 c0Var) {
        Pair l4 = l(i10, g0Var);
        if (l4 != null) {
            this.f12356b.f12442i.d(new a1(this, l4, c0Var, 1));
        }
    }

    @Override
    public final void f(int i10, u2.g0 g0Var, u2.u uVar, u2.c0 c0Var) {
        Pair l4 = l(i10, g0Var);
        if (l4 != null) {
            this.f12356b.f12442i.d(new b1(this, l4, uVar, c0Var, 1));
        }
    }

    @Override
    public final void g(int i10, u2.g0 g0Var, u2.u uVar, u2.c0 c0Var, IOException iOException, boolean z10) {
        Pair l4 = l(i10, g0Var);
        if (l4 != null) {
            this.f12356b.f12442i.d(new d1(this, l4, uVar, c0Var, iOException, z10, 0));
        }
    }

    @Override
    public final void h(int i10, u2.g0 g0Var) {
        Pair l4 = l(i10, g0Var);
        if (l4 != null) {
            this.f12356b.f12442i.d(new c1(this, l4, 0));
        }
    }

    @Override
    public final void i(int i10, u2.g0 g0Var, u2.u uVar, u2.c0 c0Var, int i11) {
        Pair l4 = l(i10, g0Var);
        if (l4 != null) {
            this.f12356b.f12442i.d(new tb(this, l4, uVar, c0Var, i11, 5));
        }
    }

    @Override
    public final void j(int i10, u2.g0 g0Var) {
        Pair l4 = l(i10, g0Var);
        if (l4 != null) {
            this.f12356b.f12442i.d(new c1(this, l4, 1));
        }
    }

    @Override
    public final void k(int i10, u2.g0 g0Var, u2.u uVar, u2.c0 c0Var) {
        Pair l4 = l(i10, g0Var);
        if (l4 != null) {
            this.f12356b.f12442i.d(new b1(this, l4, uVar, c0Var, 0));
        }
    }

    public final Pair l(int i10, u2.g0 g0Var) {
        u2.g0 g0Var2;
        g1 g1Var = this.f12355a;
        u2.g0 g0Var3 = null;
        if (g0Var != null) {
            int i11 = 0;
            while (true) {
                if (i11 < g1Var.f12419c.size()) {
                    if (((u2.g0) g1Var.f12419c.get(i11)).d == g0Var.d) {
                        Object obj = g0Var.f47327a;
                        Object obj2 = g1Var.f12418b;
                        int i12 = a.f12307g;
                        g0Var2 = g0Var.a(Pair.create(obj2, obj));
                        break;
                    }
                    i11++;
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
        return Pair.create(Integer.valueOf(i10 + g1Var.d), g0Var3);
    }
}
