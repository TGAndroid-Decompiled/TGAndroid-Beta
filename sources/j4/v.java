package j4;

import ai.f9;
import c3.h0;
public final class v implements i {
    public String f13935e;
    public h0 f13936f;
    public boolean f13938i;
    public int f13940k;
    public int f13941l;
    public int f13943n;
    public int f13944o;
    public int f13948s;
    public boolean f13950u;
    public int d = 0;
    public final e2.v f13932a = new e2.v(new byte[15], 2);
    public final a4.h f13933b = new a4.h();
    public final e2.v f13934c = new e2.v();
    public final f9 f13945p = new Object();
    public int f13946q = -2147483647;
    public int f13947r = -1;
    public long f13949t = -1;
    public boolean f13939j = true;
    public boolean f13942m = true;
    public double f13937g = -9.223372036854776E18d;
    public double h = -9.223372036854776E18d;

    @Override
    public final void a(e2.v r25) {
        throw new UnsupportedOperationException("Method not decompiled: j4.v.a(e2.v):void");
    }

    @Override
    public final void c() {
        this.d = 0;
        this.f13941l = 0;
        this.f13932a.G(2);
        this.f13943n = 0;
        this.f13944o = 0;
        this.f13946q = -2147483647;
        this.f13947r = -1;
        this.f13948s = 0;
        this.f13949t = -1L;
        this.f13950u = false;
        this.f13938i = false;
        this.f13942m = true;
        this.f13939j = true;
        this.f13937g = -9.223372036854776E18d;
        this.h = -9.223372036854776E18d;
    }

    @Override
    public final void d(c3.q qVar, f0 f0Var) {
        f0Var.a();
        f0Var.b();
        this.f13935e = f0Var.f13771e;
        f0Var.b();
        this.f13936f = qVar.Z1(f0Var.d, 1);
    }

    @Override
    public final void f(int i10, long j3) {
        this.f13940k = i10;
        if (!this.f13939j && (this.f13944o != 0 || !this.f13942m)) {
            this.f13938i = true;
        }
        if (j3 != -9223372036854775807L) {
            if (this.f13938i) {
                this.h = j3;
            } else {
                this.f13937g = j3;
            }
        }
    }

    @Override
    public final void e(boolean z10) {
    }
}
