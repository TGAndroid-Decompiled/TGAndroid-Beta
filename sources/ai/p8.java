package ai;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class p8 implements Runnable {
    public final int f2005a;
    public final ha f2006b;
    public final TLRPC.TL_payments_paymentResult f2007c;

    public p8(ha haVar, TLRPC.TL_payments_paymentResult tL_payments_paymentResult, int i10) {
        this.f2005a = i10;
        this.f2006b = haVar;
        this.f2007c = tL_payments_paymentResult;
    }

    @Override
    public final void run() {
        switch (this.f2005a) {
            case 0:
                MessagesController.getInstance(this.f2006b.f1413a).lambda$processUpdates$377(this.f2007c.updates, false);
                return;
            case 1:
                MessagesController.getInstance(this.f2006b.f1413a).lambda$processUpdates$377(this.f2007c.updates, false);
                return;
            case 2:
                MessagesController.getInstance(this.f2006b.f1413a).lambda$processUpdates$377(this.f2007c.updates, false);
                return;
            case 3:
                MessagesController.getInstance(this.f2006b.f1413a).lambda$processUpdates$377(this.f2007c.updates, false);
                return;
            default:
                MessagesController.getInstance(this.f2006b.f1413a).lambda$processUpdates$377(this.f2007c.updates, false);
                return;
        }
    }
}
