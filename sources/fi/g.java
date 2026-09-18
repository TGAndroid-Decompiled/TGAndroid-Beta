package fi;

import org.telegram.messenger.MessagesController;
import org.telegram.ui.zn;
public final class g implements Runnable {
    public final int f9104a;
    public final p f9105b;
    public final long f9106c;

    public g(p pVar, long j3, int i10) {
        this.f9104a = i10;
        this.f9105b = pVar;
        this.f9106c = j3;
    }

    @Override
    public final void run() {
        switch (this.f9104a) {
            case 0:
                MessagesController.getInstance(r0.currentAccount).unlinkCommunity(this.f9106c, r0.f9152b, new i(this.f9105b, 0));
                return;
            default:
                p pVar = this.f9105b;
                pVar.getClass();
                pVar.presentFragment(zn.R9(this.f9106c));
                return;
        }
    }
}
