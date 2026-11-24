package defpackage;
public final class cr1 extends k11 {
    public final byte d;
    public final int e;
    public final rc2 f;
    public final yv1 g;

    public cr1(yv1 yv1Var, int i, rc2 rc2Var, byte b) {
        this.d = b;
        this.g = yv1Var;
        this.e = i;
        this.f = rc2Var;
    }

    @Override
    public final void c(boolean z) {
        switch (this.d) {
            case 0:
                if (!z) {
                    gm.d3(new eh(this, this.e, (byte) 16), 240L);
                    return;
                }
                return;
            case 1:
                if (!z) {
                    gm.d3(new eh(this, this.e, (byte) 18), 240L);
                    return;
                }
                return;
            default:
                if (!z) {
                    gm.d3(new eh(this, this.e, (byte) 19), 240L);
                    return;
                }
                return;
        }
    }

    @Override
    public final void d() {
        byte b = this.d;
        rc2 rc2Var = this.f;
        int i = this.e;
        yv1 yv1Var = this.g;
        switch (b) {
            case 0:
                yv1Var.kc = i;
                yv1Var.lc = 6;
                rc2Var.invalidate();
                return;
            case 1:
                yv1Var.kc = i;
                yv1Var.lc = 5;
                yv1Var.nc = null;
                rc2Var.invalidate();
                return;
            default:
                yv1Var.kc = i;
                yv1Var.lc = 7;
                rc2Var.invalidate();
                return;
        }
    }
}
