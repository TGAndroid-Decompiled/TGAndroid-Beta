package c3;

import b2.r0;
import e9.a1;
import java.util.List;
public final class d0 implements o {
    public final int f3750a;
    public final int f3751b;
    public final String f3752c;
    public int d;
    public int e;
    public q f3753f;
    public h0 f3754g;

    public d0(int i10, int i11, String str) {
        this.f3750a = i10;
        this.f3751b = i11;
        this.f3752c = str;
    }

    @Override
    public final boolean a(p pVar) {
        boolean z10;
        int i10 = this.f3751b;
        int i11 = this.f3750a;
        if (i11 != -1 && i10 != -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.g(z10);
        e2.v vVar = new e2.v(i10);
        ((l) pVar).h(vVar.f7933a, 0, i10, false);
        if (vVar.D() == i11) {
            return true;
        }
        return false;
    }

    @Override
    public final void g(q qVar) {
        this.f3753f = qVar;
        h0 Z1 = qVar.Z1(1024, 4);
        this.f3754g = Z1;
        b2.r rVar = new b2.r();
        String str = this.f3752c;
        rVar.f3251p = r0.n(str);
        rVar.f3252q = r0.n(str);
        hg.k0.s(rVar, Z1);
        this.f3753f.f1();
        this.f3753f.X1(new Object());
        this.e = 1;
    }

    @Override
    public final void h(long j3, long j10) {
        if (j3 != 0 && this.e != 1) {
            return;
        }
        this.e = 1;
        this.d = 0;
    }

    @Override
    public final List i() {
        e9.g0 g0Var = e9.i0.f8083b;
        return a1.e;
    }

    @Override
    public final int m(p pVar, s sVar) {
        int i10 = this.e;
        if (i10 != 1) {
            if (i10 == 2) {
                return -1;
            }
            throw new IllegalStateException();
        }
        h0 h0Var = this.f3754g;
        h0Var.getClass();
        int a2 = h0Var.a(pVar, 1024, true);
        if (a2 == -1) {
            this.e = 2;
            this.f3754g.c(0L, 1, this.d, 0, null);
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
