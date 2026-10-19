package ai;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class p8 implements Runnable {
    public final int f2014a;
    public final ga f2015b;
    public final TLRPC.TL_payments_paymentResult f2016c;

    public p8(ga gaVar, TLRPC.TL_payments_paymentResult tL_payments_paymentResult, int i10) {
        this.f2014a = i10;
        this.f2015b = gaVar;
        this.f2016c = tL_payments_paymentResult;
    }

    @Override
    public final void run() {
        switch (this.f2014a) {
            case 0:
                MessagesController.getInstance(this.f2015b.f1363a).lambda$processUpdates$377(this.f2016c.updates, false);
                return;
            case 1:
                MessagesController.getInstance(this.f2015b.f1363a).lambda$processUpdates$377(this.f2016c.updates, false);
                return;
            case 2:
                MessagesController.getInstance(this.f2015b.f1363a).lambda$processUpdates$377(this.f2016c.updates, false);
                return;
            case 3:
                MessagesController.getInstance(this.f2015b.f1363a).lambda$processUpdates$377(this.f2016c.updates, false);
                return;
            default:
                MessagesController.getInstance(this.f2015b.f1363a).lambda$processUpdates$377(this.f2016c.updates, false);
                return;
        }
    }
}
