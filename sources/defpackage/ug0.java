package defpackage;
public abstract class ug0 implements xc8 {
    public boolean E;
    public boolean F;
    public rx6 H;
    public sc3 J;
    public final byte b;
    public d79 d;
    public int e;
    public uc8 f;
    public adb h;
    public byte n;
    public ip9 r;
    public fm4[] s;
    public long w;
    public long x;
    public final Object a = new Object();
    public final sk4 c = new sk4((byte) 1, false);
    public long y = Long.MIN_VALUE;
    public aob G = aob.a;
    public long I = -9223372036854775807L;

    public ug0(int i) {
        this.b = i;
    }

    public final int A(sk4 sk4Var, z83 z83Var, int i) {
        boolean z;
        if ((i & 1) != 0) {
            z = true;
        } else {
            z = false;
        }
        ip9 ip9Var = this.r;
        ip9Var.getClass();
        int h = ip9Var.h(sk4Var, z83Var, i);
        if (h == -4) {
            if (z83Var.isEndOfStream()) {
                if (!z) {
                    this.y = Long.MIN_VALUE;
                }
                if (this.E) {
                    return -4;
                }
                return -3;
            }
            long j = z83Var.e + this.w;
            z83Var.e = j;
            if (!z) {
                this.y = Math.max(this.y, j);
                return h;
            }
        } else if (h == -5) {
            fm4 fm4Var = (fm4) sk4Var.c;
            fm4Var.getClass();
            long j2 = fm4Var.y;
            if (j2 != Long.MAX_VALUE) {
                em4 a = fm4Var.a();
                a.x = j2 + this.w;
                sk4Var.c = new fm4(a);
            }
        }
        return h;
    }

    public abstract void B(long j, long j2);

    public final void C(fm4[] fm4VarArr, ip9 ip9Var, long j, long j2, rx6 rx6Var) {
        gre.p(!this.E);
        this.r = ip9Var;
        this.H = rx6Var;
        J();
        if (this.y == Long.MIN_VALUE) {
            this.y = j;
        }
        this.s = fm4VarArr;
        this.w = j2;
        y(fm4VarArr, j, j2, rx6Var);
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
        ip9 ip9Var = this.r;
        ip9Var.getClass();
        return ip9Var.n(j - this.w);
    }

    public int G(fm4 fm4Var) {
        if ("application/x-camera-motion".equals(fm4Var.t)) {
            return ls6.a(4, 0, 0, 0);
        }
        return ls6.a(0, 0, 0, 0);
    }

    public int H() {
        return 0;
    }

    public boolean I(long j) {
        return false;
    }

    public final void J() {
        rx6 rx6Var;
        if (!this.G.p() && (rx6Var = this.H) != null) {
            int b = this.G.b(rx6Var.a);
            if (b == -1) {
                this.I = -9223372036854775807L;
                return;
            }
            this.I = this.G.f(b, new xnb(), false).d;
            int i = rx6Var.b;
            if (i != -1) {
                this.I = da.c.a(i).e[rx6Var.c];
                return;
            }
            int i2 = rx6Var.e;
            if (i2 != -1) {
                da.c.a(i2).getClass();
                this.I = 0L;
                return;
            }
            return;
        }
        this.I = -9223372036854775807L;
    }

    public final defpackage.j54 e(java.lang.Throwable r11, defpackage.fm4 r12, boolean r13, int r14) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ug0.e(java.lang.Throwable, fm4, boolean, int):j54");
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

    public ck6 k() {
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
        ip9 ip9Var = this.r;
        ip9Var.getClass();
        return ip9Var.j();
    }

    public abstract void q();

    public abstract void s(long j, boolean z, boolean z2);

    public final void u() {
        sc3 sc3Var;
        synchronized (this.a) {
            sc3Var = this.J;
        }
        if (sc3Var != null) {
            sc3Var.g.getClass();
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

    public void y(fm4[] fm4VarArr, long j, long j2, rx6 rx6Var) {
    }
}
