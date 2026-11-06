package l2;

import a8.ia;
public abstract class b implements m1 {
    public boolean D;
    public boolean E;
    public x2.g0 G;
    public a3.s H;
    public final int f17757b;
    public q1 d;
    public int f17759e;
    public m2.j f17760f;
    public h2.g0 h;
    public int f17761n;
    public x2.c1 f17762r;
    public e2.u[] f17763s;
    public long f17764w;
    public long f17765x;
    public final Object f17756a = new Object();
    public final wf.b f17758c = new wf.b(27, false);
    public long f17766y = Long.MIN_VALUE;
    public e2.l1 F = e2.l1.f10354a;

    public b(int i7) {
        this.f17757b = i7;
    }

    public final int B(long j3) {
        x2.c1 c1Var = this.f17762r;
        c1Var.getClass();
        return c1Var.l(j3 - this.f17764w);
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
        if (this.f17761n == 1) {
            if (m() || l()) {
                return 1000000L;
            }
            return 10000L;
        }
        return 10000L;
    }

    public w0 h() {
        return null;
    }

    public abstract String i();

    public final boolean k() {
        if (this.f17766y == Long.MIN_VALUE) {
            return true;
        }
        return false;
    }

    public abstract boolean l();

    public abstract boolean m();

    public abstract void n();

    public abstract void p(long j3, boolean z9, boolean z10);

    public final int w(wf.b bVar, k2.h hVar, int i7) {
        x2.c1 c1Var = this.f17762r;
        c1Var.getClass();
        int m10 = c1Var.m(bVar, hVar, i7);
        if (m10 == -4) {
            if (hVar.isEndOfStream()) {
                this.f17766y = Long.MIN_VALUE;
                if (this.D) {
                    return -4;
                }
                return -3;
            }
            long j3 = hVar.f17173e + this.f17764w;
            hVar.f17173e = j3;
            this.f17766y = Math.max(this.f17766y, j3);
            return m10;
        }
        if (m10 == -5) {
            e2.u uVar = (e2.u) bVar.f57539c;
            uVar.getClass();
            long j10 = uVar.f10619x;
            if (j10 != Long.MAX_VALUE) {
                e2.t a10 = uVar.a();
                a10.f10567w = j10 + this.f17764w;
                bVar.f57539c = new e2.u(a10);
            }
        }
        return m10;
    }

    public abstract void x(long j3, long j10);

    public final void y(e2.u[] uVarArr, x2.c1 c1Var, long j3, long j10, x2.g0 g0Var) {
        ia.p(!this.D);
        this.f17762r = c1Var;
        this.G = g0Var;
        if (this.f17766y == Long.MIN_VALUE) {
            this.f17766y = j3;
        }
        this.f17763s = uVarArr;
        this.f17764w = j10;
        u(uVarArr, j3, j10, g0Var);
    }

    public final void z(long j3, boolean z9, boolean z10) {
        this.D = false;
        this.f17765x = j3;
        this.f17766y = j3;
        if (!z10) {
            if (B(j3) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        p(j3, z9, z10);
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

    public void o(boolean z9, boolean z10) {
    }

    public void u(e2.u[] uVarArr, long j3, long j10, x2.g0 g0Var) {
    }
}
