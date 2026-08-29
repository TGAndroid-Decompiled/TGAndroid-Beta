package jh;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class v2 implements Runnable {
    public final int f12944a;
    public final h5 f12945b;
    public final TLRPC.TL_payments_paymentResult f12946c;

    public v2(h5 h5Var, TLRPC.TL_payments_paymentResult tL_payments_paymentResult, int i10) {
        this.f12944a = i10;
        this.f12945b = h5Var;
        this.f12946c = tL_payments_paymentResult;
    }

    @Override
    public final void run() {
        switch (this.f12944a) {
            case 0:
                MessagesController.getInstance(this.f12945b.currentAccount).processUpdates(this.f12946c.updates, false);
                return;
            default:
                MessagesController.getInstance(this.f12945b.currentAccount).processUpdates(this.f12946c.updates, false);
                return;
        }
    }
}
