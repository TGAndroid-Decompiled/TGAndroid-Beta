package ci;
public final class h6 implements pg.e1 {
    public final qb f4747a;

    public h6(qb qbVar) {
        this.f4747a = qbVar;
    }

    @Override
    public final void b() {
        i6 i6Var = this.f4747a.P0;
        if (i6Var != null) {
            i6Var.invalidate();
        }
    }

    @Override
    public final void c() {
        qb qbVar = this.f4747a;
        if (qbVar.f5411c1) {
            qbVar.f5411c1 = false;
            return;
        }
        qbVar.f5427k1.b(1);
        qbVar.b((pg.m) pg.m.f41218a.get(0));
    }

    @Override
    public final boolean d() {
        boolean z10;
        qb qbVar = this.f4747a;
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
        qb qbVar = this.f4747a;
        qbVar.D0.f41350a.e();
        qbVar.f5413d1.setViewHidden(false);
    }

    @Override
    public final void f() {
        qb qbVar = this.f4747a;
        if (qbVar.J0 != null) {
            qbVar.D0(null, true);
        }
        qbVar.f5413d1.setViewHidden(true);
    }

    @Override
    public final void a() {
    }
}
