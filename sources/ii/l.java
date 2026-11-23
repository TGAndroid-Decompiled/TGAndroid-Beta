package ii;

import org.telegram.messenger.m10;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.Wallet.o6;
public final class l implements Runnable {
    public final int f16405a;
    public final g2 f16406b;

    public l(int i7, g2 g2Var) {
        this.f16405a = i7;
        this.f16406b = g2Var;
    }

    @Override
    public final void run() {
        switch (this.f16405a) {
            case 0:
                this.f16406b.presentFragment(new o6());
                return;
            default:
                m10.m(1, this.f16406b);
                return;
        }
    }
}
