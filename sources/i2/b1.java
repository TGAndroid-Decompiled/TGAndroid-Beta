package i2;

import android.util.Pair;
import bi.g3;
import di.o3;
import java.io.IOException;
public final class b1 implements u2.m0, n2.k {
    public final d1 f10109a;
    public final e1 f10110b;

    public b1(e1 e1Var, d1 d1Var) {
        this.f10110b = e1Var;
        this.f10109a = d1Var;
    }

    @Override
    public final void a(int i10, u2.g0 g0Var, int i11) {
        Pair l4 = l(i10, g0Var);
        if (l4 != null) {
            this.f10110b.f10169i.c(new g3(this, l4, i11, 12));
        }
    }

    @Override
    public final void b(int i10, u2.g0 g0Var, Exception exc) {
        Pair l4 = l(i10, g0Var);
        if (l4 != null) {
            this.f10110b.f10169i.c(new gg.a0(this, l4, exc, 10));
        }
    }

    @Override
    public final void c(int i10, u2.g0 g0Var, u2.c0 c0Var) {
        Pair l4 = l(i10, g0Var);
        if (l4 != null) {
            this.f10110b.f10169i.c(new x0(this, l4, c0Var, 0));
        }
    }

    @Override
    public final void d(int i10, u2.g0 g0Var, u2.c0 c0Var) {
        Pair l4 = l(i10, g0Var);
        if (l4 != null) {
            this.f10110b.f10169i.c(new x0(this, l4, c0Var, 1));
        }
    }

    @Override
    public final void e(int i10, u2.g0 g0Var, u2.u uVar, u2.c0 c0Var) {
        Pair l4 = l(i10, g0Var);
        if (l4 != null) {
            this.f10110b.f10169i.c(new z0(this, l4, uVar, c0Var, 1));
        }
    }

    @Override
    public final void f(int i10, u2.g0 g0Var, u2.u uVar, u2.c0 c0Var, IOException iOException, boolean z10) {
        Pair l4 = l(i10, g0Var);
        if (l4 != null) {
            this.f10110b.f10169i.c(new a1(this, l4, uVar, c0Var, iOException, z10, 0));
        }
    }

    @Override
    public final void g(int i10, u2.g0 g0Var) {
        Pair l4 = l(i10, g0Var);
        if (l4 != null) {
            this.f10110b.f10169i.c(new y0(this, l4, 1));
        }
    }

    @Override
    public final void h(int i10, u2.g0 g0Var, u2.u uVar, u2.c0 c0Var, int i11) {
        Pair l4 = l(i10, g0Var);
        if (l4 != null) {
            this.f10110b.f10169i.c(new o3(this, l4, uVar, c0Var, i11, 4));
        }
    }

    @Override
    public final void i(int i10, u2.g0 g0Var) {
        Pair l4 = l(i10, g0Var);
        if (l4 != null) {
            this.f10110b.f10169i.c(new y0(this, l4, 2));
        }
    }

    @Override
    public final void j(int i10, u2.g0 g0Var, u2.u uVar, u2.c0 c0Var) {
        Pair l4 = l(i10, g0Var);
        if (l4 != null) {
            this.f10110b.f10169i.c(new z0(this, l4, uVar, c0Var, 0));
        }
    }

    @Override
    public final void k(int i10, u2.g0 g0Var) {
        Pair l4 = l(i10, g0Var);
        if (l4 != null) {
            this.f10110b.f10169i.c(new y0(this, l4, 0));
        }
    }

    public final Pair l(int i10, u2.g0 g0Var) {
        u2.g0 g0Var2;
        d1 d1Var = this.f10109a;
        u2.g0 g0Var3 = null;
        if (g0Var != null) {
            int i11 = 0;
            while (true) {
                if (i11 < d1Var.f10124c.size()) {
                    if (((u2.g0) d1Var.f10124c.get(i11)).d == g0Var.d) {
                        Object obj = g0Var.f42324a;
                        Object obj2 = d1Var.f10123b;
                        int i12 = a.f10097g;
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
        return Pair.create(Integer.valueOf(i10 + d1Var.d), g0Var3);
    }
}
