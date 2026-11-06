package bi;

import org.telegram.messenger.qp;
import org.telegram.tgnet.TLRPC;
public final class p8 implements Runnable {
    public final int f4529a;
    public final ea f4530b;
    public final TLRPC.TL_payments_paymentResult f4531c;

    public p8(ea eaVar, TLRPC.TL_payments_paymentResult tL_payments_paymentResult, int i7) {
        this.f4529a = i7;
        this.f4530b = eaVar;
        this.f4531c = tL_payments_paymentResult;
    }

    @Override
    public final void run() {
        switch (this.f4529a) {
            case 0:
                qp.s1(this.f4530b.f3807a).O3(this.f4531c.updates, false);
                return;
            case 1:
                qp.s1(this.f4530b.f3807a).O3(this.f4531c.updates, false);
                return;
            case 2:
                qp.s1(this.f4530b.f3807a).O3(this.f4531c.updates, false);
                return;
            case 3:
                qp.s1(this.f4530b.f3807a).O3(this.f4531c.updates, false);
                return;
            default:
                qp.s1(this.f4530b.f3807a).O3(this.f4531c.updates, false);
                return;
        }
    }
}
