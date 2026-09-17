package j4;

import ai.f9;
import c3.h0;
public final class v implements i {
    public String e;
    public h0 f12834f;
    public boolean f12836i;
    public int f12838k;
    public int f12839l;
    public int f12841n;
    public int f12842o;
    public int f12846s;
    public boolean f12848u;
    public int d = 0;
    public final e2.v f12831a = new e2.v(new byte[15], 2);
    public final a4.h f12832b = new a4.h();
    public final e2.v f12833c = new e2.v();
    public final f9 f12843p = new Object();
    public int f12844q = -2147483647;
    public int f12845r = -1;
    public long f12847t = -1;
    public boolean f12837j = true;
    public boolean f12840m = true;
    public double f12835g = -9.223372036854776E18d;
    public double h = -9.223372036854776E18d;

    @Override
    public final void a(e2.v r25) {
        throw new UnsupportedOperationException("Method not decompiled: j4.v.a(e2.v):void");
    }

    @Override
    public final void c() {
        this.d = 0;
        this.f12839l = 0;
        this.f12831a.G(2);
        this.f12841n = 0;
        this.f12842o = 0;
        this.f12844q = -2147483647;
        this.f12845r = -1;
        this.f12846s = 0;
        this.f12847t = -1L;
        this.f12848u = false;
        this.f12836i = false;
        this.f12840m = true;
        this.f12837j = true;
        this.f12835g = -9.223372036854776E18d;
        this.h = -9.223372036854776E18d;
    }

    @Override
    public final void d(c3.q qVar, f0 f0Var) {
        f0Var.a();
        f0Var.b();
        this.e = f0Var.e;
        f0Var.b();
        this.f12834f = qVar.Z1(f0Var.d, 1);
    }

    @Override
    public final void f(int i10, long j3) {
        this.f12838k = i10;
        if (!this.f12837j && (this.f12842o != 0 || !this.f12840m)) {
            this.f12836i = true;
        }
        if (j3 != -9223372036854775807L) {
            if (this.f12836i) {
                this.h = j3;
            } else {
                this.f12835g = j3;
            }
        }
    }

    @Override
    public final void e(boolean z10) {
    }
}
