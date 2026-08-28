package gh;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class x2 implements Runnable {
    public final int f9141a;
    public final k5 f9142b;
    public final TLRPC.TL_payments_paymentResult f9143c;

    public x2(k5 k5Var, TLRPC.TL_payments_paymentResult tL_payments_paymentResult, int i9) {
        this.f9141a = i9;
        this.f9142b = k5Var;
        this.f9143c = tL_payments_paymentResult;
    }

    @Override
    public final void run() {
        switch (this.f9141a) {
            case 0:
                MessagesController.getInstance(this.f9142b.currentAccount).processUpdates(this.f9143c.updates, false);
                return;
            default:
                MessagesController.getInstance(this.f9142b.currentAccount).processUpdates(this.f9143c.updates, false);
                return;
        }
    }
}
