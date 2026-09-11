package gi;

import org.telegram.messenger.MessagesController;
import org.telegram.ui.co;
public final class g implements Runnable {
    public final int f10687a;
    public final p f10688b;
    public final long f10689c;

    public g(p pVar, long j3, int i10) {
        this.f10687a = i10;
        this.f10688b = pVar;
        this.f10689c = j3;
    }

    @Override
    public final void run() {
        switch (this.f10687a) {
            case 0:
                MessagesController.getInstance(r0.currentAccount).unlinkCommunity(this.f10689c, r0.f10741b, new i(this.f10688b, 0));
                return;
            default:
                p pVar = this.f10688b;
                pVar.getClass();
                pVar.presentFragment(co.R9(this.f10689c));
                return;
        }
    }
}
