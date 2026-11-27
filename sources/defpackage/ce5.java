package defpackage;
public final class ce5 implements av3 {
    public static final float[] l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};
    public final oz9 a;
    public final ey7 b;
    public final boolean[] c = new boolean[4];
    public final ae5 d;
    public final xj7 e;
    public be5 f;
    public long g;
    public String h;
    public x1c i;
    public boolean j;
    public long k;

    public ce5(oz9 oz9Var) {
        this.a = oz9Var;
        ?? obj = new Object();
        obj.e = new byte[128];
        this.d = obj;
        this.k = -9223372036854775807L;
        this.e = new xj7(178);
        this.b = new ey7();
    }

    @Override
    public final void b(defpackage.ey7 r20) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ce5.b(ey7):void");
    }

    @Override
    public final void d() {
        rfd.a(this.c);
        ae5 ae5Var = this.d;
        ae5Var.c = false;
        ae5Var.a = 0;
        ae5Var.d = (byte) 0;
        be5 be5Var = this.f;
        if (be5Var != null) {
            be5Var.b = false;
            be5Var.c = false;
            be5Var.d = false;
            be5Var.e = -1;
        }
        xj7 xj7Var = this.e;
        if (xj7Var != null) {
            xj7Var.c();
        }
        this.g = 0L;
        this.k = -9223372036854775807L;
    }

    @Override
    public final void f() {
        this.f.getClass();
        this.f.b(0, this.g, this.j);
        be5 be5Var = this.f;
        be5Var.b = false;
        be5Var.c = false;
        be5Var.d = false;
        be5Var.e = -1;
    }

    @Override
    public final void g(int i, long j) {
        this.k = j;
    }

    @Override
    public final void h(g84 g84Var, l6c l6cVar) {
        l6cVar.a();
        l6cVar.b();
        this.h = l6cVar.e;
        l6cVar.b();
        x1c e0 = g84Var.e0(l6cVar.d, 2);
        this.i = e0;
        this.f = new be5(e0);
        this.a.b(g84Var, l6cVar);
    }

    @Override
    public final void e() {
    }
}
