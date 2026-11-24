package defpackage;
public abstract class uh0 implements ze8 {
    public boolean E;
    public boolean F;
    public rz6 H;
    public fe3 J;
    public final byte b;
    public f99 d;
    public int e;
    public we8 f;
    public bfb h;
    public byte n;
    public jr9 r;
    public go4[] s;
    public long w;
    public long x;
    public final Object a = new Object();
    public final mj4 c = new mj4((byte) 3, false);
    public long y = Long.MIN_VALUE;
    public bqb G = bqb.a;
    public long I = -9223372036854775807L;

    public uh0(int i) {
        this.b = i;
    }

    public final int A(mj4 mj4Var, la3 la3Var, int i) {
        boolean z;
        if ((i & 1) != 0) {
            z = true;
        } else {
            z = false;
        }
        jr9 jr9Var = this.r;
        jr9Var.getClass();
        int p = jr9Var.p(mj4Var, la3Var, i);
        if (p == -4) {
            if (la3Var.isEndOfStream()) {
                if (!z) {
                    this.y = Long.MIN_VALUE;
                }
                if (this.E) {
                    return -4;
                }
                return -3;
            }
            long j = la3Var.e + this.w;
            la3Var.e = j;
            if (!z) {
                this.y = Math.max(this.y, j);
                return p;
            }
        } else if (p == -5) {
            go4 go4Var = (go4) mj4Var.c;
            go4Var.getClass();
            long j2 = go4Var.y;
            if (j2 != Long.MAX_VALUE) {
                fo4 a = go4Var.a();
                a.x = j2 + this.w;
                mj4Var.c = new go4(a);
            }
        }
        return p;
    }

    public abstract void B(long j, long j2);

    public final void C(go4[] go4VarArr, jr9 jr9Var, long j, long j2, rz6 rz6Var) {
        jte.p(!this.E);
        this.r = jr9Var;
        this.H = rz6Var;
        J();
        if (this.y == Long.MIN_VALUE) {
            this.y = j;
        }
        this.s = go4VarArr;
        this.w = j2;
        y(go4VarArr, j, j2, rz6Var);
    }

    public final void D(long j, boolean z, boolean z2) {
        this.E = false;
        this.x = j;
        this.y = j;
        if (!z2) {
            if (F(j) != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
        }
        s(j, z, z2);
    }

    public final int F(long j) {
        jr9 jr9Var = this.r;
        jr9Var.getClass();
        return jr9Var.m(j - this.w);
    }

    public int G(go4 go4Var) {
        if ("application/x-camera-motion".equals(go4Var.t)) {
            return kt6.a(4, 0, 0, 0);
        }
        return kt6.a(0, 0, 0, 0);
    }

    public int H() {
        return 0;
    }

    public boolean I(long j) {
        return false;
    }

    public final void J() {
        rz6 rz6Var;
        if (!this.G.p() && (rz6Var = this.H) != null) {
            int b = this.G.b(rz6Var.a);
            if (b == -1) {
                this.I = -9223372036854775807L;
                return;
            }
            this.I = this.G.f(b, new ypb(), false).d;
            int i = rz6Var.b;
            if (i != -1) {
                this.I = da.c.a(i).e[rz6Var.c];
                return;
            }
            int i2 = rz6Var.e;
            if (i2 != -1) {
                da.c.a(i2).getClass();
                this.I = 0L;
                return;
            }
            return;
        }
        this.I = -9223372036854775807L;
    }

    public final defpackage.u64 e(java.lang.Throwable r11, defpackage.go4 r12, boolean r13, int r14) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uh0.e(java.lang.Throwable, go4, boolean, int):u64");
    }

    public long j(long j, long j2) {
        if (this.n == 1) {
            if (o() || n()) {
                return 1000000L;
            }
            return 10000L;
        }
        return 10000L;
    }

    public fm6 k() {
        return null;
    }

    public String l() {
        return "CameraMotionRenderer";
    }

    public final boolean m() {
        if (this.y == Long.MIN_VALUE) {
            return true;
        }
        return false;
    }

    public boolean n() {
        return m();
    }

    public boolean o() {
        return true;
    }

    public final boolean p() {
        if (m()) {
            return this.E;
        }
        jr9 jr9Var = this.r;
        jr9Var.getClass();
        return jr9Var.i();
    }

    public abstract void q();

    public abstract void s(long j, boolean z, boolean z2);

    public final void u() {
        fe3 fe3Var;
        synchronized (this.a) {
            fe3Var = this.J;
        }
        if (fe3Var != null) {
            fe3Var.g.getClass();
        }
    }

    public void f() {
    }

    public void t() {
    }

    public void v() {
    }

    public void w() {
    }

    public void x() {
    }

    public void z() {
    }

    public void E(float f, float f2) {
    }

    @Override
    public void d(int i, Object obj) {
    }

    public void r(boolean z, boolean z2) {
    }

    public void y(go4[] go4VarArr, long j, long j2, rz6 rz6Var) {
    }
}
