package ci;
public final class g6 implements pg.e1 {
    public final nb f4724a;

    public g6(nb nbVar) {
        this.f4724a = nbVar;
    }

    @Override
    public final void b() {
        h6 h6Var = this.f4724a.P0;
        if (h6Var != null) {
            h6Var.invalidate();
        }
    }

    @Override
    public final void c() {
        nb nbVar = this.f4724a;
        if (nbVar.f5334c1) {
            nbVar.f5334c1 = false;
            return;
        }
        nbVar.f5350k1.b(1);
        nbVar.b((pg.m) pg.m.f41168a.get(0));
    }

    @Override
    public final boolean d() {
        boolean z10;
        nb nbVar = this.f4724a;
        if (nbVar.J0 == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            nbVar.D0(null, true);
        }
        return z10;
    }

    @Override
    public final void e() {
        nb nbVar = this.f4724a;
        nbVar.D0.f41300a.e();
        nbVar.f5336d1.setViewHidden(false);
    }

    @Override
    public final void f() {
        nb nbVar = this.f4724a;
        if (nbVar.J0 != null) {
            nbVar.D0(null, true);
        }
        nbVar.f5336d1.setViewHidden(true);
    }

    @Override
    public final void a() {
    }
}
