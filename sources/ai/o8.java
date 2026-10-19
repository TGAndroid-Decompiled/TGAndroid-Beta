package ai;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class o8 implements Runnable {
    public final int f1952a;
    public final ga f1953b;
    public final TLRPC.TL_payments_paymentResult f1954c;

    public o8(ga gaVar, TLRPC.TL_payments_paymentResult tL_payments_paymentResult, int i10) {
        this.f1952a = i10;
        this.f1953b = gaVar;
        this.f1954c = tL_payments_paymentResult;
    }

    @Override
    public final void run() {
        switch (this.f1952a) {
            case 0:
                MessagesController.getInstance(this.f1953b.f1348a).lambda$processUpdates$377(this.f1954c.updates, false);
                return;
            case 1:
                MessagesController.getInstance(this.f1953b.f1348a).lambda$processUpdates$377(this.f1954c.updates, false);
                return;
            case 2:
                MessagesController.getInstance(this.f1953b.f1348a).lambda$processUpdates$377(this.f1954c.updates, false);
                return;
            case 3:
                MessagesController.getInstance(this.f1953b.f1348a).lambda$processUpdates$377(this.f1954c.updates, false);
                return;
            default:
                MessagesController.getInstance(this.f1953b.f1348a).lambda$processUpdates$377(this.f1954c.updates, false);
                return;
        }
    }
}
