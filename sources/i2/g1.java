package i2;

import android.util.Pair;
import fi.l3;
import java.io.IOException;
public final class g1 implements u2.k0, n2.l {
    public final i1 f10976a;
    public final j1 f10977b;

    public g1(j1 j1Var, i1 i1Var) {
        this.f10977b = j1Var;
        this.f10976a = i1Var;
    }

    @Override
    public final void a(int i10, u2.g0 g0Var, int i11) {
        Pair l4 = l(i10, g0Var);
        if (l4 != null) {
            this.f10977b.f11056i.d(new ah.o(this, l4, i11, 13));
        }
    }

    @Override
    public final void b(int i10, u2.g0 g0Var, Exception exc) {
        Pair l4 = l(i10, g0Var);
        if (l4 != null) {
            this.f10977b.f11056i.d(new hg.t(this, l4, exc, 7));
        }
    }

    @Override
    public final void c(int i10, u2.g0 g0Var, oa.d dVar) {
        Pair l4 = l(i10, g0Var);
        if (l4 != null) {
            this.f10977b.f11056i.d(new hg.t(this, l4, dVar, 6));
        }
    }

    @Override
    public final void d(int i10, u2.g0 g0Var, u2.c0 c0Var) {
        Pair l4 = l(i10, g0Var);
        if (l4 != null) {
            this.f10977b.f11056i.d(new c1(this, l4, c0Var, 0));
        }
    }

    @Override
    public final void e(int i10, u2.g0 g0Var, u2.c0 c0Var) {
        Pair l4 = l(i10, g0Var);
        if (l4 != null) {
            this.f10977b.f11056i.d(new c1(this, l4, c0Var, 1));
        }
    }

    @Override
    public final void f(int i10, u2.g0 g0Var, u2.u uVar, u2.c0 c0Var) {
        Pair l4 = l(i10, g0Var);
        if (l4 != null) {
            this.f10977b.f11056i.d(new d1(this, l4, uVar, c0Var, 1));
        }
    }

    @Override
    public final void g(int i10, u2.g0 g0Var, u2.u uVar, u2.c0 c0Var, IOException iOException, boolean z10) {
        Pair l4 = l(i10, g0Var);
        if (l4 != null) {
            this.f10977b.f11056i.d(new f1(this, l4, uVar, c0Var, iOException, z10, 0));
        }
    }

    @Override
    public final void h(int i10, u2.g0 g0Var) {
        Pair l4 = l(i10, g0Var);
        if (l4 != null) {
            this.f10977b.f11056i.d(new e1(this, l4, 0));
        }
    }

    @Override
    public final void i(int i10, u2.g0 g0Var, u2.u uVar, u2.c0 c0Var, int i11) {
        Pair l4 = l(i10, g0Var);
        if (l4 != null) {
            this.f10977b.f11056i.d(new l3(this, l4, uVar, c0Var, i11, 4));
        }
    }

    @Override
    public final void j(int i10, u2.g0 g0Var) {
        Pair l4 = l(i10, g0Var);
        if (l4 != null) {
            this.f10977b.f11056i.d(new e1(this, l4, 1));
        }
    }

    @Override
    public final void k(int i10, u2.g0 g0Var, u2.u uVar, u2.c0 c0Var) {
        Pair l4 = l(i10, g0Var);
        if (l4 != null) {
            this.f10977b.f11056i.d(new d1(this, l4, uVar, c0Var, 0));
        }
    }

    public final Pair l(int i10, u2.g0 g0Var) {
        u2.g0 g0Var2;
        i1 i1Var = this.f10976a;
        u2.g0 g0Var3 = null;
        if (g0Var != null) {
            int i11 = 0;
            while (true) {
                if (i11 < i1Var.f11044c.size()) {
                    if (((u2.g0) i1Var.f11044c.get(i11)).d == g0Var.d) {
                        Object obj = g0Var.f45920a;
                        Object obj2 = i1Var.f11043b;
                        int i12 = a.f10911g;
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
        return Pair.create(Integer.valueOf(i10 + i1Var.d), g0Var3);
    }
}
