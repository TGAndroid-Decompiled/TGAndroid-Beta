package i2;

import v7.u6;
public abstract class b implements m1 {
    public boolean E;
    public u2.g0 G;
    public x2.n H;
    public final int f10916b;
    public q1 d;
    public int e;
    public j2.k f10918f;
    public e2.g0 h;
    public int f10919n;
    public u2.d1 f10920r;
    public b2.x[] f10921s;
    public long v;
    public long f10922w;
    public boolean f10924y;
    public final Object f10915a = new Object();
    public final qf.b f10917c = new qf.b(24);
    public long f10923x = Long.MIN_VALUE;
    public b2.p1 F = b2.p1.f2281a;

    public b(int i10) {
        this.f10916b = i10;
    }

    public final int B(long j10) {
        u2.d1 d1Var = this.f10920r;
        d1Var.getClass();
        return d1Var.m(j10 - this.v);
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
        if (this.f10919n == 1) {
            if (m() || l()) {
                return 1000000L;
            }
            return 10000L;
        }
        return 10000L;
    }

    public w0 i() {
        return null;
    }

    public abstract String j();

    public final boolean k() {
        if (this.f10923x == Long.MIN_VALUE) {
            return true;
        }
        return false;
    }

    public abstract boolean l();

    public abstract boolean m();

    public abstract void n();

    public abstract void p(long j10, boolean z10, boolean z11);

    public final int w(qf.b bVar, h2.h hVar, int i10) {
        u2.d1 d1Var = this.f10920r;
        d1Var.getClass();
        int f7 = d1Var.f(bVar, hVar, i10);
        if (f7 == -4) {
            if (hVar.isEndOfStream()) {
                this.f10923x = Long.MIN_VALUE;
                if (this.f10924y) {
                    return -4;
                }
                return -3;
            }
            long j10 = hVar.e + this.v;
            hVar.e = j10;
            this.f10923x = Math.max(this.f10923x, j10);
            return f7;
        }
        if (f7 == -5) {
            b2.x xVar = (b2.x) bVar.f43356c;
            xVar.getClass();
            long j11 = xVar.f2523x;
            if (j11 != Long.MAX_VALUE) {
                b2.w a2 = xVar.a();
                a2.f2470w = j11 + this.v;
                bVar.f43356c = new b2.x(a2);
            }
        }
        return f7;
    }

    public abstract void x(long j10, long j11);

    public final void y(b2.x[] xVarArr, u2.d1 d1Var, long j10, long j11, u2.g0 g0Var) {
        u6.p(!this.f10924y);
        this.f10920r = d1Var;
        this.G = g0Var;
        if (this.f10923x == Long.MIN_VALUE) {
            this.f10923x = j10;
        }
        this.f10921s = xVarArr;
        this.v = j11;
        u(xVarArr, j10, j11, g0Var);
    }

    public final void z(long j10, boolean z10, boolean z11) {
        this.f10924y = false;
        this.f10922w = j10;
        this.f10923x = j10;
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
