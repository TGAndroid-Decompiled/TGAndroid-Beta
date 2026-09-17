package i2;
public abstract class f implements i1 {
    public boolean E;
    public u2.f0 G;
    public x2.p H;
    public final int f11521b;
    public m1 d;
    public int f11523e;
    public j2.k f11524f;
    public e2.x h;
    public int f11525n;
    public u2.b1 f11526r;
    public b2.s[] f11527s;
    public long v;
    public long f11528w;
    public boolean f11530y;
    public final Object f11520a = new Object();
    public final n4.y f11522c = new n4.y(17, false);
    public long f11529x = Long.MIN_VALUE;
    public b2.k1 F = b2.k1.f2158a;

    public f(int i10) {
        this.f11521b = i10;
    }

    public abstract int A(b2.s sVar);

    public int B() {
        return 0;
    }

    public final i2.o c(java.lang.Throwable r12, b2.s r13, boolean r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: i2.f.c(java.lang.Throwable, b2.s, boolean, int):i2.o");
    }

    public long g(long j3, long j10) {
        if (this.f11525n == 1) {
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
        if (this.f11529x == Long.MIN_VALUE) {
            return true;
        }
        return false;
    }

    public abstract boolean l();

    public abstract boolean m();

    public final boolean n() {
        if (k()) {
            return this.f11530y;
        }
        u2.b1 b1Var = this.f11526r;
        b1Var.getClass();
        return b1Var.e();
    }

    public abstract void o();

    public abstract void q(long j3, boolean z10);

    public final int w(n4.y yVar, h2.h hVar, int i10) {
        u2.b1 b1Var = this.f11526r;
        b1Var.getClass();
        int f7 = b1Var.f(yVar, hVar, i10);
        if (f7 == -4) {
            if (hVar.isEndOfStream()) {
                this.f11529x = Long.MIN_VALUE;
                if (this.f11530y) {
                    return -4;
                }
                return -3;
            }
            long j3 = hVar.f10877e + this.v;
            hVar.f10877e = j3;
            this.f11529x = Math.max(this.f11529x, j3);
            return f7;
        }
        if (f7 == -5) {
            b2.s sVar = (b2.s) yVar.f16524c;
            sVar.getClass();
            long j10 = sVar.f2401w;
            if (j10 != Long.MAX_VALUE) {
                b2.r a2 = sVar.a();
                a2.v = j10 + this.v;
                yVar.f16524c = new b2.s(a2);
            }
        }
        return f7;
    }

    public abstract void x(long j3, long j10);

    public final void y(b2.s[] sVarArr, u2.b1 b1Var, long j3, long j10, u2.f0 f0Var) {
        e2.d.g(!this.f11530y);
        this.f11526r = b1Var;
        this.G = f0Var;
        if (this.f11529x == Long.MIN_VALUE) {
            this.f11529x = j3;
        }
        this.f11527s = sVarArr;
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
    public void d(int i10, Object obj) {
    }

    public void p(boolean z10, boolean z11) {
    }

    public void z(float f7, float f10) {
    }

    public void v(b2.s[] sVarArr, long j3, long j10, u2.f0 f0Var) {
    }
}
