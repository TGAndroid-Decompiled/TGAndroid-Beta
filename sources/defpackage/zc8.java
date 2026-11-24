package defpackage;
public final class zc8 extends aob {
    public static final Object j = new Object();
    public final br6 e;
    public final boolean f;
    public final boolean g;
    public final wq6 h;
    public final long i;

    public zc8(ad8 ad8Var) {
        wq6 wq6Var;
        this.e = ad8Var.u();
        this.f = ad8Var.c0();
        this.g = ad8Var.u0();
        if (ad8Var.P0()) {
            wq6Var = wq6.f;
        } else {
            wq6Var = null;
        }
        this.h = wq6Var;
        this.i = g8c.T(ad8Var.z());
    }

    @Override
    public final int b(Object obj) {
        if (j != obj) {
            return -1;
        }
        return 0;
    }

    @Override
    public final xnb f(int i, xnb xnbVar, boolean z) {
        da daVar = da.c;
        Object obj = j;
        xnbVar.h(obj, obj, 0, this.i, 0L, false);
        return xnbVar;
    }

    @Override
    public final int h() {
        return 1;
    }

    @Override
    public final Object l(int i) {
        return j;
    }

    @Override
    public final znb m(int i, znb znbVar, long j2) {
        znbVar.b(j, this.e, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, this.f, this.g, this.h, 0L, this.i, 0, 0, 0L);
        znbVar.j = false;
        return znbVar;
    }

    @Override
    public final int o() {
        return 1;
    }
}
