package di;
public final class h6 implements qg.b1 {
    public final rb f7320a;

    public h6(rb rbVar) {
        this.f7320a = rbVar;
    }

    @Override
    public final void b() {
        i6 i6Var = this.f7320a.P0;
        if (i6Var != null) {
            i6Var.invalidate();
        }
    }

    @Override
    public final void c() {
        rb rbVar = this.f7320a;
        if (rbVar.f7956c1) {
            rbVar.f7956c1 = false;
            return;
        }
        rbVar.f7972k1.b(1);
        rbVar.o((qg.m) qg.m.f44480a.get(0));
    }

    @Override
    public final boolean d() {
        boolean z10;
        rb rbVar = this.f7320a;
        if (rbVar.J0 == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            rbVar.D0(null, true);
        }
        return z10;
    }

    @Override
    public final void e() {
        rb rbVar = this.f7320a;
        rbVar.D0.f44589a.f();
        rbVar.f7958d1.setViewHidden(false);
    }

    @Override
    public final void f() {
        rb rbVar = this.f7320a;
        if (rbVar.J0 != null) {
            rbVar.D0(null, true);
        }
        rbVar.f7958d1.setViewHidden(true);
    }

    @Override
    public final void a() {
    }
}
