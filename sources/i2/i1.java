package i2;

import android.util.Pair;
import java.io.IOException;
public final class i1 implements u2.k0, n2.k {
    public final k1 f7936a;
    public final l1 f7937b;

    public i1(l1 l1Var, k1 k1Var) {
        this.f7937b = l1Var;
        this.f7936a = k1Var;
    }

    @Override
    public final void B(int i10, u2.g0 g0Var, u2.u uVar, u2.c0 c0Var, IOException iOException, boolean z10) {
        Pair a2 = a(i10, g0Var);
        if (a2 != null) {
            this.f7937b.f7962i.d(new h1(this, a2, uVar, c0Var, iOException, z10, 0));
        }
    }

    @Override
    public final void E(int i10, u2.g0 g0Var) {
        Pair a2 = a(i10, g0Var);
        if (a2 != null) {
            this.f7937b.f7962i.d(new f1(this, a2, 0));
        }
    }

    @Override
    public final void G(int i10, u2.g0 g0Var, u2.u uVar, u2.c0 c0Var, int i11) {
        Pair a2 = a(i10, g0Var);
        if (a2 != null) {
            this.f7937b.f7962i.d(new g1(this, a2, uVar, c0Var, i11, 0));
        }
    }

    @Override
    public final void J(int i10, u2.g0 g0Var) {
        Pair a2 = a(i10, g0Var);
        if (a2 != null) {
            this.f7937b.f7962i.d(new f1(this, a2, 1));
        }
    }

    @Override
    public final void L(int i10, u2.g0 g0Var, u2.u uVar, u2.c0 c0Var) {
        Pair a2 = a(i10, g0Var);
        if (a2 != null) {
            this.f7937b.f7962i.d(new e1(this, a2, uVar, c0Var, 0));
        }
    }

    public final Pair a(int i10, u2.g0 g0Var) {
        u2.g0 g0Var2;
        k1 k1Var = this.f7936a;
        u2.g0 g0Var3 = null;
        if (g0Var != null) {
            int i11 = 0;
            while (true) {
                if (i11 < k1Var.f7951c.size()) {
                    if (((u2.g0) k1Var.f7951c.get(i11)).d == g0Var.d) {
                        Object obj = g0Var.f49875a;
                        Object obj2 = k1Var.f7950b;
                        int i12 = a.f7788g;
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
        return Pair.create(Integer.valueOf(i10 + k1Var.d), g0Var3);
    }

    @Override
    public final void b(int i10, u2.g0 g0Var, int i11) {
        Pair a2 = a(i10, g0Var);
        if (a2 != null) {
            this.f7937b.f7962i.d(new ag.o0(this, a2, i11, 5));
        }
    }

    @Override
    public final void j(int i10, u2.g0 g0Var, Exception exc) {
        Pair a2 = a(i10, g0Var);
        if (a2 != null) {
            this.f7937b.f7962i.d(new a3.l0(this, a2, exc, 24));
        }
    }

    @Override
    public final void l(int i10, u2.g0 g0Var, oa.d dVar) {
        Pair a2 = a(i10, g0Var);
        if (a2 != null) {
            this.f7937b.f7962i.d(new a3.l0(this, a2, dVar, 23));
        }
    }

    @Override
    public final void n(int i10, u2.g0 g0Var, u2.c0 c0Var) {
        Pair a2 = a(i10, g0Var);
        if (a2 != null) {
            this.f7937b.f7962i.d(new d1(this, a2, c0Var, 0));
        }
    }

    @Override
    public final void r(int i10, u2.g0 g0Var, u2.c0 c0Var) {
        Pair a2 = a(i10, g0Var);
        if (a2 != null) {
            this.f7937b.f7962i.d(new d1(this, a2, c0Var, 1));
        }
    }

    @Override
    public final void t(int i10, u2.g0 g0Var, u2.u uVar, u2.c0 c0Var) {
        Pair a2 = a(i10, g0Var);
        if (a2 != null) {
            this.f7937b.f7962i.d(new e1(this, a2, uVar, c0Var, 1));
        }
    }
}
