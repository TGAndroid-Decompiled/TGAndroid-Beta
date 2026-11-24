package defpackage;
public final class tn9 implements Runnable {
    public final byte a;
    public final ao9 b;
    public final Runnable c;

    public tn9(ao9 ao9Var, Runnable runnable, byte b) {
        this.a = b;
        this.b = ao9Var;
        this.c = runnable;
    }

    @Override
    public final void run() {
        byte b = this.a;
        Runnable runnable = this.c;
        ao9 ao9Var = this.b;
        switch (b) {
            case 0:
                if (!ao9Var.h) {
                    runnable.run();
                    return;
                }
                return;
            default:
                if (!ao9Var.h) {
                    ao9Var.h = true;
                    ao9Var.e.C();
                    ao9Var.b.removeCallbacks(ao9Var.n);
                    y54 y54Var = ao9Var.f;
                    if (y54Var != null) {
                        y54Var.g1();
                        ao9Var.f = null;
                    }
                    ao9Var.g = null;
                    ao9Var.a.quitSafely();
                }
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
