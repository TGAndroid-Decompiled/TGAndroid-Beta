package ii;

import org.telegram.messenger.n10;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.Wallet.n6;
public final class l implements Runnable {
    public final int f16339a;
    public final g2 f16340b;

    public l(int i7, g2 g2Var) {
        this.f16339a = i7;
        this.f16340b = g2Var;
    }

    @Override
    public final void run() {
        switch (this.f16339a) {
            case 0:
                this.f16340b.presentFragment(new n6());
                return;
            default:
                n10.m(1, this.f16340b);
                return;
        }
    }
}
