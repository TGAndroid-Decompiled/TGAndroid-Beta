package l2;

import a8.la;
public abstract class b implements i1 {
    public boolean E;
    public boolean F;
    public x2.g0 H;
    public a3.s I;
    public final int f19284b;
    public m1 d;
    public int f19286e;
    public m2.i f19287f;
    public h2.g0 h;
    public int f19288n;
    public x2.d1 f19289r;
    public e2.u[] f19290s;
    public long f19291w;
    public long f19292x;
    public final Object f19283a = new Object();
    public final k8.a f19285c = new k8.a(1, false);
    public long f19293y = Long.MIN_VALUE;
    public e2.l1 G = e2.l1.f10537a;

    public b(int i7) {
        this.f19284b = i7;
    }

    public final int B(long j3) {
        x2.d1 d1Var = this.f19289r;
        d1Var.getClass();
        return d1Var.j(j3 - this.f19291w);
    }

    public abstract int C(e2.u uVar);

    public int D() {
        return 0;
    }

    public boolean E(long j3) {
        return false;
    }

    public final l2.l d(java.lang.Throwable r12, e2.u r13, boolean r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: l2.b.d(java.lang.Throwable, e2.u, boolean, int):l2.l");
    }

    public long g(long j3, long j10) {
        if (this.f19288n == 1) {
            if (m() || l()) {
                return 1000000L;
            }
            return 10000L;
        }
        return 10000L;
    }

    public t0 h() {
        return null;
    }

    public abstract String i();

    public final boolean k() {
        if (this.f19293y == Long.MIN_VALUE) {
            return true;
        }
        return false;
    }

    public abstract boolean l();

    public abstract boolean m();

    public abstract void n();

    public abstract void p(long j3, boolean z10, boolean z11);

    public final int w(k8.a aVar, k2.h hVar, int i7) {
        x2.d1 d1Var = this.f19289r;
        d1Var.getClass();
        int m10 = d1Var.m(aVar, hVar, i7);
        if (m10 == -4) {
            if (hVar.isEndOfStream()) {
                this.f19293y = Long.MIN_VALUE;
                if (this.E) {
                    return -4;
                }
                return -3;
            }
            long j3 = hVar.f18159e + this.f19291w;
            hVar.f18159e = j3;
            this.f19293y = Math.max(this.f19293y, j3);
            return m10;
        }
        if (m10 == -5) {
            e2.u uVar = (e2.u) aVar.f18215c;
            uVar.getClass();
            long j10 = uVar.f10802x;
            if (j10 != Long.MAX_VALUE) {
                e2.t a10 = uVar.a();
                a10.f10750w = j10 + this.f19291w;
                aVar.f18215c = new e2.u(a10);
            }
        }
        return m10;
    }

    public abstract void x(long j3, long j10);

    public final void y(e2.u[] uVarArr, x2.d1 d1Var, long j3, long j10, x2.g0 g0Var) {
        la.p(!this.E);
        this.f19289r = d1Var;
        this.H = g0Var;
        if (this.f19293y == Long.MIN_VALUE) {
            this.f19293y = j3;
        }
        this.f19290s = uVarArr;
        this.f19291w = j10;
        u(uVarArr, j3, j10, g0Var);
    }

    public final void z(long j3, boolean z10, boolean z11) {
        this.E = false;
        this.f19292x = j3;
        this.f19293y = j3;
        if (!z11) {
            if (B(j3) != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
        }
        p(j3, z10, z11);
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
    public void c(int i7, Object obj) {
    }

    public void o(boolean z10, boolean z11) {
    }

    public void u(e2.u[] uVarArr, long j3, long j10, x2.g0 g0Var) {
    }
}
