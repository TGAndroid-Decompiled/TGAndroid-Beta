package di;
public final class f6 implements qg.b1 {
    public final mb f6944a;

    public f6(mb mbVar) {
        this.f6944a = mbVar;
    }

    @Override
    public final void b() {
        g6 g6Var = this.f6944a.P0;
        if (g6Var != null) {
            g6Var.invalidate();
        }
    }

    @Override
    public final void c() {
        mb mbVar = this.f6944a;
        if (mbVar.f7515c1) {
            mbVar.f7515c1 = false;
            return;
        }
        mbVar.f7531k1.b(1);
        mbVar.o((qg.m) qg.m.f43485a.get(0));
    }

    @Override
    public final boolean d() {
        boolean z10;
        mb mbVar = this.f6944a;
        if (mbVar.J0 == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            mbVar.C0(null, true);
        }
        return z10;
    }

    @Override
    public final void e() {
        mb mbVar = this.f6944a;
        mbVar.D0.f43585a.f();
        mbVar.f7517d1.setViewHidden(false);
    }

    @Override
    public final void f() {
        mb mbVar = this.f6944a;
        if (mbVar.J0 != null) {
            mbVar.C0(null, true);
        }
        mbVar.f7517d1.setViewHidden(true);
    }

    @Override
    public final void a() {
    }
}
