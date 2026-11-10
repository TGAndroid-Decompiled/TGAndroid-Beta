package bi;

import org.telegram.messenger.qp;
import org.telegram.tgnet.TLRPC;
public final class c4 implements Runnable {
    public final int f3567a;
    public final k7 f3568b;
    public final TLRPC.TL_payments_paymentResult f3569c;

    public c4(k7 k7Var, TLRPC.TL_payments_paymentResult tL_payments_paymentResult, int i7) {
        this.f3567a = i7;
        this.f3568b = k7Var;
        this.f3569c = tL_payments_paymentResult;
    }

    @Override
    public final void run() {
        switch (this.f3567a) {
            case 0:
                qp.s1(this.f3568b.f28669a).O3(this.f3569c.updates, false);
                return;
            default:
                qp.s1(this.f3568b.f28669a).O3(this.f3569c.updates, false);
                return;
        }
    }
}
