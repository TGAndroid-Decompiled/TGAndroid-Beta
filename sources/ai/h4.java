package ai;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class h4 implements Runnable {
    public final int f1422a;
    public final k7 f1423b;
    public final TLRPC.TL_payments_paymentResult f1424c;

    public h4(k7 k7Var, TLRPC.TL_payments_paymentResult tL_payments_paymentResult, int i10) {
        this.f1422a = i10;
        this.f1423b = k7Var;
        this.f1424c = tL_payments_paymentResult;
    }

    @Override
    public final void run() {
        switch (this.f1422a) {
            case 0:
                MessagesController.getInstance(this.f1423b.currentAccount).lambda$processUpdates$377(this.f1424c.updates, false);
                return;
            default:
                MessagesController.getInstance(this.f1423b.currentAccount).lambda$processUpdates$377(this.f1424c.updates, false);
                return;
        }
    }
}
