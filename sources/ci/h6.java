package ci;
public final class h6 implements pg.b1 {
    public final qb f4743a;

    public h6(qb qbVar) {
        this.f4743a = qbVar;
    }

    @Override
    public final void b() {
        i6 i6Var = this.f4743a.P0;
        if (i6Var != null) {
            i6Var.invalidate();
        }
    }

    @Override
    public final void c() {
        qb qbVar = this.f4743a;
        if (qbVar.f5407c1) {
            qbVar.f5407c1 = false;
            return;
        }
        qbVar.f5423k1.b(1);
        qbVar.b((pg.m) pg.m.f40912a.get(0));
    }

    @Override
    public final boolean d() {
        boolean z10;
        qb qbVar = this.f4743a;
        if (qbVar.J0 == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            qbVar.D0(null, true);
        }
        return z10;
    }

    @Override
    public final void e() {
        qb qbVar = this.f4743a;
        qbVar.D0.f41012a.e();
        qbVar.f5409d1.setViewHidden(false);
    }

    @Override
    public final void f() {
        qb qbVar = this.f4743a;
        if (qbVar.J0 != null) {
            qbVar.D0(null, true);
        }
        qbVar.f5409d1.setViewHidden(true);
    }

    @Override
    public final void a() {
    }
}
