package m4;
public final class k1 extends b2.k1 {
    public static final Object f13418k = new Object();
    public final b2.k0 e;
    public final boolean f13419f;
    public final boolean f13420g;
    public final boolean h;
    public final b2.e0 f13421i;
    public final long f13422j;

    public k1(l1 l1Var) {
        boolean z10;
        b2.e0 e0Var;
        this.e = l1Var.w();
        this.f13419f = l1Var.d0();
        this.f13420g = l1Var.t0();
        if (!l1Var.w0().p() && l1Var.w0().m(l1Var.l0(), new b2.j1(), 0L).f1758k) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.h = z10;
        if (l1Var.M0()) {
            e0Var = b2.e0.f1666f;
        } else {
            e0Var = null;
        }
        this.f13421i = e0Var;
        this.f13422j = e2.d0.Q(l1Var.A());
    }

    @Override
    public final int b(Object obj) {
        if (f13418k.equals(obj)) {
            return 0;
        }
        return -1;
    }

    @Override
    public final b2.h1 f(int i10, b2.h1 h1Var, boolean z10) {
        h1Var.getClass();
        b2.b bVar = b2.b.f1628c;
        Object obj = f13418k;
        h1Var.h(obj, obj, 0, this.f13422j, 0L, bVar, false);
        h1Var.f1708f = this.h;
        return h1Var;
    }

    @Override
    public final int h() {
        return 1;
    }

    @Override
    public final Object l(int i10) {
        return f13418k;
    }

    @Override
    public final b2.j1 m(int i10, b2.j1 j1Var, long j3) {
        j1Var.b(f13418k, this.e, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, this.f13419f, this.f13420g, this.f13421i, 0L, this.f13422j, 0, 0, 0L);
        j1Var.f1758k = this.h;
        return j1Var;
    }

    @Override
    public final int o() {
        return 1;
    }
}
