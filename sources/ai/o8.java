package ai;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class o8 implements Runnable {
    public final int f1955a;
    public final ga f1956b;
    public final TLRPC.TL_payments_paymentResult f1957c;

    public o8(ga gaVar, TLRPC.TL_payments_paymentResult tL_payments_paymentResult, int i10) {
        this.f1955a = i10;
        this.f1956b = gaVar;
        this.f1957c = tL_payments_paymentResult;
    }

    @Override
    public final void run() {
        switch (this.f1955a) {
            case 0:
                MessagesController.getInstance(this.f1956b.f1352a).lambda$processUpdates$377(this.f1957c.updates, false);
                return;
            case 1:
                MessagesController.getInstance(this.f1956b.f1352a).lambda$processUpdates$377(this.f1957c.updates, false);
                return;
            case 2:
                MessagesController.getInstance(this.f1956b.f1352a).lambda$processUpdates$377(this.f1957c.updates, false);
                return;
            case 3:
                MessagesController.getInstance(this.f1956b.f1352a).lambda$processUpdates$377(this.f1957c.updates, false);
                return;
            default:
                MessagesController.getInstance(this.f1956b.f1352a).lambda$processUpdates$377(this.f1957c.updates, false);
                return;
        }
    }
}
