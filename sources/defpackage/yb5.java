package defpackage;
public final class yb5 implements gu3 {
    public static final double[] r = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};
    public String a;
    public wxb b;
    public final uv9 c;
    public final String d;
    public final xu7 e;
    public final oh7 f;
    public final boolean[] g = new boolean[4];
    public final xb5 h;
    public long i;
    public boolean j;
    public boolean k;
    public long l;
    public long m;
    public long n;
    public long o;
    public boolean p;
    public boolean q;

    public yb5(uv9 uv9Var, String str) {
        this.c = uv9Var;
        this.d = str;
        ?? obj = new Object();
        obj.a = new byte[128];
        this.h = obj;
        if (uv9Var != null) {
            this.f = new oh7(178);
            this.e = new xu7();
        } else {
            this.f = null;
            this.e = null;
        }
        this.m = -9223372036854775807L;
        this.o = -9223372036854775807L;
    }

    @Override
    public final void b(defpackage.xu7 r23) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yb5.b(xu7):void");
    }

    @Override
    public final void d() {
        yad.a(this.g);
        xb5 xb5Var = this.h;
        xb5Var.d = false;
        xb5Var.b = 0;
        xb5Var.c = 0;
        oh7 oh7Var = this.f;
        if (oh7Var != null) {
            oh7Var.c();
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
    public final void h(l74 l74Var, l2c l2cVar) {
        l2cVar.a();
        l2cVar.b();
        this.a = l2cVar.e;
        l2cVar.b();
        this.b = l74Var.S(l2cVar.d, 2);
        uv9 uv9Var = this.c;
        if (uv9Var != null) {
            uv9Var.b(l74Var, l2cVar);
        }
    }

    @Override
    public final void e() {
    }
}
