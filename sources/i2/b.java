package i2;

import v7.u6;
public abstract class b implements k1 {
    public boolean E;
    public u2.g0 G;
    public x2.n H;
    public final int f12313b;
    public o1 d;
    public int e;
    public j2.k f12315f;
    public e2.g0 h;
    public int f12316n;
    public u2.e1 f12317r;
    public b2.w[] f12318s;
    public long v;
    public long f12319w;
    public boolean f12321y;
    public final Object f12312a = new Object();
    public final qf.b f12314c = new qf.b(22);
    public long f12320x = Long.MIN_VALUE;
    public b2.o1 F = b2.o1.f3894a;

    public b(int i10) {
        this.f12313b = i10;
    }

    public final int B(long j10) {
        u2.e1 e1Var = this.f12317r;
        e1Var.getClass();
        return e1Var.h(j10 - this.v);
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
        if (this.f12316n == 1) {
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
        if (this.f12320x == Long.MIN_VALUE) {
            return true;
        }
        return false;
    }

    public abstract boolean l();

    public abstract boolean m();

    public abstract void n();

    public abstract void p(long j10, boolean z10, boolean z11);

    public final int w(qf.b bVar, h2.h hVar, int i10) {
        u2.e1 e1Var = this.f12317r;
        e1Var.getClass();
        int f7 = e1Var.f(bVar, hVar, i10);
        if (f7 == -4) {
            if (hVar.isEndOfStream()) {
                this.f12320x = Long.MIN_VALUE;
                if (this.f12321y) {
                    return -4;
                }
                return -3;
            }
            long j10 = hVar.e + this.v;
            hVar.e = j10;
            this.f12320x = Math.max(this.f12320x, j10);
            return f7;
        }
        if (f7 == -5) {
            b2.w wVar = (b2.w) bVar.f44443c;
            wVar.getClass();
            long j11 = wVar.f4136x;
            if (j11 != Long.MAX_VALUE) {
                b2.v a2 = wVar.a();
                a2.f4083w = j11 + this.v;
                bVar.f44443c = new b2.w(a2);
            }
        }
        return f7;
    }

    public abstract void x(long j10, long j11);

    public final void y(b2.w[] wVarArr, u2.e1 e1Var, long j10, long j11, u2.g0 g0Var) {
        u6.p(!this.f12321y);
        this.f12317r = e1Var;
        this.G = g0Var;
        if (this.f12320x == Long.MIN_VALUE) {
            this.f12320x = j10;
        }
        this.f12318s = wVarArr;
        this.v = j11;
        u(wVarArr, j10, j11, g0Var);
    }

    public final void z(long j10, boolean z10, boolean z11) {
        this.f12321y = false;
        this.f12319w = j10;
        this.f12320x = j10;
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

    public void u(b2.w[] wVarArr, long j10, long j11, u2.g0 g0Var) {
    }
}
