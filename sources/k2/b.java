package k2;

import b8.zb;
public abstract class b implements l1 {
    public boolean E;
    public boolean F;
    public w2.g0 H;
    public z2.n I;
    public final int f16444b;
    public q1 d;
    public int f16446e;
    public l2.k f16447f;
    public g2.h0 h;
    public int f16448n;
    public w2.d1 f16449r;
    public d2.v[] f16450s;
    public long f16451w;
    public long f16452x;
    public final Object f16443a = new Object();
    public final tf.b f16445c = new Object();
    public long f16453y = Long.MIN_VALUE;
    public d2.n1 G = d2.n1.f8245a;

    public b(int i3) {
        this.f16444b = i3;
    }

    public final int B(long j10) {
        w2.d1 d1Var = this.f16449r;
        d1Var.getClass();
        return d1Var.m(j10 - this.f16451w);
    }

    public abstract int C(d2.v vVar);

    public int D() {
        return 0;
    }

    public boolean E(long j10) {
        return false;
    }

    public final k2.l e(java.lang.Throwable r12, d2.v r13, boolean r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: k2.b.e(java.lang.Throwable, d2.v, boolean, int):k2.l");
    }

    public long h(long j10, long j11) {
        if (this.f16448n == 1) {
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
        if (this.f16453y == Long.MIN_VALUE) {
            return true;
        }
        return false;
    }

    public abstract boolean l();

    public abstract boolean m();

    public abstract void n();

    public abstract void p(long j10, boolean z10, boolean z11);

    public final int w(tf.b bVar, j2.h hVar, int i3) {
        w2.d1 d1Var = this.f16449r;
        d1Var.getClass();
        int o10 = d1Var.o(bVar, hVar, i3);
        if (o10 == -4) {
            if (hVar.isEndOfStream()) {
                this.f16453y = Long.MIN_VALUE;
                if (this.E) {
                    return -4;
                }
                return -3;
            }
            long j10 = hVar.f16158e + this.f16451w;
            hVar.f16158e = j10;
            this.f16453y = Math.max(this.f16453y, j10);
            return o10;
        }
        if (o10 == -5) {
            d2.v vVar = (d2.v) bVar.f55095b;
            vVar.getClass();
            long j11 = vVar.f8493x;
            if (j11 != Long.MAX_VALUE) {
                d2.u a10 = vVar.a();
                a10.f8435w = j11 + this.f16451w;
                bVar.f55095b = new d2.v(a10);
            }
        }
        return o10;
    }

    public abstract void x(long j10, long j11);

    public final void y(d2.v[] vVarArr, w2.d1 d1Var, long j10, long j11, w2.g0 g0Var) {
        zb.p(!this.E);
        this.f16449r = d1Var;
        this.H = g0Var;
        if (this.f16453y == Long.MIN_VALUE) {
            this.f16453y = j10;
        }
        this.f16450s = vVarArr;
        this.f16451w = j11;
        u(vVarArr, j10, j11, g0Var);
    }

    public final void z(long j10, boolean z10, boolean z11) {
        this.E = false;
        this.f16452x = j10;
        this.f16453y = j10;
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

    public void A(float f10, float f11) {
    }

    @Override
    public void d(int i3, Object obj) {
    }

    public void o(boolean z10, boolean z11) {
    }

    public void u(d2.v[] vVarArr, long j10, long j11, w2.g0 g0Var) {
    }
}
