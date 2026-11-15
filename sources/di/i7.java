package di;

import org.telegram.messenger.np;
import org.telegram.tgnet.TLRPC;
public final class i7 implements Runnable {
    public final int f8804a;
    public final u8 f8805b;
    public final TLRPC.TL_payments_paymentResult f8806c;

    public i7(u8 u8Var, TLRPC.TL_payments_paymentResult tL_payments_paymentResult, int i7) {
        this.f8804a = i7;
        this.f8805b = u8Var;
        this.f8806c = tL_payments_paymentResult;
    }

    @Override
    public final void run() {
        switch (this.f8804a) {
            case 0:
                np.s1(this.f8805b.f9529a).O3(this.f8806c.updates, false);
                return;
            case 1:
                np.s1(this.f8805b.f9529a).O3(this.f8806c.updates, false);
                return;
            case 2:
                np.s1(this.f8805b.f9529a).O3(this.f8806c.updates, false);
                return;
            case 3:
                np.s1(this.f8805b.f9529a).O3(this.f8806c.updates, false);
                return;
            default:
                np.s1(this.f8805b.f9529a).O3(this.f8806c.updates, false);
                return;
        }
    }
}
