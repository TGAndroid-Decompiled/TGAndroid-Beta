package lh;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class f6 implements Runnable {
    public final int f12427a;
    public final t7 f12428b;
    public final TLRPC.TL_payments_paymentResult f12429c;

    public f6(t7 t7Var, TLRPC.TL_payments_paymentResult tL_payments_paymentResult, int i10) {
        this.f12427a = i10;
        this.f12428b = t7Var;
        this.f12429c = tL_payments_paymentResult;
    }

    @Override
    public final void run() {
        switch (this.f12427a) {
            case 0:
                MessagesController.getInstance(this.f12428b.f13149a).processUpdates(this.f12429c.updates, false);
                return;
            case 1:
                MessagesController.getInstance(this.f12428b.f13149a).processUpdates(this.f12429c.updates, false);
                return;
            case 2:
                MessagesController.getInstance(this.f12428b.f13149a).processUpdates(this.f12429c.updates, false);
                return;
            case 3:
                MessagesController.getInstance(this.f12428b.f13149a).processUpdates(this.f12429c.updates, false);
                return;
            default:
                MessagesController.getInstance(this.f12428b.f13149a).processUpdates(this.f12429c.updates, false);
                return;
        }
    }
}
