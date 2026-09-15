package j4;

import ai.f9;
import c3.h0;
public final class v implements i {
    public String e;
    public h0 f12831f;
    public boolean f12833i;
    public int f12835k;
    public int f12836l;
    public int f12838n;
    public int f12839o;
    public int f12843s;
    public boolean f12845u;
    public int d = 0;
    public final e2.v f12828a = new e2.v(new byte[15], 2);
    public final a4.h f12829b = new a4.h();
    public final e2.v f12830c = new e2.v();
    public final f9 f12840p = new Object();
    public int f12841q = -2147483647;
    public int f12842r = -1;
    public long f12844t = -1;
    public boolean f12834j = true;
    public boolean f12837m = true;
    public double f12832g = -9.223372036854776E18d;
    public double h = -9.223372036854776E18d;

    @Override
    public final void a(e2.v r25) {
        throw new UnsupportedOperationException("Method not decompiled: j4.v.a(e2.v):void");
    }

    @Override
    public final void c() {
        this.d = 0;
        this.f12836l = 0;
        this.f12828a.G(2);
        this.f12838n = 0;
        this.f12839o = 0;
        this.f12841q = -2147483647;
        this.f12842r = -1;
        this.f12843s = 0;
        this.f12844t = -1L;
        this.f12845u = false;
        this.f12833i = false;
        this.f12837m = true;
        this.f12834j = true;
        this.f12832g = -9.223372036854776E18d;
        this.h = -9.223372036854776E18d;
    }

    @Override
    public final void d(c3.q qVar, f0 f0Var) {
        f0Var.a();
        f0Var.b();
        this.e = f0Var.e;
        f0Var.b();
        this.f12831f = qVar.Z1(f0Var.d, 1);
    }

    @Override
    public final void f(int i10, long j3) {
        this.f12835k = i10;
        if (!this.f12834j && (this.f12839o != 0 || !this.f12837m)) {
            this.f12833i = true;
        }
        if (j3 != -9223372036854775807L) {
            if (this.f12833i) {
                this.h = j3;
            } else {
                this.f12832g = j3;
            }
        }
    }

    @Override
    public final void e(boolean z10) {
    }
}
