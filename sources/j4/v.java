package j4;

import bi.n8;
import c3.h0;
public final class v implements i {
    public String f13485e;
    public h0 f13486f;
    public boolean f13488i;
    public int f13490k;
    public int f13491l;
    public int f13493n;
    public int f13494o;
    public int f13498s;
    public boolean f13500u;
    public int d = 0;
    public final e2.v f13482a = new e2.v(new byte[15], 2);
    public final a4.h f13483b = new a4.h();
    public final e2.v f13484c = new e2.v();
    public final n8 f13495p = new Object();
    public int f13496q = -2147483647;
    public int f13497r = -1;
    public long f13499t = -1;
    public boolean f13489j = true;
    public boolean f13492m = true;
    public double f13487g = -9.223372036854776E18d;
    public double h = -9.223372036854776E18d;

    @Override
    public final void b(e2.v r25) {
        throw new UnsupportedOperationException("Method not decompiled: j4.v.b(e2.v):void");
    }

    @Override
    public final void d() {
        this.d = 0;
        this.f13491l = 0;
        this.f13482a.G(2);
        this.f13493n = 0;
        this.f13494o = 0;
        this.f13496q = -2147483647;
        this.f13497r = -1;
        this.f13498s = 0;
        this.f13499t = -1L;
        this.f13500u = false;
        this.f13488i = false;
        this.f13492m = true;
        this.f13489j = true;
        this.f13487g = -9.223372036854776E18d;
        this.h = -9.223372036854776E18d;
    }

    @Override
    public final void e(c3.q qVar, f0 f0Var) {
        f0Var.a();
        f0Var.b();
        this.f13485e = f0Var.f13321e;
        f0Var.b();
        this.f13486f = qVar.R1(f0Var.d, 1);
    }

    @Override
    public final void g(int i10, long j3) {
        this.f13490k = i10;
        if (!this.f13489j && (this.f13494o != 0 || !this.f13492m)) {
            this.f13488i = true;
        }
        if (j3 != -9223372036854775807L) {
            if (this.f13488i) {
                this.h = j3;
            } else {
                this.f13487g = j3;
            }
        }
    }

    @Override
    public final void f(boolean z10) {
    }
}
