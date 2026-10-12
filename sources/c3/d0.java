package c3;

import b2.w0;
import e9.l0;
import e9.n0;
import e9.x1;
import java.util.List;
import v7.u6;
public final class d0 implements o {
    public final int f4230a;
    public final int f4231b;
    public final String f4232c;
    public int d;
    public int e;
    public q f4233f;
    public i0 f4234g;

    public d0(int i10, int i11, String str) {
        this.f4230a = i10;
        this.f4231b = i11;
        this.f4232c = str;
    }

    @Override
    public final boolean a(p pVar) {
        boolean z10;
        int i10 = this.f4231b;
        int i11 = this.f4230a;
        if (i11 != -1 && i10 != -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        u6.p(z10);
        e2.x xVar = new e2.x(i10);
        ((l) pVar).j(xVar.f8411a, 0, i10, false);
        if (xVar.H() == i11) {
            return true;
        }
        return false;
    }

    @Override
    public final void c(q qVar) {
        this.f4233f = qVar;
        i0 a02 = qVar.a0(1024, 4);
        this.f4234g = a02;
        b2.w wVar = new b2.w();
        String str = this.f4232c;
        wVar.f2465q = w0.n(str);
        wVar.f2466r = w0.n(str);
        i2.d.s(wVar, a02);
        this.f4233f.D();
        this.f4233f.K(new Object());
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
        l0 l0Var = n0.f8592b;
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
        i0 i0Var = this.f4234g;
        i0Var.getClass();
        int a2 = i0Var.a(pVar, 1024, true);
        if (a2 == -1) {
            this.e = 2;
            this.f4234g.c(0L, 1, this.d, 0, null);
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
