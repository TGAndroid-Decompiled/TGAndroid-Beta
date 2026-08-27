package hh;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;

public final class x2 implements Runnable {

    public final int f10328a;

    public final i5 f10329b;

    public final TLRPC.TL_payments_paymentResult f10330c;

    public x2(i5 i5Var, TLRPC.TL_payments_paymentResult tL_payments_paymentResult, int i10) {
        this.f10328a = i10;
        this.f10329b = i5Var;
        this.f10330c = tL_payments_paymentResult;
    }

    @Override
    public final void run() {
        switch (this.f10328a) {
            case 0:
                MessagesController.getInstance(this.f10329b.currentAccount).processUpdates(this.f10330c.updates, false);
                break;
            default:
                MessagesController.getInstance(this.f10329b.currentAccount).processUpdates(this.f10330c.updates, false);
                break;
        }
    }
}
