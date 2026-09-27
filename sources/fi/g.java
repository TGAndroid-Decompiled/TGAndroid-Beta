package fi;

import org.telegram.messenger.MessagesController;
import org.telegram.ui.xn;
public final class g implements Runnable {
    public final int f9092a;
    public final p f9093b;
    public final long f9094c;

    public g(p pVar, long j3, int i10) {
        this.f9092a = i10;
        this.f9093b = pVar;
        this.f9094c = j3;
    }

    @Override
    public final void run() {
        switch (this.f9092a) {
            case 0:
                MessagesController.getInstance(r0.currentAccount).unlinkCommunity(this.f9094c, r0.f9140b, new i(this.f9093b, 0));
                return;
            default:
                p pVar = this.f9093b;
                pVar.getClass();
                pVar.presentFragment(xn.R9(this.f9094c));
                return;
        }
    }
}
