package di;

import org.telegram.messenger.mp;
import org.telegram.tgnet.TLRPC;
public final class i3 implements Runnable {
    public final int f8994a;
    public final f6 f8995b;
    public final TLRPC.TL_payments_paymentResult f8996c;

    public i3(f6 f6Var, TLRPC.TL_payments_paymentResult tL_payments_paymentResult, int i7) {
        this.f8994a = i7;
        this.f8995b = f6Var;
        this.f8996c = tL_payments_paymentResult;
    }

    @Override
    public final void run() {
        switch (this.f8994a) {
            case 0:
                mp.u1(this.f8995b.f30223a).V3(this.f8996c.updates, false);
                return;
            default:
                mp.u1(this.f8995b.f30223a).V3(this.f8996c.updates, false);
                return;
        }
    }
}
