package ei;
public final class w5 implements qg.d1 {
    public final xa f10044a;

    public w5(xa xaVar) {
        this.f10044a = xaVar;
    }

    @Override
    public final void b() {
        x5 x5Var = this.f10044a.P0;
        if (x5Var != null) {
            x5Var.invalidate();
        }
    }

    @Override
    public final void c() {
        xa xaVar = this.f10044a;
        if (xaVar.f9005c1) {
            xaVar.f9005c1 = false;
            return;
        }
        xaVar.f9021k1.b(1);
        xaVar.o((qg.m) qg.m.f44605a.get(0));
    }

    @Override
    public final boolean d() {
        boolean z10;
        xa xaVar = this.f10044a;
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
        xa xaVar = this.f10044a;
        xaVar.D0.f44726a.e();
        xaVar.f9007d1.setViewHidden(false);
    }

    @Override
    public final void f() {
        xa xaVar = this.f10044a;
        if (xaVar.J0 != null) {
            xaVar.C0(null, true);
        }
        xaVar.f9007d1.setViewHidden(true);
    }

    @Override
    public final void a() {
    }
}
