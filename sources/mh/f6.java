package mh;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class f6 implements Runnable {
    public final int f14041a;
    public final t7 f14042b;
    public final TLRPC.TL_payments_paymentResult f14043c;

    public f6(t7 t7Var, TLRPC.TL_payments_paymentResult tL_payments_paymentResult, int i10) {
        this.f14041a = i10;
        this.f14042b = t7Var;
        this.f14043c = tL_payments_paymentResult;
    }

    @Override
    public final void run() {
        switch (this.f14041a) {
            case 0:
                MessagesController.getInstance(this.f14042b.f14830a).processUpdates(this.f14043c.updates, false);
                return;
            case 1:
                MessagesController.getInstance(this.f14042b.f14830a).processUpdates(this.f14043c.updates, false);
                return;
            case 2:
                MessagesController.getInstance(this.f14042b.f14830a).processUpdates(this.f14043c.updates, false);
                return;
            case 3:
                MessagesController.getInstance(this.f14042b.f14830a).processUpdates(this.f14043c.updates, false);
                return;
            default:
                MessagesController.getInstance(this.f14042b.f14830a).processUpdates(this.f14043c.updates, false);
                return;
        }
    }
}
