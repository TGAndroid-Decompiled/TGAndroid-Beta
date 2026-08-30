package lh;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.Components.vt;
public final class g0 implements org.telegram.ui.ActionBar.c2 {
    public final int f12453a;
    public final int f12454b;
    public final Object f12455c;

    public g0(int i10, int i11, org.telegram.ui.ActionBar.p2 p2Var) {
        this.f12453a = i10;
        this.f12454b = i11;
        this.f12455c = p2Var;
    }

    @Override
    public void i(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        af.f g10 = d2Var.g(-1, true, true);
        g10.d();
        TL_payments.TL_resolveStarGiftOffer tL_resolveStarGiftOffer = new TL_payments.TL_resolveStarGiftOffer();
        tL_resolveStarGiftOffer.offer_msg_id = this.f12453a;
        int i11 = this.f12454b;
        ConnectionsManager.getInstance(i11).sendRequestTyped(tL_resolveStarGiftOffer, new i0(i11, (org.telegram.ui.ActionBar.p2) this.f12455c, g10, d2Var));
    }

    public g0(vt vtVar, int i10, int i11) {
        this.f12455c = vtVar;
        this.f12453a = i10;
        this.f12454b = i11;
    }
}
