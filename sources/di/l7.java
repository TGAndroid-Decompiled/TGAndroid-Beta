package di;

import org.telegram.messenger.mp;
import org.telegram.tgnet.TLRPC;
public final class l7 implements Runnable {
    public final int f9290a;
    public final y8 f9291b;
    public final TLRPC.TL_payments_paymentResult f9292c;

    public l7(y8 y8Var, TLRPC.TL_payments_paymentResult tL_payments_paymentResult, int i7) {
        this.f9290a = i7;
        this.f9291b = y8Var;
        this.f9292c = tL_payments_paymentResult;
    }

    @Override
    public final void run() {
        switch (this.f9290a) {
            case 0:
                mp.u1(this.f9291b.f10082a).V3(this.f9292c.updates, false);
                return;
            case 1:
                mp.u1(this.f9291b.f10082a).V3(this.f9292c.updates, false);
                return;
            case 2:
                mp.u1(this.f9291b.f10082a).V3(this.f9292c.updates, false);
                return;
            case 3:
                mp.u1(this.f9291b.f10082a).V3(this.f9292c.updates, false);
                return;
            default:
                mp.u1(this.f9291b.f10082a).V3(this.f9292c.updates, false);
                return;
        }
    }
}
