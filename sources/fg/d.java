package fg;

import org.telegram.messenger.at;
import org.telegram.ui.ActionBar.s6;
public final class d implements Runnable {
    public final int f7064a;
    public final s6 f7065b;

    public d(s6 s6Var, int i10) {
        this.f7064a = i10;
        this.f7065b = s6Var;
    }

    @Override
    public final void run() {
        int i10 = this.f7064a;
        s6 s6Var = this.f7065b;
        switch (i10) {
            case 0:
                at.e().k(270, s6Var, Boolean.TRUE, null, -1);
                return;
            default:
                s6Var.s();
                return;
        }
    }
}
