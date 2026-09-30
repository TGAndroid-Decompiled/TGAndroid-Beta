package fi;

import org.telegram.messenger.MessagesController;
import org.telegram.ui.wn;
public final class g implements Runnable {
    public final int f9099a;
    public final p f9100b;
    public final long f9101c;

    public g(p pVar, long j3, int i10) {
        this.f9099a = i10;
        this.f9100b = pVar;
        this.f9101c = j3;
    }

    @Override
    public final void run() {
        switch (this.f9099a) {
            case 0:
                MessagesController.getInstance(r0.currentAccount).unlinkCommunity(this.f9101c, r0.f9147b, new i(this.f9100b, 0));
                return;
            default:
                p pVar = this.f9100b;
                pVar.getClass();
                pVar.presentFragment(wn.R9(this.f9101c));
                return;
        }
    }
}
