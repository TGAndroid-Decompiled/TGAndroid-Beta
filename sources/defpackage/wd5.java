package defpackage;
public final class wd5 implements rv3 {
    public static final double[] r = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};
    public String a;
    public yzb b;
    public final xx9 c;
    public final String d;
    public final yw7 e;
    public final rj7 f;
    public final boolean[] g = new boolean[4];
    public final vd5 h;
    public long i;
    public boolean j;
    public boolean k;
    public long l;
    public long m;
    public long n;
    public long o;
    public boolean p;
    public boolean q;

    public wd5(xx9 xx9Var, String str) {
        this.c = xx9Var;
        this.d = str;
        ?? obj = new Object();
        obj.a = new byte[128];
        this.h = obj;
        if (xx9Var != null) {
            this.f = new rj7(178);
            this.e = new yw7();
        } else {
            this.f = null;
            this.e = null;
        }
        this.m = -9223372036854775807L;
        this.o = -9223372036854775807L;
    }

    @Override
    public final void b(defpackage.yw7 r23) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wd5.b(yw7):void");
    }

    @Override
    public final void d() {
        add.a(this.g);
        vd5 vd5Var = this.h;
        vd5Var.d = false;
        vd5Var.b = 0;
        vd5Var.c = 0;
        rj7 rj7Var = this.f;
        if (rj7Var != null) {
            rj7Var.c();
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
    public final void h(u84 u84Var, l4c l4cVar) {
        l4cVar.a();
        l4cVar.b();
        this.a = l4cVar.e;
        l4cVar.b();
        this.b = u84Var.c0(l4cVar.d, 2);
        xx9 xx9Var = this.c;
        if (xx9Var != null) {
            xx9Var.b(u84Var, l4cVar);
        }
    }

    @Override
    public final void e() {
    }
}
