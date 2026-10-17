package ai;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.Components.iu;
public final class p0 implements org.telegram.ui.ActionBar.a2 {
    public final int f1992a;
    public final int f1993b;
    public final Object f1994c;

    public p0(int i10, int i11, org.telegram.ui.ActionBar.n2 n2Var) {
        this.f1992a = i10;
        this.f1993b = i11;
        this.f1994c = n2Var;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        pf.c g10 = b2Var.g(-1, true, true);
        g10.d();
        TL_payments.TL_resolveStarGiftOffer tL_resolveStarGiftOffer = new TL_payments.TL_resolveStarGiftOffer();
        tL_resolveStarGiftOffer.offer_msg_id = this.f1992a;
        int i11 = this.f1993b;
        ConnectionsManager.getInstance(i11).sendRequestTyped(tL_resolveStarGiftOffer, new u0(i11, (org.telegram.ui.ActionBar.n2) this.f1994c, g10, b2Var));
    }

    public p0(iu iuVar, int i10, int i11) {
        this.f1994c = iuVar;
        this.f1992a = i10;
        this.f1993b = i11;
    }
}
