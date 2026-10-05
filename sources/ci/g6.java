package ci;
public final class g6 implements pg.e1 {
    public final mb f5112a;

    public g6(mb mbVar) {
        this.f5112a = mbVar;
    }

    @Override
    public final void b() {
        h6 h6Var = this.f5112a.P0;
        if (h6Var != null) {
            h6Var.invalidate();
        }
    }

    @Override
    public final void c() {
        mb mbVar = this.f5112a;
        if (mbVar.f5749c1) {
            mbVar.f5749c1 = false;
            return;
        }
        mbVar.f5765k1.b(1);
        mbVar.b((pg.m) pg.m.f44541a.get(0));
    }

    @Override
    public final boolean d() {
        boolean z10;
        mb mbVar = this.f5112a;
        if (mbVar.J0 == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            mbVar.D0(null, true);
        }
        return z10;
    }

    @Override
    public final void e() {
        mb mbVar = this.f5112a;
        mbVar.D0.f44685a.j();
        mbVar.f5751d1.setViewHidden(false);
    }

    @Override
    public final void f() {
        mb mbVar = this.f5112a;
        if (mbVar.J0 != null) {
            mbVar.D0(null, true);
        }
        mbVar.f5751d1.setViewHidden(true);
    }

    @Override
    public final void a() {
    }
}
