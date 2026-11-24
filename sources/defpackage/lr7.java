package defpackage;
public final class lr7 implements Runnable {
    public final byte a;
    public final pr7 b;

    public lr7(pr7 pr7Var, byte b) {
        this.a = b;
        this.b = pr7Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        pr7 pr7Var = this.b;
        switch (b) {
            case 0:
                if (pr7Var.k2) {
                    pr7Var.k2 = false;
                    pr7Var.c2.setLoading(false);
                    pr7Var.a1();
                    return;
                }
                return;
            case 1:
                if (!pr7Var.i2) {
                    pr7Var.i2 = true;
                    pr7Var.h2 = false;
                    pr7Var.g2 = false;
                    pr7Var.dismiss();
                    Runnable runnable = pr7Var.q2;
                    if (runnable != null) {
                        runnable.run();
                    }
                }
                if (!pr7Var.j2) {
                    pr7Var.j2 = true;
                    h65 h65Var = pr7Var.s2;
                    if (h65Var != null) {
                        h65Var.run();
                        return;
                    }
                    return;
                }
                return;
            case 2:
                pr7Var.Z0();
                return;
            default:
                pr7Var.dismiss();
                return;
        }
    }
}
