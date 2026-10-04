package fi;

import org.telegram.messenger.MessagesController;
import org.telegram.ui.yn;
public final class g implements Runnable {
    public final int f9892a;
    public final p f9893b;
    public final long f9894c;

    public g(p pVar, long j3, int i10) {
        this.f9892a = i10;
        this.f9893b = pVar;
        this.f9894c = j3;
    }

    @Override
    public final void run() {
        switch (this.f9892a) {
            case 0:
                MessagesController.getInstance(r0.currentAccount).unlinkCommunity(this.f9894c, r0.f9946b, new i(this.f9893b, 0));
                return;
            default:
                p pVar = this.f9893b;
                pVar.getClass();
                pVar.presentFragment(yn.Q9(this.f9894c));
                return;
        }
    }
}
