package j4;

import ai.f9;
import c3.h0;
public final class v implements i {
    public String e;
    public h0 f12835f;
    public boolean f12837i;
    public int f12839k;
    public int f12840l;
    public int f12842n;
    public int f12843o;
    public int f12847s;
    public boolean f12849u;
    public int d = 0;
    public final e2.v f12832a = new e2.v(new byte[15], 2);
    public final a4.h f12833b = new a4.h();
    public final e2.v f12834c = new e2.v();
    public final f9 f12844p = new Object();
    public int f12845q = -2147483647;
    public int f12846r = -1;
    public long f12848t = -1;
    public boolean f12838j = true;
    public boolean f12841m = true;
    public double f12836g = -9.223372036854776E18d;
    public double h = -9.223372036854776E18d;

    @Override
    public final void b(e2.v r25) {
        throw new UnsupportedOperationException("Method not decompiled: j4.v.b(e2.v):void");
    }

    @Override
    public final void d() {
        this.d = 0;
        this.f12840l = 0;
        this.f12832a.G(2);
        this.f12842n = 0;
        this.f12843o = 0;
        this.f12845q = -2147483647;
        this.f12846r = -1;
        this.f12847s = 0;
        this.f12848t = -1L;
        this.f12849u = false;
        this.f12837i = false;
        this.f12841m = true;
        this.f12838j = true;
        this.f12836g = -9.223372036854776E18d;
        this.h = -9.223372036854776E18d;
    }

    @Override
    public final void e(c3.q qVar, f0 f0Var) {
        f0Var.a();
        f0Var.b();
        this.e = f0Var.e;
        f0Var.b();
        this.f12835f = qVar.Z1(f0Var.d, 1);
    }

    @Override
    public final void g(int i10, long j3) {
        this.f12839k = i10;
        if (!this.f12838j && (this.f12843o != 0 || !this.f12841m)) {
            this.f12837i = true;
        }
        if (j3 != -9223372036854775807L) {
            if (this.f12837i) {
                this.h = j3;
            } else {
                this.f12836g = j3;
            }
        }
    }

    @Override
    public final void f(boolean z10) {
    }
}
