package ci;

import org.telegram.messenger.gd;
import org.telegram.messenger.x10;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.Components.lc;
public final class z implements Runnable {
    public final int f5873a = 1;
    public final String f5874b;
    public final x10 f5875c;
    public final g2 d;

    public z(String str, x10 x10Var, g2 g2Var) {
        this.f5874b = str;
        this.f5875c = x10Var;
        this.d = g2Var;
    }

    @Override
    public final void run() {
        int i7 = this.f5873a;
        g2 g2Var = this.d;
        x10 x10Var = this.f5875c;
        String str = this.f5874b;
        switch (i7) {
            case 0:
                b0.p(g2Var, 0, new z(str, x10Var, g2Var));
                return;
            default:
                if (str != null) {
                    x10Var.a(str);
                    return;
                } else {
                    lc.b0(g2Var).N(gd.N0(2131745665, null), gd.N0(2131751093, null)).j();
                    return;
                }
        }
    }

    public z(g2 g2Var, String str, x10 x10Var) {
        this.d = g2Var;
        this.f5874b = str;
        this.f5875c = x10Var;
    }
}
