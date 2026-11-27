package defpackage;
public final class ng8 extends asb {
    public static final Object j = new Object();
    public final ft6 e;
    public final boolean f;
    public final boolean g;
    public final at6 h;
    public final long i;

    public ng8(og8 og8Var) {
        at6 at6Var;
        this.e = og8Var.u();
        this.f = og8Var.c0();
        this.g = og8Var.u0();
        if (og8Var.P0()) {
            at6Var = at6.f;
        } else {
            at6Var = null;
        }
        this.h = at6Var;
        this.i = gcc.T(og8Var.z());
    }

    @Override
    public final int b(Object obj) {
        if (j != obj) {
            return -1;
        }
        return 0;
    }

    @Override
    public final xrb f(int i, xrb xrbVar, boolean z) {
        ea eaVar = ea.c;
        Object obj = j;
        xrbVar.h(obj, obj, 0, this.i, 0L, false);
        return xrbVar;
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
    public final zrb m(int i, zrb zrbVar, long j2) {
        zrbVar.b(j, this.e, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, this.f, this.g, this.h, 0L, this.i, 0, 0, 0L);
        zrbVar.j = false;
        return zrbVar;
    }

    @Override
    public final int o() {
        return 1;
    }
}
