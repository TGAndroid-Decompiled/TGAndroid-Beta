package j4;

import c3.h0;
import i2.l0;
public final class k implements i {
    public static final double[] f13321r = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};
    public String f13322a;
    public h0 f13323b;
    public final c0 f13324c;
    public final String d;
    public final e2.v f13325e;
    public final l0 f13326f;
    public final boolean[] f13327g = new boolean[4];
    public final j h;
    public long f13328i;
    public boolean f13329j;
    public boolean f13330k;
    public long f13331l;
    public long f13332m;
    public long f13333n;
    public long f13334o;
    public boolean f13335p;
    public boolean f13336q;

    public k(c0 c0Var, String str) {
        this.f13324c = c0Var;
        this.d = str;
        ?? obj = new Object();
        obj.d = new byte[128];
        this.h = obj;
        if (c0Var != null) {
            this.f13326f = new l0(178);
            this.f13325e = new e2.v();
        } else {
            this.f13326f = null;
            this.f13325e = null;
        }
        this.f13332m = -9223372036854775807L;
        this.f13334o = -9223372036854775807L;
    }

    @Override
    public final void b(e2.v r23) {
        throw new UnsupportedOperationException("Method not decompiled: j4.k.b(e2.v):void");
    }

    @Override
    public final void d() {
        f2.p.a(this.f13327g);
        j jVar = this.h;
        jVar.f13318a = false;
        jVar.f13319b = 0;
        jVar.f13320c = 0;
        l0 l0Var = this.f13326f;
        if (l0Var != null) {
            l0Var.g();
        }
        this.f13328i = 0L;
        this.f13329j = false;
        this.f13332m = -9223372036854775807L;
        this.f13334o = -9223372036854775807L;
    }

    @Override
    public final void e(c3.q qVar, f0 f0Var) {
        f0Var.a();
        f0Var.b();
        this.f13322a = f0Var.f13295e;
        f0Var.b();
        this.f13323b = qVar.R1(f0Var.d, 2);
        c0 c0Var = this.f13324c;
        if (c0Var != null) {
            c0Var.b(qVar, f0Var);
        }
    }

    @Override
    public final void f(boolean z10) {
        e2.d.h(this.f13323b);
        if (z10) {
            boolean z11 = this.f13335p;
            this.f13323b.c(this.f13334o, z11 ? 1 : 0, (int) (this.f13328i - this.f13333n), 0, null);
        }
    }

    @Override
    public final void g(int i10, long j3) {
        this.f13332m = j3;
    }
}
