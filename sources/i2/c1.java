package i2;

import android.util.Pair;
import fi.l3;
import java.io.IOException;
public final class c1 implements u2.k0, n2.k {
    public final e1 f11472a;
    public final f1 f11473b;

    public c1(f1 f1Var, e1 e1Var) {
        this.f11473b = f1Var;
        this.f11472a = e1Var;
    }

    @Override
    public final void a(int i10, u2.f0 f0Var, int i11) {
        Pair l4 = l(i10, f0Var);
        if (l4 != null) {
            this.f11473b.f11546i.c(new ah.p(this, l4, i11, 13));
        }
    }

    @Override
    public final void b(int i10, u2.f0 f0Var, Exception exc) {
        Pair l4 = l(i10, f0Var);
        if (l4 != null) {
            this.f11473b.f11546i.c(new hg.t(this, l4, exc, 6));
        }
    }

    @Override
    public final void c(int i10, u2.f0 f0Var, u2.b0 b0Var) {
        Pair l4 = l(i10, f0Var);
        if (l4 != null) {
            this.f11473b.f11546i.c(new y0(this, l4, b0Var, 0));
        }
    }

    @Override
    public final void d(int i10, u2.f0 f0Var, u2.b0 b0Var) {
        Pair l4 = l(i10, f0Var);
        if (l4 != null) {
            this.f11473b.f11546i.c(new y0(this, l4, b0Var, 1));
        }
    }

    @Override
    public final void e(int i10, u2.f0 f0Var, u2.t tVar, u2.b0 b0Var) {
        Pair l4 = l(i10, f0Var);
        if (l4 != null) {
            this.f11473b.f11546i.c(new a1(this, l4, tVar, b0Var, 1));
        }
    }

    @Override
    public final void f(int i10, u2.f0 f0Var, u2.t tVar, u2.b0 b0Var, IOException iOException, boolean z10) {
        Pair l4 = l(i10, f0Var);
        if (l4 != null) {
            this.f11473b.f11546i.c(new b1(this, l4, tVar, b0Var, iOException, z10, 0));
        }
    }

    @Override
    public final void g(int i10, u2.f0 f0Var) {
        Pair l4 = l(i10, f0Var);
        if (l4 != null) {
            this.f11473b.f11546i.c(new z0(this, l4, 1));
        }
    }

    @Override
    public final void h(int i10, u2.f0 f0Var, u2.t tVar, u2.b0 b0Var, int i11) {
        Pair l4 = l(i10, f0Var);
        if (l4 != null) {
            this.f11473b.f11546i.c(new l3(this, l4, tVar, b0Var, i11, 4));
        }
    }

    @Override
    public final void i(int i10, u2.f0 f0Var) {
        Pair l4 = l(i10, f0Var);
        if (l4 != null) {
            this.f11473b.f11546i.c(new z0(this, l4, 2));
        }
    }

    @Override
    public final void j(int i10, u2.f0 f0Var, u2.t tVar, u2.b0 b0Var) {
        Pair l4 = l(i10, f0Var);
        if (l4 != null) {
            this.f11473b.f11546i.c(new a1(this, l4, tVar, b0Var, 0));
        }
    }

    @Override
    public final void k(int i10, u2.f0 f0Var) {
        Pair l4 = l(i10, f0Var);
        if (l4 != null) {
            this.f11473b.f11546i.c(new z0(this, l4, 0));
        }
    }

    public final Pair l(int i10, u2.f0 f0Var) {
        u2.f0 f0Var2;
        e1 e1Var = this.f11472a;
        u2.f0 f0Var3 = null;
        if (f0Var != null) {
            int i11 = 0;
            while (true) {
                if (i11 < e1Var.f11492c.size()) {
                    if (((u2.f0) e1Var.f11492c.get(i11)).d == f0Var.d) {
                        Object obj = f0Var.f46667a;
                        Object obj2 = e1Var.f11491b;
                        int i12 = a.f11449g;
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
        return Pair.create(Integer.valueOf(i10 + e1Var.d), f0Var3);
    }
}
