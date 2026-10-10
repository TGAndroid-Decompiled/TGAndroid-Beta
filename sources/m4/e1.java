package m4;
public final class e1 extends b2.k1 {
    public static final Object f16063k = new Object();
    public final b2.k0 f16064e;
    public final boolean f16065f;
    public final boolean f16066g;
    public final boolean h;
    public final b2.e0 f16067i;
    public final long f16068j;

    public e1(f1 f1Var) {
        boolean z10;
        b2.e0 e0Var;
        this.f16064e = f1Var.w();
        this.f16065f = f1Var.d0();
        this.f16066g = f1Var.t0();
        if (!f1Var.w0().p() && f1Var.w0().m(f1Var.l0(), new b2.j1(), 0L).f3387k) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.h = z10;
        if (f1Var.M0()) {
            e0Var = b2.e0.f3283f;
        } else {
            e0Var = null;
        }
        this.f16067i = e0Var;
        this.f16068j = e2.d0.P(f1Var.A());
    }

    @Override
    public final int b(Object obj) {
        if (f16063k.equals(obj)) {
            return 0;
        }
        return -1;
    }

    @Override
    public final b2.h1 f(int i10, b2.h1 h1Var, boolean z10) {
        h1Var.getClass();
        b2.b bVar = b2.b.f3239c;
        Object obj = f16063k;
        h1Var.h(obj, obj, 0, this.f16068j, 0L, bVar, false);
        h1Var.f3331f = this.h;
        return h1Var;
    }

    @Override
    public final int h() {
        return 1;
    }

    @Override
    public final Object l(int i10) {
        return f16063k;
    }

    @Override
    public final b2.j1 m(int i10, b2.j1 j1Var, long j3) {
        j1Var.b(f16063k, this.f16064e, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, this.f16065f, this.f16066g, this.f16067i, 0L, this.f16068j, 0, 0, 0L);
        j1Var.f3387k = this.h;
        return j1Var;
    }

    @Override
    public final int o() {
        return 1;
    }
}
