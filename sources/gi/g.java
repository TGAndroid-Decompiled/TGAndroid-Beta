package gi;

import org.telegram.messenger.MessagesController;
import org.telegram.ui.co;
public final class g implements Runnable {
    public final int f10715a;
    public final p f10716b;
    public final long f10717c;

    public g(p pVar, long j3, int i10) {
        this.f10715a = i10;
        this.f10716b = pVar;
        this.f10717c = j3;
    }

    @Override
    public final void run() {
        switch (this.f10715a) {
            case 0:
                MessagesController.getInstance(r0.currentAccount).unlinkCommunity(this.f10717c, r0.f10769b, new i(this.f10716b, 0));
                return;
            default:
                p pVar = this.f10716b;
                pVar.getClass();
                pVar.presentFragment(co.R9(this.f10717c));
                return;
        }
    }
}
