package defpackage;
public final class pg8 implements Runnable {
    public final byte a;
    public final xg8 b;

    public pg8(xg8 xg8Var, boolean z) {
        this.a = (byte) 0;
        this.b = xg8Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        xg8 xg8Var = this.b;
        switch (b) {
            case 0:
                gm.c3(new pg8(xg8Var, (byte) 3));
                rc2 rc2Var = xg8Var.M;
                if (rc2Var != null) {
                    rc2Var.setVisibility(0);
                    rc2 rc2Var2 = xg8Var.M;
                    rc2Var2.d6 = null;
                    rc2Var2.invalidate();
                }
                ru1 ru1Var = xg8Var.f0;
                if (ru1Var != null) {
                    gm.c3(ru1Var);
                    xg8Var.f0 = null;
                    return;
                }
                return;
            case 1:
                xg8Var.b(false);
                return;
            case 2:
                xg8Var.b(false);
                return;
            default:
                xg8Var.c();
                return;
        }
    }

    public pg8(xg8 xg8Var, byte b) {
        this.a = b;
        this.b = xg8Var;
    }
}
