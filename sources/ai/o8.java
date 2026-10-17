package ai;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class o8 implements Runnable {
    public final int f1962a;
    public final fa f1963b;
    public final TLRPC.TL_payments_paymentResult f1964c;

    public o8(fa faVar, TLRPC.TL_payments_paymentResult tL_payments_paymentResult, int i10) {
        this.f1962a = i10;
        this.f1963b = faVar;
        this.f1964c = tL_payments_paymentResult;
    }

    @Override
    public final void run() {
        switch (this.f1962a) {
            case 0:
                MessagesController.getInstance(this.f1963b.f1311a).lambda$processUpdates$377(this.f1964c.updates, false);
                return;
            case 1:
                MessagesController.getInstance(this.f1963b.f1311a).lambda$processUpdates$377(this.f1964c.updates, false);
                return;
            case 2:
                MessagesController.getInstance(this.f1963b.f1311a).lambda$processUpdates$377(this.f1964c.updates, false);
                return;
            case 3:
                MessagesController.getInstance(this.f1963b.f1311a).lambda$processUpdates$377(this.f1964c.updates, false);
                return;
            default:
                MessagesController.getInstance(this.f1963b.f1311a).lambda$processUpdates$377(this.f1964c.updates, false);
                return;
        }
    }
}
