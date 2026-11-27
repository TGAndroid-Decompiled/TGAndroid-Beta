package defpackage;
public final class bb4 implements Runnable {
    public final byte a;
    public final gb4 b;

    public bb4(gb4 gb4Var, byte b) {
        this.a = b;
        this.b = gb4Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        gb4 gb4Var = this.b;
        switch (b) {
            case 0:
                Runnable runnable = gb4Var.l;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                Runnable runnable2 = gb4Var.l;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
        }
    }
}
