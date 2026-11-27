package defpackage;
public final class wf2 implements kj6, yma {
    public final byte a;
    public final xf2 b;

    public wf2(xf2 xf2Var, byte b) {
        this.a = b;
        this.b = xf2Var;
    }

    @Override
    public final boolean a(lj6 lj6Var, boolean z) {
        bg2 bg2Var = this.b.d;
        return bg2Var.h0(bg2Var.a.E(((Integer) lj6Var.getTag()).intValue()), !z, lj6Var);
    }

    @Override
    public final void j(int i) {
        byte b = this.a;
        boolean z = true;
        xf2 xf2Var = this.b;
        switch (b) {
            case 1:
                bg2 bg2Var = xf2Var.d;
                if (bg2Var.r != null) {
                    int i2 = bg2Var.p1;
                    if ((i2 <= 0 || i != 0) && (i2 != 0 || i <= 0)) {
                        z = false;
                    }
                    bg2Var.p1 = i;
                    if (z) {
                        vf2 A0 = bg2Var.A0();
                        bg2Var.F0();
                        bg2Var.D0(A0);
                    }
                    bg2Var.a.g(bg2Var.P0);
                    return;
                }
                return;
            default:
                xf2Var.d.s1 = i + 1;
                return;
        }
    }

    @Override
    public final void m() {
        byte b = this.a;
    }

    private final void b() {
    }

    private final void c() {
    }
}
