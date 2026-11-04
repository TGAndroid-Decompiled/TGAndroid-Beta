package bi;

import org.telegram.messenger.bd;
import org.telegram.messenger.u10;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.Components.fc;
public final class y implements Runnable {
    public final int f3915a = 1;
    public final String f3916b;
    public final u10 f3917c;
    public final d2 d;

    public y(String str, u10 u10Var, d2 d2Var) {
        this.f3916b = str;
        this.f3917c = u10Var;
        this.d = d2Var;
    }

    @Override
    public final void run() {
        int i3 = this.f3915a;
        d2 d2Var = this.d;
        u10 u10Var = this.f3917c;
        String str = this.f3916b;
        switch (i3) {
            case 0:
                a0.p(d2Var, 0, new y(str, u10Var, d2Var));
                return;
            default:
                if (str != null) {
                    u10Var.a(str);
                    return;
                } else {
                    fc.a0(d2Var).N(bd.M0(2131745871, null), bd.M0(2131751106, null)).j();
                    return;
                }
        }
    }

    public y(d2 d2Var, String str, u10 u10Var) {
        this.d = d2Var;
        this.f3916b = str;
        this.f3917c = u10Var;
    }
}
