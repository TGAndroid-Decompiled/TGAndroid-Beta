package fi;

import org.telegram.messenger.MessagesController;
import org.telegram.ui.bo;
public final class g implements Runnable {
    public final int f9105a;
    public final p f9106b;
    public final long f9107c;

    public g(p pVar, long j3, int i10) {
        this.f9105a = i10;
        this.f9106b = pVar;
        this.f9107c = j3;
    }

    @Override
    public final void run() {
        switch (this.f9105a) {
            case 0:
                MessagesController.getInstance(r0.currentAccount).unlinkCommunity(this.f9107c, r0.f9153b, new i(this.f9106b, 0));
                return;
            default:
                p pVar = this.f9106b;
                pVar.getClass();
                pVar.presentFragment(bo.R9(this.f9107c));
                return;
        }
    }
}
