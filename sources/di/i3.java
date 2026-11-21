package di;

import org.telegram.messenger.mp;
import org.telegram.tgnet.TLRPC;
public final class i3 implements Runnable {
    public final int f9030a;
    public final f6 f9031b;
    public final TLRPC.TL_payments_paymentResult f9032c;

    public i3(f6 f6Var, TLRPC.TL_payments_paymentResult tL_payments_paymentResult, int i7) {
        this.f9030a = i7;
        this.f9031b = f6Var;
        this.f9032c = tL_payments_paymentResult;
    }

    @Override
    public final void run() {
        switch (this.f9030a) {
            case 0:
                mp.u1(this.f9031b.f30170a).V3(this.f9032c.updates, false);
                return;
            default:
                mp.u1(this.f9031b.f30170a).V3(this.f9032c.updates, false);
                return;
        }
    }
}
