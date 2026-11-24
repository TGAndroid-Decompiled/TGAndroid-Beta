package defpackage;
public final class ga8 implements Runnable {
    public final byte a;
    public final ja8 b;

    public ga8(ja8 ja8Var, byte b) {
        this.a = b;
        this.b = ja8Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        ja8 ja8Var = this.b;
        switch (b) {
            case 0:
                ja8Var.d.a(false);
                return;
            default:
                Runnable runnable = ja8Var.I;
                ja8Var.I = null;
                if (runnable != null) {
                    runnable.run();
                }
                Runnable runnable2 = ja8Var.J;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
        }
    }
}
