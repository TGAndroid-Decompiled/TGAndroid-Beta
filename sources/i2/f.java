package i2;
public abstract class f implements h1 {
    public boolean E;
    public u2.g0 G;
    public x2.p H;
    public final int f10174b;
    public l1 d;
    public int e;
    public j2.k f10176f;
    public e2.x h;
    public int f10177n;
    public u2.d1 f10178r;
    public b2.s[] f10179s;
    public long v;
    public long f10180w;
    public boolean f10182y;
    public final Object f10173a = new Object();
    public final of.b f10175c = new of.b(17);
    public long f10181x = Long.MIN_VALUE;
    public b2.k1 F = b2.k1.f1774a;

    public f(int i10) {
        this.f10174b = i10;
    }

    public abstract int A(b2.s sVar);

    public int B() {
        return 0;
    }

    public final i2.n d(java.lang.Throwable r12, b2.s r13, boolean r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: i2.f.d(java.lang.Throwable, b2.s, boolean, int):i2.n");
    }

    public long g(long j3, long j10) {
        if (this.f10177n == 1) {
            if (m() || l()) {
                return 1000000L;
            }
            return 10000L;
        }
        return 10000L;
    }

    public r0 i() {
        return null;
    }

    public abstract String j();

    public final boolean k() {
        if (this.f10181x == Long.MIN_VALUE) {
            return true;
        }
        return false;
    }

    public abstract boolean l();

    public abstract boolean m();

    public final boolean n() {
        if (k()) {
            return this.f10182y;
        }
        u2.d1 d1Var = this.f10178r;
        d1Var.getClass();
        return d1Var.e();
    }

    public abstract void o();

    public abstract void q(long j3, boolean z10);

    public final int w(of.b bVar, h2.h hVar, int i10) {
        u2.d1 d1Var = this.f10178r;
        d1Var.getClass();
        int t10 = d1Var.t(bVar, hVar, i10);
        if (t10 == -4) {
            if (hVar.isEndOfStream()) {
                this.f10181x = Long.MIN_VALUE;
                if (this.f10182y) {
                    return -4;
                }
                return -3;
            }
            long j3 = hVar.e + this.v;
            hVar.e = j3;
            this.f10181x = Math.max(this.f10181x, j3);
            return t10;
        }
        if (t10 == -5) {
            b2.s sVar = (b2.s) bVar.f14295c;
            sVar.getClass();
            long j10 = sVar.f2006w;
            if (j10 != Long.MAX_VALUE) {
                b2.r a2 = sVar.a();
                a2.v = j10 + this.v;
                bVar.f14295c = new b2.s(a2);
            }
        }
        return t10;
    }

    public abstract void x(long j3, long j10);

    public final void y(b2.s[] sVarArr, u2.d1 d1Var, long j3, long j10, u2.g0 g0Var) {
        e2.d.g(!this.f10182y);
        this.f10178r = d1Var;
        this.G = g0Var;
        if (this.f10181x == Long.MIN_VALUE) {
            this.f10181x = j3;
        }
        this.f10179s = sVarArr;
        this.v = j10;
        v(sVarArr, j3, j10, g0Var);
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

    public void v(b2.s[] sVarArr, long j3, long j10, u2.g0 g0Var) {
    }
}
