package di;

import org.telegram.messenger.np;
import org.telegram.tgnet.TLRPC;
public final class e3 implements Runnable {
    public final int f8450a;
    public final c6 f8451b;
    public final TLRPC.TL_payments_paymentResult f8452c;

    public e3(c6 c6Var, TLRPC.TL_payments_paymentResult tL_payments_paymentResult, int i7) {
        this.f8450a = i7;
        this.f8451b = c6Var;
        this.f8452c = tL_payments_paymentResult;
    }

    @Override
    public final void run() {
        switch (this.f8450a) {
            case 0:
                np.s1(this.f8451b.f29679a).O3(this.f8452c.updates, false);
                return;
            default:
                np.s1(this.f8451b.f29679a).O3(this.f8452c.updates, false);
                return;
        }
    }
}
