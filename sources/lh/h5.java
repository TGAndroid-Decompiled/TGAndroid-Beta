package lh;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.no0;
import org.telegram.ui.np0;
public final class h5 implements Utilities.Callback {
    public final int f12800a = 0;
    public final mf.b f12801b;
    public final TL_stars.TL_starGiftUnique f12802c;
    public final long d;
    public final Object f12803e;
    public final Object f12804f;

    public h5(q5 q5Var, org.telegram.ui.ActionBar.d2 d2Var, mf.b bVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10) {
        this.f12803e = q5Var;
        this.f12804f = d2Var;
        this.f12801b = bVar;
        this.f12802c = tL_starGiftUnique;
        this.d = j10;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f12800a) {
            case 0:
                q5.U((q5) this.f12803e, (org.telegram.ui.ActionBar.d2) this.f12804f, this.f12801b, this.f12802c, this.d, (TLRPC.TL_payments_paymentFormStarGift) obj);
                return;
            default:
                np0.V((np0) this.f12803e, this.f12801b, this.f12802c, this.d, (no0) this.f12804f, (TLRPC.TL_payments_paymentFormStarGift) obj);
                return;
        }
    }

    public h5(np0 np0Var, mf.b bVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, no0 no0Var) {
        this.f12803e = np0Var;
        this.f12801b = bVar;
        this.f12802c = tL_starGiftUnique;
        this.d = j10;
        this.f12804f = no0Var;
    }
}
