package defpackage;
public final class yd8 implements Runnable {
    public final byte a;
    public final ae8 b;

    public yd8(ae8 ae8Var, byte b) {
        this.a = b;
        this.b = ae8Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        ae8 ae8Var = this.b;
        switch (b) {
            case 0:
                ae8Var.d.a(false);
                return;
            default:
                Runnable runnable = ae8Var.I;
                ae8Var.I = null;
                if (runnable != null) {
                    runnable.run();
                }
                Runnable runnable2 = ae8Var.J;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
        }
    }
}
