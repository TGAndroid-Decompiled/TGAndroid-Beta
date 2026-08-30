package j3;
public abstract class e implements b2 {
    public final int f8489b;
    public g2 d;
    public int e;
    public k3.k f8491f;
    public int h;
    public o4.l0 f8492n;
    public n0[] f8493r;
    public long f8494s;
    public boolean f8495w;
    public boolean f8496x;
    public f5.p f8497y;
    public final Object f8488a = new Object();
    public final f7.b f8490c = new f7.b((char) 0, 17);
    public long v = Long.MIN_VALUE;

    public e(int i10) {
        this.f8489b = i10;
    }

    public final j3.n a(java.lang.Throwable r11, j3.n0 r12, boolean r13, int r14) {
        throw new UnsupportedOperationException("Method not decompiled: j3.e.a(java.lang.Throwable, j3.n0, boolean, int):j3.n");
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
        o4.l0 l0Var = this.f8492n;
        l0Var.getClass();
        int f10 = l0Var.f(bVar, iVar, i10);
        if (f10 == -4) {
            if (iVar.e(4)) {
                this.v = Long.MIN_VALUE;
                if (this.f8495w) {
                    return -4;
                }
                return -3;
            }
            long j10 = iVar.f14242f + this.f8494s;
            iVar.f14242f = j10;
            this.v = Math.max(this.v, j10);
            return f10;
        }
        if (f10 == -5) {
            n0 n0Var = (n0) bVar.f6013c;
            n0Var.getClass();
            long j11 = n0Var.G;
            if (j11 != Long.MAX_VALUE) {
                m0 a2 = n0Var.a();
                a2.f8688s = j11 + this.f8494s;
                bVar.f6013c = new n0(a2);
            }
        }
        return f10;
    }

    public abstract void t(long j10, long j11);

    public final void u(n0[] n0VarArr, o4.l0 l0Var, long j10, long j11) {
        h5.a.i(!this.f8495w);
        this.f8492n = l0Var;
        if (this.v == Long.MIN_VALUE) {
            this.v = j10;
        }
        this.f8493r = n0VarArr;
        this.f8494s = j11;
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
        this.f8490c.l();
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
