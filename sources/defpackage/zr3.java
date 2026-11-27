package defpackage;
public final class zr3 implements Runnable {
    public final byte a;
    public final as3 b;

    public zr3(as3 as3Var, byte b) {
        this.a = b;
        this.b = as3Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        as3 as3Var = this.b;
        switch (b) {
            case 0:
                if (as3Var.L > 0) {
                    as3Var.dualToggleShape();
                    try {
                        as3Var.performHapticFeedback(0, 1);
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
                return;
            default:
                as3Var.focusToPoint((int) as3Var.J, (int) as3Var.K);
                return;
        }
    }
}
