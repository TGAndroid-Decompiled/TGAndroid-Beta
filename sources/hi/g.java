package hi;

import org.telegram.messenger.MessagesController;
import org.telegram.ui.sn;
public final class g implements Runnable {
    public final int f12149a;
    public final o f12150b;
    public final long f12151c;

    public g(o oVar, long j10, int i10) {
        this.f12149a = i10;
        this.f12150b = oVar;
        this.f12151c = j10;
    }

    @Override
    public final void run() {
        switch (this.f12149a) {
            case 0:
                MessagesController.getInstance(r0.currentAccount).unlinkCommunity(this.f12151c, r0.f12193b, new i(this.f12150b, 0));
                return;
            default:
                o oVar = this.f12150b;
                oVar.getClass();
                oVar.presentFragment(sn.W9(this.f12151c));
                return;
        }
    }
}
