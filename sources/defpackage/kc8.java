package defpackage;
public final class kc8 implements Runnable {
    public final byte a;
    public final mc8 b;

    public kc8(mc8 mc8Var, byte b) {
        this.a = b;
        this.b = mc8Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        mc8 mc8Var = this.b;
        switch (b) {
            case 0:
                mc8Var.d.a(false);
                return;
            default:
                Runnable runnable = mc8Var.I;
                mc8Var.I = null;
                if (runnable != null) {
                    runnable.run();
                }
                Runnable runnable2 = mc8Var.J;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
        }
    }
}
