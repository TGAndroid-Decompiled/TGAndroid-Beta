package j4;

import c3.h0;
import i2.m0;
public final class k implements i {
    public static final double[] f13798r = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};
    public String f13799a;
    public h0 f13800b;
    public final c0 f13801c;
    public final String d;
    public final e2.v f13802e;
    public final m0 f13803f;
    public final boolean[] f13804g = new boolean[4];
    public final j h;
    public long f13805i;
    public boolean f13806j;
    public boolean f13807k;
    public long f13808l;
    public long f13809m;
    public long f13810n;
    public long f13811o;
    public boolean f13812p;
    public boolean f13813q;

    public k(c0 c0Var, String str) {
        this.f13801c = c0Var;
        this.d = str;
        ?? obj = new Object();
        obj.d = new byte[128];
        this.h = obj;
        if (c0Var != null) {
            this.f13803f = new m0(178);
            this.f13802e = new e2.v();
        } else {
            this.f13803f = null;
            this.f13802e = null;
        }
        this.f13809m = -9223372036854775807L;
        this.f13811o = -9223372036854775807L;
    }

    @Override
    public final void a(e2.v r23) {
        throw new UnsupportedOperationException("Method not decompiled: j4.k.a(e2.v):void");
    }

    @Override
    public final void c() {
        f2.o.a(this.f13804g);
        j jVar = this.h;
        jVar.f13795a = false;
        jVar.f13796b = 0;
        jVar.f13797c = 0;
        m0 m0Var = this.f13803f;
        if (m0Var != null) {
            m0Var.g();
        }
        this.f13805i = 0L;
        this.f13806j = false;
        this.f13809m = -9223372036854775807L;
        this.f13811o = -9223372036854775807L;
    }

    @Override
    public final void d(c3.q qVar, f0 f0Var) {
        f0Var.a();
        f0Var.b();
        this.f13799a = f0Var.f13772e;
        f0Var.b();
        this.f13800b = qVar.Z1(f0Var.d, 2);
        c0 c0Var = this.f13801c;
        if (c0Var != null) {
            c0Var.b(qVar, f0Var);
        }
    }

    @Override
    public final void e(boolean z10) {
        e2.d.h(this.f13800b);
        if (z10) {
            boolean z11 = this.f13812p;
            this.f13800b.c(this.f13811o, z11 ? 1 : 0, (int) (this.f13805i - this.f13810n), 0, null);
        }
    }

    @Override
    public final void f(int i10, long j3) {
        this.f13809m = j3;
    }
}
