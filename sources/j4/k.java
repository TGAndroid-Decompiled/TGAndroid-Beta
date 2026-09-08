package j4;

import c3.h0;
import i2.l0;
public final class k implements i {
    public static final double[] f13347r = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};
    public String f13348a;
    public h0 f13349b;
    public final c0 f13350c;
    public final String d;
    public final e2.v f13351e;
    public final l0 f13352f;
    public final boolean[] f13353g = new boolean[4];
    public final j h;
    public long f13354i;
    public boolean f13355j;
    public boolean f13356k;
    public long f13357l;
    public long f13358m;
    public long f13359n;
    public long f13360o;
    public boolean f13361p;
    public boolean f13362q;

    public k(c0 c0Var, String str) {
        this.f13350c = c0Var;
        this.d = str;
        ?? obj = new Object();
        obj.d = new byte[128];
        this.h = obj;
        if (c0Var != null) {
            this.f13352f = new l0(178);
            this.f13351e = new e2.v();
        } else {
            this.f13352f = null;
            this.f13351e = null;
        }
        this.f13358m = -9223372036854775807L;
        this.f13360o = -9223372036854775807L;
    }

    @Override
    public final void b(e2.v r23) {
        throw new UnsupportedOperationException("Method not decompiled: j4.k.b(e2.v):void");
    }

    @Override
    public final void d() {
        f2.p.a(this.f13353g);
        j jVar = this.h;
        jVar.f13344a = false;
        jVar.f13345b = 0;
        jVar.f13346c = 0;
        l0 l0Var = this.f13352f;
        if (l0Var != null) {
            l0Var.g();
        }
        this.f13354i = 0L;
        this.f13355j = false;
        this.f13358m = -9223372036854775807L;
        this.f13360o = -9223372036854775807L;
    }

    @Override
    public final void e(c3.q qVar, f0 f0Var) {
        f0Var.a();
        f0Var.b();
        this.f13348a = f0Var.f13321e;
        f0Var.b();
        this.f13349b = qVar.R1(f0Var.d, 2);
        c0 c0Var = this.f13350c;
        if (c0Var != null) {
            c0Var.b(qVar, f0Var);
        }
    }

    @Override
    public final void f(boolean z10) {
        e2.d.h(this.f13349b);
        if (z10) {
            boolean z11 = this.f13361p;
            this.f13349b.c(this.f13360o, z11 ? 1 : 0, (int) (this.f13354i - this.f13359n), 0, null);
        }
    }

    @Override
    public final void g(int i10, long j3) {
        this.f13358m = j3;
    }
}
