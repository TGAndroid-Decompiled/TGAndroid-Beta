package ai;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.Components.iu;
public final class p0 implements org.telegram.ui.ActionBar.a2 {
    public final int f1991a;
    public final int f1992b;
    public final Object f1993c;

    public p0(int i10, int i11, org.telegram.ui.ActionBar.n2 n2Var) {
        this.f1991a = i10;
        this.f1992b = i11;
        this.f1993c = n2Var;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        pf.c h = b2Var.h(-1, true, true);
        h.d();
        TL_payments.TL_resolveStarGiftOffer tL_resolveStarGiftOffer = new TL_payments.TL_resolveStarGiftOffer();
        tL_resolveStarGiftOffer.offer_msg_id = this.f1991a;
        int i11 = this.f1992b;
        ConnectionsManager.getInstance(i11).sendRequestTyped(tL_resolveStarGiftOffer, new u0(i11, (org.telegram.ui.ActionBar.n2) this.f1993c, h, b2Var));
    }

    public p0(iu iuVar, int i10, int i11) {
        this.f1993c = iuVar;
        this.f1991a = i10;
        this.f1992b = i11;
    }
}
