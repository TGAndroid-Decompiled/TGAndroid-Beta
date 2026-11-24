package defpackage;
public final class zd5 implements rv3 {
    public static final float[] l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};
    public final xx9 a;
    public final yw7 b;
    public final boolean[] c = new boolean[4];
    public final xd5 d;
    public final rj7 e;
    public yd5 f;
    public long g;
    public String h;
    public yzb i;
    public boolean j;
    public long k;

    public zd5(xx9 xx9Var) {
        this.a = xx9Var;
        ?? obj = new Object();
        obj.e = new byte[128];
        this.d = obj;
        this.k = -9223372036854775807L;
        this.e = new rj7(178);
        this.b = new yw7();
    }

    @Override
    public final void b(defpackage.yw7 r20) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zd5.b(yw7):void");
    }

    @Override
    public final void d() {
        add.a(this.c);
        xd5 xd5Var = this.d;
        xd5Var.c = false;
        xd5Var.a = 0;
        xd5Var.d = (byte) 0;
        yd5 yd5Var = this.f;
        if (yd5Var != null) {
            yd5Var.b = false;
            yd5Var.c = false;
            yd5Var.d = false;
            yd5Var.e = -1;
        }
        rj7 rj7Var = this.e;
        if (rj7Var != null) {
            rj7Var.c();
        }
        this.g = 0L;
        this.k = -9223372036854775807L;
    }

    @Override
    public final void f() {
        this.f.getClass();
        this.f.b(0, this.g, this.j);
        yd5 yd5Var = this.f;
        yd5Var.b = false;
        yd5Var.c = false;
        yd5Var.d = false;
        yd5Var.e = -1;
    }

    @Override
    public final void g(int i, long j) {
        this.k = j;
    }

    @Override
    public final void h(u84 u84Var, l4c l4cVar) {
        l4cVar.a();
        l4cVar.b();
        this.h = l4cVar.e;
        l4cVar.b();
        yzb c0 = u84Var.c0(l4cVar.d, 2);
        this.i = c0;
        this.f = new yd5(c0);
        this.a.b(u84Var, l4cVar);
    }

    @Override
    public final void e() {
    }
}
