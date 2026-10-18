package i2;

import ai.m4;
import ai.ub;
import android.util.Pair;
import ei.z1;
import java.io.IOException;
public final class e1 implements u2.j0, n2.l {
    public final g1 f12351a;
    public final h1 f12352b;

    public e1(h1 h1Var, g1 g1Var) {
        this.f12352b = h1Var;
        this.f12351a = g1Var;
    }

    @Override
    public final void a(int i10, u2.f0 f0Var, int i11) {
        Pair l4 = l(i10, f0Var);
        if (l4 != null) {
            this.f12352b.f12426i.d(new ah.o(this, l4, i11, 17));
        }
    }

    @Override
    public final void b(int i10, u2.f0 f0Var, Exception exc) {
        Pair l4 = l(i10, f0Var);
        if (l4 != null) {
            this.f12352b.f12426i.d(new z1(this, l4, exc, 22));
        }
    }

    @Override
    public final void c(int i10, u2.f0 f0Var, oa.d dVar) {
        Pair l4 = l(i10, f0Var);
        if (l4 != null) {
            this.f12352b.f12426i.d(new z1(this, l4, dVar, 21));
        }
    }

    @Override
    public final void d(int i10, u2.f0 f0Var, u2.b0 b0Var) {
        Pair l4 = l(i10, f0Var);
        if (l4 != null) {
            this.f12352b.f12426i.d(new b1(this, l4, b0Var, 0));
        }
    }

    @Override
    public final void e(int i10, u2.f0 f0Var, u2.b0 b0Var) {
        Pair l4 = l(i10, f0Var);
        if (l4 != null) {
            this.f12352b.f12426i.d(new b1(this, l4, b0Var, 1));
        }
    }

    @Override
    public final void f(int i10, u2.f0 f0Var, u2.t tVar, u2.b0 b0Var) {
        Pair l4 = l(i10, f0Var);
        if (l4 != null) {
            this.f12352b.f12426i.d(new c1(this, l4, tVar, b0Var, 1));
        }
    }

    @Override
    public final void g(int i10, u2.f0 f0Var, u2.t tVar, u2.b0 b0Var, IOException iOException, boolean z10) {
        Pair l4 = l(i10, f0Var);
        if (l4 != null) {
            this.f12352b.f12426i.d(new m4(this, l4, tVar, b0Var, iOException, z10, 1));
        }
    }

    @Override
    public final void h(int i10, u2.f0 f0Var) {
        Pair l4 = l(i10, f0Var);
        if (l4 != null) {
            this.f12352b.f12426i.d(new d1(this, l4, 0));
        }
    }

    @Override
    public final void i(int i10, u2.f0 f0Var, u2.t tVar, u2.b0 b0Var, int i11) {
        Pair l4 = l(i10, f0Var);
        if (l4 != null) {
            this.f12352b.f12426i.d(new ub(this, l4, tVar, b0Var, i11, 5));
        }
    }

    @Override
    public final void j(int i10, u2.f0 f0Var) {
        Pair l4 = l(i10, f0Var);
        if (l4 != null) {
            this.f12352b.f12426i.d(new d1(this, l4, 1));
        }
    }

    @Override
    public final void k(int i10, u2.f0 f0Var, u2.t tVar, u2.b0 b0Var) {
        Pair l4 = l(i10, f0Var);
        if (l4 != null) {
            this.f12352b.f12426i.d(new c1(this, l4, tVar, b0Var, 0));
        }
    }

    public final Pair l(int i10, u2.f0 f0Var) {
        u2.f0 f0Var2;
        g1 g1Var = this.f12351a;
        u2.f0 f0Var3 = null;
        if (f0Var != null) {
            int i11 = 0;
            while (true) {
                if (i11 < g1Var.f12377c.size()) {
                    if (((u2.f0) g1Var.f12377c.get(i11)).d == f0Var.d) {
                        Object obj = f0Var.f47347a;
                        Object obj2 = g1Var.f12376b;
                        int i12 = a.f12309g;
                        f0Var2 = f0Var.a(Pair.create(obj2, obj));
                        break;
                    }
                    i11++;
                } else {
                    f0Var2 = null;
                    break;
                }
            }
            if (f0Var2 == null) {
                return null;
            }
            f0Var3 = f0Var2;
        }
        return Pair.create(Integer.valueOf(i10 + g1Var.d), f0Var3);
    }
}
