package ci;
public final class g6 implements pg.d1 {
    public final nb f5121a;

    public g6(nb nbVar) {
        this.f5121a = nbVar;
    }

    @Override
    public final void b() {
        h6 h6Var = this.f5121a.P0;
        if (h6Var != null) {
            h6Var.invalidate();
        }
    }

    @Override
    public final void c() {
        nb nbVar = this.f5121a;
        if (nbVar.f5793c1) {
            nbVar.f5793c1 = false;
            return;
        }
        nbVar.f5809k1.b(1);
        nbVar.b((pg.m) pg.m.f45686a.get(0));
    }

    @Override
    public final boolean d() {
        boolean z10;
        nb nbVar = this.f5121a;
        if (nbVar.J0 == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            nbVar.C0(null, true);
        }
        return z10;
    }

    @Override
    public final void e() {
        nb nbVar = this.f5121a;
        nbVar.D0.f45819a.e();
        nbVar.f5795d1.setViewHidden(false);
    }

    @Override
    public final void f() {
        nb nbVar = this.f5121a;
        if (nbVar.J0 != null) {
            nbVar.C0(null, true);
        }
        nbVar.f5795d1.setViewHidden(true);
    }

    @Override
    public final void a() {
    }
}
