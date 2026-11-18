package ii;

import org.telegram.messenger.n10;
import org.telegram.ui.ActionBar.h2;
import org.telegram.ui.Wallet.n6;
public final class l implements Runnable {
    public final int f16314a;
    public final h2 f16315b;

    public l(int i7, h2 h2Var) {
        this.f16314a = i7;
        this.f16315b = h2Var;
    }

    @Override
    public final void run() {
        switch (this.f16314a) {
            case 0:
                this.f16315b.presentFragment(new n6());
                return;
            default:
                n10.m(1, this.f16315b);
                return;
        }
    }
}
