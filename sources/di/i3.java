package di;

import org.telegram.messenger.np;
import org.telegram.tgnet.TLRPC;
public final class i3 implements Runnable {
    public final int f9033a;
    public final f6 f9034b;
    public final TLRPC.TL_payments_paymentResult f9035c;

    public i3(f6 f6Var, TLRPC.TL_payments_paymentResult tL_payments_paymentResult, int i7) {
        this.f9033a = i7;
        this.f9034b = f6Var;
        this.f9035c = tL_payments_paymentResult;
    }

    @Override
    public final void run() {
        switch (this.f9033a) {
            case 0:
                np.u1(this.f9034b.f30173a).V3(this.f9035c.updates, false);
                return;
            default:
                np.u1(this.f9034b.f30173a).V3(this.f9035c.updates, false);
                return;
        }
    }
}
