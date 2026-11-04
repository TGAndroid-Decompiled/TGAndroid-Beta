package k2;

import ai.e3;
import android.util.Pair;
import ci.v3;
import ei.h9;
import java.io.IOException;
public final class f1 implements w2.k0, p2.k {
    public final h1 f16502a;
    public final i1 f16503b;

    public f1(i1 i1Var, h1 h1Var) {
        this.f16503b = i1Var;
        this.f16502a = h1Var;
    }

    @Override
    public final void A(int i3, w2.g0 g0Var, Exception exc) {
        Pair a10 = a(i3, g0Var);
        if (a10 != null) {
            this.f16503b.f16587i.d(new h9(this, a10, exc, 20));
        }
    }

    @Override
    public final void D(int i3, w2.g0 g0Var, w2.c0 c0Var) {
        Pair a10 = a(i3, g0Var);
        if (a10 != null) {
            this.f16503b.f16587i.d(new c1(this, a10, c0Var, 0));
        }
    }

    @Override
    public final void I(int i3, w2.g0 g0Var) {
        Pair a10 = a(i3, g0Var);
        if (a10 != null) {
            this.f16503b.f16587i.d(new e1(this, a10, 1));
        }
    }

    @Override
    public final void K(int i3, w2.g0 g0Var, w2.u uVar, w2.c0 c0Var, int i10) {
        Pair a10 = a(i3, g0Var);
        if (a10 != null) {
            this.f16503b.f16587i.d(new ai.p1(this, a10, uVar, c0Var, i10, 4));
        }
    }

    @Override
    public final void M(int i3, w2.g0 g0Var, int i10) {
        Pair a10 = a(i3, g0Var);
        if (a10 != null) {
            this.f16503b.f16587i.d(new e3(this, a10, i10, 18));
        }
    }

    public final Pair a(int i3, w2.g0 g0Var) {
        w2.g0 g0Var2;
        h1 h1Var = this.f16502a;
        w2.g0 g0Var3 = null;
        if (g0Var != null) {
            int i10 = 0;
            while (true) {
                if (i10 < h1Var.f16533c.size()) {
                    if (((w2.g0) h1Var.f16533c.get(i10)).d == g0Var.d) {
                        Object obj = g0Var.f57081a;
                        Object obj2 = h1Var.f16532b;
                        int i11 = a.f16436g;
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
        return Pair.create(Integer.valueOf(i3 + h1Var.d), g0Var3);
    }

    @Override
    public final void b(int i3, w2.g0 g0Var) {
        Pair a10 = a(i3, g0Var);
        if (a10 != null) {
            this.f16503b.f16587i.d(new e1(this, a10, 0));
        }
    }

    @Override
    public final void d(int i3, w2.g0 g0Var, w2.c0 c0Var) {
        Pair a10 = a(i3, g0Var);
        if (a10 != null) {
            this.f16503b.f16587i.d(new c1(this, a10, c0Var, 1));
        }
    }

    @Override
    public final void j(int i3, w2.g0 g0Var, w2.u uVar, w2.c0 c0Var, IOException iOException, boolean z10) {
        Pair a10 = a(i3, g0Var);
        if (a10 != null) {
            this.f16503b.f16587i.d(new v3(this, a10, uVar, c0Var, iOException, z10, 1));
        }
    }

    @Override
    public final void t(int i3, w2.g0 g0Var, w2.u uVar, w2.c0 c0Var) {
        Pair a10 = a(i3, g0Var);
        if (a10 != null) {
            this.f16503b.f16587i.d(new d1(this, a10, uVar, c0Var, 1));
        }
    }

    @Override
    public final void x(int i3, w2.g0 g0Var, v7.s sVar) {
        Pair a10 = a(i3, g0Var);
        if (a10 != null) {
            this.f16503b.f16587i.d(new h9(this, a10, sVar, 19));
        }
    }

    @Override
    public final void z(int i3, w2.g0 g0Var, w2.u uVar, w2.c0 c0Var) {
        Pair a10 = a(i3, g0Var);
        if (a10 != null) {
            this.f16503b.f16587i.d(new d1(this, a10, uVar, c0Var, 0));
        }
    }
}
