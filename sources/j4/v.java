package j4;

import c3.j0;
import di.b7;
public final class v implements i {
    public String e;
    public j0 f15465f;
    public boolean f15467i;
    public int f15469k;
    public int f15470l;
    public int f15472n;
    public int f15473o;
    public int f15477s;
    public boolean f15479u;
    public int d = 0;
    public final e2.x f15462a = new e2.x(new byte[15], 2);
    public final a4.g f15463b = new a4.g();
    public final e2.x f15464c = new e2.x();
    public final b7 f15474p = new b7();
    public int f15475q = -2147483647;
    public int f15476r = -1;
    public long f15478t = -1;
    public boolean f15468j = true;
    public boolean f15471m = true;
    public double f15466g = -9.223372036854776E18d;
    public double h = -9.223372036854776E18d;

    @Override
    public final void a(e2.x r25) {
        throw new UnsupportedOperationException("Method not decompiled: j4.v.a(e2.x):void");
    }

    @Override
    public final void c() {
        this.d = 0;
        this.f15470l = 0;
        this.f15462a.K(2);
        this.f15472n = 0;
        this.f15473o = 0;
        this.f15475q = -2147483647;
        this.f15476r = -1;
        this.f15477s = 0;
        this.f15478t = -1L;
        this.f15479u = false;
        this.f15467i = false;
        this.f15471m = true;
        this.f15468j = true;
        this.f15466g = -9.223372036854776E18d;
        this.h = -9.223372036854776E18d;
    }

    @Override
    public final void d(c3.q qVar, f0 f0Var) {
        f0Var.b();
        f0Var.c();
        this.e = (String) f0Var.e;
        f0Var.c();
        this.f15465f = qVar.F1(f0Var.f15315c, 1);
    }

    @Override
    public final void f(int i10, long j10) {
        this.f15469k = i10;
        if (!this.f15468j && (this.f15473o != 0 || !this.f15471m)) {
            this.f15467i = true;
        }
        if (j10 != -9223372036854775807L) {
            if (this.f15467i) {
                this.h = j10;
            } else {
                this.f15466g = j10;
            }
        }
    }

    @Override
    public final void e(boolean z10) {
    }
}
