package ii;

import org.telegram.messenger.o10;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.Wallet.n6;
public final class l implements Runnable {
    public final int f16342a;
    public final g2 f16343b;

    public l(int i7, g2 g2Var) {
        this.f16342a = i7;
        this.f16343b = g2Var;
    }

    @Override
    public final void run() {
        switch (this.f16342a) {
            case 0:
                this.f16343b.presentFragment(new n6());
                return;
            default:
                o10.m(1, this.f16343b);
                return;
        }
    }
}
