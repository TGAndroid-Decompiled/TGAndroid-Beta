package lh;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class f6 implements Runnable {
    public final int f12411a;
    public final t7 f12412b;
    public final TLRPC.TL_payments_paymentResult f12413c;

    public f6(t7 t7Var, TLRPC.TL_payments_paymentResult tL_payments_paymentResult, int i10) {
        this.f12411a = i10;
        this.f12412b = t7Var;
        this.f12413c = tL_payments_paymentResult;
    }

    @Override
    public final void run() {
        switch (this.f12411a) {
            case 0:
                MessagesController.getInstance(this.f12412b.f13133a).processUpdates(this.f12413c.updates, false);
                return;
            case 1:
                MessagesController.getInstance(this.f12412b.f13133a).processUpdates(this.f12413c.updates, false);
                return;
            case 2:
                MessagesController.getInstance(this.f12412b.f13133a).processUpdates(this.f12413c.updates, false);
                return;
            case 3:
                MessagesController.getInstance(this.f12412b.f13133a).processUpdates(this.f12413c.updates, false);
                return;
            default:
                MessagesController.getInstance(this.f12412b.f13133a).processUpdates(this.f12413c.updates, false);
                return;
        }
    }
}
