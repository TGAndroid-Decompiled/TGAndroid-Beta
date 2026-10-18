package ai;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class k4 implements Runnable {
    public final int f1625a;
    public final k7 f1626b;
    public final TLRPC.TL_payments_paymentResult f1627c;

    public k4(k7 k7Var, TLRPC.TL_payments_paymentResult tL_payments_paymentResult, int i10) {
        this.f1625a = i10;
        this.f1626b = k7Var;
        this.f1627c = tL_payments_paymentResult;
    }

    @Override
    public final void run() {
        switch (this.f1625a) {
            case 0:
                MessagesController.getInstance(this.f1626b.currentAccount).lambda$processUpdates$377(this.f1627c.updates, false);
                return;
            default:
                MessagesController.getInstance(this.f1626b.currentAccount).lambda$processUpdates$377(this.f1627c.updates, false);
                return;
        }
    }
}
