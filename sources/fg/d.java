package fg;

import org.telegram.messenger.zs;
import org.telegram.ui.ActionBar.s6;
public final class d implements Runnable {
    public final int f7063a;
    public final s6 f7064b;

    public d(s6 s6Var, int i10) {
        this.f7063a = i10;
        this.f7064b = s6Var;
    }

    @Override
    public final void run() {
        int i10 = this.f7063a;
        s6 s6Var = this.f7064b;
        switch (i10) {
            case 0:
                zs.e().k(270, s6Var, Boolean.TRUE, null, -1);
                return;
            default:
                s6Var.s();
                return;
        }
    }
}
