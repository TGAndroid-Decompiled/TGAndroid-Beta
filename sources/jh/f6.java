package jh;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class f6 implements Runnable {
    public final int f12064a;
    public final s7 f12065b;
    public final TLRPC.TL_payments_paymentResult f12066c;

    public f6(s7 s7Var, TLRPC.TL_payments_paymentResult tL_payments_paymentResult, int i10) {
        this.f12064a = i10;
        this.f12065b = s7Var;
        this.f12066c = tL_payments_paymentResult;
    }

    @Override
    public final void run() {
        switch (this.f12064a) {
            case 0:
                MessagesController.getInstance(this.f12065b.f12787a).processUpdates(this.f12066c.updates, false);
                return;
            case 1:
                MessagesController.getInstance(this.f12065b.f12787a).processUpdates(this.f12066c.updates, false);
                return;
            case 2:
                MessagesController.getInstance(this.f12065b.f12787a).processUpdates(this.f12066c.updates, false);
                return;
            case 3:
                MessagesController.getInstance(this.f12065b.f12787a).processUpdates(this.f12066c.updates, false);
                return;
            default:
                MessagesController.getInstance(this.f12065b.f12787a).processUpdates(this.f12066c.updates, false);
                return;
        }
    }
}
