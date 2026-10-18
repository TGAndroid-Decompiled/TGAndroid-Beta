package ai;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class i4 implements Runnable {
    public final int f1477a;
    public final k7 f1478b;
    public final TLRPC.TL_payments_paymentResult f1479c;

    public i4(k7 k7Var, TLRPC.TL_payments_paymentResult tL_payments_paymentResult, int i10) {
        this.f1477a = i10;
        this.f1478b = k7Var;
        this.f1479c = tL_payments_paymentResult;
    }

    @Override
    public final void run() {
        switch (this.f1477a) {
            case 0:
                MessagesController.getInstance(this.f1478b.currentAccount).lambda$processUpdates$377(this.f1479c.updates, false);
                return;
            default:
                MessagesController.getInstance(this.f1478b.currentAccount).lambda$processUpdates$377(this.f1479c.updates, false);
                return;
        }
    }
}
