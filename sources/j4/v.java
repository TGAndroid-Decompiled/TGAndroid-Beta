package j4;

import bi.q8;
import c3.i0;
public final class v implements i {
    public String e;
    public i0 f12793f;
    public boolean f12795i;
    public int f12797k;
    public int f12798l;
    public int f12800n;
    public int f12801o;
    public int f12805s;
    public boolean f12807u;
    public int d = 0;
    public final e2.x f12790a = new e2.x(new byte[15], 2);
    public final a4.g f12791b = new a4.g();
    public final e2.x f12792c = new e2.x();
    public final q8 f12802p = new q8();
    public int f12803q = -2147483647;
    public int f12804r = -1;
    public long f12806t = -1;
    public boolean f12796j = true;
    public boolean f12799m = true;
    public double f12794g = -9.223372036854776E18d;
    public double h = -9.223372036854776E18d;

    @Override
    public final void a(e2.x r25) {
        throw new UnsupportedOperationException("Method not decompiled: j4.v.a(e2.x):void");
    }

    @Override
    public final void c() {
        this.d = 0;
        this.f12798l = 0;
        this.f12790a.K(2);
        this.f12800n = 0;
        this.f12801o = 0;
        this.f12803q = -2147483647;
        this.f12804r = -1;
        this.f12805s = 0;
        this.f12806t = -1L;
        this.f12807u = false;
        this.f12795i = false;
        this.f12799m = true;
        this.f12796j = true;
        this.f12794g = -9.223372036854776E18d;
        this.h = -9.223372036854776E18d;
    }

    @Override
    public final void d(c3.q qVar, f0 f0Var) {
        f0Var.b();
        f0Var.c();
        this.e = (String) f0Var.e;
        f0Var.c();
        this.f12793f = qVar.a0(f0Var.f12643c, 1);
    }

    @Override
    public final void f(int i10, long j10) {
        this.f12797k = i10;
        if (!this.f12796j && (this.f12801o != 0 || !this.f12799m)) {
            this.f12795i = true;
        }
        if (j10 != -9223372036854775807L) {
            if (this.f12795i) {
                this.h = j10;
            } else {
                this.f12794g = j10;
            }
        }
    }

    @Override
    public final void e(boolean z10) {
    }
}
