package kh;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.no0;
import org.telegram.ui.np0;
public final class g5 implements Utilities.Callback {
    public final int f10753a = 0;
    public final lf.b f10754b;
    public final TL_stars.TL_starGiftUnique f10755c;
    public final long d;
    public final Object e;
    public final Object f10756f;

    public g5(p5 p5Var, org.telegram.ui.ActionBar.d2 d2Var, lf.b bVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10) {
        this.e = p5Var;
        this.f10756f = d2Var;
        this.f10754b = bVar;
        this.f10755c = tL_starGiftUnique;
        this.d = j10;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f10753a) {
            case 0:
                p5.U((p5) this.e, (org.telegram.ui.ActionBar.d2) this.f10756f, this.f10754b, this.f10755c, this.d, (TLRPC.TL_payments_paymentFormStarGift) obj);
                return;
            default:
                np0.V((np0) this.e, this.f10754b, this.f10755c, this.d, (no0) this.f10756f, (TLRPC.TL_payments_paymentFormStarGift) obj);
                return;
        }
    }

    public g5(np0 np0Var, lf.b bVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, no0 no0Var) {
        this.e = np0Var;
        this.f10754b = bVar;
        this.f10755c = tL_starGiftUnique;
        this.d = j10;
        this.f10756f = no0Var;
    }
}
