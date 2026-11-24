package defpackage;

import org.telegram.ui.LaunchActivity;
public final class i implements Runnable {
    public final byte a;
    public final u21 b;

    public i(u21 u21Var, byte b) {
        this.a = b;
        this.b = u21Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        u21 u21Var = this.b;
        switch (b) {
            case 0:
                new jh8(42, u21Var.c, u21Var.X()).show();
                return;
            default:
                if (LaunchActivity.S() != null) {
                    if (u21Var == null) {
                        u21Var = u21.b0(LaunchActivity.S());
                    }
                    if (u21Var != null) {
                        m21 I = u21Var.I(2131624092, k96.M0(2131746029, null), k96.M0(2131745992, null));
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
