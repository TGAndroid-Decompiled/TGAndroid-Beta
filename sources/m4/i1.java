package m4;
public final class i1 extends b2.k1 {
    public static final Object f15960k = new Object();
    public final b2.k0 f15961e;
    public final boolean f15962f;
    public final boolean f15963g;
    public final boolean h;
    public final b2.e0 f15964i;
    public final long f15965j;

    public i1(j1 j1Var) {
        boolean z10;
        b2.e0 e0Var;
        this.f15961e = j1Var.w();
        this.f15962f = j1Var.d0();
        this.f15963g = j1Var.t0();
        if (!j1Var.w0().p() && j1Var.w0().m(j1Var.l0(), new b2.j1(), 0L).f2114k) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.h = z10;
        if (j1Var.M0()) {
            e0Var = b2.e0.f2010f;
        } else {
            e0Var = null;
        }
        this.f15964i = e0Var;
        this.f15965j = e2.d0.Q(j1Var.A());
    }

    @Override
    public final int b(Object obj) {
        if (f15960k.equals(obj)) {
            return 0;
        }
        return -1;
    }

    @Override
    public final b2.h1 f(int i10, b2.h1 h1Var, boolean z10) {
        h1Var.getClass();
        b2.b bVar = b2.b.f1966c;
        Object obj = f15960k;
        h1Var.h(obj, obj, 0, this.f15965j, 0L, bVar, false);
        h1Var.f2058f = this.h;
        return h1Var;
    }

    @Override
    public final int h() {
        return 1;
    }

    @Override
    public final Object l(int i10) {
        return f15960k;
    }

    @Override
    public final b2.j1 m(int i10, b2.j1 j1Var, long j3) {
        j1Var.b(f15960k, this.f15961e, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, this.f15962f, this.f15963g, this.f15964i, 0L, this.f15965j, 0, 0, 0L);
        j1Var.f2114k = this.h;
        return j1Var;
    }

    @Override
    public final int o() {
        return 1;
    }
}
