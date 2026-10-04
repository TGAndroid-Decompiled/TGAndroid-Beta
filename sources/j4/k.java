package j4;

import c3.h0;
import i2.m0;
public final class k implements i {
    public static final double[] f13797r = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};
    public String f13798a;
    public h0 f13799b;
    public final c0 f13800c;
    public final String d;
    public final e2.v f13801e;
    public final m0 f13802f;
    public final boolean[] f13803g = new boolean[4];
    public final j h;
    public long f13804i;
    public boolean f13805j;
    public boolean f13806k;
    public long f13807l;
    public long f13808m;
    public long f13809n;
    public long f13810o;
    public boolean f13811p;
    public boolean f13812q;

    public k(c0 c0Var, String str) {
        this.f13800c = c0Var;
        this.d = str;
        ?? obj = new Object();
        obj.d = new byte[128];
        this.h = obj;
        if (c0Var != null) {
            this.f13802f = new m0(178);
            this.f13801e = new e2.v();
        } else {
            this.f13802f = null;
            this.f13801e = null;
        }
        this.f13808m = -9223372036854775807L;
        this.f13810o = -9223372036854775807L;
    }

    @Override
    public final void a(e2.v r23) {
        throw new UnsupportedOperationException("Method not decompiled: j4.k.a(e2.v):void");
    }

    @Override
    public final void c() {
        f2.o.a(this.f13803g);
        j jVar = this.h;
        jVar.f13794a = false;
        jVar.f13795b = 0;
        jVar.f13796c = 0;
        m0 m0Var = this.f13802f;
        if (m0Var != null) {
            m0Var.g();
        }
        this.f13804i = 0L;
        this.f13805j = false;
        this.f13808m = -9223372036854775807L;
        this.f13810o = -9223372036854775807L;
    }

    @Override
    public final void d(c3.q qVar, f0 f0Var) {
        f0Var.a();
        f0Var.b();
        this.f13798a = f0Var.f13771e;
        f0Var.b();
        this.f13799b = qVar.Z1(f0Var.d, 2);
        c0 c0Var = this.f13800c;
        if (c0Var != null) {
            c0Var.b(qVar, f0Var);
        }
    }

    @Override
    public final void e(boolean z10) {
        e2.d.h(this.f13799b);
        if (z10) {
            boolean z11 = this.f13811p;
            this.f13799b.c(this.f13810o, z11 ? 1 : 0, (int) (this.f13804i - this.f13809n), 0, null);
        }
    }

    @Override
    public final void f(int i10, long j3) {
        this.f13808m = j3;
    }
}
