package i2;
public abstract class f implements j1 {
    public boolean E;
    public u2.f0 G;
    public x2.p H;
    public final int f11644b;
    public n1 d;
    public int f11646e;
    public j2.k f11647f;
    public e2.x h;
    public int f11648n;
    public u2.a1 f11649r;
    public b2.s[] f11650s;
    public long v;
    public long f11651w;
    public boolean f11653y;
    public final Object f11643a = new Object();
    public final n4.x f11645c = new n4.x(19, false);
    public long f11652x = Long.MIN_VALUE;
    public b2.k1 F = b2.k1.f3404a;

    public f(int i10) {
        this.f11644b = i10;
    }

    public abstract int A(b2.s sVar);

    public int B() {
        return 0;
    }

    public final i2.n d(java.lang.Throwable r12, b2.s r13, boolean r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: i2.f.d(java.lang.Throwable, b2.s, boolean, int):i2.n");
    }

    public long g(long j3, long j10) {
        if (this.f11648n == 1) {
            if (m() || l()) {
                return 1000000L;
            }
            return 10000L;
        }
        return 10000L;
    }

    public t0 i() {
        return null;
    }

    public abstract String j();

    public final boolean k() {
        if (this.f11652x == Long.MIN_VALUE) {
            return true;
        }
        return false;
    }

    public abstract boolean l();

    public abstract boolean m();

    public final boolean n() {
        if (k()) {
            return this.f11653y;
        }
        u2.a1 a1Var = this.f11649r;
        a1Var.getClass();
        return a1Var.e();
    }

    public abstract void o();

    public abstract void q(long j3, boolean z10);

    public final int w(n4.x xVar, h2.h hVar, int i10) {
        u2.a1 a1Var = this.f11649r;
        a1Var.getClass();
        int f7 = a1Var.f(xVar, hVar, i10);
        if (f7 == -4) {
            if (hVar.isEndOfStream()) {
                this.f11652x = Long.MIN_VALUE;
                if (this.f11653y) {
                    return -4;
                }
                return -3;
            }
            long j3 = hVar.f10985e + this.v;
            hVar.f10985e = j3;
            this.f11652x = Math.max(this.f11652x, j3);
            return f7;
        }
        if (f7 == -5) {
            b2.s sVar = (b2.s) xVar.f16695c;
            sVar.getClass();
            long j10 = sVar.f3647w;
            if (j10 != Long.MAX_VALUE) {
                b2.r a2 = sVar.a();
                a2.v = j10 + this.v;
                xVar.f16695c = new b2.s(a2);
            }
        }
        return f7;
    }

    public abstract void x(long j3, long j10);

    public final void y(b2.s[] sVarArr, u2.a1 a1Var, long j3, long j10, u2.f0 f0Var) {
        e2.d.g(!this.f11653y);
        this.f11649r = a1Var;
        this.G = f0Var;
        if (this.f11652x == Long.MIN_VALUE) {
            this.f11652x = j3;
        }
        this.f11650s = sVarArr;
        this.v = j10;
        v(sVarArr, j3, j10, f0Var);
    }

    public void e() {
    }

    public void r() {
    }

    public void s() {
    }

    public void t() {
    }

    public void u() {
    }

    @Override
    public void c(int i10, Object obj) {
    }

    public void p(boolean z10, boolean z11) {
    }

    public void z(float f7, float f10) {
    }

    public void v(b2.s[] sVarArr, long j3, long j10, u2.f0 f0Var) {
    }
}
