package c3;

import b2.v0;
import e9.n0;
import e9.x1;
import java.util.List;
import v7.t6;
public final class d0 implements o {
    public final int f3635a;
    public final int f3636b;
    public final String f3637c;
    public int d;
    public int e;
    public q f3638f;
    public k0 f3639g;

    public d0(int i10, int i11, String str) {
        this.f3635a = i10;
        this.f3636b = i11;
        this.f3637c = str;
    }

    @Override
    public final boolean a(p pVar) {
        boolean z10;
        int i10 = this.f3636b;
        int i11 = this.f3635a;
        if (i11 != -1 && i10 != -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        t6.p(z10);
        e2.x xVar = new e2.x(i10);
        ((l) pVar).j(xVar.f6207a, 0, i10, false);
        if (xVar.H() == i11) {
            return true;
        }
        return false;
    }

    @Override
    public final void c(q qVar) {
        this.f3638f = qVar;
        k0 I1 = qVar.I1(1024, 4);
        this.f3639g = I1;
        b2.w wVar = new b2.w();
        String str = this.f3637c;
        wVar.f2369q = v0.n(str);
        wVar.f2370r = v0.n(str);
        i0.a.r(wVar, I1);
        this.f3638f.Q0();
        this.f3638f.G1(new Object());
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
        e9.l0 l0Var = n0.f6390b;
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
        k0 k0Var = this.f3639g;
        k0Var.getClass();
        int a2 = k0Var.a(pVar, 1024, true);
        if (a2 == -1) {
            this.e = 2;
            this.f3639g.c(0L, 1, this.d, 0, null);
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
