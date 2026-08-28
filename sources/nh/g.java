package nh;

import org.telegram.messenger.MessagesController;
import org.telegram.ui.qn;
public final class g implements Runnable {
    public final int f18634a;
    public final o f18635b;
    public final long f18636c;

    public g(o oVar, long j10, int i9) {
        this.f18634a = i9;
        this.f18635b = oVar;
        this.f18636c = j10;
    }

    @Override
    public final void run() {
        switch (this.f18634a) {
            case 0:
                MessagesController.getInstance(r0.currentAccount).unlinkCommunity(this.f18636c, r0.f18683b, new i(this.f18635b, 0));
                return;
            default:
                o oVar = this.f18635b;
                oVar.getClass();
                oVar.presentFragment(qn.R9(this.f18636c));
                return;
        }
    }
}
