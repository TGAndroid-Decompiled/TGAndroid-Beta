package defpackage;
public final class up9 implements Runnable {
    public final byte a;
    public final bq9 b;
    public final Runnable c;

    public up9(bq9 bq9Var, Runnable runnable, byte b) {
        this.a = b;
        this.b = bq9Var;
        this.c = runnable;
    }

    @Override
    public final void run() {
        byte b = this.a;
        Runnable runnable = this.c;
        bq9 bq9Var = this.b;
        switch (b) {
            case 0:
                if (!bq9Var.h) {
                    runnable.run();
                    return;
                }
                return;
            default:
                if (!bq9Var.h) {
                    bq9Var.h = true;
                    bq9Var.e.C();
                    bq9Var.b.removeCallbacks(bq9Var.n);
                    h74 h74Var = bq9Var.f;
                    if (h74Var != null) {
                        h74Var.g1();
                        bq9Var.f = null;
                    }
                    bq9Var.g = null;
                    bq9Var.a.quitSafely();
                }
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
