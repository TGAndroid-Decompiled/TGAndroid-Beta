package defpackage;
public final class e94 implements Runnable {
    public final byte a;
    public final k94 b;

    public e94(k94 k94Var, byte b) {
        this.a = b;
        this.b = k94Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        k94 k94Var = this.b;
        switch (b) {
            case 0:
                Runnable runnable = k94Var.l;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                Runnable runnable2 = k94Var.l;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
        }
    }
}
