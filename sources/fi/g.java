package fi;

import org.telegram.messenger.MessagesController;
import org.telegram.ui.zn;
public final class g implements Runnable {
    public final int f9968a;
    public final p f9969b;
    public final long f9970c;

    public g(p pVar, long j3, int i10) {
        this.f9968a = i10;
        this.f9969b = pVar;
        this.f9970c = j3;
    }

    @Override
    public final void run() {
        switch (this.f9968a) {
            case 0:
                MessagesController.getInstance(r0.currentAccount).unlinkCommunity(this.f9970c, r0.f10022b, new i(this.f9969b, 0));
                return;
            default:
                p pVar = this.f9969b;
                pVar.getClass();
                pVar.presentFragment(zn.W9(this.f9970c));
                return;
        }
    }
}
