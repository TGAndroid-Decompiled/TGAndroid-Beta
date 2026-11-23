package ci;

import org.telegram.messenger.hd;
import org.telegram.messenger.y10;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.Components.lc;
public final class z implements Runnable {
    public final int f5876a = 1;
    public final String f5877b;
    public final y10 f5878c;
    public final g2 d;

    public z(String str, y10 y10Var, g2 g2Var) {
        this.f5877b = str;
        this.f5878c = y10Var;
        this.d = g2Var;
    }

    @Override
    public final void run() {
        int i7 = this.f5876a;
        g2 g2Var = this.d;
        y10 y10Var = this.f5878c;
        String str = this.f5877b;
        switch (i7) {
            case 0:
                b0.p(g2Var, 0, new z(str, y10Var, g2Var));
                return;
            default:
                if (str != null) {
                    y10Var.a(str);
                    return;
                } else {
                    lc.b0(g2Var).N(hd.N0(2131745665, null), hd.N0(2131751093, null)).j();
                    return;
                }
        }
    }

    public z(g2 g2Var, String str, y10 y10Var) {
        this.d = g2Var;
        this.f5877b = str;
        this.f5878c = y10Var;
    }
}
