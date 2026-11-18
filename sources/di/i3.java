package di;

import org.telegram.messenger.mp;
import org.telegram.tgnet.TLRPC;
public final class i3 implements Runnable {
    public final int f9006a;
    public final f6 f9007b;
    public final TLRPC.TL_payments_paymentResult f9008c;

    public i3(f6 f6Var, TLRPC.TL_payments_paymentResult tL_payments_paymentResult, int i7) {
        this.f9006a = i7;
        this.f9007b = f6Var;
        this.f9008c = tL_payments_paymentResult;
    }

    @Override
    public final void run() {
        switch (this.f9006a) {
            case 0:
                mp.u1(this.f9007b.f30189a).V3(this.f9008c.updates, false);
                return;
            default:
                mp.u1(this.f9007b.f30189a).V3(this.f9008c.updates, false);
                return;
        }
    }
}
