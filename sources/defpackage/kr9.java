package defpackage;
public final class kr9 implements Runnable {
    public final byte a;
    public final rr9 b;
    public final Runnable c;

    public kr9(rr9 rr9Var, Runnable runnable, byte b) {
        this.a = b;
        this.b = rr9Var;
        this.c = runnable;
    }

    @Override
    public final void run() {
        byte b = this.a;
        Runnable runnable = this.c;
        rr9 rr9Var = this.b;
        switch (b) {
            case 0:
                if (!rr9Var.h) {
                    runnable.run();
                    return;
                }
                return;
            default:
                if (!rr9Var.h) {
                    rr9Var.h = true;
                    rr9Var.e.C();
                    rr9Var.b.removeCallbacks(rr9Var.n);
                    s64 s64Var = rr9Var.f;
                    if (s64Var != null) {
                        s64Var.g1();
                        rr9Var.f = null;
                    }
                    rr9Var.g = null;
                    rr9Var.a.quitSafely();
                }
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
