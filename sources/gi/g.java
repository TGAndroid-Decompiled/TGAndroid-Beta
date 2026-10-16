package gi;

import org.telegram.messenger.MessagesController;
import org.telegram.ui.fo;
public final class g implements Runnable {
    public final int f10184a;
    public final p f10185b;
    public final long f10186c;

    public g(p pVar, long j10, int i10) {
        this.f10184a = i10;
        this.f10185b = pVar;
        this.f10186c = j10;
    }

    @Override
    public final void run() {
        switch (this.f10184a) {
            case 0:
                MessagesController.getInstance(r0.currentAccount).unlinkCommunity(this.f10186c, r0.f10232b, new i(this.f10185b, 0));
                return;
            default:
                p pVar = this.f10185b;
                pVar.getClass();
                pVar.presentFragment(fo.W9(this.f10186c));
                return;
        }
    }
}
