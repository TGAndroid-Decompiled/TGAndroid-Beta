package bi;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class l8 implements Runnable {
    public final int f5031a;
    public final ca f5032b;
    public final TLRPC.TL_payments_paymentResult f5033c;

    public l8(ca caVar, TLRPC.TL_payments_paymentResult tL_payments_paymentResult, int i10) {
        this.f5031a = i10;
        this.f5032b = caVar;
        this.f5033c = tL_payments_paymentResult;
    }

    @Override
    public final void run() {
        switch (this.f5031a) {
            case 0:
                MessagesController.getInstance(this.f5032b.f4441a).lambda$processUpdates$379(this.f5033c.updates, false);
                return;
            case 1:
                MessagesController.getInstance(this.f5032b.f4441a).lambda$processUpdates$379(this.f5033c.updates, false);
                return;
            case 2:
                MessagesController.getInstance(this.f5032b.f4441a).lambda$processUpdates$379(this.f5033c.updates, false);
                return;
            case 3:
                MessagesController.getInstance(this.f5032b.f4441a).lambda$processUpdates$379(this.f5033c.updates, false);
                return;
            default:
                MessagesController.getInstance(this.f5032b.f4441a).lambda$processUpdates$379(this.f5033c.updates, false);
                return;
        }
    }
}
