package defpackage;
public final class bc5 implements gu3 {
    public static final float[] l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};
    public final uv9 a;
    public final xu7 b;
    public final boolean[] c = new boolean[4];
    public final zb5 d;
    public final oh7 e;
    public ac5 f;
    public long g;
    public String h;
    public wxb i;
    public boolean j;
    public long k;

    public bc5(uv9 uv9Var) {
        this.a = uv9Var;
        ?? obj = new Object();
        obj.e = new byte[128];
        this.d = obj;
        this.k = -9223372036854775807L;
        this.e = new oh7(178);
        this.b = new xu7();
    }

    @Override
    public final void b(defpackage.xu7 r20) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bc5.b(xu7):void");
    }

    @Override
    public final void d() {
        yad.a(this.c);
        zb5 zb5Var = this.d;
        zb5Var.c = false;
        zb5Var.a = 0;
        zb5Var.d = (byte) 0;
        ac5 ac5Var = this.f;
        if (ac5Var != null) {
            ac5Var.b = false;
            ac5Var.c = false;
            ac5Var.d = false;
            ac5Var.e = -1;
        }
        oh7 oh7Var = this.e;
        if (oh7Var != null) {
            oh7Var.c();
        }
        this.g = 0L;
        this.k = -9223372036854775807L;
    }

    @Override
    public final void f() {
        this.f.getClass();
        this.f.b(0, this.g, this.j);
        ac5 ac5Var = this.f;
        ac5Var.b = false;
        ac5Var.c = false;
        ac5Var.d = false;
        ac5Var.e = -1;
    }

    @Override
    public final void g(int i, long j) {
        this.k = j;
    }

    @Override
    public final void h(l74 l74Var, l2c l2cVar) {
        l2cVar.a();
        l2cVar.b();
        this.h = l2cVar.e;
        l2cVar.b();
        wxb T = l74Var.T(l2cVar.d, 2);
        this.i = T;
        this.f = new ac5(T);
        this.a.b(l74Var, l2cVar);
    }

    @Override
    public final void e() {
    }
}
