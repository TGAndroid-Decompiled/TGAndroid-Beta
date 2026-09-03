package mh;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.Components.xt;
public final class f0 implements org.telegram.ui.ActionBar.c2 {
    public final int f14006a;
    public final int f14007b;
    public final Object f14008c;

    public f0(int i10, int i11, org.telegram.ui.ActionBar.p2 p2Var) {
        this.f14006a = i10;
        this.f14007b = i11;
        this.f14008c = p2Var;
    }

    @Override
    public void j(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        af.f g10 = d2Var.g(-1, true, true);
        g10.d();
        TL_payments.TL_resolveStarGiftOffer tL_resolveStarGiftOffer = new TL_payments.TL_resolveStarGiftOffer();
        tL_resolveStarGiftOffer.offer_msg_id = this.f14006a;
        int i11 = this.f14007b;
        ConnectionsManager.getInstance(i11).sendRequestTyped(tL_resolveStarGiftOffer, new h0(i11, (org.telegram.ui.ActionBar.p2) this.f14008c, g10, d2Var));
    }

    public f0(xt xtVar, int i10, int i11) {
        this.f14008c = xtVar;
        this.f14006a = i10;
        this.f14007b = i11;
    }
}
