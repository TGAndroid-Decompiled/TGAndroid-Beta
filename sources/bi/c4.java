package bi;

import org.telegram.messenger.qp;
import org.telegram.tgnet.TLRPC;
public final class c4 implements Runnable {
    public final int f3564a;
    public final k7 f3565b;
    public final TLRPC.TL_payments_paymentResult f3566c;

    public c4(k7 k7Var, TLRPC.TL_payments_paymentResult tL_payments_paymentResult, int i7) {
        this.f3564a = i7;
        this.f3565b = k7Var;
        this.f3566c = tL_payments_paymentResult;
    }

    @Override
    public final void run() {
        switch (this.f3564a) {
            case 0:
                qp.s1(this.f3565b.f28621a).O3(this.f3566c.updates, false);
                return;
            default:
                qp.s1(this.f3565b.f28621a).O3(this.f3566c.updates, false);
                return;
        }
    }
}
