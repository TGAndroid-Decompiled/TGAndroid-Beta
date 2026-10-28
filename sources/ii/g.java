package ii;

import org.telegram.messenger.MessagesController;
import org.telegram.ui.wn;
public final class g implements Runnable {
    public final int f14343a;
    public final o f14344b;
    public final long f14345c;

    public g(o oVar, long j10, int i10) {
        this.f14343a = i10;
        this.f14344b = oVar;
        this.f14345c = j10;
    }

    @Override
    public final void run() {
        switch (this.f14343a) {
            case 0:
                MessagesController.getInstance(r0.currentAccount).unlinkCommunity(this.f14345c, r0.f14391c, new i(this.f14344b, 0));
                return;
            default:
                o oVar = this.f14344b;
                oVar.getClass();
                oVar.presentFragment(wn.ea(this.f14345c));
                return;
        }
    }
}
