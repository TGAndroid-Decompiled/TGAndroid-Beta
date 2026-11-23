package di;

import org.telegram.messenger.np;
import org.telegram.tgnet.TLRPC;
public final class i3 implements Runnable {
    public final int f8997a;
    public final f6 f8998b;
    public final TLRPC.TL_payments_paymentResult f8999c;

    public i3(f6 f6Var, TLRPC.TL_payments_paymentResult tL_payments_paymentResult, int i7) {
        this.f8997a = i7;
        this.f8998b = f6Var;
        this.f8999c = tL_payments_paymentResult;
    }

    @Override
    public final void run() {
        switch (this.f8997a) {
            case 0:
                np.u1(this.f8998b.f30139a).V3(this.f8999c.updates, false);
                return;
            default:
                np.u1(this.f8998b.f30139a).V3(this.f8999c.updates, false);
                return;
        }
    }
}
