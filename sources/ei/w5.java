package ei;
public final class w5 implements qg.d1 {
    public final xa f10042a;

    public w5(xa xaVar) {
        this.f10042a = xaVar;
    }

    @Override
    public final void b() {
        x5 x5Var = this.f10042a.P0;
        if (x5Var != null) {
            x5Var.invalidate();
        }
    }

    @Override
    public final void c() {
        xa xaVar = this.f10042a;
        if (xaVar.f9003c1) {
            xaVar.f9003c1 = false;
            return;
        }
        xaVar.f9019k1.b(1);
        xaVar.o((qg.m) qg.m.f44561a.get(0));
    }

    @Override
    public final boolean d() {
        boolean z10;
        xa xaVar = this.f10042a;
        if (xaVar.J0 == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            xaVar.C0(null, true);
        }
        return z10;
    }

    @Override
    public final void e() {
        xa xaVar = this.f10042a;
        xaVar.D0.f44683a.e();
        xaVar.f9005d1.setViewHidden(false);
    }

    @Override
    public final void f() {
        xa xaVar = this.f10042a;
        if (xaVar.J0 != null) {
            xaVar.C0(null, true);
        }
        xaVar.f9005d1.setViewHidden(true);
    }

    @Override
    public final void a() {
    }
}
