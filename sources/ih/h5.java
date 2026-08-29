package ih;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.tm;
import org.telegram.ui.yo0;
public final class h5 implements Utilities.Callback {
    public final int f9224a = 0;
    public final kf.b f9225b;
    public final TL_stars.TL_starGiftUnique f9226c;
    public final long d;
    public final Object f9227e;
    public final Object f9228f;

    public h5(q5 q5Var, org.telegram.ui.ActionBar.c2 c2Var, kf.b bVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10) {
        this.f9227e = q5Var;
        this.f9228f = c2Var;
        this.f9225b = bVar;
        this.f9226c = tL_starGiftUnique;
        this.d = j10;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f9224a) {
            case 0:
                q5.U((q5) this.f9227e, (org.telegram.ui.ActionBar.c2) this.f9228f, this.f9225b, this.f9226c, this.d, (TLRPC.TL_payments_paymentFormStarGift) obj);
                return;
            default:
                yo0.U((yo0) this.f9227e, this.f9225b, this.f9226c, this.d, (tm) this.f9228f, (TLRPC.TL_payments_paymentFormStarGift) obj);
                return;
        }
    }

    public h5(yo0 yo0Var, kf.b bVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, tm tmVar) {
        this.f9227e = yo0Var;
        this.f9225b = bVar;
        this.f9226c = tL_starGiftUnique;
        this.d = j10;
        this.f9228f = tmVar;
    }
}
