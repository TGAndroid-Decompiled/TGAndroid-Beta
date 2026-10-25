package fi;
public final class v5 implements rg.b1 {
    public final ta f11820a;

    public v5(ta taVar) {
        this.f11820a = taVar;
    }

    @Override
    public final void b() {
        w5 w5Var = this.f11820a.E0;
        if (w5Var != null) {
            w5Var.invalidate();
        }
    }

    @Override
    public final void c() {
        ta taVar = this.f11820a;
        if (taVar.R0) {
            taVar.R0 = false;
            return;
        }
        taVar.Z0.b(1);
        taVar.i((rg.m) rg.m.f47462a.get(0));
    }

    @Override
    public final boolean d() {
        boolean z10;
        ta taVar = this.f11820a;
        if (taVar.f10824y0 == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            taVar.A0(null, true);
        }
        return z10;
    }

    @Override
    public final void e() {
        ta taVar = this.f11820a;
        taVar.f10812s0.f47559a.a();
        taVar.S0.setViewHidden(false);
    }

    @Override
    public final void f() {
        ta taVar = this.f11820a;
        if (taVar.f10824y0 != null) {
            taVar.A0(null, true);
        }
        taVar.S0.setViewHidden(true);
    }

    @Override
    public final void a() {
    }
}
