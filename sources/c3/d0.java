package c3;

import b2.r0;
import e9.a1;
import java.util.List;
public final class d0 implements o {
    public final int f4165a;
    public final int f4166b;
    public final String f4167c;
    public int d;
    public int e;
    public q f4168f;
    public h0 f4169g;

    public d0(int i10, int i11, String str) {
        this.f4165a = i10;
        this.f4166b = i11;
        this.f4167c = str;
    }

    @Override
    public final boolean b(p pVar) {
        boolean z10;
        int i10 = this.f4166b;
        int i11 = this.f4165a;
        if (i11 != -1 && i10 != -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.g(z10);
        e2.v vVar = new e2.v(i10);
        ((l) pVar).g(vVar.f7234a, 0, i10, false);
        if (vVar.D() == i11) {
            return true;
        }
        return false;
    }

    @Override
    public final void g(q qVar) {
        this.f4168f = qVar;
        h0 I = qVar.I(1024, 4);
        this.f4169g = I;
        b2.r rVar = new b2.r();
        String str = this.f4167c;
        rVar.f1945p = r0.n(str);
        rVar.f1946q = r0.n(str);
        hc.b.u(rVar, I);
        this.f4168f.B();
        this.f4168f.G(new Object());
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
        e9.g0 g0Var = e9.i0.f7384b;
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
        h0 h0Var = this.f4169g;
        h0Var.getClass();
        int a2 = h0Var.a(pVar, 1024, true);
        if (a2 == -1) {
            this.e = 2;
            this.f4169g.c(0L, 1, this.d, 0, null);
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
