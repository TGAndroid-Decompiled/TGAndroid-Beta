package defpackage;
public final class eb4 implements Runnable {
    public final byte a;
    public final kb4 b;

    public eb4(kb4 kb4Var, byte b) {
        this.a = b;
        this.b = kb4Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        kb4 kb4Var = this.b;
        switch (b) {
            case 0:
                Runnable runnable = kb4Var.l;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                Runnable runnable2 = kb4Var.l;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
        }
    }
}
