package l4;

import e3.i0;
import ei.t6;
public final class v implements i {
    public String f17987e;
    public i0 f17988f;
    public boolean f17990i;
    public int f17992k;
    public int f17993l;
    public int f17995n;
    public int f17996o;
    public int f18000s;
    public boolean f18002u;
    public int d = 0;
    public final g2.y f17984a = new g2.y(new byte[15], 2);
    public final c4.f f17985b = new c4.f();
    public final g2.y f17986c = new g2.y();
    public final t6 f17997p = new t6();
    public int f17998q = -2147483647;
    public int f17999r = -1;
    public long f18001t = -1;
    public boolean f17991j = true;
    public boolean f17994m = true;
    public double f17989g = -9.223372036854776E18d;
    public double h = -9.223372036854776E18d;

    @Override
    public final void a() {
        this.d = 0;
        this.f17993l = 0;
        this.f17984a.K(2);
        this.f17995n = 0;
        this.f17996o = 0;
        this.f17998q = -2147483647;
        this.f17999r = -1;
        this.f18000s = 0;
        this.f18001t = -1L;
        this.f18002u = false;
        this.f17990i = false;
        this.f17994m = true;
        this.f17991j = true;
        this.f17989g = -9.223372036854776E18d;
        this.h = -9.223372036854776E18d;
    }

    @Override
    public final void c(g2.y r25) {
        throw new UnsupportedOperationException("Method not decompiled: l4.v.c(g2.y):void");
    }

    @Override
    public final void e(int i3, long j10) {
        this.f17992k = i3;
        if (!this.f17991j && (this.f17996o != 0 || !this.f17994m)) {
            this.f17990i = true;
        }
        if (j10 != -9223372036854775807L) {
            if (this.f17990i) {
                this.h = j10;
            } else {
                this.f17989g = j10;
            }
        }
    }

    @Override
    public final void f(e3.q qVar, f0 f0Var) {
        f0Var.b();
        f0Var.c();
        this.f17987e = (String) f0Var.f17823e;
        f0Var.c();
        this.f17988f = qVar.i0(f0Var.f17822c, 1);
    }

    @Override
    public final void d(boolean z10) {
    }
}
