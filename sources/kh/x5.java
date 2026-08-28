package kh;
public final class x5 implements xf.b1 {
    public final ya f16378a;

    public x5(ya yaVar) {
        this.f16378a = yaVar;
    }

    @Override
    public final void b() {
        y5 y5Var = this.f16378a.L0;
        if (y5Var != null) {
            y5Var.invalidate();
        }
    }

    @Override
    public final void c() {
        ya yaVar = this.f16378a;
        if (yaVar.Y0) {
            yaVar.Y0 = false;
            return;
        }
        yaVar.f15279g1.b(1);
        yaVar.n((xf.m) xf.m.f49272a.get(0));
    }

    @Override
    public final boolean d() {
        boolean z10;
        ya yaVar = this.f16378a;
        if (yaVar.F0 == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            yaVar.D0(null, true);
        }
        return z10;
    }

    @Override
    public final void e() {
        ya yaVar = this.f16378a;
        yaVar.f15315z0.f49381a.e();
        yaVar.Z0.setViewHidden(false);
    }

    @Override
    public final void f() {
        ya yaVar = this.f16378a;
        if (yaVar.F0 != null) {
            yaVar.D0(null, true);
        }
        yaVar.Z0.setViewHidden(true);
    }

    @Override
    public final void a() {
    }
}
