package l2;

import a8.ja;
public abstract class b implements i1 {
    public boolean E;
    public boolean F;
    public x2.f0 H;
    public a3.s I;
    public final int f18889b;
    public m1 d;
    public int f18891e;
    public m2.j f18892f;
    public h2.g0 h;
    public int f18893n;
    public x2.b1 f18894r;
    public e2.u[] f18895s;
    public long f18896w;
    public long f18897x;
    public final Object f18888a = new Object();
    public final k8.a f18890c = new k8.a(1, false);
    public long f18898y = Long.MIN_VALUE;
    public e2.l1 G = e2.l1.f10190a;

    public b(int i7) {
        this.f18889b = i7;
    }

    public final int B(long j3) {
        x2.b1 b1Var = this.f18894r;
        b1Var.getClass();
        return b1Var.n(j3 - this.f18896w);
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
        if (this.f18893n == 1) {
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
        if (this.f18898y == Long.MIN_VALUE) {
            return true;
        }
        return false;
    }

    public abstract boolean l();

    public abstract boolean m();

    public abstract void n();

    public abstract void p(long j3, boolean z10, boolean z11);

    public final int w(k8.a aVar, k2.h hVar, int i7) {
        x2.b1 b1Var = this.f18894r;
        b1Var.getClass();
        int q10 = b1Var.q(aVar, hVar, i7);
        if (q10 == -4) {
            if (hVar.isEndOfStream()) {
                this.f18898y = Long.MIN_VALUE;
                if (this.E) {
                    return -4;
                }
                return -3;
            }
            long j3 = hVar.f17733e + this.f18896w;
            hVar.f17733e = j3;
            this.f18898y = Math.max(this.f18898y, j3);
            return q10;
        }
        if (q10 == -5) {
            e2.u uVar = (e2.u) aVar.f17789c;
            uVar.getClass();
            long j10 = uVar.f10455x;
            if (j10 != Long.MAX_VALUE) {
                e2.t a10 = uVar.a();
                a10.f10403w = j10 + this.f18896w;
                aVar.f17789c = new e2.u(a10);
            }
        }
        return q10;
    }

    public abstract void x(long j3, long j10);

    public final void y(e2.u[] uVarArr, x2.b1 b1Var, long j3, long j10, x2.f0 f0Var) {
        ja.p(!this.E);
        this.f18894r = b1Var;
        this.H = f0Var;
        if (this.f18898y == Long.MIN_VALUE) {
            this.f18898y = j3;
        }
        this.f18895s = uVarArr;
        this.f18896w = j10;
        u(uVarArr, j3, j10, f0Var);
    }

    public final void z(long j3, boolean z10, boolean z11) {
        this.E = false;
        this.f18897x = j3;
        this.f18898y = j3;
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

    public void u(e2.u[] uVarArr, long j3, long j10, x2.f0 f0Var) {
    }
}
