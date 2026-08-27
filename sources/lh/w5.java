package lh;

public final class w5 implements yf.a1 {

    public final va f17010a;

    public w5(va vaVar) {
        this.f17010a = vaVar;
    }

    @Override
    public final void b() {
        x5 x5Var = this.f17010a.L0;
        if (x5Var != null) {
            x5Var.invalidate();
        }
    }

    @Override
    public final void c() {
        va vaVar = this.f17010a;
        if (vaVar.Y0) {
            vaVar.Y0 = false;
        } else {
            vaVar.f15969g1.b(1);
            vaVar.l((yf.m) yf.m.f49979a.get(0));
        }
    }

    @Override
    public final boolean d() {
        va vaVar = this.f17010a;
        boolean z10 = vaVar.F0 == null;
        if (!z10) {
            vaVar.D0(null, true);
        }
        return z10;
    }

    @Override
    public final void e() {
        va vaVar = this.f17010a;
        vaVar.f16005z0.f50076a.g();
        vaVar.Z0.setViewHidden(false);
    }

    @Override
    public final void f() {
        va vaVar = this.f17010a;
        if (vaVar.F0 != null) {
            vaVar.D0(null, true);
        }
        vaVar.Z0.setViewHidden(true);
    }

    @Override
    public final void a() {
    }
}
