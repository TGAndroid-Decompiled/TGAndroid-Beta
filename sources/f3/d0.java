package f3;

import a8.la;
import e2.s0;
import h9.t1;
import java.util.List;
public final class d0 implements o {
    public final int f11171a;
    public final int f11172b;
    public final String f11173c;
    public int d;
    public int f11174e;
    public q f11175f;
    public i0 f11176g;

    public d0(int i7, int i10, String str) {
        this.f11171a = i7;
        this.f11172b = i10;
        this.f11173c = str;
    }

    @Override
    public final boolean b(p pVar) {
        boolean z10;
        int i7 = this.f11172b;
        int i10 = this.f11171a;
        if (i10 != -1 && i7 != -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        la.p(z10);
        h2.x xVar = new h2.x(i7);
        ((l) pVar).g(xVar.f13865a, 0, i7, false);
        if (xVar.H() == i10) {
            return true;
        }
        return false;
    }

    @Override
    public final void c(q qVar) {
        this.f11175f = qVar;
        i0 d2 = qVar.d2(1024, 4);
        this.f11176g = d2;
        e2.t tVar = new e2.t();
        String str = this.f11173c;
        tVar.f10745q = s0.n(str);
        tVar.f10746r = s0.n(str);
        p5.c.r(tVar, d2);
        this.f11175f.d1();
        this.f11175f.j(new Object());
        this.f11174e = 1;
    }

    @Override
    public final void d(long j3, long j10) {
        if (j3 != 0 && this.f11174e != 1) {
            return;
        }
        this.f11174e = 1;
        this.d = 0;
    }

    @Override
    public final List e() {
        h9.g0 g0Var = h9.i0.f14035b;
        return t1.f14103e;
    }

    @Override
    public final int f(p pVar, s sVar) {
        int i7 = this.f11174e;
        if (i7 != 1) {
            if (i7 == 2) {
                return -1;
            }
            throw new IllegalStateException();
        }
        i0 i0Var = this.f11176g;
        i0Var.getClass();
        int e10 = i0Var.e(pVar, 1024, true);
        if (e10 == -1) {
            this.f11174e = 2;
            this.f11176g.c(0L, 1, this.d, 0, null);
            this.d = 0;
            return 0;
        }
        this.d += e10;
        return 0;
    }

    @Override
    public final o a() {
        return this;
    }

    @Override
    public final void release() {
    }
}
