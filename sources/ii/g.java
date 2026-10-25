package ii;

import org.telegram.messenger.MessagesController;
import org.telegram.ui.un;
public final class g implements Runnable {
    public final int f14344a;
    public final o f14345b;
    public final long f14346c;

    public g(o oVar, long j10, int i10) {
        this.f14344a = i10;
        this.f14345b = oVar;
        this.f14346c = j10;
    }

    @Override
    public final void run() {
        switch (this.f14344a) {
            case 0:
                MessagesController.getInstance(r0.currentAccount).unlinkCommunity(this.f14346c, r0.f14392c, new i(this.f14345b, 0));
                return;
            default:
                o oVar = this.f14345b;
                oVar.getClass();
                oVar.presentFragment(un.ba(this.f14346c));
                return;
        }
    }
}
