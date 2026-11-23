package l2;

import a8.ma;
public abstract class b implements j1 {
    public boolean E;
    public boolean F;
    public x2.g0 H;
    public a3.s I;
    public final int f19347b;
    public n1 d;
    public int f19349e;
    public m2.i f19350f;
    public h2.g0 h;
    public int f19351n;
    public x2.d1 f19352r;
    public e2.u[] f19353s;
    public long f19354w;
    public long f19355x;
    public final Object f19346a = new Object();
    public final jb.m f19348c = new jb.m(2, false);
    public long f19356y = Long.MIN_VALUE;
    public e2.l1 G = e2.l1.f10498a;

    public b(int i7) {
        this.f19347b = i7;
    }

    public final int B(long j3) {
        x2.d1 d1Var = this.f19352r;
        d1Var.getClass();
        return d1Var.o(j3 - this.f19354w);
    }

    public abstract int C(e2.u uVar);

    public int D() {
        return 0;
    }

    public boolean E(long j3) {
        return false;
    }

    public final l2.m d(java.lang.Throwable r12, e2.u r13, boolean r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: l2.b.d(java.lang.Throwable, e2.u, boolean, int):l2.m");
    }

    public long g(long j3, long j10) {
        if (this.f19351n == 1) {
            if (m() || k()) {
                return 1000000L;
            }
            return 10000L;
        }
        return 10000L;
    }

    public u0 h() {
        return null;
    }

    public abstract String i();

    public final boolean j() {
        if (this.f19356y == Long.MIN_VALUE) {
            return true;
        }
        return false;
    }

    public abstract boolean k();

    public abstract boolean m();

    public abstract void n();

    public abstract void p(long j3, boolean z10, boolean z11);

    public final int w(jb.m mVar, k2.h hVar, int i7) {
        x2.d1 d1Var = this.f19352r;
        d1Var.getClass();
        int b10 = d1Var.b(mVar, hVar, i7);
        if (b10 == -4) {
            if (hVar.isEndOfStream()) {
                this.f19356y = Long.MIN_VALUE;
                if (this.E) {
                    return -4;
                }
                return -3;
            }
            long j3 = hVar.f18224e + this.f19354w;
            hVar.f18224e = j3;
            this.f19356y = Math.max(this.f19356y, j3);
            return b10;
        }
        if (b10 == -5) {
            e2.u uVar = (e2.u) mVar.f17465c;
            uVar.getClass();
            long j10 = uVar.f10763x;
            if (j10 != Long.MAX_VALUE) {
                e2.t a10 = uVar.a();
                a10.f10711w = j10 + this.f19354w;
                mVar.f17465c = new e2.u(a10);
            }
        }
        return b10;
    }

    public abstract void x(long j3, long j10);

    public final void y(e2.u[] uVarArr, x2.d1 d1Var, long j3, long j10, x2.g0 g0Var) {
        ma.p(!this.E);
        this.f19352r = d1Var;
        this.H = g0Var;
        if (this.f19356y == Long.MIN_VALUE) {
            this.f19356y = j3;
        }
        this.f19353s = uVarArr;
        this.f19354w = j10;
        u(uVarArr, j3, j10, g0Var);
    }

    public final void z(long j3, boolean z10, boolean z11) {
        this.E = false;
        this.f19355x = j3;
        this.f19356y = j3;
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
