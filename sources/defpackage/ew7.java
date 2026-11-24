package defpackage;
public final class ew7 implements Runnable {
    public final byte a;
    public final hw7 b;

    public ew7(hw7 hw7Var, byte b) {
        this.a = b;
        this.b = hw7Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        hw7 hw7Var = this.b;
        switch (b) {
            case 0:
                hw7Var.c = null;
                x59 x59Var = hw7Var.a;
                if (x59Var != null) {
                    x59Var.f0();
                    return;
                }
                return;
            default:
                hw7Var.b();
                return;
        }
    }
}
