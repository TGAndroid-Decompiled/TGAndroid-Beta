package lh;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.xk;
import org.telegram.ui.ip0;
public final class h5 implements Utilities.Callback {
    public final int f12798a = 0;
    public final mf.b f12799b;
    public final TL_stars.TL_starGiftUnique f12800c;
    public final long d;
    public final Object f12801e;
    public final Object f12802f;

    public h5(q5 q5Var, org.telegram.ui.ActionBar.d2 d2Var, mf.b bVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10) {
        this.f12801e = q5Var;
        this.f12802f = d2Var;
        this.f12799b = bVar;
        this.f12800c = tL_starGiftUnique;
        this.d = j10;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f12798a) {
            case 0:
                q5.U((q5) this.f12801e, (org.telegram.ui.ActionBar.d2) this.f12802f, this.f12799b, this.f12800c, this.d, (TLRPC.TL_payments_paymentFormStarGift) obj);
                return;
            default:
                ip0.U((ip0) this.f12801e, this.f12799b, this.f12800c, this.d, (xk) this.f12802f, (TLRPC.TL_payments_paymentFormStarGift) obj);
                return;
        }
    }

    public h5(ip0 ip0Var, mf.b bVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, xk xkVar) {
        this.f12801e = ip0Var;
        this.f12799b = bVar;
        this.f12800c = tL_starGiftUnique;
        this.d = j10;
        this.f12802f = xkVar;
    }
}
