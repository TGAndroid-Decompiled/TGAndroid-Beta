package di;

import org.telegram.messenger.mp;
import org.telegram.tgnet.TLRPC;
public final class l7 implements Runnable {
    public final int f9259a;
    public final x8 f9260b;
    public final TLRPC.TL_payments_paymentResult f9261c;

    public l7(x8 x8Var, TLRPC.TL_payments_paymentResult tL_payments_paymentResult, int i7) {
        this.f9259a = i7;
        this.f9260b = x8Var;
        this.f9261c = tL_payments_paymentResult;
    }

    @Override
    public final void run() {
        switch (this.f9259a) {
            case 0:
                mp.u1(this.f9260b.f10015a).V3(this.f9261c.updates, false);
                return;
            case 1:
                mp.u1(this.f9260b.f10015a).V3(this.f9261c.updates, false);
                return;
            case 2:
                mp.u1(this.f9260b.f10015a).V3(this.f9261c.updates, false);
                return;
            case 3:
                mp.u1(this.f9260b.f10015a).V3(this.f9261c.updates, false);
                return;
            default:
                mp.u1(this.f9260b.f10015a).V3(this.f9261c.updates, false);
                return;
        }
    }
}
