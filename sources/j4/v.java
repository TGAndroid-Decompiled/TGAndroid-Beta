package j4;
public final class v implements i {
    public String e;
    public c3.h0 f11730f;
    public boolean f11732i;
    public int f11734k;
    public int f11735l;
    public int f11737n;
    public int f11738o;
    public int f11742s;
    public boolean f11744u;
    public int d = 0;
    public final e2.v f11727a = new e2.v(new byte[15], 2);
    public final a4.h f11728b = new a4.h();
    public final e2.v f11729c = new e2.v();
    public final w f11739p = new Object();
    public int f11740q = -2147483647;
    public int f11741r = -1;
    public long f11743t = -1;
    public boolean f11733j = true;
    public boolean f11736m = true;
    public double f11731g = -9.223372036854776E18d;
    public double h = -9.223372036854776E18d;

    @Override
    public final void a(e2.v r25) {
        throw new UnsupportedOperationException("Method not decompiled: j4.v.a(e2.v):void");
    }

    @Override
    public final void b() {
        this.d = 0;
        this.f11735l = 0;
        this.f11727a.G(2);
        this.f11737n = 0;
        this.f11738o = 0;
        this.f11740q = -2147483647;
        this.f11741r = -1;
        this.f11742s = 0;
        this.f11743t = -1L;
        this.f11744u = false;
        this.f11732i = false;
        this.f11736m = true;
        this.f11733j = true;
        this.f11731g = -9.223372036854776E18d;
        this.h = -9.223372036854776E18d;
    }

    @Override
    public final void c(c3.q qVar, g0 g0Var) {
        g0Var.a();
        g0Var.b();
        this.e = g0Var.e;
        g0Var.b();
        this.f11730f = qVar.I(g0Var.d, 1);
    }

    @Override
    public final void e(int i10, long j3) {
        this.f11734k = i10;
        if (!this.f11733j && (this.f11738o != 0 || !this.f11736m)) {
            this.f11732i = true;
        }
        if (j3 != -9223372036854775807L) {
            if (this.f11732i) {
                this.h = j3;
            } else {
                this.f11731g = j3;
            }
        }
    }

    @Override
    public final void d(boolean z10) {
    }
}
