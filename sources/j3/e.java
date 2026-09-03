package j3;
public abstract class e implements b2 {
    public final int f8471b;
    public g2 d;
    public int e;
    public k3.k f8473f;
    public int h;
    public o4.l0 f8474n;
    public n0[] f8475r;
    public long f8476s;
    public boolean f8477w;
    public boolean f8478x;
    public f5.p f8479y;
    public final Object f8470a = new Object();
    public final f7.b f8472c = new f7.b((char) 0, 17);
    public long v = Long.MIN_VALUE;

    public e(int i10) {
        this.f8471b = i10;
    }

    public final j3.n c(java.lang.Throwable r11, j3.n0 r12, boolean r13, int r14) {
        throw new UnsupportedOperationException("Method not decompiled: j3.e.c(java.lang.Throwable, j3.n0, boolean, int):j3.n");
    }

    public h5.n f() {
        return null;
    }

    public abstract String g();

    public final boolean h() {
        if (this.v == Long.MIN_VALUE) {
            return true;
        }
        return false;
    }

    public abstract boolean i();

    public abstract boolean j();

    public abstract void k();

    public abstract void m(long j10, boolean z4);

    public abstract void r(n0[] n0VarArr, long j10, long j11);

    public final int s(f7.b bVar, n3.i iVar, int i10) {
        o4.l0 l0Var = this.f8474n;
        l0Var.getClass();
        int f10 = l0Var.f(bVar, iVar, i10);
        if (f10 == -4) {
            if (iVar.d(4)) {
                this.v = Long.MIN_VALUE;
                if (this.f8477w) {
                    return -4;
                }
                return -3;
            }
            long j10 = iVar.f14227f + this.f8476s;
            iVar.f14227f = j10;
            this.v = Math.max(this.v, j10);
            return f10;
        }
        if (f10 == -5) {
            n0 n0Var = (n0) bVar.f6002c;
            n0Var.getClass();
            long j11 = n0Var.G;
            if (j11 != Long.MAX_VALUE) {
                m0 a2 = n0Var.a();
                a2.f8670s = j11 + this.f8476s;
                bVar.f6002c = new n0(a2);
            }
        }
        return f10;
    }

    public abstract void t(long j10, long j11);

    public final void u(n0[] n0VarArr, o4.l0 l0Var, long j10, long j11) {
        h5.a.i(!this.f8477w);
        this.f8474n = l0Var;
        if (this.v == Long.MIN_VALUE) {
            this.v = j10;
        }
        this.f8475r = n0VarArr;
        this.f8476s = j11;
        r(n0VarArr, j10, j11);
    }

    public final void v() {
        boolean z4;
        if (this.h == 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        h5.a.i(z4);
        this.f8472c.m();
        o();
    }

    public abstract int x(n0 n0Var);

    public int y() {
        return 0;
    }

    public void n() {
    }

    public void o() {
    }

    public void p() {
    }

    public void q() {
    }

    @Override
    public void b(int i10, Object obj) {
    }

    public void l(boolean z4, boolean z10) {
    }

    public void w(float f10, float f11) {
    }
}
