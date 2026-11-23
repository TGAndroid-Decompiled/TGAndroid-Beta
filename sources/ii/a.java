package ii;

import org.telegram.messenger.p10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class a implements Runnable {
    public final int f16348a;
    public final p10 f16349b;
    public final TLObject f16350c;
    public final TLRPC.TL_error d;

    public a(p10 p10Var, TLObject tLObject, TLRPC.TL_error tL_error, int i7) {
        this.f16348a = i7;
        this.f16349b = p10Var;
        this.f16350c = tLObject;
        this.d = tL_error;
    }

    @Override
    public final void run() {
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        switch (this.f16348a) {
            case 0:
                TLObject tLObject = this.f16350c;
                if (tLObject instanceof TLRPC.TL_payments_starsRevenueStats) {
                    tL_starsRevenueStatus = ((TLRPC.TL_payments_starsRevenueStats) tLObject).status;
                } else {
                    tL_starsRevenueStatus = null;
                }
                this.f16349b.a(tL_starsRevenueStatus, this.d);
                return;
            default:
                this.f16349b.a(this.f16350c, this.d);
                return;
        }
    }
}
