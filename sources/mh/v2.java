package mh;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class v2 implements Runnable {
    public final int f14929a;
    public final g5 f14930b;
    public final TLRPC.TL_payments_paymentResult f14931c;

    public v2(g5 g5Var, TLRPC.TL_payments_paymentResult tL_payments_paymentResult, int i10) {
        this.f14929a = i10;
        this.f14930b = g5Var;
        this.f14931c = tL_payments_paymentResult;
    }

    @Override
    public final void run() {
        switch (this.f14929a) {
            case 0:
                MessagesController.getInstance(this.f14930b.currentAccount).processUpdates(this.f14931c.updates, false);
                return;
            default:
                MessagesController.getInstance(this.f14930b.currentAccount).processUpdates(this.f14931c.updates, false);
                return;
        }
    }
}
