package j4;

import bi.q8;
import c3.i0;
public final class v implements i {
    public String e;
    public i0 f12797f;
    public boolean f12799i;
    public int f12801k;
    public int f12802l;
    public int f12804n;
    public int f12805o;
    public int f12809s;
    public boolean f12811u;
    public int d = 0;
    public final e2.x f12794a = new e2.x(new byte[15], 2);
    public final a4.g f12795b = new a4.g();
    public final e2.x f12796c = new e2.x();
    public final q8 f12806p = new q8();
    public int f12807q = -2147483647;
    public int f12808r = -1;
    public long f12810t = -1;
    public boolean f12800j = true;
    public boolean f12803m = true;
    public double f12798g = -9.223372036854776E18d;
    public double h = -9.223372036854776E18d;

    @Override
    public final void a(e2.x r25) {
        throw new UnsupportedOperationException("Method not decompiled: j4.v.a(e2.x):void");
    }

    @Override
    public final void c() {
        this.d = 0;
        this.f12802l = 0;
        this.f12794a.K(2);
        this.f12804n = 0;
        this.f12805o = 0;
        this.f12807q = -2147483647;
        this.f12808r = -1;
        this.f12809s = 0;
        this.f12810t = -1L;
        this.f12811u = false;
        this.f12799i = false;
        this.f12803m = true;
        this.f12800j = true;
        this.f12798g = -9.223372036854776E18d;
        this.h = -9.223372036854776E18d;
    }

    @Override
    public final void d(c3.q qVar, f0 f0Var) {
        f0Var.b();
        f0Var.c();
        this.e = (String) f0Var.e;
        f0Var.c();
        this.f12797f = qVar.W(f0Var.f12647c, 1);
    }

    @Override
    public final void f(int i10, long j10) {
        this.f12801k = i10;
        if (!this.f12800j && (this.f12805o != 0 || !this.f12803m)) {
            this.f12799i = true;
        }
        if (j10 != -9223372036854775807L) {
            if (this.f12799i) {
                this.h = j10;
            } else {
                this.f12798g = j10;
            }
        }
    }

    @Override
    public final void e(boolean z10) {
    }
}
