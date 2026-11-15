package m4;

import f3.i0;
import fi.m6;
public final class v implements i {
    public String f20417e;
    public i0 f20418f;
    public boolean f20420i;
    public int f20422k;
    public int f20423l;
    public int f20425n;
    public int f20426o;
    public int f20430s;
    public boolean f20432u;
    public int d = 0;
    public final h2.x f20414a = new h2.x(new byte[15], 2);
    public final d4.f f20415b = new d4.f();
    public final h2.x f20416c = new h2.x();
    public final m6 f20427p = new m6();
    public int f20428q = -2147483647;
    public int f20429r = -1;
    public long f20431t = -1;
    public boolean f20421j = true;
    public boolean f20424m = true;
    public double f20419g = -9.223372036854776E18d;
    public double h = -9.223372036854776E18d;

    @Override
    public final void c(h2.x r25) {
        throw new UnsupportedOperationException("Method not decompiled: m4.v.c(h2.x):void");
    }

    @Override
    public final void d() {
        this.d = 0;
        this.f20423l = 0;
        this.f20414a.K(2);
        this.f20425n = 0;
        this.f20426o = 0;
        this.f20428q = -2147483647;
        this.f20429r = -1;
        this.f20430s = 0;
        this.f20431t = -1L;
        this.f20432u = false;
        this.f20420i = false;
        this.f20424m = true;
        this.f20421j = true;
        this.f20419g = -9.223372036854776E18d;
        this.h = -9.223372036854776E18d;
    }

    @Override
    public final void f(int i7, long j3) {
        this.f20422k = i7;
        if (!this.f20421j && (this.f20426o != 0 || !this.f20424m)) {
            this.f20420i = true;
        }
        if (j3 != -9223372036854775807L) {
            if (this.f20420i) {
                this.h = j3;
            } else {
                this.f20419g = j3;
            }
        }
    }

    @Override
    public final void g(f3.q qVar, f0 f0Var) {
        f0Var.b();
        f0Var.c();
        this.f20417e = (String) f0Var.f20253e;
        f0Var.c();
        this.f20418f = qVar.d2(f0Var.f20252c, 1);
    }

    @Override
    public final void e(boolean z10) {
    }
}
