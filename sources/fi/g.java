package fi;

import org.telegram.messenger.MessagesController;
import org.telegram.ui.eo;
public final class g implements Runnable {
    public final int f9966a;
    public final p f9967b;
    public final long f9968c;

    public g(p pVar, long j3, int i10) {
        this.f9966a = i10;
        this.f9967b = pVar;
        this.f9968c = j3;
    }

    @Override
    public final void run() {
        switch (this.f9966a) {
            case 0:
                MessagesController.getInstance(r0.currentAccount).unlinkCommunity(this.f9968c, r0.f10020b, new i(this.f9967b, 0));
                return;
            default:
                p pVar = this.f9967b;
                pVar.getClass();
                pVar.presentFragment(eo.W9(this.f9968c));
                return;
        }
    }
}
