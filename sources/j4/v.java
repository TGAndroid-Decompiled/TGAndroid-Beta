package j4;

import ai.f9;
import c3.h0;
public final class v implements i {
    public String e;
    public h0 f12838f;
    public boolean f12840i;
    public int f12842k;
    public int f12843l;
    public int f12845n;
    public int f12846o;
    public int f12850s;
    public boolean f12852u;
    public int d = 0;
    public final e2.v f12835a = new e2.v(new byte[15], 2);
    public final a4.h f12836b = new a4.h();
    public final e2.v f12837c = new e2.v();
    public final f9 f12847p = new Object();
    public int f12848q = -2147483647;
    public int f12849r = -1;
    public long f12851t = -1;
    public boolean f12841j = true;
    public boolean f12844m = true;
    public double f12839g = -9.223372036854776E18d;
    public double h = -9.223372036854776E18d;

    @Override
    public final void a(e2.v r25) {
        throw new UnsupportedOperationException("Method not decompiled: j4.v.a(e2.v):void");
    }

    @Override
    public final void c() {
        this.d = 0;
        this.f12843l = 0;
        this.f12835a.G(2);
        this.f12845n = 0;
        this.f12846o = 0;
        this.f12848q = -2147483647;
        this.f12849r = -1;
        this.f12850s = 0;
        this.f12851t = -1L;
        this.f12852u = false;
        this.f12840i = false;
        this.f12844m = true;
        this.f12841j = true;
        this.f12839g = -9.223372036854776E18d;
        this.h = -9.223372036854776E18d;
    }

    @Override
    public final void d(c3.q qVar, f0 f0Var) {
        f0Var.a();
        f0Var.b();
        this.e = f0Var.e;
        f0Var.b();
        this.f12838f = qVar.Z1(f0Var.d, 1);
    }

    @Override
    public final void f(int i10, long j3) {
        this.f12842k = i10;
        if (!this.f12841j && (this.f12846o != 0 || !this.f12844m)) {
            this.f12840i = true;
        }
        if (j3 != -9223372036854775807L) {
            if (this.f12840i) {
                this.h = j3;
            } else {
                this.f12839g = j3;
            }
        }
    }

    @Override
    public final void e(boolean z10) {
    }
}
