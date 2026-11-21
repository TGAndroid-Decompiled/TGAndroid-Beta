package ii;

import org.telegram.messenger.q10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class a implements Runnable {
    public final int f16282a;
    public final q10 f16283b;
    public final TLObject f16284c;
    public final TLRPC.TL_error d;

    public a(q10 q10Var, TLObject tLObject, TLRPC.TL_error tL_error, int i7) {
        this.f16282a = i7;
        this.f16283b = q10Var;
        this.f16284c = tLObject;
        this.d = tL_error;
    }

    @Override
    public final void run() {
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        switch (this.f16282a) {
            case 0:
                TLObject tLObject = this.f16284c;
                if (tLObject instanceof TLRPC.TL_payments_starsRevenueStats) {
                    tL_starsRevenueStatus = ((TLRPC.TL_payments_starsRevenueStats) tLObject).status;
                } else {
                    tL_starsRevenueStatus = null;
                }
                this.f16283b.a(tL_starsRevenueStatus, this.d);
                return;
            default:
                this.f16283b.a(this.f16284c, this.d);
                return;
        }
    }
}
