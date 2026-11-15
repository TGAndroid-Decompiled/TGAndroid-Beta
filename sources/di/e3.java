package di;

import org.telegram.messenger.np;
import org.telegram.tgnet.TLRPC;
public final class e3 implements Runnable {
    public final int f8446a;
    public final c6 f8447b;
    public final TLRPC.TL_payments_paymentResult f8448c;

    public e3(c6 c6Var, TLRPC.TL_payments_paymentResult tL_payments_paymentResult, int i7) {
        this.f8446a = i7;
        this.f8447b = c6Var;
        this.f8448c = tL_payments_paymentResult;
    }

    @Override
    public final void run() {
        switch (this.f8446a) {
            case 0:
                np.s1(this.f8447b.f29679a).O3(this.f8448c.updates, false);
                return;
            default:
                np.s1(this.f8447b.f29679a).O3(this.f8448c.updates, false);
                return;
        }
    }
}
