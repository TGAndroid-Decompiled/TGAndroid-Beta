package j4;

import ai.g9;
import c3.h0;
public final class v implements i {
    public String f13970e;
    public h0 f13971f;
    public boolean f13973i;
    public int f13975k;
    public int f13976l;
    public int f13978n;
    public int f13979o;
    public int f13983s;
    public boolean f13985u;
    public int d = 0;
    public final e2.v f13967a = new e2.v(new byte[15], 2);
    public final a4.g f13968b = new a4.g();
    public final e2.v f13969c = new e2.v();
    public final g9 f13980p = new Object();
    public int f13981q = -2147483647;
    public int f13982r = -1;
    public long f13984t = -1;
    public boolean f13974j = true;
    public boolean f13977m = true;
    public double f13972g = -9.223372036854776E18d;
    public double h = -9.223372036854776E18d;

    @Override
    public final void b(e2.v r25) {
        throw new UnsupportedOperationException("Method not decompiled: j4.v.b(e2.v):void");
    }

    @Override
    public final void d() {
        this.d = 0;
        this.f13976l = 0;
        this.f13967a.G(2);
        this.f13978n = 0;
        this.f13979o = 0;
        this.f13981q = -2147483647;
        this.f13982r = -1;
        this.f13983s = 0;
        this.f13984t = -1L;
        this.f13985u = false;
        this.f13973i = false;
        this.f13977m = true;
        this.f13974j = true;
        this.f13972g = -9.223372036854776E18d;
        this.h = -9.223372036854776E18d;
    }

    @Override
    public final void e(c3.q qVar, f0 f0Var) {
        f0Var.b();
        f0Var.c();
        this.f13970e = (String) f0Var.f13806e;
        f0Var.c();
        this.f13971f = qVar.f2(f0Var.f13805c, 1);
    }

    @Override
    public final void g(int i10, long j3) {
        this.f13975k = i10;
        if (!this.f13974j && (this.f13979o != 0 || !this.f13977m)) {
            this.f13973i = true;
        }
        if (j3 != -9223372036854775807L) {
            if (this.f13973i) {
                this.h = j3;
            } else {
                this.f13972g = j3;
            }
        }
    }

    @Override
    public final void f(boolean z10) {
    }
}
