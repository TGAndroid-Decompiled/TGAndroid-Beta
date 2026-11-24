package defpackage;
public final class uf7 implements gu3 {
    public String e;
    public wxb f;
    public boolean i;
    public int k;
    public int l;
    public int n;
    public int o;
    public int s;
    public boolean u;
    public byte d = 0;
    public final xu7 a = new xu7(2, new byte[15]);
    public final qd1 b = new qd1();
    public final xu7 c = new xu7();
    public final iz0 p = new iz0();
    public int q = -2147483647;
    public int r = -1;
    public long t = -1;
    public boolean j = true;
    public boolean m = true;
    public double g = -9.223372036854776E18d;
    public double h = -9.223372036854776E18d;

    @Override
    public final void b(defpackage.xu7 r27) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uf7.b(xu7):void");
    }

    @Override
    public final void d() {
        this.d = (byte) 0;
        this.l = 0;
        this.a.K(2);
        this.n = 0;
        this.o = 0;
        this.q = -2147483647;
        this.r = -1;
        this.s = 0;
        this.t = -1L;
        this.u = false;
        this.i = false;
        this.m = true;
        this.j = true;
        this.g = -9.223372036854776E18d;
        this.h = -9.223372036854776E18d;
    }

    @Override
    public final void g(int i, long j) {
        this.k = i;
        if (!this.j && (this.o != 0 || !this.m)) {
            this.i = true;
        }
        if (j != -9223372036854775807L) {
            if (this.i) {
                this.h = j;
            } else {
                this.g = j;
            }
        }
    }

    @Override
    public final void h(l74 l74Var, l2c l2cVar) {
        l2cVar.a();
        l2cVar.b();
        this.e = l2cVar.e;
        l2cVar.b();
        this.f = l74Var.T(l2cVar.d, 1);
    }

    @Override
    public final void e() {
    }

    @Override
    public final void f() {
    }
}
