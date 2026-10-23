package i2;

import ai.p4;
import ai.vb;
import android.util.Pair;
import ei.z1;
import java.io.IOException;
public final class e1 implements u2.m0, n2.l {
    public final g1 f12381a;
    public final h1 f12382b;

    public e1(h1 h1Var, g1 g1Var) {
        this.f12382b = h1Var;
        this.f12381a = g1Var;
    }

    @Override
    public final void a(int i10, u2.h0 h0Var, int i11) {
        Pair l4 = l(i10, h0Var);
        if (l4 != null) {
            this.f12382b.f12456i.d(new ah.o(this, l4, i11, 17));
        }
    }

    @Override
    public final void b(int i10, u2.h0 h0Var, Exception exc) {
        Pair l4 = l(i10, h0Var);
        if (l4 != null) {
            this.f12382b.f12456i.d(new z1(this, l4, exc, 22));
        }
    }

    @Override
    public final void c(int i10, u2.h0 h0Var, oa.d dVar) {
        Pair l4 = l(i10, h0Var);
        if (l4 != null) {
            this.f12382b.f12456i.d(new z1(this, l4, dVar, 21));
        }
    }

    @Override
    public final void d(int i10, u2.h0 h0Var, u2.d0 d0Var) {
        Pair l4 = l(i10, h0Var);
        if (l4 != null) {
            this.f12382b.f12456i.d(new b1(this, l4, d0Var, 0));
        }
    }

    @Override
    public final void e(int i10, u2.h0 h0Var, u2.d0 d0Var) {
        Pair l4 = l(i10, h0Var);
        if (l4 != null) {
            this.f12382b.f12456i.d(new b1(this, l4, d0Var, 1));
        }
    }

    @Override
    public final void f(int i10, u2.h0 h0Var, u2.v vVar, u2.d0 d0Var) {
        Pair l4 = l(i10, h0Var);
        if (l4 != null) {
            this.f12382b.f12456i.d(new c1(this, l4, vVar, d0Var, 1));
        }
    }

    @Override
    public final void g(int i10, u2.h0 h0Var, u2.v vVar, u2.d0 d0Var, IOException iOException, boolean z10) {
        Pair l4 = l(i10, h0Var);
        if (l4 != null) {
            this.f12382b.f12456i.d(new p4(this, l4, vVar, d0Var, iOException, z10, 1));
        }
    }

    @Override
    public final void h(int i10, u2.h0 h0Var) {
        Pair l4 = l(i10, h0Var);
        if (l4 != null) {
            this.f12382b.f12456i.d(new d1(this, l4, 0));
        }
    }

    @Override
    public final void i(int i10, u2.h0 h0Var, u2.v vVar, u2.d0 d0Var, int i11) {
        Pair l4 = l(i10, h0Var);
        if (l4 != null) {
            this.f12382b.f12456i.d(new vb(this, l4, vVar, d0Var, i11, 5));
        }
    }

    @Override
    public final void j(int i10, u2.h0 h0Var) {
        Pair l4 = l(i10, h0Var);
        if (l4 != null) {
            this.f12382b.f12456i.d(new d1(this, l4, 1));
        }
    }

    @Override
    public final void k(int i10, u2.h0 h0Var, u2.v vVar, u2.d0 d0Var) {
        Pair l4 = l(i10, h0Var);
        if (l4 != null) {
            this.f12382b.f12456i.d(new c1(this, l4, vVar, d0Var, 0));
        }
    }

    public final Pair l(int i10, u2.h0 h0Var) {
        u2.h0 h0Var2;
        g1 g1Var = this.f12381a;
        u2.h0 h0Var3 = null;
        if (h0Var != null) {
            int i11 = 0;
            while (true) {
                if (i11 < g1Var.f12407c.size()) {
                    if (((u2.h0) g1Var.f12407c.get(i11)).d == h0Var.d) {
                        Object obj = h0Var.f47767a;
                        Object obj2 = g1Var.f12406b;
                        int i12 = a.f12338g;
                        h0Var2 = h0Var.a(Pair.create(obj2, obj));
                        break;
                    }
                    i11++;
                } else {
                    h0Var2 = null;
                    break;
                }
            }
            if (h0Var2 == null) {
                return null;
            }
            h0Var3 = h0Var2;
        }
        return Pair.create(Integer.valueOf(i10 + g1Var.d), h0Var3);
    }
}
