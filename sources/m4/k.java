package m4;

import f3.j0;
import l2.m0;
public final class k implements i {
    public static final double[] f20733r = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};
    public String f20734a;
    public j0 f20735b;
    public final c0 f20736c;
    public final String d;
    public final h2.x f20737e;
    public final m0 f20738f;
    public final boolean[] f20739g = new boolean[4];
    public final j h;
    public long f20740i;
    public boolean f20741j;
    public boolean f20742k;
    public long f20743l;
    public long f20744m;
    public long f20745n;
    public long f20746o;
    public boolean f20747p;
    public boolean f20748q;

    public k(c0 c0Var, String str) {
        this.f20736c = c0Var;
        this.d = str;
        ?? obj = new Object();
        obj.d = new byte[128];
        this.h = obj;
        if (c0Var != null) {
            this.f20738f = new m0(178);
            this.f20737e = new h2.x();
        } else {
            this.f20738f = null;
            this.f20737e = null;
        }
        this.f20744m = -9223372036854775807L;
        this.f20746o = -9223372036854775807L;
    }

    @Override
    public final void c(h2.x r23) {
        throw new UnsupportedOperationException("Method not decompiled: m4.k.c(h2.x):void");
    }

    @Override
    public final void d() {
        i2.o.b(this.f20739g);
        j jVar = this.h;
        jVar.f20730a = false;
        jVar.f20731b = 0;
        jVar.f20732c = 0;
        m0 m0Var = this.f20738f;
        if (m0Var != null) {
            m0Var.g();
        }
        this.f20740i = 0L;
        this.f20741j = false;
        this.f20744m = -9223372036854775807L;
        this.f20746o = -9223372036854775807L;
    }

    @Override
    public final void e(boolean z10) {
        this.f20735b.getClass();
        if (z10) {
            boolean z11 = this.f20747p;
            this.f20735b.c(this.f20746o, z11 ? 1 : 0, (int) (this.f20740i - this.f20745n), 0, null);
        }
    }

    @Override
    public final void f(int i7, long j3) {
        this.f20744m = j3;
    }

    @Override
    public final void g(f3.q qVar, f0 f0Var) {
        f0Var.b();
        f0Var.c();
        this.f20734a = (String) f0Var.f20707e;
        f0Var.c();
        this.f20735b = qVar.d2(f0Var.f20706c, 2);
        c0 c0Var = this.f20736c;
        if (c0Var != null) {
            c0Var.b(qVar, f0Var);
        }
    }
}
