package ci;

import org.telegram.messenger.gd;
import org.telegram.messenger.w10;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.Components.kc;
public final class z implements Runnable {
    public final int f5839a = 1;
    public final String f5840b;
    public final w10 f5841c;
    public final g2 d;

    public z(String str, w10 w10Var, g2 g2Var) {
        this.f5840b = str;
        this.f5841c = w10Var;
        this.d = g2Var;
    }

    @Override
    public final void run() {
        int i7 = this.f5839a;
        g2 g2Var = this.d;
        w10 w10Var = this.f5841c;
        String str = this.f5840b;
        switch (i7) {
            case 0:
                b0.p(g2Var, 0, new z(str, w10Var, g2Var));
                return;
            default:
                if (str != null) {
                    w10Var.a(str);
                    return;
                } else {
                    kc.b0(g2Var).N(gd.N0(2131745665, null), gd.N0(2131751093, null)).j();
                    return;
                }
        }
    }

    public z(g2 g2Var, String str, w10 w10Var) {
        this.d = g2Var;
        this.f5840b = str;
        this.f5841c = w10Var;
    }
}
