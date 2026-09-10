package ei;

import org.telegram.messenger.MessagesController;
import org.telegram.ui.eo;
public final class g implements Runnable {
    public final int f7549a;
    public final p f7550b;
    public final long f7551c;

    public g(p pVar, long j3, int i10) {
        this.f7549a = i10;
        this.f7550b = pVar;
        this.f7551c = j3;
    }

    @Override
    public final void run() {
        switch (this.f7549a) {
            case 0:
                MessagesController.getInstance(r0.currentAccount).unlinkCommunity(this.f7551c, r0.f7597b, new i(this.f7550b, 0));
                return;
            default:
                p pVar = this.f7550b;
                pVar.getClass();
                pVar.presentFragment(eo.R9(this.f7551c));
                return;
        }
    }
}
