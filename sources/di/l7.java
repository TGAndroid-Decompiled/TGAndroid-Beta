package di;

import org.telegram.messenger.np;
import org.telegram.tgnet.TLRPC;
public final class l7 implements Runnable {
    public final int f9258a;
    public final y8 f9259b;
    public final TLRPC.TL_payments_paymentResult f9260c;

    public l7(y8 y8Var, TLRPC.TL_payments_paymentResult tL_payments_paymentResult, int i7) {
        this.f9258a = i7;
        this.f9259b = y8Var;
        this.f9260c = tL_payments_paymentResult;
    }

    @Override
    public final void run() {
        switch (this.f9258a) {
            case 0:
                np.u1(this.f9259b.f10048a).V3(this.f9260c.updates, false);
                return;
            case 1:
                np.u1(this.f9259b.f10048a).V3(this.f9260c.updates, false);
                return;
            case 2:
                np.u1(this.f9259b.f10048a).V3(this.f9260c.updates, false);
                return;
            case 3:
                np.u1(this.f9259b.f10048a).V3(this.f9260c.updates, false);
                return;
            default:
                np.u1(this.f9259b.f10048a).V3(this.f9260c.updates, false);
                return;
        }
    }
}
