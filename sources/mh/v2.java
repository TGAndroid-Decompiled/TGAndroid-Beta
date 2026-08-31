package mh;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class v2 implements Runnable {
    public final int f14927a;
    public final g5 f14928b;
    public final TLRPC.TL_payments_paymentResult f14929c;

    public v2(g5 g5Var, TLRPC.TL_payments_paymentResult tL_payments_paymentResult, int i10) {
        this.f14927a = i10;
        this.f14928b = g5Var;
        this.f14929c = tL_payments_paymentResult;
    }

    @Override
    public final void run() {
        switch (this.f14927a) {
            case 0:
                MessagesController.getInstance(this.f14928b.currentAccount).processUpdates(this.f14929c.updates, false);
                return;
            default:
                MessagesController.getInstance(this.f14928b.currentAccount).processUpdates(this.f14929c.updates, false);
                return;
        }
    }
}
