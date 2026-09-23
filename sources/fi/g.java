package fi;

import org.telegram.messenger.MessagesController;
import org.telegram.ui.xn;
public final class g implements Runnable {
    public final int f9088a;
    public final p f9089b;
    public final long f9090c;

    public g(p pVar, long j3, int i10) {
        this.f9088a = i10;
        this.f9089b = pVar;
        this.f9090c = j3;
    }

    @Override
    public final void run() {
        switch (this.f9088a) {
            case 0:
                MessagesController.getInstance(r0.currentAccount).unlinkCommunity(this.f9090c, r0.f9136b, new i(this.f9089b, 0));
                return;
            default:
                p pVar = this.f9089b;
                pVar.getClass();
                pVar.presentFragment(xn.R9(this.f9090c));
                return;
        }
    }
}
