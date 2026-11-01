package i2;

import v7.t6;
public abstract class b implements o1 {
    public boolean D;
    public boolean E;
    public u2.g0 G;
    public x2.o H;
    public final int f7809b;
    public s1 d;
    public int e;
    public j2.l f7811f;
    public e2.g0 h;
    public int f7812n;
    public u2.d1 f7813r;
    public b2.x[] f7814s;
    public long f7815w;
    public long f7816x;
    public final Object f7808a = new Object();
    public final hf.b f7810c = new hf.b(23, false);
    public long f7817y = Long.MIN_VALUE;
    public b2.o1 F = b2.o1.f2172a;

    public b(int i10) {
        this.f7809b = i10;
    }

    public final int B(long j10) {
        u2.d1 d1Var = this.f7813r;
        d1Var.getClass();
        return d1Var.i(j10 - this.f7815w);
    }

    public abstract int C(b2.x xVar);

    public int D() {
        return 0;
    }

    public boolean E(long j10) {
        return false;
    }

    public final i2.l e(java.lang.Throwable r12, b2.x r13, boolean r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: i2.b.e(java.lang.Throwable, b2.x, boolean, int):i2.l");
    }

    public long h(long j10, long j11) {
        if (this.f7812n == 1) {
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
        if (this.f7817y == Long.MIN_VALUE) {
            return true;
        }
        return false;
    }

    public abstract boolean l();

    public abstract boolean m();

    public abstract void n();

    public abstract void p(long j10, boolean z10, boolean z11);

    public final int w(hf.b bVar, h2.h hVar, int i10) {
        u2.d1 d1Var = this.f7813r;
        d1Var.getClass();
        int r10 = d1Var.r(bVar, hVar, i10);
        if (r10 == -4) {
            if (hVar.isEndOfStream()) {
                this.f7817y = Long.MIN_VALUE;
                if (this.D) {
                    return -4;
                }
                return -3;
            }
            long j10 = hVar.e + this.f7815w;
            hVar.e = j10;
            this.f7817y = Math.max(this.f7817y, j10);
            return r10;
        }
        if (r10 == -5) {
            b2.x xVar = (b2.x) bVar.f7659c;
            xVar.getClass();
            long j11 = xVar.f2427x;
            if (j11 != Long.MAX_VALUE) {
                b2.w a2 = xVar.a();
                a2.f2374w = j11 + this.f7815w;
                bVar.f7659c = new b2.x(a2);
            }
        }
        return r10;
    }

    public abstract void x(long j10, long j11);

    public final void y(b2.x[] xVarArr, u2.d1 d1Var, long j10, long j11, u2.g0 g0Var) {
        t6.p(!this.D);
        this.f7813r = d1Var;
        this.G = g0Var;
        if (this.f7817y == Long.MIN_VALUE) {
            this.f7817y = j10;
        }
        this.f7814s = xVarArr;
        this.f7815w = j11;
        u(xVarArr, j10, j11, g0Var);
    }

    public final void z(long j10, boolean z10, boolean z11) {
        this.D = false;
        this.f7816x = j10;
        this.f7817y = j10;
        if (!z11) {
            if (B(j10) != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
        }
        p(j10, z10, z11);
    }

    public void f() {
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
    public void d(int i10, Object obj) {
    }

    public void o(boolean z10, boolean z11) {
    }

    public void u(b2.x[] xVarArr, long j10, long j11, u2.g0 g0Var) {
    }
}
