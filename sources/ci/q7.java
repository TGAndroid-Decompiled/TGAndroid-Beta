package ci;

import org.telegram.messenger.hp;
import org.telegram.tgnet.TLRPC;
public final class q7 implements Runnable {
    public final int f5843a;
    public final e9 f5844b;
    public final TLRPC.TL_payments_paymentResult f5845c;

    public q7(e9 e9Var, TLRPC.TL_payments_paymentResult tL_payments_paymentResult, int i3) {
        this.f5843a = i3;
        this.f5844b = e9Var;
        this.f5845c = tL_payments_paymentResult;
    }

    @Override
    public final void run() {
        switch (this.f5843a) {
            case 0:
                hp.s1(this.f5844b.f5029a).O3(this.f5845c.updates, false);
                return;
            case 1:
                hp.s1(this.f5844b.f5029a).O3(this.f5845c.updates, false);
                return;
            case 2:
                hp.s1(this.f5844b.f5029a).O3(this.f5845c.updates, false);
                return;
            case 3:
                hp.s1(this.f5844b.f5029a).O3(this.f5845c.updates, false);
                return;
            default:
                hp.s1(this.f5844b.f5029a).O3(this.f5845c.updates, false);
                return;
        }
    }
}
