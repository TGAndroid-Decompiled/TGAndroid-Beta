package hi;

import org.telegram.messenger.MessagesController;
import org.telegram.ui.sn;
public final class g implements Runnable {
    public final int f12179a;
    public final o f12180b;
    public final long f12181c;

    public g(o oVar, long j10, int i10) {
        this.f12179a = i10;
        this.f12180b = oVar;
        this.f12181c = j10;
    }

    @Override
    public final void run() {
        switch (this.f12179a) {
            case 0:
                MessagesController.getInstance(r0.currentAccount).unlinkCommunity(this.f12181c, r0.f12224c, new i(this.f12180b, 0));
                return;
            default:
                o oVar = this.f12180b;
                oVar.getClass();
                oVar.presentFragment(sn.W9(this.f12181c));
                return;
        }
    }
}
