package j4;

import bi.n8;
import c3.h0;
public final class v implements i {
    public String f13459e;
    public h0 f13460f;
    public boolean f13462i;
    public int f13464k;
    public int f13465l;
    public int f13467n;
    public int f13468o;
    public int f13472s;
    public boolean f13474u;
    public int d = 0;
    public final e2.v f13456a = new e2.v(new byte[15], 2);
    public final a4.h f13457b = new a4.h();
    public final e2.v f13458c = new e2.v();
    public final n8 f13469p = new Object();
    public int f13470q = -2147483647;
    public int f13471r = -1;
    public long f13473t = -1;
    public boolean f13463j = true;
    public boolean f13466m = true;
    public double f13461g = -9.223372036854776E18d;
    public double h = -9.223372036854776E18d;

    @Override
    public final void b(e2.v r25) {
        throw new UnsupportedOperationException("Method not decompiled: j4.v.b(e2.v):void");
    }

    @Override
    public final void d() {
        this.d = 0;
        this.f13465l = 0;
        this.f13456a.G(2);
        this.f13467n = 0;
        this.f13468o = 0;
        this.f13470q = -2147483647;
        this.f13471r = -1;
        this.f13472s = 0;
        this.f13473t = -1L;
        this.f13474u = false;
        this.f13462i = false;
        this.f13466m = true;
        this.f13463j = true;
        this.f13461g = -9.223372036854776E18d;
        this.h = -9.223372036854776E18d;
    }

    @Override
    public final void e(c3.q qVar, f0 f0Var) {
        f0Var.a();
        f0Var.b();
        this.f13459e = f0Var.f13295e;
        f0Var.b();
        this.f13460f = qVar.R1(f0Var.d, 1);
    }

    @Override
    public final void g(int i10, long j3) {
        this.f13464k = i10;
        if (!this.f13463j && (this.f13468o != 0 || !this.f13466m)) {
            this.f13462i = true;
        }
        if (j3 != -9223372036854775807L) {
            if (this.f13462i) {
                this.h = j3;
            } else {
                this.f13461g = j3;
            }
        }
    }

    @Override
    public final void f(boolean z10) {
    }
}
