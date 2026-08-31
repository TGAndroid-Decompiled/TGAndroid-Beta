package mh;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class f6 implements Runnable {
    public final int f14039a;
    public final t7 f14040b;
    public final TLRPC.TL_payments_paymentResult f14041c;

    public f6(t7 t7Var, TLRPC.TL_payments_paymentResult tL_payments_paymentResult, int i10) {
        this.f14039a = i10;
        this.f14040b = t7Var;
        this.f14041c = tL_payments_paymentResult;
    }

    @Override
    public final void run() {
        switch (this.f14039a) {
            case 0:
                MessagesController.getInstance(this.f14040b.f14828a).processUpdates(this.f14041c.updates, false);
                return;
            case 1:
                MessagesController.getInstance(this.f14040b.f14828a).processUpdates(this.f14041c.updates, false);
                return;
            case 2:
                MessagesController.getInstance(this.f14040b.f14828a).processUpdates(this.f14041c.updates, false);
                return;
            case 3:
                MessagesController.getInstance(this.f14040b.f14828a).processUpdates(this.f14041c.updates, false);
                return;
            default:
                MessagesController.getInstance(this.f14040b.f14828a).processUpdates(this.f14041c.updates, false);
                return;
        }
    }
}
