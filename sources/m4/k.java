package m4;

import f3.i0;
import l2.l0;
public final class k implements i {
    public static final double[] f20279r = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};
    public String f20280a;
    public i0 f20281b;
    public final c0 f20282c;
    public final String d;
    public final h2.x f20283e;
    public final l0 f20284f;
    public final boolean[] f20285g = new boolean[4];
    public final j h;
    public long f20286i;
    public boolean f20287j;
    public boolean f20288k;
    public long f20289l;
    public long f20290m;
    public long f20291n;
    public long f20292o;
    public boolean f20293p;
    public boolean f20294q;

    public k(c0 c0Var, String str) {
        this.f20282c = c0Var;
        this.d = str;
        ?? obj = new Object();
        obj.d = new byte[128];
        this.h = obj;
        if (c0Var != null) {
            this.f20284f = new l0(178);
            this.f20283e = new h2.x();
        } else {
            this.f20284f = null;
            this.f20283e = null;
        }
        this.f20290m = -9223372036854775807L;
        this.f20292o = -9223372036854775807L;
    }

    @Override
    public final void c(h2.x r23) {
        throw new UnsupportedOperationException("Method not decompiled: m4.k.c(h2.x):void");
    }

    @Override
    public final void d() {
        i2.o.b(this.f20285g);
        j jVar = this.h;
        jVar.f20276a = false;
        jVar.f20277b = 0;
        jVar.f20278c = 0;
        l0 l0Var = this.f20284f;
        if (l0Var != null) {
            l0Var.g();
        }
        this.f20286i = 0L;
        this.f20287j = false;
        this.f20290m = -9223372036854775807L;
        this.f20292o = -9223372036854775807L;
    }

    @Override
    public final void e(boolean z10) {
        this.f20281b.getClass();
        if (z10) {
            boolean z11 = this.f20293p;
            this.f20281b.c(this.f20292o, z11 ? 1 : 0, (int) (this.f20286i - this.f20291n), 0, null);
        }
    }

    @Override
    public final void f(int i7, long j3) {
        this.f20290m = j3;
    }

    @Override
    public final void g(f3.q qVar, f0 f0Var) {
        f0Var.b();
        f0Var.c();
        this.f20280a = (String) f0Var.f20253e;
        f0Var.c();
        this.f20281b = qVar.d2(f0Var.f20252c, 2);
        c0 c0Var = this.f20282c;
        if (c0Var != null) {
            c0Var.b(qVar, f0Var);
        }
    }
}
