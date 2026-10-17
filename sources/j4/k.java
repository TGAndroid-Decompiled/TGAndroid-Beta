package j4;

import c3.j0;
import i2.m0;
public final class k implements i {
    public static final double[] f14075r = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};
    public String f14076a;
    public j0 f14077b;
    public final c0 f14078c;
    public final String d;
    public final e2.x e;
    public final m0 f14079f;
    public final boolean[] f14080g = new boolean[4];
    public final j h;
    public long f14081i;
    public boolean f14082j;
    public boolean f14083k;
    public long f14084l;
    public long f14085m;
    public long f14086n;
    public long f14087o;
    public boolean f14088p;
    public boolean f14089q;

    public k(c0 c0Var, String str) {
        this.f14078c = c0Var;
        this.d = str;
        ?? obj = new Object();
        obj.d = new byte[128];
        this.h = obj;
        if (c0Var != null) {
            this.f14079f = new m0(178);
            this.e = new e2.x();
        } else {
            this.f14079f = null;
            this.e = null;
        }
        this.f14085m = -9223372036854775807L;
        this.f14087o = -9223372036854775807L;
    }

    @Override
    public final void a(e2.x r23) {
        throw new UnsupportedOperationException("Method not decompiled: j4.k.a(e2.x):void");
    }

    @Override
    public final void c() {
        f2.q.b(this.f14080g);
        j jVar = this.h;
        jVar.f14072a = false;
        jVar.f14073b = 0;
        jVar.f14074c = 0;
        m0 m0Var = this.f14079f;
        if (m0Var != null) {
            m0Var.g();
        }
        this.f14081i = 0L;
        this.f14082j = false;
        this.f14085m = -9223372036854775807L;
        this.f14087o = -9223372036854775807L;
    }

    @Override
    public final void d(c3.q qVar, f0 f0Var) {
        f0Var.b();
        f0Var.c();
        this.f14076a = (String) f0Var.e;
        f0Var.c();
        this.f14077b = qVar.j0(f0Var.f14052c, 2);
        c0 c0Var = this.f14078c;
        if (c0Var != null) {
            c0Var.b(qVar, f0Var);
        }
    }

    @Override
    public final void e(boolean z10) {
        this.f14077b.getClass();
        if (z10) {
            boolean z11 = this.f14088p;
            this.f14077b.c(this.f14087o, z11 ? 1 : 0, (int) (this.f14081i - this.f14086n), 0, null);
        }
    }

    @Override
    public final void f(int i10, long j10) {
        this.f14085m = j10;
    }
}
