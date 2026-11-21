package m4;

import f3.i0;
import l2.l0;
public final class k implements i {
    public static final double[] f20668r = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};
    public String f20669a;
    public i0 f20670b;
    public final c0 f20671c;
    public final String d;
    public final h2.x f20672e;
    public final l0 f20673f;
    public final boolean[] f20674g = new boolean[4];
    public final j h;
    public long f20675i;
    public boolean f20676j;
    public boolean f20677k;
    public long f20678l;
    public long f20679m;
    public long f20680n;
    public long f20681o;
    public boolean f20682p;
    public boolean f20683q;

    public k(c0 c0Var, String str) {
        this.f20671c = c0Var;
        this.d = str;
        ?? obj = new Object();
        obj.d = new byte[128];
        this.h = obj;
        if (c0Var != null) {
            this.f20673f = new l0(178);
            this.f20672e = new h2.x();
        } else {
            this.f20673f = null;
            this.f20672e = null;
        }
        this.f20679m = -9223372036854775807L;
        this.f20681o = -9223372036854775807L;
    }

    @Override
    public final void c(h2.x r23) {
        throw new UnsupportedOperationException("Method not decompiled: m4.k.c(h2.x):void");
    }

    @Override
    public final void d() {
        i2.o.b(this.f20674g);
        j jVar = this.h;
        jVar.f20665a = false;
        jVar.f20666b = 0;
        jVar.f20667c = 0;
        l0 l0Var = this.f20673f;
        if (l0Var != null) {
            l0Var.g();
        }
        this.f20675i = 0L;
        this.f20676j = false;
        this.f20679m = -9223372036854775807L;
        this.f20681o = -9223372036854775807L;
    }

    @Override
    public final void e(boolean z10) {
        this.f20670b.getClass();
        if (z10) {
            boolean z11 = this.f20682p;
            this.f20670b.c(this.f20681o, z11 ? 1 : 0, (int) (this.f20675i - this.f20680n), 0, null);
        }
    }

    @Override
    public final void f(int i7, long j3) {
        this.f20679m = j3;
    }

    @Override
    public final void g(f3.q qVar, f0 f0Var) {
        f0Var.b();
        f0Var.c();
        this.f20669a = (String) f0Var.f20642e;
        f0Var.c();
        this.f20670b = qVar.d2(f0Var.f20641c, 2);
        c0 c0Var = this.f20671c;
        if (c0Var != null) {
            c0Var.b(qVar, f0Var);
        }
    }
}
