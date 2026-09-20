package ci;
public final class h6 implements pg.d1 {
    public final qb f4749a;

    public h6(qb qbVar) {
        this.f4749a = qbVar;
    }

    @Override
    public final void b() {
        i6 i6Var = this.f4749a.P0;
        if (i6Var != null) {
            i6Var.invalidate();
        }
    }

    @Override
    public final void c() {
        qb qbVar = this.f4749a;
        if (qbVar.f5413c1) {
            qbVar.f5413c1 = false;
            return;
        }
        qbVar.f5429k1.b(1);
        qbVar.b((pg.m) pg.m.f41199a.get(0));
    }

    @Override
    public final boolean d() {
        boolean z10;
        qb qbVar = this.f4749a;
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
        qb qbVar = this.f4749a;
        qbVar.D0.f41321a.e();
        qbVar.f5415d1.setViewHidden(false);
    }

    @Override
    public final void f() {
        qb qbVar = this.f4749a;
        if (qbVar.J0 != null) {
            qbVar.D0(null, true);
        }
        qbVar.f5415d1.setViewHidden(true);
    }

    @Override
    public final void a() {
    }
}
