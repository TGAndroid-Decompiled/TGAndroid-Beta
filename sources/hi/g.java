package hi;

import org.telegram.messenger.MessagesController;
import org.telegram.ui.qn;
public final class g implements Runnable {
    public final int f12150a;
    public final o f12151b;
    public final long f12152c;

    public g(o oVar, long j10, int i10) {
        this.f12150a = i10;
        this.f12151b = oVar;
        this.f12152c = j10;
    }

    @Override
    public final void run() {
        switch (this.f12150a) {
            case 0:
                MessagesController.getInstance(r0.currentAccount).unlinkCommunity(this.f12152c, r0.f12194b, new i(this.f12151b, 0));
                return;
            default:
                o oVar = this.f12151b;
                oVar.getClass();
                oVar.presentFragment(qn.W9(this.f12152c));
                return;
        }
    }
}
