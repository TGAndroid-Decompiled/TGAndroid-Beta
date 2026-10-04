package ci;
public final class g6 implements pg.e1 {
    public final mb f5111a;

    public g6(mb mbVar) {
        this.f5111a = mbVar;
    }

    @Override
    public final void b() {
        h6 h6Var = this.f5111a.P0;
        if (h6Var != null) {
            h6Var.invalidate();
        }
    }

    @Override
    public final void c() {
        mb mbVar = this.f5111a;
        if (mbVar.f5748c1) {
            mbVar.f5748c1 = false;
            return;
        }
        mbVar.f5764k1.b(1);
        mbVar.b((pg.m) pg.m.f44527a.get(0));
    }

    @Override
    public final boolean d() {
        boolean z10;
        mb mbVar = this.f5111a;
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
        mb mbVar = this.f5111a;
        mbVar.D0.f44671a.j();
        mbVar.f5750d1.setViewHidden(false);
    }

    @Override
    public final void f() {
        mb mbVar = this.f5111a;
        if (mbVar.J0 != null) {
            mbVar.D0(null, true);
        }
        mbVar.f5750d1.setViewHidden(true);
    }

    @Override
    public final void a() {
    }
}
