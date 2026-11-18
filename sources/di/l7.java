package di;

import org.telegram.messenger.mp;
import org.telegram.tgnet.TLRPC;
public final class l7 implements Runnable {
    public final int f9262a;
    public final x8 f9263b;
    public final TLRPC.TL_payments_paymentResult f9264c;

    public l7(x8 x8Var, TLRPC.TL_payments_paymentResult tL_payments_paymentResult, int i7) {
        this.f9262a = i7;
        this.f9263b = x8Var;
        this.f9264c = tL_payments_paymentResult;
    }

    @Override
    public final void run() {
        switch (this.f9262a) {
            case 0:
                mp.u1(this.f9263b.f10018a).V3(this.f9264c.updates, false);
                return;
            case 1:
                mp.u1(this.f9263b.f10018a).V3(this.f9264c.updates, false);
                return;
            case 2:
                mp.u1(this.f9263b.f10018a).V3(this.f9264c.updates, false);
                return;
            case 3:
                mp.u1(this.f9263b.f10018a).V3(this.f9264c.updates, false);
                return;
            default:
                mp.u1(this.f9263b.f10018a).V3(this.f9264c.updates, false);
                return;
        }
    }
}
