package defpackage;

import org.telegram.ui.LaunchActivity;
public final class i implements Runnable {
    public final byte a;
    public final c41 b;

    public i(c41 c41Var, byte b) {
        this.a = b;
        this.b = c41Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        c41 c41Var = this.b;
        switch (b) {
            case 0:
                new kj8(42, c41Var.c, c41Var.X()).show();
                return;
            default:
                if (LaunchActivity.S() != null) {
                    if (c41Var == null) {
                        c41Var = c41.b0(LaunchActivity.S());
                    }
                    if (c41Var != null) {
                        u31 I = c41Var.I(2131624092, jb6.M0(2131745955, null), jb6.M0(2131745918, null));
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
