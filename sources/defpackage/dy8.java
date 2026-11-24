package defpackage;
public final class dy8 implements Runnable {
    public final byte a;
    public final iy8 b;

    public dy8(iy8 iy8Var, byte b) {
        this.a = b;
        this.b = iy8Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        iy8 iy8Var = this.b;
        switch (b) {
            case 0:
                if (iy8Var.h == null && iy8Var.d != null && !iy8Var.isFinished && iy8Var.getParentActivity() != null) {
                    iy8Var.g0(iy8Var.d.H0(), 0.0f, true);
                    iy8Var.h.setVisibility(4);
                    cz3 cz3Var = iy8Var.y;
                    if (cz3Var != null) {
                        cz3Var.setVisibility(4);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                cz3 cz3Var2 = iy8Var.y;
                if (cz3Var2 != null) {
                    cz3Var2.invalidate();
                }
                iy8Var.m0();
                return;
            default:
                iy8Var.k0();
                return;
        }
    }
}
