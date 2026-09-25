package i2;

import ai.s1;
import android.util.Pair;
import ei.l3;
import java.io.IOException;
public final class d1 implements u2.j0, n2.l {
    public final f1 f10625a;
    public final g1 f10626b;

    public d1(g1 g1Var, f1 f1Var) {
        this.f10626b = g1Var;
        this.f10625a = f1Var;
    }

    @Override
    public final void a(int i10, u2.f0 f0Var, int i11) {
        Pair l4 = l(i10, f0Var);
        if (l4 != null) {
            this.f10626b.f10702i.c(new s1(this, l4, i11, 13));
        }
    }

    @Override
    public final void b(int i10, u2.f0 f0Var, Exception exc) {
        Pair l4 = l(i10, f0Var);
        if (l4 != null) {
            this.f10626b.f10702i.c(new gg.t(this, l4, exc, 14));
        }
    }

    @Override
    public final void c(int i10, u2.f0 f0Var, u2.b0 b0Var) {
        Pair l4 = l(i10, f0Var);
        if (l4 != null) {
            this.f10626b.f10702i.c(new z0(this, l4, b0Var, 0));
        }
    }

    @Override
    public final void d(int i10, u2.f0 f0Var, u2.b0 b0Var) {
        Pair l4 = l(i10, f0Var);
        if (l4 != null) {
            this.f10626b.f10702i.c(new z0(this, l4, b0Var, 1));
        }
    }

    @Override
    public final void e(int i10, u2.f0 f0Var, u2.t tVar, u2.b0 b0Var) {
        Pair l4 = l(i10, f0Var);
        if (l4 != null) {
            this.f10626b.f10702i.c(new b1(this, l4, tVar, b0Var, 1));
        }
    }

    @Override
    public final void f(int i10, u2.f0 f0Var, u2.t tVar, u2.b0 b0Var, IOException iOException, boolean z10) {
        Pair l4 = l(i10, f0Var);
        if (l4 != null) {
            this.f10626b.f10702i.c(new c1(this, l4, tVar, b0Var, iOException, z10, 0));
        }
    }

    @Override
    public final void g(int i10, u2.f0 f0Var) {
        Pair l4 = l(i10, f0Var);
        if (l4 != null) {
            this.f10626b.f10702i.c(new a1(this, l4, 1));
        }
    }

    @Override
    public final void h(int i10, u2.f0 f0Var, u2.t tVar, u2.b0 b0Var, int i11) {
        Pair l4 = l(i10, f0Var);
        if (l4 != null) {
            this.f10626b.f10702i.c(new l3(this, l4, tVar, b0Var, i11, 4));
        }
    }

    @Override
    public final void i(int i10, u2.f0 f0Var) {
        Pair l4 = l(i10, f0Var);
        if (l4 != null) {
            this.f10626b.f10702i.c(new a1(this, l4, 2));
        }
    }

    @Override
    public final void j(int i10, u2.f0 f0Var, u2.t tVar, u2.b0 b0Var) {
        Pair l4 = l(i10, f0Var);
        if (l4 != null) {
            this.f10626b.f10702i.c(new b1(this, l4, tVar, b0Var, 0));
        }
    }

    @Override
    public final void k(int i10, u2.f0 f0Var) {
        Pair l4 = l(i10, f0Var);
        if (l4 != null) {
            this.f10626b.f10702i.c(new a1(this, l4, 0));
        }
    }

    public final Pair l(int i10, u2.f0 f0Var) {
        u2.f0 f0Var2;
        f1 f1Var = this.f10625a;
        u2.f0 f0Var3 = null;
        if (f0Var != null) {
            int i11 = 0;
            while (true) {
                if (i11 < f1Var.f10684c.size()) {
                    if (((u2.f0) f1Var.f10684c.get(i11)).d == f0Var.d) {
                        Object obj = f0Var.f43642a;
                        Object obj2 = f1Var.f10683b;
                        int i12 = a.f10599g;
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
        return Pair.create(Integer.valueOf(i10 + f1Var.d), f0Var3);
    }
}
