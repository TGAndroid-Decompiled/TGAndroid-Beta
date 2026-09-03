package lh;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class w2 implements Runnable {
    public final int f13265a;
    public final g5 f13266b;
    public final TLRPC.TL_payments_paymentResult f13267c;

    public w2(g5 g5Var, TLRPC.TL_payments_paymentResult tL_payments_paymentResult, int i10) {
        this.f13265a = i10;
        this.f13266b = g5Var;
        this.f13267c = tL_payments_paymentResult;
    }

    @Override
    public final void run() {
        switch (this.f13265a) {
            case 0:
                MessagesController.getInstance(this.f13266b.currentAccount).processUpdates(this.f13267c.updates, false);
                return;
            default:
                MessagesController.getInstance(this.f13266b.currentAccount).processUpdates(this.f13267c.updates, false);
                return;
        }
    }
}
