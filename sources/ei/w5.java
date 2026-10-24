package ei;
public final class w5 implements qg.d1 {
    public final xa f10058a;

    public w5(xa xaVar) {
        this.f10058a = xaVar;
    }

    @Override
    public final void b() {
        x5 x5Var = this.f10058a.P0;
        if (x5Var != null) {
            x5Var.invalidate();
        }
    }

    @Override
    public final void c() {
        xa xaVar = this.f10058a;
        if (xaVar.f9013c1) {
            xaVar.f9013c1 = false;
            return;
        }
        xaVar.f9029k1.b(1);
        xaVar.n((qg.m) qg.m.f44983a.get(0));
    }

    @Override
    public final boolean d() {
        boolean z10;
        xa xaVar = this.f10058a;
        if (xaVar.J0 == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            xaVar.B0(null, true);
        }
        return z10;
    }

    @Override
    public final void e() {
        xa xaVar = this.f10058a;
        xaVar.D0.f45104a.e();
        xaVar.f9015d1.setViewHidden(false);
    }

    @Override
    public final void f() {
        xa xaVar = this.f10058a;
        if (xaVar.J0 != null) {
            xaVar.B0(null, true);
        }
        xaVar.f9015d1.setViewHidden(true);
    }

    @Override
    public final void a() {
    }
}
