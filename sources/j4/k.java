package j4;

import c3.j0;
import i2.o0;
public final class k implements i {
    public static final double[] f14082r = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};
    public String f14083a;
    public j0 f14084b;
    public final c0 f14085c;
    public final String d;
    public final e2.x e;
    public final o0 f14086f;
    public final boolean[] f14087g = new boolean[4];
    public final j h;
    public long f14088i;
    public boolean f14089j;
    public boolean f14090k;
    public long f14091l;
    public long f14092m;
    public long f14093n;
    public long f14094o;
    public boolean f14095p;
    public boolean f14096q;

    public k(c0 c0Var, String str) {
        this.f14085c = c0Var;
        this.d = str;
        ?? obj = new Object();
        obj.d = new byte[128];
        this.h = obj;
        if (c0Var != null) {
            this.f14086f = new o0(178);
            this.e = new e2.x();
        } else {
            this.f14086f = null;
            this.e = null;
        }
        this.f14092m = -9223372036854775807L;
        this.f14094o = -9223372036854775807L;
    }

    @Override
    public final void a(e2.x r23) {
        throw new UnsupportedOperationException("Method not decompiled: j4.k.a(e2.x):void");
    }

    @Override
    public final void c() {
        f2.q.b(this.f14087g);
        j jVar = this.h;
        jVar.f14079a = false;
        jVar.f14080b = 0;
        jVar.f14081c = 0;
        o0 o0Var = this.f14086f;
        if (o0Var != null) {
            o0Var.g();
        }
        this.f14088i = 0L;
        this.f14089j = false;
        this.f14092m = -9223372036854775807L;
        this.f14094o = -9223372036854775807L;
    }

    @Override
    public final void d(c3.q qVar, f0 f0Var) {
        f0Var.b();
        f0Var.c();
        this.f14083a = (String) f0Var.e;
        f0Var.c();
        this.f14084b = qVar.j0(f0Var.f14059c, 2);
        c0 c0Var = this.f14085c;
        if (c0Var != null) {
            c0Var.b(qVar, f0Var);
        }
    }

    @Override
    public final void e(boolean z10) {
        this.f14084b.getClass();
        if (z10) {
            boolean z11 = this.f14095p;
            this.f14084b.c(this.f14094o, z11 ? 1 : 0, (int) (this.f14088i - this.f14093n), 0, null);
        }
    }

    @Override
    public final void f(int i10, long j10) {
        this.f14092m = j10;
    }
}
