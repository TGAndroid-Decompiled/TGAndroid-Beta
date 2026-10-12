package gi;

import org.telegram.messenger.MessagesController;
import org.telegram.ui.fo;
public final class g implements Runnable {
    public final int f10180a;
    public final p f10181b;
    public final long f10182c;

    public g(p pVar, long j10, int i10) {
        this.f10180a = i10;
        this.f10181b = pVar;
        this.f10182c = j10;
    }

    @Override
    public final void run() {
        switch (this.f10180a) {
            case 0:
                MessagesController.getInstance(r0.currentAccount).unlinkCommunity(this.f10182c, r0.f10228b, new i(this.f10181b, 0));
                return;
            default:
                p pVar = this.f10181b;
                pVar.getClass();
                pVar.presentFragment(fo.W9(this.f10182c));
                return;
        }
    }
}
