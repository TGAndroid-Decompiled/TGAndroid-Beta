package defpackage;
public final class ka7 implements Runnable {
    public final byte a;
    public final uc7 b;
    public final long c;
    public final Runnable d;

    public ka7(uc7 uc7Var, long j, Runnable runnable, byte b) {
        this.a = b;
        this.b = uc7Var;
        this.c = j;
        this.d = runnable;
    }

    @Override
    public final void run() {
        byte b = this.a;
        Runnable runnable = this.d;
        long j = this.c;
        uc7 uc7Var = this.b;
        switch (b) {
            case 0:
                uc7Var.e3(0, j, true);
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                uc7Var.e3(0, j, true);
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
