package i2;

import v7.u6;
public abstract class b implements k1 {
    public boolean E;
    public u2.f0 G;
    public x2.n H;
    public final int f12315b;
    public o1 d;
    public int e;
    public j2.k f12317f;
    public e2.g0 h;
    public int f12318n;
    public u2.c1 f12319r;
    public b2.w[] f12320s;
    public long v;
    public long f12321w;
    public boolean f12323y;
    public final Object f12314a = new Object();
    public final qf.b f12316c = new qf.b(22);
    public long f12322x = Long.MIN_VALUE;
    public b2.o1 F = b2.o1.f3894a;

    public b(int i10) {
        this.f12315b = i10;
    }

    public final int B(long j10) {
        u2.c1 c1Var = this.f12319r;
        c1Var.getClass();
        return c1Var.h(j10 - this.v);
    }

    public abstract int C(b2.w wVar);

    public int D() {
        return 0;
    }

    public boolean E(long j10) {
        return false;
    }

    public final i2.m d(java.lang.Throwable r12, b2.w r13, boolean r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: i2.b.d(java.lang.Throwable, b2.w, boolean, int):i2.m");
    }

    public long g(long j10, long j11) {
        if (this.f12318n == 1) {
            if (m() || l()) {
                return 1000000L;
            }
            return 10000L;
        }
        return 10000L;
    }

    public v0 i() {
        return null;
    }

    public abstract String j();

    public final boolean k() {
        if (this.f12322x == Long.MIN_VALUE) {
            return true;
        }
        return false;
    }

    public abstract boolean l();

    public abstract boolean m();

    public abstract void n();

    public abstract void p(long j10, boolean z10, boolean z11);

    public final int w(qf.b bVar, h2.h hVar, int i10) {
        u2.c1 c1Var = this.f12319r;
        c1Var.getClass();
        int f7 = c1Var.f(bVar, hVar, i10);
        if (f7 == -4) {
            if (hVar.isEndOfStream()) {
                this.f12322x = Long.MIN_VALUE;
                if (this.f12323y) {
                    return -4;
                }
                return -3;
            }
            long j10 = hVar.e + this.v;
            hVar.e = j10;
            this.f12322x = Math.max(this.f12322x, j10);
            return f7;
        }
        if (f7 == -5) {
            b2.w wVar = (b2.w) bVar.f44486c;
            wVar.getClass();
            long j11 = wVar.f4136x;
            if (j11 != Long.MAX_VALUE) {
                b2.v a2 = wVar.a();
                a2.f4083w = j11 + this.v;
                bVar.f44486c = new b2.w(a2);
            }
        }
        return f7;
    }

    public abstract void x(long j10, long j11);

    public final void y(b2.w[] wVarArr, u2.c1 c1Var, long j10, long j11, u2.f0 f0Var) {
        u6.p(!this.f12323y);
        this.f12319r = c1Var;
        this.G = f0Var;
        if (this.f12322x == Long.MIN_VALUE) {
            this.f12322x = j10;
        }
        this.f12320s = wVarArr;
        this.v = j11;
        u(wVarArr, j10, j11, f0Var);
    }

    public final void z(long j10, boolean z10, boolean z11) {
        this.f12323y = false;
        this.f12321w = j10;
        this.f12322x = j10;
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

    public void u(b2.w[] wVarArr, long j10, long j11, u2.f0 f0Var) {
    }
}
