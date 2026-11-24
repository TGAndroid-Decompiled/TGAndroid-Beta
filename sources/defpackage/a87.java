package defpackage;
public final class a87 implements Runnable {
    public final byte a;
    public final na7 b;
    public final long c;
    public final Runnable d;

    public a87(na7 na7Var, long j, Runnable runnable, byte b) {
        this.a = b;
        this.b = na7Var;
        this.c = j;
        this.d = runnable;
    }

    @Override
    public final void run() {
        byte b = this.a;
        Runnable runnable = this.d;
        long j = this.c;
        na7 na7Var = this.b;
        switch (b) {
            case 0:
                na7Var.Y2(0, j, true);
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                na7Var.Y2(0, j, true);
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
