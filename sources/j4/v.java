package j4;

import ai.f9;
import c3.h0;
public final class v implements i {
    public String e;
    public h0 f12833f;
    public boolean f12835i;
    public int f12837k;
    public int f12838l;
    public int f12840n;
    public int f12841o;
    public int f12845s;
    public boolean f12847u;
    public int d = 0;
    public final e2.v f12830a = new e2.v(new byte[15], 2);
    public final a4.h f12831b = new a4.h();
    public final e2.v f12832c = new e2.v();
    public final f9 f12842p = new Object();
    public int f12843q = -2147483647;
    public int f12844r = -1;
    public long f12846t = -1;
    public boolean f12836j = true;
    public boolean f12839m = true;
    public double f12834g = -9.223372036854776E18d;
    public double h = -9.223372036854776E18d;

    @Override
    public final void a(e2.v r25) {
        throw new UnsupportedOperationException("Method not decompiled: j4.v.a(e2.v):void");
    }

    @Override
    public final void c() {
        this.d = 0;
        this.f12838l = 0;
        this.f12830a.G(2);
        this.f12840n = 0;
        this.f12841o = 0;
        this.f12843q = -2147483647;
        this.f12844r = -1;
        this.f12845s = 0;
        this.f12846t = -1L;
        this.f12847u = false;
        this.f12835i = false;
        this.f12839m = true;
        this.f12836j = true;
        this.f12834g = -9.223372036854776E18d;
        this.h = -9.223372036854776E18d;
    }

    @Override
    public final void d(c3.q qVar, f0 f0Var) {
        f0Var.a();
        f0Var.b();
        this.e = f0Var.e;
        f0Var.b();
        this.f12833f = qVar.Z1(f0Var.d, 1);
    }

    @Override
    public final void f(int i10, long j3) {
        this.f12837k = i10;
        if (!this.f12836j && (this.f12841o != 0 || !this.f12839m)) {
            this.f12835i = true;
        }
        if (j3 != -9223372036854775807L) {
            if (this.f12835i) {
                this.h = j3;
            } else {
                this.f12834g = j3;
            }
        }
    }

    @Override
    public final void e(boolean z10) {
    }
}
