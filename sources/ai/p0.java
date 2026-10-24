package ai;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.Components.gu;
public final class p0 implements org.telegram.ui.ActionBar.z1 {
    public final int f1971a;
    public final int f1972b;
    public final Object f1973c;

    public p0(int i10, int i11, org.telegram.ui.ActionBar.o2 o2Var) {
        this.f1971a = i10;
        this.f1972b = i11;
        this.f1973c = o2Var;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        pf.c h = c2Var.h(-1, true, true);
        h.d();
        TL_payments.TL_resolveStarGiftOffer tL_resolveStarGiftOffer = new TL_payments.TL_resolveStarGiftOffer();
        tL_resolveStarGiftOffer.offer_msg_id = this.f1971a;
        int i11 = this.f1972b;
        ConnectionsManager.getInstance(i11).sendRequestTyped(tL_resolveStarGiftOffer, new u0(i11, (org.telegram.ui.ActionBar.o2) this.f1973c, h, c2Var));
    }

    public p0(gu guVar, int i10, int i11) {
        this.f1973c = guVar;
        this.f1971a = i10;
        this.f1972b = i11;
    }
}
