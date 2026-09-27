package j4;

import ai.f9;
import c3.h0;
public final class v implements i {
    public String e;
    public h0 f12826f;
    public boolean f12828i;
    public int f12830k;
    public int f12831l;
    public int f12833n;
    public int f12834o;
    public int f12838s;
    public boolean f12840u;
    public int d = 0;
    public final e2.v f12823a = new e2.v(new byte[15], 2);
    public final a4.h f12824b = new a4.h();
    public final e2.v f12825c = new e2.v();
    public final f9 f12835p = new Object();
    public int f12836q = -2147483647;
    public int f12837r = -1;
    public long f12839t = -1;
    public boolean f12829j = true;
    public boolean f12832m = true;
    public double f12827g = -9.223372036854776E18d;
    public double h = -9.223372036854776E18d;

    @Override
    public final void a(e2.v r25) {
        throw new UnsupportedOperationException("Method not decompiled: j4.v.a(e2.v):void");
    }

    @Override
    public final void c() {
        this.d = 0;
        this.f12831l = 0;
        this.f12823a.G(2);
        this.f12833n = 0;
        this.f12834o = 0;
        this.f12836q = -2147483647;
        this.f12837r = -1;
        this.f12838s = 0;
        this.f12839t = -1L;
        this.f12840u = false;
        this.f12828i = false;
        this.f12832m = true;
        this.f12829j = true;
        this.f12827g = -9.223372036854776E18d;
        this.h = -9.223372036854776E18d;
    }

    @Override
    public final void d(c3.q qVar, f0 f0Var) {
        f0Var.a();
        f0Var.b();
        this.e = f0Var.e;
        f0Var.b();
        this.f12826f = qVar.Z1(f0Var.d, 1);
    }

    @Override
    public final void f(int i10, long j3) {
        this.f12830k = i10;
        if (!this.f12829j && (this.f12834o != 0 || !this.f12832m)) {
            this.f12828i = true;
        }
        if (j3 != -9223372036854775807L) {
            if (this.f12828i) {
                this.h = j3;
            } else {
                this.f12827g = j3;
            }
        }
    }

    @Override
    public final void e(boolean z10) {
    }
}
