package di;

import org.telegram.messenger.np;
import org.telegram.tgnet.TLRPC;
public final class i7 implements Runnable {
    public final int f8806a;
    public final v8 f8807b;
    public final TLRPC.TL_payments_paymentResult f8808c;

    public i7(v8 v8Var, TLRPC.TL_payments_paymentResult tL_payments_paymentResult, int i7) {
        this.f8806a = i7;
        this.f8807b = v8Var;
        this.f8808c = tL_payments_paymentResult;
    }

    @Override
    public final void run() {
        switch (this.f8806a) {
            case 0:
                np.s1(this.f8807b.f9598a).O3(this.f8808c.updates, false);
                return;
            case 1:
                np.s1(this.f8807b.f9598a).O3(this.f8808c.updates, false);
                return;
            case 2:
                np.s1(this.f8807b.f9598a).O3(this.f8808c.updates, false);
                return;
            case 3:
                np.s1(this.f8807b.f9598a).O3(this.f8808c.updates, false);
                return;
            default:
                np.s1(this.f8807b.f9598a).O3(this.f8808c.updates, false);
                return;
        }
    }
}
