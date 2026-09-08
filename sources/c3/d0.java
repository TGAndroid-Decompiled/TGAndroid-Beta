package c3;

import b2.r0;
import e9.a1;
import java.util.List;
public final class d0 implements o {
    public final int f4268a;
    public final int f4269b;
    public final String f4270c;
    public int d;
    public int f4271e;
    public q f4272f;
    public h0 f4273g;

    public d0(int i10, int i11, String str) {
        this.f4268a = i10;
        this.f4269b = i11;
        this.f4270c = str;
    }

    @Override
    public final boolean b(p pVar) {
        boolean z10;
        int i10 = this.f4269b;
        int i11 = this.f4268a;
        if (i11 != -1 && i10 != -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.g(z10);
        e2.v vVar = new e2.v(i10);
        ((l) pVar).j(vVar.f8817a, 0, i10, false);
        if (vVar.D() == i11) {
            return true;
        }
        return false;
    }

    @Override
    public final void g(q qVar) {
        this.f4272f = qVar;
        h0 R1 = qVar.R1(1024, 4);
        this.f4273g = R1;
        b2.r rVar = new b2.r();
        String str = this.f4270c;
        rVar.f2338p = r0.n(str);
        rVar.f2339q = r0.n(str);
        i2.g.u(rVar, R1);
        this.f4272f.Z0();
        this.f4272f.P1(new Object());
        this.f4271e = 1;
    }

    @Override
    public final void h(long j3, long j10) {
        if (j3 != 0 && this.f4271e != 1) {
            return;
        }
        this.f4271e = 1;
        this.d = 0;
    }

    @Override
    public final List i() {
        e9.g0 g0Var = e9.i0.f8985b;
        return a1.f8948e;
    }

    @Override
    public final int m(p pVar, s sVar) {
        int i10 = this.f4271e;
        if (i10 != 1) {
            if (i10 == 2) {
                return -1;
            }
            throw new IllegalStateException();
        }
        h0 h0Var = this.f4273g;
        h0Var.getClass();
        int a2 = h0Var.a(pVar, 1024, true);
        if (a2 == -1) {
            this.f4271e = 2;
            this.f4273g.c(0L, 1, this.d, 0, null);
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
