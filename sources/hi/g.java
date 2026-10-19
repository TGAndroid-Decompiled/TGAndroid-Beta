package hi;

import org.telegram.messenger.MessagesController;
import org.telegram.ui.qn;
public final class g implements Runnable {
    public final int f12148a;
    public final o f12149b;
    public final long f12150c;

    public g(o oVar, long j10, int i10) {
        this.f12148a = i10;
        this.f12149b = oVar;
        this.f12150c = j10;
    }

    @Override
    public final void run() {
        switch (this.f12148a) {
            case 0:
                MessagesController.getInstance(r0.currentAccount).unlinkCommunity(this.f12150c, r0.f12192b, new i(this.f12149b, 0));
                return;
            default:
                o oVar = this.f12149b;
                oVar.getClass();
                oVar.presentFragment(qn.W9(this.f12150c));
                return;
        }
    }
}
