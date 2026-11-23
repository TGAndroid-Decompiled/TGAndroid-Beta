package m4;

import f3.i0;
import l2.l0;
public final class k implements i {
    public static final double[] f20671r = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};
    public String f20672a;
    public i0 f20673b;
    public final c0 f20674c;
    public final String d;
    public final h2.x f20675e;
    public final l0 f20676f;
    public final boolean[] f20677g = new boolean[4];
    public final j h;
    public long f20678i;
    public boolean f20679j;
    public boolean f20680k;
    public long f20681l;
    public long f20682m;
    public long f20683n;
    public long f20684o;
    public boolean f20685p;
    public boolean f20686q;

    public k(c0 c0Var, String str) {
        this.f20674c = c0Var;
        this.d = str;
        ?? obj = new Object();
        obj.d = new byte[128];
        this.h = obj;
        if (c0Var != null) {
            this.f20676f = new l0(178);
            this.f20675e = new h2.x();
        } else {
            this.f20676f = null;
            this.f20675e = null;
        }
        this.f20682m = -9223372036854775807L;
        this.f20684o = -9223372036854775807L;
    }

    @Override
    public final void c(h2.x r23) {
        throw new UnsupportedOperationException("Method not decompiled: m4.k.c(h2.x):void");
    }

    @Override
    public final void d() {
        i2.o.b(this.f20677g);
        j jVar = this.h;
        jVar.f20668a = false;
        jVar.f20669b = 0;
        jVar.f20670c = 0;
        l0 l0Var = this.f20676f;
        if (l0Var != null) {
            l0Var.g();
        }
        this.f20678i = 0L;
        this.f20679j = false;
        this.f20682m = -9223372036854775807L;
        this.f20684o = -9223372036854775807L;
    }

    @Override
    public final void e(boolean z10) {
        this.f20673b.getClass();
        if (z10) {
            boolean z11 = this.f20685p;
            this.f20673b.c(this.f20684o, z11 ? 1 : 0, (int) (this.f20678i - this.f20683n), 0, null);
        }
    }

    @Override
    public final void f(int i7, long j3) {
        this.f20682m = j3;
    }

    @Override
    public final void g(f3.q qVar, f0 f0Var) {
        f0Var.b();
        f0Var.c();
        this.f20672a = (String) f0Var.f20645e;
        f0Var.c();
        this.f20673b = qVar.d2(f0Var.f20644c, 2);
        c0 c0Var = this.f20674c;
        if (c0Var != null) {
            c0Var.b(qVar, f0Var);
        }
    }
}
