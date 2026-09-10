package bi;
public final class g7 implements og.g1 {
    public final ad f2749a;

    public g7(ad adVar) {
        this.f2749a = adVar;
    }

    @Override
    public final void b() {
        h7 h7Var = this.f2749a.P0;
        if (h7Var != null) {
            h7Var.invalidate();
        }
    }

    @Override
    public final void c() {
        ad adVar = this.f2749a;
        if (adVar.f3503c1) {
            adVar.f3503c1 = false;
            return;
        }
        adVar.f3519k1.b(1);
        adVar.B((og.m) og.m.f14420a.get(0));
    }

    @Override
    public final boolean d() {
        boolean z10;
        ad adVar = this.f2749a;
        if (adVar.J0 == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            adVar.D0(null, true);
        }
        return z10;
    }

    @Override
    public final void e() {
        ad adVar = this.f2749a;
        adVar.D0.f14570a.e();
        adVar.f3505d1.setViewHidden(false);
    }

    @Override
    public final void f() {
        ad adVar = this.f2749a;
        if (adVar.J0 != null) {
            adVar.D0(null, true);
        }
        adVar.f3505d1.setViewHidden(true);
    }

    @Override
    public final void a() {
    }
}
