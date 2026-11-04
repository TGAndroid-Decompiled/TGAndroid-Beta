package l4;

import e3.i0;
import k2.o0;
public final class k implements i {
    public static final double[] f17849r = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};
    public String f17850a;
    public i0 f17851b;
    public final c0 f17852c;
    public final String d;
    public final g2.y f17853e;
    public final o0 f17854f;
    public final boolean[] f17855g = new boolean[4];
    public final j h;
    public long f17856i;
    public boolean f17857j;
    public boolean f17858k;
    public long f17859l;
    public long f17860m;
    public long f17861n;
    public long f17862o;
    public boolean f17863p;
    public boolean f17864q;

    public k(c0 c0Var, String str) {
        this.f17852c = c0Var;
        this.d = str;
        ?? obj = new Object();
        obj.d = new byte[128];
        this.h = obj;
        if (c0Var != null) {
            this.f17854f = new o0(178);
            this.f17853e = new g2.y();
        } else {
            this.f17854f = null;
            this.f17853e = null;
        }
        this.f17860m = -9223372036854775807L;
        this.f17862o = -9223372036854775807L;
    }

    @Override
    public final void a() {
        h2.o.b(this.f17855g);
        j jVar = this.h;
        jVar.f17846a = false;
        jVar.f17847b = 0;
        jVar.f17848c = 0;
        o0 o0Var = this.f17854f;
        if (o0Var != null) {
            o0Var.g();
        }
        this.f17856i = 0L;
        this.f17857j = false;
        this.f17860m = -9223372036854775807L;
        this.f17862o = -9223372036854775807L;
    }

    @Override
    public final void c(g2.y r23) {
        throw new UnsupportedOperationException("Method not decompiled: l4.k.c(g2.y):void");
    }

    @Override
    public final void d(boolean z10) {
        this.f17851b.getClass();
        if (z10) {
            boolean z11 = this.f17863p;
            this.f17851b.d(this.f17862o, z11 ? 1 : 0, (int) (this.f17856i - this.f17861n), 0, null);
        }
    }

    @Override
    public final void e(int i3, long j10) {
        this.f17860m = j10;
    }

    @Override
    public final void f(e3.q qVar, f0 f0Var) {
        f0Var.b();
        f0Var.c();
        this.f17850a = (String) f0Var.f17823e;
        f0Var.c();
        this.f17851b = qVar.i0(f0Var.f17822c, 2);
        c0 c0Var = this.f17852c;
        if (c0Var != null) {
            c0Var.b(qVar, f0Var);
        }
    }
}
