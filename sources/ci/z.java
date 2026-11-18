package ci;

import org.telegram.messenger.gd;
import org.telegram.messenger.x10;
import org.telegram.ui.ActionBar.h2;
import org.telegram.ui.Components.lc;
public final class z implements Runnable {
    public final int f5844a = 1;
    public final String f5845b;
    public final x10 f5846c;
    public final h2 d;

    public z(String str, x10 x10Var, h2 h2Var) {
        this.f5845b = str;
        this.f5846c = x10Var;
        this.d = h2Var;
    }

    @Override
    public final void run() {
        int i7 = this.f5844a;
        h2 h2Var = this.d;
        x10 x10Var = this.f5846c;
        String str = this.f5845b;
        switch (i7) {
            case 0:
                b0.p(h2Var, 0, new z(str, x10Var, h2Var));
                return;
            default:
                if (str != null) {
                    x10Var.a(str);
                    return;
                } else {
                    lc.b0(h2Var).N(gd.M0(2131745666, null), gd.M0(2131751094, null)).j();
                    return;
                }
        }
    }

    public z(h2 h2Var, String str, x10 x10Var) {
        this.d = h2Var;
        this.f5845b = str;
        this.f5846c = x10Var;
    }
}
