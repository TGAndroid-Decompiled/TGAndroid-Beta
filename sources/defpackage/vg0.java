package defpackage;
public abstract class vg0 implements lg8 {
    public boolean E;
    public boolean F;
    public vz6 H;
    public ld3 J;
    public final byte b;
    public qa9 d;
    public int e;
    public ig8 f;
    public vgb h;
    public byte n;
    public at9 r;
    public ko4[] s;
    public long w;
    public long x;
    public final Object a = new Object();
    public final ym4 c = new ym4((byte) 1, false);
    public long y = Long.MIN_VALUE;
    public asb G = asb.a;
    public long I = -9223372036854775807L;

    public vg0(int i) {
        this.b = i;
    }

    public final int A(ym4 ym4Var, s93 s93Var, int i) {
        boolean z;
        if ((i & 1) != 0) {
            z = true;
        } else {
            z = false;
        }
        at9 at9Var = this.r;
        at9Var.getClass();
        int i2 = at9Var.i(ym4Var, s93Var, i);
        if (i2 == -4) {
            if (s93Var.isEndOfStream()) {
                if (!z) {
                    this.y = Long.MIN_VALUE;
                }
                if (this.E) {
                    return -4;
                }
                return -3;
            }
            long j = s93Var.e + this.w;
            s93Var.e = j;
            if (!z) {
                this.y = Math.max(this.y, j);
                return i2;
            }
        } else if (i2 == -5) {
            ko4 ko4Var = (ko4) ym4Var.c;
            ko4Var.getClass();
            long j2 = ko4Var.y;
            if (j2 != Long.MAX_VALUE) {
                jo4 a = ko4Var.a();
                a.x = j2 + this.w;
                ym4Var.c = new ko4(a);
            }
        }
        return i2;
    }

    public abstract void B(long j, long j2);

    public final void C(ko4[] ko4VarArr, at9 at9Var, long j, long j2, vz6 vz6Var) {
        yve.p(!this.E);
        this.r = at9Var;
        this.H = vz6Var;
        J();
        if (this.y == Long.MIN_VALUE) {
            this.y = j;
        }
        this.s = ko4VarArr;
        this.w = j2;
        y(ko4VarArr, j, j2, vz6Var);
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
        at9 at9Var = this.r;
        at9Var.getClass();
        return at9Var.o(j - this.w);
    }

    public int G(ko4 ko4Var) {
        if ("application/x-camera-motion".equals(ko4Var.t)) {
            return qu6.a(4, 0, 0, 0);
        }
        return qu6.a(0, 0, 0, 0);
    }

    public int H() {
        return 0;
    }

    public boolean I(long j) {
        return false;
    }

    public final void J() {
        vz6 vz6Var;
        if (!this.G.p() && (vz6Var = this.H) != null) {
            int b = this.G.b(vz6Var.a);
            if (b == -1) {
                this.I = -9223372036854775807L;
                return;
            }
            this.I = this.G.f(b, new xrb(), false).d;
            int i = vz6Var.b;
            if (i != -1) {
                this.I = ea.c.a(i).e[vz6Var.c];
                return;
            }
            int i2 = vz6Var.e;
            if (i2 != -1) {
                ea.c.a(i2).getClass();
                this.I = 0L;
                return;
            }
            return;
        }
        this.I = -9223372036854775807L;
    }

    public final defpackage.e64 e(java.lang.Throwable r11, defpackage.ko4 r12, boolean r13, int r14) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vg0.e(java.lang.Throwable, ko4, boolean, int):e64");
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

    public hm6 k() {
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
        at9 at9Var = this.r;
        at9Var.getClass();
        return at9Var.k();
    }

    public abstract void q();

    public abstract void s(long j, boolean z, boolean z2);

    public final void u() {
        ld3 ld3Var;
        synchronized (this.a) {
            ld3Var = this.J;
        }
        if (ld3Var != null) {
            ld3Var.g.getClass();
        }
    }

    public void i() {
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

    public void y(ko4[] ko4VarArr, long j, long j2, vz6 vz6Var) {
    }
}
