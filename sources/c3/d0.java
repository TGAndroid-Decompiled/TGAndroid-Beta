package c3;

import b2.r0;
import e9.a1;
import java.util.List;
public final class d0 implements o {
    public final int f4047a;
    public final int f4048b;
    public final String f4049c;
    public int d;
    public int f4050e;
    public q f4051f;
    public h0 f4052g;

    public d0(int i10, int i11, String str) {
        this.f4047a = i10;
        this.f4048b = i11;
        this.f4049c = str;
    }

    @Override
    public final boolean b(p pVar) {
        boolean z10;
        int i10 = this.f4048b;
        int i11 = this.f4047a;
        if (i11 != -1 && i10 != -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.g(z10);
        e2.v vVar = new e2.v(i10);
        ((l) pVar).f(vVar.f8590a, 0, i10, false);
        if (vVar.D() == i11) {
            return true;
        }
        return false;
    }

    @Override
    public final void g(q qVar) {
        this.f4051f = qVar;
        h0 Z1 = qVar.Z1(1024, 4);
        this.f4052g = Z1;
        b2.r rVar = new b2.r();
        String str = this.f4049c;
        rVar.f3505p = r0.n(str);
        rVar.f3506q = r0.n(str);
        hg.c.s(rVar, Z1);
        this.f4051f.e1();
        this.f4051f.X1(new Object());
        this.f4050e = 1;
    }

    @Override
    public final void h(long j3, long j10) {
        if (j3 != 0 && this.f4050e != 1) {
            return;
        }
        this.f4050e = 1;
        this.d = 0;
    }

    @Override
    public final List i() {
        e9.g0 g0Var = e9.i0.f8758b;
        return a1.f8721e;
    }

    @Override
    public final int m(p pVar, s sVar) {
        int i10 = this.f4050e;
        if (i10 != 1) {
            if (i10 == 2) {
                return -1;
            }
            throw new IllegalStateException();
        }
        h0 h0Var = this.f4052g;
        h0Var.getClass();
        int a2 = h0Var.a(pVar, 1024, true);
        if (a2 == -1) {
            this.f4050e = 2;
            this.f4052g.c(0L, 1, this.d, 0, null);
            this.d = 0;
            return 0;
        }
        this.d += a2;
        return 0;
    }

    @Override
    public final o c() {
        return this;
    }

    @Override
    public final void release() {
    }
}
