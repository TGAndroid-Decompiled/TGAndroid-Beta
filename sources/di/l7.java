package di;

import org.telegram.messenger.np;
import org.telegram.tgnet.TLRPC;
public final class l7 implements Runnable {
    public final int f9293a;
    public final y8 f9294b;
    public final TLRPC.TL_payments_paymentResult f9295c;

    public l7(y8 y8Var, TLRPC.TL_payments_paymentResult tL_payments_paymentResult, int i7) {
        this.f9293a = i7;
        this.f9294b = y8Var;
        this.f9295c = tL_payments_paymentResult;
    }

    @Override
    public final void run() {
        switch (this.f9293a) {
            case 0:
                np.u1(this.f9294b.f10085a).V3(this.f9295c.updates, false);
                return;
            case 1:
                np.u1(this.f9294b.f10085a).V3(this.f9295c.updates, false);
                return;
            case 2:
                np.u1(this.f9294b.f10085a).V3(this.f9295c.updates, false);
                return;
            case 3:
                np.u1(this.f9294b.f10085a).V3(this.f9295c.updates, false);
                return;
            default:
                np.u1(this.f9294b.f10085a).V3(this.f9295c.updates, false);
                return;
        }
    }
}
