package i2;
public abstract class f implements i1 {
    public boolean E;
    public u2.f0 G;
    public x2.p H;
    public final int f11495b;
    public m1 d;
    public int f11497e;
    public j2.k f11498f;
    public e2.x h;
    public int f11499n;
    public u2.b1 f11500r;
    public b2.s[] f11501s;
    public long v;
    public long f11502w;
    public boolean f11504y;
    public final Object f11494a = new Object();
    public final n4.y f11496c = new n4.y(17, false);
    public long f11503x = Long.MIN_VALUE;
    public b2.k1 F = b2.k1.f2131a;

    public f(int i10) {
        this.f11495b = i10;
    }

    public int A() {
        return 0;
    }

    public final i2.o c(java.lang.Throwable r12, b2.s r13, boolean r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: i2.f.c(java.lang.Throwable, b2.s, boolean, int):i2.o");
    }

    public long g(long j3, long j10) {
        if (this.f11499n == 1) {
            if (m() || l()) {
                return 1000000L;
            }
            return 10000L;
        }
        return 10000L;
    }

    public s0 i() {
        return null;
    }

    public abstract String j();

    public final boolean k() {
        if (this.f11503x == Long.MIN_VALUE) {
            return true;
        }
        return false;
    }

    public abstract boolean l();

    public abstract boolean m();

    public abstract void n();

    public abstract void p(long j3, boolean z10);

    public final int v(n4.y yVar, h2.g gVar, int i10) {
        u2.b1 b1Var = this.f11500r;
        b1Var.getClass();
        int f7 = b1Var.f(yVar, gVar, i10);
        if (f7 == -4) {
            if (gVar.c(4)) {
                this.f11503x = Long.MIN_VALUE;
                if (this.f11504y) {
                    return -4;
                }
                return -3;
            }
            long j3 = gVar.h + this.v;
            gVar.h = j3;
            this.f11503x = Math.max(this.f11503x, j3);
            return f7;
        }
        if (f7 == -5) {
            b2.s sVar = (b2.s) yVar.f16497c;
            sVar.getClass();
            long j10 = sVar.f2374w;
            if (j10 != Long.MAX_VALUE) {
                b2.r a2 = sVar.a();
                a2.v = j10 + this.v;
                yVar.f16497c = new b2.s(a2);
            }
        }
        return f7;
    }

    public abstract void w(long j3, long j10);

    public final void x(b2.s[] sVarArr, u2.b1 b1Var, long j3, long j10, u2.f0 f0Var) {
        e2.d.g(!this.f11504y);
        this.f11500r = b1Var;
        this.G = f0Var;
        if (this.f11503x == Long.MIN_VALUE) {
            this.f11503x = j3;
        }
        this.f11501s = sVarArr;
        this.v = j10;
        u(sVarArr, j3, j10, f0Var);
    }

    public abstract int z(b2.s sVar);

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

    @Override
    public void d(int i10, Object obj) {
    }

    public void o(boolean z10, boolean z11) {
    }

    public void y(float f7, float f10) {
    }

    public void u(b2.s[] sVarArr, long j3, long j10, u2.f0 f0Var) {
    }
}
