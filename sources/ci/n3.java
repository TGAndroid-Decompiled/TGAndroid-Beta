package ci;

import org.telegram.messenger.hp;
import org.telegram.tgnet.TLRPC;
public final class n3 implements Runnable {
    public final int f5590a;
    public final l6 f5591b;
    public final TLRPC.TL_payments_paymentResult f5592c;

    public n3(l6 l6Var, TLRPC.TL_payments_paymentResult tL_payments_paymentResult, int i3) {
        this.f5590a = i3;
        this.f5591b = l6Var;
        this.f5592c = tL_payments_paymentResult;
    }

    @Override
    public final void run() {
        switch (this.f5590a) {
            case 0:
                hp.s1(this.f5591b.f28583a).O3(this.f5592c.updates, false);
                return;
            default:
                hp.s1(this.f5591b.f28583a).O3(this.f5592c.updates, false);
                return;
        }
    }
}
