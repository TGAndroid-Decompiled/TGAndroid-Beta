package lh;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.Components.ut;
public final class g0 implements org.telegram.ui.ActionBar.c2 {
    public final int f12437a;
    public final int f12438b;
    public final Object f12439c;

    public g0(int i10, int i11, org.telegram.ui.ActionBar.p2 p2Var) {
        this.f12437a = i10;
        this.f12438b = i11;
        this.f12439c = p2Var;
    }

    @Override
    public void l(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        ze.c g10 = d2Var.g(-1, true, true);
        g10.d();
        TL_payments.TL_resolveStarGiftOffer tL_resolveStarGiftOffer = new TL_payments.TL_resolveStarGiftOffer();
        tL_resolveStarGiftOffer.offer_msg_id = this.f12437a;
        int i11 = this.f12438b;
        ConnectionsManager.getInstance(i11).sendRequestTyped(tL_resolveStarGiftOffer, new i0(i11, (org.telegram.ui.ActionBar.p2) this.f12439c, g10, d2Var));
    }

    public g0(ut utVar, int i10, int i11) {
        this.f12439c = utVar;
        this.f12437a = i10;
        this.f12438b = i11;
    }
}
