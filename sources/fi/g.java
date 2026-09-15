package fi;

import org.telegram.messenger.MessagesController;
import org.telegram.ui.bo;
public final class g implements Runnable {
    public final int f9100a;
    public final p f9101b;
    public final long f9102c;

    public g(p pVar, long j3, int i10) {
        this.f9100a = i10;
        this.f9101b = pVar;
        this.f9102c = j3;
    }

    @Override
    public final void run() {
        switch (this.f9100a) {
            case 0:
                MessagesController.getInstance(r0.currentAccount).unlinkCommunity(this.f9102c, r0.f9148b, new i(this.f9101b, 0));
                return;
            default:
                p pVar = this.f9101b;
                pVar.getClass();
                pVar.presentFragment(bo.R9(this.f9102c));
                return;
        }
    }
}
