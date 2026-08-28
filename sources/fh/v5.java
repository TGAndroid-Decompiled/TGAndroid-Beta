package fh;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.eb0;
import org.telegram.ui.zo0;
public final class v5 implements Utilities.Callback {
    public final int f6817a = 0;
    public final gf.b f6818b;
    public final TL_stars.TL_starGiftUnique f6819c;
    public final long d;
    public final Object f6820e;
    public final Object f6821f;

    public v5(f6 f6Var, org.telegram.ui.ActionBar.c2 c2Var, gf.b bVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10) {
        this.f6820e = f6Var;
        this.f6821f = c2Var;
        this.f6818b = bVar;
        this.f6819c = tL_starGiftUnique;
        this.d = j10;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f6817a) {
            case 0:
                f6.T((f6) this.f6820e, (org.telegram.ui.ActionBar.c2) this.f6821f, this.f6818b, this.f6819c, this.d, (TLRPC.TL_payments_paymentFormStarGift) obj);
                return;
            default:
                zo0.T((zo0) this.f6820e, this.f6818b, this.f6819c, this.d, (eb0) this.f6821f, (TLRPC.TL_payments_paymentFormStarGift) obj);
                return;
        }
    }

    public v5(zo0 zo0Var, gf.b bVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, eb0 eb0Var) {
        this.f6820e = zo0Var;
        this.f6818b = bVar;
        this.f6819c = tL_starGiftUnique;
        this.d = j10;
        this.f6821f = eb0Var;
    }
}
