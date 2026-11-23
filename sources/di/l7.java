package di;

import org.telegram.messenger.mp;
import org.telegram.tgnet.TLRPC;
public final class l7 implements Runnable {
    public final int f9254a;
    public final y8 f9255b;
    public final TLRPC.TL_payments_paymentResult f9256c;

    public l7(y8 y8Var, TLRPC.TL_payments_paymentResult tL_payments_paymentResult, int i7) {
        this.f9254a = i7;
        this.f9255b = y8Var;
        this.f9256c = tL_payments_paymentResult;
    }

    @Override
    public final void run() {
        switch (this.f9254a) {
            case 0:
                mp.u1(this.f9255b.f10046a).V3(this.f9256c.updates, false);
                return;
            case 1:
                mp.u1(this.f9255b.f10046a).V3(this.f9256c.updates, false);
                return;
            case 2:
                mp.u1(this.f9255b.f10046a).V3(this.f9256c.updates, false);
                return;
            case 3:
                mp.u1(this.f9255b.f10046a).V3(this.f9256c.updates, false);
                return;
            default:
                mp.u1(this.f9255b.f10046a).V3(this.f9256c.updates, false);
                return;
        }
    }
}
