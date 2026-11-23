package ii;

import org.telegram.messenger.o10;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.Wallet.n6;
public final class l implements Runnable {
    public final int f16308a;
    public final g2 f16309b;

    public l(int i7, g2 g2Var) {
        this.f16308a = i7;
        this.f16309b = g2Var;
    }

    @Override
    public final void run() {
        switch (this.f16308a) {
            case 0:
                this.f16309b.presentFragment(new n6());
                return;
            default:
                o10.m(1, this.f16309b);
                return;
        }
    }
}
