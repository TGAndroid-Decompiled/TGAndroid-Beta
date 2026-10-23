package j4;

import c3.l0;
import ci.b7;
public final class v implements i {
    public String e;
    public l0 f14252f;
    public boolean f14254i;
    public int f14256k;
    public int f14257l;
    public int f14259n;
    public int f14260o;
    public int f14264s;
    public boolean f14266u;
    public int d = 0;
    public final e2.x f14249a = new e2.x(new byte[15], 2);
    public final a4.g f14250b = new a4.g();
    public final e2.x f14251c = new e2.x();
    public final b7 f14261p = new b7();
    public int f14262q = -2147483647;
    public int f14263r = -1;
    public long f14265t = -1;
    public boolean f14255j = true;
    public boolean f14258m = true;
    public double f14253g = -9.223372036854776E18d;
    public double h = -9.223372036854776E18d;

    @Override
    public final void a(e2.x r25) {
        throw new UnsupportedOperationException("Method not decompiled: j4.v.a(e2.x):void");
    }

    @Override
    public final void c() {
        this.d = 0;
        this.f14257l = 0;
        this.f14249a.K(2);
        this.f14259n = 0;
        this.f14260o = 0;
        this.f14262q = -2147483647;
        this.f14263r = -1;
        this.f14264s = 0;
        this.f14265t = -1L;
        this.f14266u = false;
        this.f14254i = false;
        this.f14258m = true;
        this.f14255j = true;
        this.f14253g = -9.223372036854776E18d;
        this.h = -9.223372036854776E18d;
    }

    @Override
    public final void d(c3.s sVar, f0 f0Var) {
        f0Var.b();
        f0Var.c();
        this.e = (String) f0Var.e;
        f0Var.c();
        this.f14252f = sVar.j0(f0Var.f14102c, 1);
    }

    @Override
    public final void f(int i10, long j10) {
        this.f14256k = i10;
        if (!this.f14255j && (this.f14260o != 0 || !this.f14258m)) {
            this.f14254i = true;
        }
        if (j10 != -9223372036854775807L) {
            if (this.f14254i) {
                this.h = j10;
            } else {
                this.f14253g = j10;
            }
        }
    }

    @Override
    public final void e(boolean z10) {
    }
}
