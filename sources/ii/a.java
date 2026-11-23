package ii;

import org.telegram.messenger.r10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class a implements Runnable {
    public final int f16285a;
    public final r10 f16286b;
    public final TLObject f16287c;
    public final TLRPC.TL_error d;

    public a(r10 r10Var, TLObject tLObject, TLRPC.TL_error tL_error, int i7) {
        this.f16285a = i7;
        this.f16286b = r10Var;
        this.f16287c = tLObject;
        this.d = tL_error;
    }

    @Override
    public final void run() {
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        switch (this.f16285a) {
            case 0:
                TLObject tLObject = this.f16287c;
                if (tLObject instanceof TLRPC.TL_payments_starsRevenueStats) {
                    tL_starsRevenueStatus = ((TLRPC.TL_payments_starsRevenueStats) tLObject).status;
                } else {
                    tL_starsRevenueStatus = null;
                }
                this.f16286b.a(tL_starsRevenueStatus, this.d);
                return;
            default:
                this.f16286b.a(this.f16287c, this.d);
                return;
        }
    }
}
