package j3;
public abstract class e implements b2 {
    public final int f9052b;
    public g2 d;
    public int f9054e;
    public k3.k f9055f;
    public int h;
    public o4.l0 f9056n;
    public n0[] f9057r;
    public long f9058s;
    public boolean f9059w;
    public boolean f9060x;
    public f5.p f9061y;
    public final Object f9051a = new Object();
    public final f7.b f9053c = new f7.b((char) 0, 16);
    public long v = Long.MIN_VALUE;

    public e(int i10) {
        this.f9052b = i10;
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
        o4.l0 l0Var = this.f9056n;
        l0Var.getClass();
        int p10 = l0Var.p(bVar, iVar, i10);
        if (p10 == -4) {
            if (iVar.e(4)) {
                this.v = Long.MIN_VALUE;
                if (this.f9059w) {
                    return -4;
                }
                return -3;
            }
            long j10 = iVar.f15216f + this.f9058s;
            iVar.f15216f = j10;
            this.v = Math.max(this.v, j10);
            return p10;
        }
        if (p10 == -5) {
            n0 n0Var = (n0) bVar.f6121c;
            n0Var.getClass();
            long j11 = n0Var.G;
            if (j11 != Long.MAX_VALUE) {
                m0 a2 = n0Var.a();
                a2.f9269s = j11 + this.f9058s;
                bVar.f6121c = new n0(a2);
            }
        }
        return p10;
    }

    public abstract void t(long j10, long j11);

    public final void u(n0[] n0VarArr, o4.l0 l0Var, long j10, long j11) {
        h5.a.i(!this.f9059w);
        this.f9056n = l0Var;
        if (this.v == Long.MIN_VALUE) {
            this.v = j10;
        }
        this.f9057r = n0VarArr;
        this.f9058s = j11;
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
        this.f9053c.l();
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
