package defpackage;
public final class cw8 implements Runnable {
    public final byte a;
    public final gw8 b;

    public cw8(gw8 gw8Var, byte b) {
        this.a = b;
        this.b = gw8Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        gw8 gw8Var = this.b;
        switch (b) {
            case 0:
                if (gw8Var.h == null && gw8Var.d != null && !gw8Var.isFinished && gw8Var.getParentActivity() != null) {
                    gw8Var.f0(gw8Var.d.H0(), 0.0f, true);
                    gw8Var.h.setVisibility(4);
                    sx3 sx3Var = gw8Var.y;
                    if (sx3Var != null) {
                        sx3Var.setVisibility(4);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                sx3 sx3Var2 = gw8Var.y;
                if (sx3Var2 != null) {
                    sx3Var2.invalidate();
                }
                gw8Var.l0();
                return;
            default:
                gw8Var.j0();
                return;
        }
    }
}
