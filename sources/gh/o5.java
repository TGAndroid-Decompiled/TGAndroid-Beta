package gh;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ap0;
import org.telegram.ui.ib0;

public final class o5 implements Utilities.Callback {

    public final int f7482a = 0;

    public final hf.b f7483b;

    public final TL_stars.TL_starGiftUnique f7484c;
    public final long d;

    public final Object f7485e;

    public final Object f7486f;

    public o5(x5 x5Var, org.telegram.ui.ActionBar.b2 b2Var, hf.b bVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10) {
        this.f7485e = x5Var;
        this.f7486f = b2Var;
        this.f7483b = bVar;
        this.f7484c = tL_starGiftUnique;
        this.d = j10;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f7482a) {
            case 0:
                x5.U((x5) this.f7485e, (org.telegram.ui.ActionBar.b2) this.f7486f, this.f7483b, this.f7484c, this.d, (TLRPC.TL_payments_paymentFormStarGift) obj);
                break;
            default:
                ap0.U((ap0) this.f7485e, this.f7483b, this.f7484c, this.d, (ib0) this.f7486f, (TLRPC.TL_payments_paymentFormStarGift) obj);
                break;
        }
    }

    public o5(ap0 ap0Var, hf.b bVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, ib0 ib0Var) {
        this.f7485e = ap0Var;
        this.f7483b = bVar;
        this.f7484c = tL_starGiftUnique;
        this.d = j10;
        this.f7486f = ib0Var;
    }
}
