package fi;

import org.telegram.messenger.MessagesController;
import org.telegram.ui.bo;
public final class g implements Runnable {
    public final int f9102a;
    public final p f9103b;
    public final long f9104c;

    public g(p pVar, long j3, int i10) {
        this.f9102a = i10;
        this.f9103b = pVar;
        this.f9104c = j3;
    }

    @Override
    public final void run() {
        switch (this.f9102a) {
            case 0:
                MessagesController.getInstance(r0.currentAccount).unlinkCommunity(this.f9104c, r0.f9150b, new i(this.f9103b, 0));
                return;
            default:
                p pVar = this.f9103b;
                pVar.getClass();
                pVar.presentFragment(bo.R9(this.f9104c));
                return;
        }
    }
}
