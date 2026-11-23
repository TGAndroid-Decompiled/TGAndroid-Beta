package f3;

import a8.ma;
import e2.s0;
import h9.s1;
import java.util.List;
public final class e0 implements o {
    public final int f11143a;
    public final int f11144b;
    public final String f11145c;
    public int d;
    public int f11146e;
    public q f11147f;
    public j0 f11148g;

    public e0(int i7, int i10, String str) {
        this.f11143a = i7;
        this.f11144b = i10;
        this.f11145c = str;
    }

    @Override
    public final boolean b(p pVar) {
        boolean z10;
        int i7 = this.f11144b;
        int i10 = this.f11143a;
        if (i10 != -1 && i7 != -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        ma.p(z10);
        h2.x xVar = new h2.x(i7);
        ((l) pVar).k(xVar.f13828a, 0, i7, false);
        if (xVar.H() == i10) {
            return true;
        }
        return false;
    }

    @Override
    public final void c(q qVar) {
        this.f11147f = qVar;
        j0 d2 = qVar.d2(1024, 4);
        this.f11148g = d2;
        e2.t tVar = new e2.t();
        String str = this.f11145c;
        tVar.f10706q = s0.n(str);
        tVar.f10707r = s0.n(str);
        p5.c.r(tVar, d2);
        this.f11147f.Z0();
        this.f11147f.h(new Object());
        this.f11146e = 1;
    }

    @Override
    public final void d(long j3, long j10) {
        if (j3 != 0 && this.f11146e != 1) {
            return;
        }
        this.f11146e = 1;
        this.d = 0;
    }

    @Override
    public final List e() {
        h9.g0 g0Var = h9.i0.f13995b;
        return s1.f14058e;
    }

    @Override
    public final int f(p pVar, s sVar) {
        int i7 = this.f11146e;
        if (i7 != 1) {
            if (i7 == 2) {
                return -1;
            }
            throw new IllegalStateException();
        }
        j0 j0Var = this.f11148g;
        j0Var.getClass();
        int e10 = j0Var.e(pVar, 1024, true);
        if (e10 == -1) {
            this.f11146e = 2;
            this.f11148g.c(0L, 1, this.d, 0, null);
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
