package defpackage;
public final class ip7 implements Runnable {
    public final byte a;
    public final mp7 b;

    public ip7(mp7 mp7Var, byte b) {
        this.a = b;
        this.b = mp7Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        mp7 mp7Var = this.b;
        switch (b) {
            case 0:
                if (mp7Var.k2) {
                    mp7Var.k2 = false;
                    mp7Var.c2.setLoading(false);
                    mp7Var.a1();
                    return;
                }
                return;
            case 1:
                if (!mp7Var.i2) {
                    mp7Var.i2 = true;
                    mp7Var.h2 = false;
                    mp7Var.g2 = false;
                    mp7Var.dismiss();
                    Runnable runnable = mp7Var.q2;
                    if (runnable != null) {
                        runnable.run();
                    }
                }
                if (!mp7Var.j2) {
                    mp7Var.j2 = true;
                    j45 j45Var = mp7Var.s2;
                    if (j45Var != null) {
                        j45Var.run();
                        return;
                    }
                    return;
                }
                return;
            case 2:
                mp7Var.Z0();
                return;
            default:
                mp7Var.dismiss();
                return;
        }
    }
}
