package defpackage;
public final class is7 implements Runnable {
    public final byte a;
    public final ms7 b;

    public is7(ms7 ms7Var, byte b) {
        this.a = b;
        this.b = ms7Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        ms7 ms7Var = this.b;
        switch (b) {
            case 0:
                if (ms7Var.k2) {
                    ms7Var.k2 = false;
                    ms7Var.c2.setLoading(false);
                    ms7Var.b1();
                    return;
                }
                return;
            case 1:
                if (!ms7Var.i2) {
                    ms7Var.i2 = true;
                    ms7Var.h2 = false;
                    ms7Var.g2 = false;
                    ms7Var.dismiss();
                    Runnable runnable = ms7Var.q2;
                    if (runnable != null) {
                        runnable.run();
                    }
                }
                if (!ms7Var.j2) {
                    ms7Var.j2 = true;
                    l65 l65Var = ms7Var.s2;
                    if (l65Var != null) {
                        l65Var.run();
                        return;
                    }
                    return;
                }
                return;
            case 2:
                ms7Var.a1();
                return;
            default:
                ms7Var.dismiss();
                return;
        }
    }
}
