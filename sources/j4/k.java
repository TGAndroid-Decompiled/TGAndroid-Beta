package j4;

import c3.j0;
import i2.n0;
public final class k implements i {
    public static final double[] f14080r = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};
    public String f14081a;
    public j0 f14082b;
    public final c0 f14083c;
    public final String d;
    public final e2.x e;
    public final n0 f14084f;
    public final boolean[] f14085g = new boolean[4];
    public final j h;
    public long f14086i;
    public boolean f14087j;
    public boolean f14088k;
    public long f14089l;
    public long f14090m;
    public long f14091n;
    public long f14092o;
    public boolean f14093p;
    public boolean f14094q;

    public k(c0 c0Var, String str) {
        this.f14083c = c0Var;
        this.d = str;
        ?? obj = new Object();
        obj.d = new byte[128];
        this.h = obj;
        if (c0Var != null) {
            this.f14084f = new n0(178);
            this.e = new e2.x();
        } else {
            this.f14084f = null;
            this.e = null;
        }
        this.f14090m = -9223372036854775807L;
        this.f14092o = -9223372036854775807L;
    }

    @Override
    public final void a(e2.x r23) {
        throw new UnsupportedOperationException("Method not decompiled: j4.k.a(e2.x):void");
    }

    @Override
    public final void c() {
        f2.q.b(this.f14085g);
        j jVar = this.h;
        jVar.f14077a = false;
        jVar.f14078b = 0;
        jVar.f14079c = 0;
        n0 n0Var = this.f14084f;
        if (n0Var != null) {
            n0Var.g();
        }
        this.f14086i = 0L;
        this.f14087j = false;
        this.f14090m = -9223372036854775807L;
        this.f14092o = -9223372036854775807L;
    }

    @Override
    public final void d(c3.q qVar, f0 f0Var) {
        f0Var.b();
        f0Var.c();
        this.f14081a = (String) f0Var.e;
        f0Var.c();
        this.f14082b = qVar.j0(f0Var.f14057c, 2);
        c0 c0Var = this.f14083c;
        if (c0Var != null) {
            c0Var.b(qVar, f0Var);
        }
    }

    @Override
    public final void e(boolean z10) {
        this.f14082b.getClass();
        if (z10) {
            boolean z11 = this.f14093p;
            this.f14082b.c(this.f14092o, z11 ? 1 : 0, (int) (this.f14086i - this.f14091n), 0, null);
        }
    }

    @Override
    public final void f(int i10, long j10) {
        this.f14090m = j10;
    }
}
