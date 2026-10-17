package j4;

import c3.j0;
import ci.c7;
public final class v implements i {
    public String e;
    public j0 f14202f;
    public boolean f14204i;
    public int f14206k;
    public int f14207l;
    public int f14209n;
    public int f14210o;
    public int f14214s;
    public boolean f14216u;
    public int d = 0;
    public final e2.x f14199a = new e2.x(new byte[15], 2);
    public final a4.g f14200b = new a4.g();
    public final e2.x f14201c = new e2.x();
    public final c7 f14211p = new c7();
    public int f14212q = -2147483647;
    public int f14213r = -1;
    public long f14215t = -1;
    public boolean f14205j = true;
    public boolean f14208m = true;
    public double f14203g = -9.223372036854776E18d;
    public double h = -9.223372036854776E18d;

    @Override
    public final void a(e2.x r25) {
        throw new UnsupportedOperationException("Method not decompiled: j4.v.a(e2.x):void");
    }

    @Override
    public final void c() {
        this.d = 0;
        this.f14207l = 0;
        this.f14199a.K(2);
        this.f14209n = 0;
        this.f14210o = 0;
        this.f14212q = -2147483647;
        this.f14213r = -1;
        this.f14214s = 0;
        this.f14215t = -1L;
        this.f14216u = false;
        this.f14204i = false;
        this.f14208m = true;
        this.f14205j = true;
        this.f14203g = -9.223372036854776E18d;
        this.h = -9.223372036854776E18d;
    }

    @Override
    public final void d(c3.q qVar, f0 f0Var) {
        f0Var.b();
        f0Var.c();
        this.e = (String) f0Var.e;
        f0Var.c();
        this.f14202f = qVar.j0(f0Var.f14052c, 1);
    }

    @Override
    public final void f(int i10, long j10) {
        this.f14206k = i10;
        if (!this.f14205j && (this.f14210o != 0 || !this.f14208m)) {
            this.f14204i = true;
        }
        if (j10 != -9223372036854775807L) {
            if (this.f14204i) {
                this.h = j10;
            } else {
                this.f14203g = j10;
            }
        }
    }

    @Override
    public final void e(boolean z10) {
    }
}
