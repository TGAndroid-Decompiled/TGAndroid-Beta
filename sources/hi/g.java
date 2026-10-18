package hi;

import org.telegram.messenger.MessagesController;
import org.telegram.ui.sn;
public final class g implements Runnable {
    public final int f12151a;
    public final o f12152b;
    public final long f12153c;

    public g(o oVar, long j10, int i10) {
        this.f12151a = i10;
        this.f12152b = oVar;
        this.f12153c = j10;
    }

    @Override
    public final void run() {
        switch (this.f12151a) {
            case 0:
                MessagesController.getInstance(r0.currentAccount).unlinkCommunity(this.f12153c, r0.f12195b, new i(this.f12152b, 0));
                return;
            default:
                o oVar = this.f12152b;
                oVar.getClass();
                oVar.presentFragment(sn.W9(this.f12153c));
                return;
        }
    }
}
