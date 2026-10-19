package j4;

import c3.j0;
import ci.c7;
public final class v implements i {
    public String e;
    public j0 f14207f;
    public boolean f14209i;
    public int f14211k;
    public int f14212l;
    public int f14214n;
    public int f14215o;
    public int f14219s;
    public boolean f14221u;
    public int d = 0;
    public final e2.x f14204a = new e2.x(new byte[15], 2);
    public final a4.g f14205b = new a4.g();
    public final e2.x f14206c = new e2.x();
    public final c7 f14216p = new c7();
    public int f14217q = -2147483647;
    public int f14218r = -1;
    public long f14220t = -1;
    public boolean f14210j = true;
    public boolean f14213m = true;
    public double f14208g = -9.223372036854776E18d;
    public double h = -9.223372036854776E18d;

    @Override
    public final void a(e2.x r25) {
        throw new UnsupportedOperationException("Method not decompiled: j4.v.a(e2.x):void");
    }

    @Override
    public final void c() {
        this.d = 0;
        this.f14212l = 0;
        this.f14204a.K(2);
        this.f14214n = 0;
        this.f14215o = 0;
        this.f14217q = -2147483647;
        this.f14218r = -1;
        this.f14219s = 0;
        this.f14220t = -1L;
        this.f14221u = false;
        this.f14209i = false;
        this.f14213m = true;
        this.f14210j = true;
        this.f14208g = -9.223372036854776E18d;
        this.h = -9.223372036854776E18d;
    }

    @Override
    public final void d(c3.q qVar, f0 f0Var) {
        f0Var.b();
        f0Var.c();
        this.e = (String) f0Var.e;
        f0Var.c();
        this.f14207f = qVar.j0(f0Var.f14057c, 1);
    }

    @Override
    public final void f(int i10, long j10) {
        this.f14211k = i10;
        if (!this.f14210j && (this.f14215o != 0 || !this.f14213m)) {
            this.f14209i = true;
        }
        if (j10 != -9223372036854775807L) {
            if (this.f14209i) {
                this.h = j10;
            } else {
                this.f14208g = j10;
            }
        }
    }

    @Override
    public final void e(boolean z10) {
    }
}
