package ai;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class h4 implements Runnable {
    public final int f1398a;
    public final l7 f1399b;
    public final TLRPC.TL_payments_paymentResult f1400c;

    public h4(l7 l7Var, TLRPC.TL_payments_paymentResult tL_payments_paymentResult, int i10) {
        this.f1398a = i10;
        this.f1399b = l7Var;
        this.f1400c = tL_payments_paymentResult;
    }

    @Override
    public final void run() {
        switch (this.f1398a) {
            case 0:
                MessagesController.getInstance(this.f1399b.currentAccount).lambda$processUpdates$377(this.f1400c.updates, false);
                return;
            default:
                MessagesController.getInstance(this.f1399b.currentAccount).lambda$processUpdates$377(this.f1400c.updates, false);
                return;
        }
    }
}
