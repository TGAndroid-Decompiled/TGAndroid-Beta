package di;

import org.telegram.messenger.mp;
import org.telegram.tgnet.TLRPC;
public final class i3 implements Runnable {
    public final int f9003a;
    public final f6 f9004b;
    public final TLRPC.TL_payments_paymentResult f9005c;

    public i3(f6 f6Var, TLRPC.TL_payments_paymentResult tL_payments_paymentResult, int i7) {
        this.f9003a = i7;
        this.f9004b = f6Var;
        this.f9005c = tL_payments_paymentResult;
    }

    @Override
    public final void run() {
        switch (this.f9003a) {
            case 0:
                mp.u1(this.f9004b.f30187a).V3(this.f9005c.updates, false);
                return;
            default:
                mp.u1(this.f9004b.f30187a).V3(this.f9005c.updates, false);
                return;
        }
    }
}
