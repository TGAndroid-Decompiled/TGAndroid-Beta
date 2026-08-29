package nh;
public final class k5 implements ag.s1 {
    public final ja f18005a;

    public k5(ja jaVar) {
        this.f18005a = jaVar;
    }

    @Override
    public final void b() {
        l5 l5Var = this.f18005a.L0;
        if (l5Var != null) {
            l5Var.invalidate();
        }
    }

    @Override
    public final void c() {
        ja jaVar = this.f18005a;
        if (jaVar.Y0) {
            jaVar.Y0 = false;
            return;
        }
        jaVar.f18634g1.b(1);
        jaVar.q((ag.m) ag.m.f584a.get(0));
    }

    @Override
    public final boolean d() {
        boolean z10;
        ja jaVar = this.f18005a;
        if (jaVar.F0 == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            jaVar.D0(null, true);
        }
        return z10;
    }

    @Override
    public final void e() {
        ja jaVar = this.f18005a;
        jaVar.f18670z0.f617a.e();
        jaVar.Z0.setViewHidden(false);
    }

    @Override
    public final void f() {
        ja jaVar = this.f18005a;
        if (jaVar.F0 != null) {
            jaVar.D0(null, true);
        }
        jaVar.Z0.setViewHidden(true);
    }

    @Override
    public final void a() {
    }
}
