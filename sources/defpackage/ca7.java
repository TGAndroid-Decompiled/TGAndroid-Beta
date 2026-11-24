package defpackage;
public final class ca7 implements Runnable {
    public final byte a;
    public final oc7 b;
    public final long c;
    public final Runnable d;

    public ca7(oc7 oc7Var, long j, Runnable runnable, byte b) {
        this.a = b;
        this.b = oc7Var;
        this.c = j;
        this.d = runnable;
    }

    @Override
    public final void run() {
        byte b = this.a;
        Runnable runnable = this.d;
        long j = this.c;
        oc7 oc7Var = this.b;
        switch (b) {
            case 0:
                oc7Var.a3(0, j, true);
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                oc7Var.a3(0, j, true);
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
