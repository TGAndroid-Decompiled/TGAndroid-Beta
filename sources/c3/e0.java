package c3;

import b2.v0;
import e9.n0;
import e9.x1;
import java.util.List;
import v7.u6;
public final class e0 implements o {
    public final int f4612a;
    public final int f4613b;
    public final String f4614c;
    public int d;
    public int e;
    public q f4615f;
    public j0 f4616g;

    public e0(int i10, int i11, String str) {
        this.f4612a = i10;
        this.f4613b = i11;
        this.f4614c = str;
    }

    @Override
    public final boolean a(p pVar) {
        boolean z10;
        int i10 = this.f4613b;
        int i11 = this.f4612a;
        if (i11 != -1 && i10 != -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        u6.p(z10);
        e2.x xVar = new e2.x(i10);
        ((l) pVar).j(xVar.f8293a, 0, i10, false);
        if (xVar.H() == i11) {
            return true;
        }
        return false;
    }

    @Override
    public final void c(q qVar) {
        this.f4615f = qVar;
        j0 j02 = qVar.j0(1024, 4);
        this.f4616g = j02;
        b2.v vVar = new b2.v();
        String str = this.f4614c;
        vVar.f4076q = v0.n(str);
        vVar.f4077r = v0.n(str);
        i2.e.u(vVar, j02);
        this.f4615f.H();
        this.f4615f.g0(new Object());
        this.e = 1;
    }

    @Override
    public final void d(long j10, long j11) {
        if (j10 != 0 && this.e != 1) {
            return;
        }
        this.e = 1;
        this.d = 0;
    }

    @Override
    public final List e() {
        e9.l0 l0Var = n0.f8476b;
        return x1.e;
    }

    @Override
    public final int f(p pVar, s sVar) {
        int i10 = this.e;
        if (i10 != 1) {
            if (i10 == 2) {
                return -1;
            }
            throw new IllegalStateException();
        }
        j0 j0Var = this.f4616g;
        j0Var.getClass();
        int a2 = j0Var.a(pVar, 1024, true);
        if (a2 == -1) {
            this.e = 2;
            this.f4616g.c(0L, 1, this.d, 0, null);
            this.d = 0;
            return 0;
        }
        this.d += a2;
        return 0;
    }

    @Override
    public final o b() {
        return this;
    }

    @Override
    public final void release() {
    }
}
