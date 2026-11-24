package defpackage;
public final class bf8 extends bqb {
    public static final Object j = new Object();
    public final bt6 e;
    public final boolean f;
    public final boolean g;
    public final ws6 h;
    public final long i;

    public bf8(cf8 cf8Var) {
        ws6 ws6Var;
        this.e = cf8Var.u();
        this.f = cf8Var.c0();
        this.g = cf8Var.u0();
        if (cf8Var.P0()) {
            ws6Var = ws6.f;
        } else {
            ws6Var = null;
        }
        this.h = ws6Var;
        this.i = hac.T(cf8Var.z());
    }

    @Override
    public final int b(Object obj) {
        if (j != obj) {
            return -1;
        }
        return 0;
    }

    @Override
    public final ypb f(int i, ypb ypbVar, boolean z) {
        da daVar = da.c;
        Object obj = j;
        ypbVar.h(obj, obj, 0, this.i, 0L, false);
        return ypbVar;
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
    public final aqb m(int i, aqb aqbVar, long j2) {
        aqbVar.b(j, this.e, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, this.f, this.g, this.h, 0L, this.i, 0, 0, 0L);
        aqbVar.j = false;
        return aqbVar;
    }

    @Override
    public final int o() {
        return 1;
    }
}
