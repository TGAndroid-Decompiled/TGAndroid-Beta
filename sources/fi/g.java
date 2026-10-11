package fi;

import org.telegram.messenger.MessagesController;
import org.telegram.ui.zn;
public final class g implements Runnable {
    public final int f9967a;
    public final p f9968b;
    public final long f9969c;

    public g(p pVar, long j3, int i10) {
        this.f9967a = i10;
        this.f9968b = pVar;
        this.f9969c = j3;
    }

    @Override
    public final void run() {
        switch (this.f9967a) {
            case 0:
                MessagesController.getInstance(r0.currentAccount).unlinkCommunity(this.f9969c, r0.f10021b, new i(this.f9968b, 0));
                return;
            default:
                p pVar = this.f9968b;
                pVar.getClass();
                pVar.presentFragment(zn.W9(this.f9969c));
                return;
        }
    }
}
