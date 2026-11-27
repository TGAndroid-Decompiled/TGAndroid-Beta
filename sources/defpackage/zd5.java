package defpackage;
public final class zd5 implements av3 {
    public static final double[] r = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};
    public String a;
    public x1c b;
    public final oz9 c;
    public final String d;
    public final ey7 e;
    public final yj7 f;
    public final boolean[] g = new boolean[4];
    public final yd5 h;
    public long i;
    public boolean j;
    public boolean k;
    public long l;
    public long m;
    public long n;
    public long o;
    public boolean p;
    public boolean q;

    public zd5(oz9 oz9Var, String str) {
        this.c = oz9Var;
        this.d = str;
        ?? obj = new Object();
        obj.a = new byte[128];
        this.h = obj;
        if (oz9Var != null) {
            this.f = new yj7(178);
            this.e = new ey7();
        } else {
            this.f = null;
            this.e = null;
        }
        this.m = -9223372036854775807L;
        this.o = -9223372036854775807L;
    }

    @Override
    public final void b(defpackage.ey7 r23) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zd5.b(ey7):void");
    }

    @Override
    public final void d() {
        rfd.a(this.g);
        yd5 yd5Var = this.h;
        yd5Var.d = false;
        yd5Var.b = 0;
        yd5Var.c = 0;
        yj7 yj7Var = this.f;
        if (yj7Var != null) {
            yj7Var.c();
        }
        this.i = 0L;
        this.j = false;
        this.m = -9223372036854775807L;
        this.o = -9223372036854775807L;
    }

    @Override
    public final void f() {
        this.b.getClass();
        long j = this.o;
        if (j != -9223372036854775807L) {
            boolean z = this.p;
            this.b.a(j, z ? 1 : 0, (int) (this.i - this.n), 0, null);
        }
    }

    @Override
    public final void g(int i, long j) {
        this.m = j;
    }

    @Override
    public final void h(g84 g84Var, l6c l6cVar) {
        l6cVar.a();
        l6cVar.b();
        this.a = l6cVar.e;
        l6cVar.b();
        this.b = g84Var.e0(l6cVar.d, 2);
        oz9 oz9Var = this.c;
        if (oz9Var != null) {
            oz9Var.b(g84Var, l6cVar);
        }
    }

    @Override
    public final void e() {
    }
}
