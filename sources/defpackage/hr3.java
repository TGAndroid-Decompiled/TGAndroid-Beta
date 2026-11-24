package defpackage;
public final class hr3 implements Runnable {
    public final byte a;
    public final ir3 b;

    public hr3(ir3 ir3Var, byte b) {
        this.a = b;
        this.b = ir3Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        ir3 ir3Var = this.b;
        switch (b) {
            case 0:
                if (ir3Var.L > 0) {
                    ir3Var.dualToggleShape();
                    try {
                        ir3Var.performHapticFeedback(0, 1);
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
                return;
            default:
                ir3Var.focusToPoint((int) ir3Var.J, (int) ir3Var.K);
                return;
        }
    }
}
