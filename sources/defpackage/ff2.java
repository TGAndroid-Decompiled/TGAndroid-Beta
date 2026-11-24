package defpackage;
public final class ff2 implements fh6, eja {
    public final byte a;
    public final gf2 b;

    public ff2(gf2 gf2Var, byte b) {
        this.a = b;
        this.b = gf2Var;
    }

    @Override
    public final boolean a(gh6 gh6Var, boolean z) {
        kf2 kf2Var = this.b.d;
        return kf2Var.h0(kf2Var.a.E(((Integer) gh6Var.getTag()).intValue()), !z, gh6Var);
    }

    @Override
    public final void k(int i) {
        byte b = this.a;
        boolean z = true;
        gf2 gf2Var = this.b;
        switch (b) {
            case 1:
                kf2 kf2Var = gf2Var.d;
                if (kf2Var.r != null) {
                    int i2 = kf2Var.p1;
                    if ((i2 <= 0 || i != 0) && (i2 != 0 || i <= 0)) {
                        z = false;
                    }
                    kf2Var.p1 = i;
                    if (z) {
                        ef2 z0 = kf2Var.z0();
                        kf2Var.E0();
                        kf2Var.C0(z0);
                    }
                    kf2Var.a.g(kf2Var.P0);
                    return;
                }
                return;
            default:
                gf2Var.d.s1 = i + 1;
                return;
        }
    }

    @Override
    public final void n() {
        byte b = this.a;
    }

    private final void b() {
    }

    private final void c() {
    }
}
