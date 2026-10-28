package j4;

import c3.j0;
import di.b7;
public final class v implements i {
    public String e;
    public j0 f15464f;
    public boolean f15466i;
    public int f15468k;
    public int f15469l;
    public int f15471n;
    public int f15472o;
    public int f15476s;
    public boolean f15478u;
    public int d = 0;
    public final e2.x f15461a = new e2.x(new byte[15], 2);
    public final a4.g f15462b = new a4.g();
    public final e2.x f15463c = new e2.x();
    public final b7 f15473p = new b7();
    public int f15474q = -2147483647;
    public int f15475r = -1;
    public long f15477t = -1;
    public boolean f15467j = true;
    public boolean f15470m = true;
    public double f15465g = -9.223372036854776E18d;
    public double h = -9.223372036854776E18d;

    @Override
    public final void a(e2.x r25) {
        throw new UnsupportedOperationException("Method not decompiled: j4.v.a(e2.x):void");
    }

    @Override
    public final void c() {
        this.d = 0;
        this.f15469l = 0;
        this.f15461a.K(2);
        this.f15471n = 0;
        this.f15472o = 0;
        this.f15474q = -2147483647;
        this.f15475r = -1;
        this.f15476s = 0;
        this.f15477t = -1L;
        this.f15478u = false;
        this.f15466i = false;
        this.f15470m = true;
        this.f15467j = true;
        this.f15465g = -9.223372036854776E18d;
        this.h = -9.223372036854776E18d;
    }

    @Override
    public final void d(c3.q qVar, f0 f0Var) {
        f0Var.b();
        f0Var.c();
        this.e = (String) f0Var.e;
        f0Var.c();
        this.f15464f = qVar.F1(f0Var.f15314c, 1);
    }

    @Override
    public final void f(int i10, long j10) {
        this.f15468k = i10;
        if (!this.f15467j && (this.f15472o != 0 || !this.f15470m)) {
            this.f15466i = true;
        }
        if (j10 != -9223372036854775807L) {
            if (this.f15466i) {
                this.h = j10;
            } else {
                this.f15465g = j10;
            }
        }
    }

    @Override
    public final void e(boolean z10) {
    }
}
