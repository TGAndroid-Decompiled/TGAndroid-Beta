package defpackage;
public final class rs3 implements Runnable {
    public final byte a;
    public final ss3 b;

    public rs3(ss3 ss3Var, byte b) {
        this.a = b;
        this.b = ss3Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        ss3 ss3Var = this.b;
        switch (b) {
            case 0:
                if (ss3Var.L > 0) {
                    ss3Var.dualToggleShape();
                    try {
                        ss3Var.performHapticFeedback(0, 1);
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
                return;
            default:
                ss3Var.focusToPoint((int) ss3Var.J, (int) ss3Var.K);
                return;
        }
    }
}
