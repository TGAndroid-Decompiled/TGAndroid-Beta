package j4;

import ai.f9;
import c3.h0;
public final class v implements i {
    public String e;
    public h0 f12823f;
    public boolean f12825i;
    public int f12827k;
    public int f12828l;
    public int f12830n;
    public int f12831o;
    public int f12835s;
    public boolean f12837u;
    public int d = 0;
    public final e2.v f12820a = new e2.v(new byte[15], 2);
    public final a4.h f12821b = new a4.h();
    public final e2.v f12822c = new e2.v();
    public final f9 f12832p = new Object();
    public int f12833q = -2147483647;
    public int f12834r = -1;
    public long f12836t = -1;
    public boolean f12826j = true;
    public boolean f12829m = true;
    public double f12824g = -9.223372036854776E18d;
    public double h = -9.223372036854776E18d;

    @Override
    public final void a(e2.v r25) {
        throw new UnsupportedOperationException("Method not decompiled: j4.v.a(e2.v):void");
    }

    @Override
    public final void c() {
        this.d = 0;
        this.f12828l = 0;
        this.f12820a.G(2);
        this.f12830n = 0;
        this.f12831o = 0;
        this.f12833q = -2147483647;
        this.f12834r = -1;
        this.f12835s = 0;
        this.f12836t = -1L;
        this.f12837u = false;
        this.f12825i = false;
        this.f12829m = true;
        this.f12826j = true;
        this.f12824g = -9.223372036854776E18d;
        this.h = -9.223372036854776E18d;
    }

    @Override
    public final void d(c3.q qVar, f0 f0Var) {
        f0Var.a();
        f0Var.b();
        this.e = f0Var.e;
        f0Var.b();
        this.f12823f = qVar.Z1(f0Var.d, 1);
    }

    @Override
    public final void f(int i10, long j3) {
        this.f12827k = i10;
        if (!this.f12826j && (this.f12831o != 0 || !this.f12829m)) {
            this.f12825i = true;
        }
        if (j3 != -9223372036854775807L) {
            if (this.f12825i) {
                this.h = j3;
            } else {
                this.f12824g = j3;
            }
        }
    }

    @Override
    public final void e(boolean z10) {
    }
}
