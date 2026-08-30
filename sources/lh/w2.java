package lh;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class w2 implements Runnable {
    public final int f13281a;
    public final g5 f13282b;
    public final TLRPC.TL_payments_paymentResult f13283c;

    public w2(g5 g5Var, TLRPC.TL_payments_paymentResult tL_payments_paymentResult, int i10) {
        this.f13281a = i10;
        this.f13282b = g5Var;
        this.f13283c = tL_payments_paymentResult;
    }

    @Override
    public final void run() {
        switch (this.f13281a) {
            case 0:
                MessagesController.getInstance(this.f13282b.currentAccount).processUpdates(this.f13283c.updates, false);
                return;
            default:
                MessagesController.getInstance(this.f13282b.currentAccount).processUpdates(this.f13283c.updates, false);
                return;
        }
    }
}
