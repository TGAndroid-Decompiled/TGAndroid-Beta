package fi;

import org.telegram.messenger.MessagesController;
import org.telegram.ui.wn;
public final class g implements Runnable {
    public final int f9087a;
    public final p f9088b;
    public final long f9089c;

    public g(p pVar, long j3, int i10) {
        this.f9087a = i10;
        this.f9088b = pVar;
        this.f9089c = j3;
    }

    @Override
    public final void run() {
        switch (this.f9087a) {
            case 0:
                MessagesController.getInstance(r0.currentAccount).unlinkCommunity(this.f9089c, r0.f9135b, new i(this.f9088b, 0));
                return;
            default:
                p pVar = this.f9088b;
                pVar.getClass();
                pVar.presentFragment(wn.R9(this.f9089c));
                return;
        }
    }
}
