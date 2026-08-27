package oh;

import org.telegram.messenger.MessagesController;
import org.telegram.ui.rn;

public final class g implements Runnable {

    public final int f19483a;

    public final o f19484b;

    public final long f19485c;

    public g(o oVar, long j10, int i10) {
        this.f19483a = i10;
        this.f19484b = oVar;
        this.f19485c = j10;
    }

    @Override
    public final void run() {
        switch (this.f19483a) {
            case 0:
                o oVar = this.f19484b;
                MessagesController.getInstance(oVar.currentAccount).unlinkCommunity(this.f19485c, oVar.f19532b, new i(oVar, 0));
                break;
            default:
                o oVar2 = this.f19484b;
                oVar2.getClass();
                oVar2.presentFragment(rn.R9(this.f19485c));
                break;
        }
    }
}
