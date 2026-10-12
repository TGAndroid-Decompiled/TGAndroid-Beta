package ci;
public final class g6 implements pg.c1 {
    public final nb f5119a;

    public g6(nb nbVar) {
        this.f5119a = nbVar;
    }

    @Override
    public final void b() {
        h6 h6Var = this.f5119a.P0;
        if (h6Var != null) {
            h6Var.invalidate();
        }
    }

    @Override
    public final void c() {
        nb nbVar = this.f5119a;
        if (nbVar.f5791c1) {
            nbVar.f5791c1 = false;
            return;
        }
        nbVar.f5807k1.b(1);
        nbVar.b((pg.m) pg.m.f45587a.get(0));
    }

    @Override
    public final boolean d() {
        boolean z10;
        nb nbVar = this.f5119a;
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
        nb nbVar = this.f5119a;
        nbVar.D0.f45700a.e();
        nbVar.f5793d1.setViewHidden(false);
    }

    @Override
    public final void f() {
        nb nbVar = this.f5119a;
        if (nbVar.J0 != null) {
            nbVar.C0(null, true);
        }
        nbVar.f5793d1.setViewHidden(true);
    }

    @Override
    public final void a() {
    }
}
