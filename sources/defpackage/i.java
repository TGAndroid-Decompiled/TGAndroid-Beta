package defpackage;

import org.telegram.ui.LaunchActivity;
public final class i implements Runnable {
    public final byte a;
    public final d31 b;

    public i(d31 d31Var, byte b) {
        this.a = b;
        this.b = d31Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        d31 d31Var = this.b;
        switch (b) {
            case 0:
                new xk8(42, d31Var.c, d31Var.X()).show();
                return;
            default:
                if (LaunchActivity.S() != null) {
                    if (d31Var == null) {
                        d31Var = d31.b0(LaunchActivity.S());
                    }
                    if (d31Var != null) {
                        v21 I = d31Var.I(2131624092, ob6.M0(2131745949, null), ob6.M0(2131745912, null));
                        I.j = 5000;
                        I.j();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
