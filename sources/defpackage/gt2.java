package defpackage;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class gt2 implements Runnable {
    public final byte a;
    public final icc b;
    public final TLObject c;
    public final TLRPC.TL_error d;

    public gt2(icc iccVar, TLObject tLObject, TLRPC.TL_error tL_error, byte b) {
        this.a = b;
        this.b = iccVar;
        this.c = tLObject;
        this.d = tL_error;
    }

    @Override
    public final void run() {
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        byte b = this.a;
        TLRPC.TL_error tL_error = this.d;
        TLObject tLObject = this.c;
        icc iccVar = this.b;
        switch (b) {
            case 0:
                iccVar.a(tLObject, tL_error);
                return;
            default:
                if (tLObject instanceof TLRPC.TL_payments_starsRevenueStats) {
                    tL_starsRevenueStatus = ((TLRPC.TL_payments_starsRevenueStats) tLObject).status;
                } else {
                    tL_starsRevenueStatus = null;
                }
                iccVar.a(tL_starsRevenueStatus, tL_error);
                return;
        }
    }
}
