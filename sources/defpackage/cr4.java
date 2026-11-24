package defpackage;
public final class cr4 implements Runnable {
    public final byte a;
    public final dr4 b;

    public cr4(dr4 dr4Var, byte b) {
        this.a = b;
        this.b = dr4Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        dr4 dr4Var = this.b;
        switch (b) {
            case 0:
                if (dr4Var.d.K == dr4Var) {
                    dr4Var.d.a0 = false;
                    dr4Var.d.b0 = null;
                    dr4Var.d.h();
                    return;
                }
                return;
            default:
                if (dr4Var.d.K == dr4Var && !dr4Var.b) {
                    dr4Var.d.a0 = true;
                    Runnable runnable = dr4Var.d.b0;
                    dr4Var.d.b0 = null;
                    if (runnable != null) {
                        runnable.run();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
