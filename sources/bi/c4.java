package bi;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class c4 implements Runnable {
    public final int f4425a;
    public final h7 f4426b;
    public final TLRPC.TL_payments_paymentResult f4427c;

    public c4(h7 h7Var, TLRPC.TL_payments_paymentResult tL_payments_paymentResult, int i10) {
        this.f4425a = i10;
        this.f4426b = h7Var;
        this.f4427c = tL_payments_paymentResult;
    }

    @Override
    public final void run() {
        switch (this.f4425a) {
            case 0:
                MessagesController.getInstance(this.f4426b.currentAccount).lambda$processUpdates$379(this.f4427c.updates, false);
                return;
            default:
                MessagesController.getInstance(this.f4426b.currentAccount).lambda$processUpdates$379(this.f4427c.updates, false);
                return;
        }
    }
}
