package gh;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class i6 implements Runnable {
    public final int f8299a;
    public final v7 f8300b;
    public final TLRPC.TL_payments_paymentResult f8301c;

    public i6(v7 v7Var, TLRPC.TL_payments_paymentResult tL_payments_paymentResult, int i9) {
        this.f8299a = i9;
        this.f8300b = v7Var;
        this.f8301c = tL_payments_paymentResult;
    }

    @Override
    public final void run() {
        switch (this.f8299a) {
            case 0:
                MessagesController.getInstance(this.f8300b.f9045a).processUpdates(this.f8301c.updates, false);
                return;
            case 1:
                MessagesController.getInstance(this.f8300b.f9045a).processUpdates(this.f8301c.updates, false);
                return;
            case 2:
                MessagesController.getInstance(this.f8300b.f9045a).processUpdates(this.f8301c.updates, false);
                return;
            case 3:
                MessagesController.getInstance(this.f8300b.f9045a).processUpdates(this.f8301c.updates, false);
                return;
            default:
                MessagesController.getInstance(this.f8300b.f9045a).processUpdates(this.f8301c.updates, false);
                return;
        }
    }
}
