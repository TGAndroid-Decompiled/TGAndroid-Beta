package ai;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class e4 implements Runnable {
    public final int f1203a;
    public final k7 f1204b;
    public final TLRPC.TL_payments_paymentResult f1205c;

    public e4(k7 k7Var, TLRPC.TL_payments_paymentResult tL_payments_paymentResult, int i10) {
        this.f1203a = i10;
        this.f1204b = k7Var;
        this.f1205c = tL_payments_paymentResult;
    }

    @Override
    public final void run() {
        switch (this.f1203a) {
            case 0:
                MessagesController.getInstance(this.f1204b.currentAccount).lambda$processUpdates$377(this.f1205c.updates, false);
                return;
            default:
                MessagesController.getInstance(this.f1204b.currentAccount).lambda$processUpdates$377(this.f1205c.updates, false);
                return;
        }
    }
}
