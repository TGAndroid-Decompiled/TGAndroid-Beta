package hh;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;

public final class h6 implements Runnable {

    public final int f9388a;

    public final u7 f9389b;

    public final TLRPC.TL_payments_paymentResult f9390c;

    public h6(u7 u7Var, TLRPC.TL_payments_paymentResult tL_payments_paymentResult, int i10) {
        this.f9388a = i10;
        this.f9389b = u7Var;
        this.f9390c = tL_payments_paymentResult;
    }

    @Override
    public final void run() {
        switch (this.f9388a) {
            case 0:
                MessagesController.getInstance(this.f9389b.f10151a).processUpdates(this.f9390c.updates, false);
                break;
            case 1:
                MessagesController.getInstance(this.f9389b.f10151a).processUpdates(this.f9390c.updates, false);
                break;
            case 2:
                MessagesController.getInstance(this.f9389b.f10151a).processUpdates(this.f9390c.updates, false);
                break;
            case 3:
                MessagesController.getInstance(this.f9389b.f10151a).processUpdates(this.f9390c.updates, false);
                break;
            default:
                MessagesController.getInstance(this.f9389b.f10151a).processUpdates(this.f9390c.updates, false);
                break;
        }
    }
}
