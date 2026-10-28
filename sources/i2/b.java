package i2;

import a8.yb;
public abstract class b implements m1 {
    public boolean E;
    public u2.g0 G;
    public x2.o H;
    public final int f13490b;
    public q1 d;
    public int e;
    public j2.j f13492f;
    public e2.g0 h;
    public int f13493n;
    public u2.d1 f13494r;
    public b2.x[] f13495s;
    public long v;
    public long f13496w;
    public boolean f13498y;
    public final Object f13489a = new Object();
    public final n4.s f13491c = new n4.s(24, false);
    public long f13497x = Long.MIN_VALUE;
    public b2.p1 F = b2.p1.f3348a;

    public b(int i10) {
        this.f13490b = i10;
    }

    public final int B(long j10) {
        u2.d1 d1Var = this.f13494r;
        d1Var.getClass();
        return d1Var.j(j10 - this.v);
    }

    public abstract int C(b2.x xVar);

    public int D() {
        return 0;
    }

    public boolean E(long j10) {
        return false;
    }

    public final i2.m d(java.lang.Throwable r12, b2.x r13, boolean r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: i2.b.d(java.lang.Throwable, b2.x, boolean, int):i2.m");
    }

    public long g(long j10, long j11) {
        if (this.f13493n == 1) {
            if (m() || l()) {
                return 1000000L;
            }
            return 10000L;
        }
        return 10000L;
    }

    public x0 i() {
        return null;
    }

    public abstract String j();

    public final boolean k() {
        if (this.f13497x == Long.MIN_VALUE) {
            return true;
        }
        return false;
    }

    public abstract boolean l();

    public abstract boolean m();

    public abstract void n();

    public abstract void p(long j10, boolean z10, boolean z11);

    public final int w(n4.s sVar, h2.h hVar, int i10) {
        u2.d1 d1Var = this.f13494r;
        d1Var.getClass();
        int f7 = d1Var.f(sVar, hVar, i10);
        if (f7 == -4) {
            if (hVar.isEndOfStream()) {
                this.f13497x = Long.MIN_VALUE;
                if (this.f13498y) {
                    return -4;
                }
                return -3;
            }
            long j10 = hVar.e + this.v;
            hVar.e = j10;
            this.f13497x = Math.max(this.f13497x, j10);
            return f7;
        }
        if (f7 == -5) {
            b2.x xVar = (b2.x) sVar.f18696c;
            xVar.getClass();
            long j11 = xVar.f3590x;
            if (j11 != Long.MAX_VALUE) {
                b2.w a2 = xVar.a();
                a2.f3537w = j11 + this.v;
                sVar.f18696c = new b2.x(a2);
            }
        }
        return f7;
    }

    public abstract void x(long j10, long j11);

    public final void y(b2.x[] xVarArr, u2.d1 d1Var, long j10, long j11, u2.g0 g0Var) {
        yb.p(!this.f13498y);
        this.f13494r = d1Var;
        this.G = g0Var;
        if (this.f13497x == Long.MIN_VALUE) {
            this.f13497x = j10;
        }
        this.f13495s = xVarArr;
        this.v = j11;
        u(xVarArr, j10, j11, g0Var);
    }

    public final void z(long j10, boolean z10, boolean z11) {
        this.f13498y = false;
        this.f13496w = j10;
        this.f13497x = j10;
        if (!z11) {
            if (B(j10) != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
        }
        p(j10, z10, z11);
    }

    public void e() {
    }

    public void q() {
    }

    public void r() {
    }

    public void s() {
    }

    public void t() {
    }

    public void v() {
    }

    public void A(float f7, float f10) {
    }

    @Override
    public void c(int i10, Object obj) {
    }

    public void o(boolean z10, boolean z11) {
    }

    public void u(b2.x[] xVarArr, long j10, long j11, u2.g0 g0Var) {
    }
}
