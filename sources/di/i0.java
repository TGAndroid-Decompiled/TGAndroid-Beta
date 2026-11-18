package di;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.Components.mt;
public final class i0 implements org.telegram.ui.ActionBar.r1 {
    public final int f8997a;
    public final int f8998b;
    public final Object f8999c;

    public i0(int i7, int i10, org.telegram.ui.ActionBar.h2 h2Var) {
        this.f8997a = i7;
        this.f8998b = i10;
        this.f8999c = h2Var;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        vf.b h = u1Var.h(-1, true, true);
        h.d();
        TL_payments.TL_resolveStarGiftOffer tL_resolveStarGiftOffer = new TL_payments.TL_resolveStarGiftOffer();
        tL_resolveStarGiftOffer.offer_msg_id = this.f8997a;
        int i10 = this.f8998b;
        ConnectionsManager.getInstance(i10).sendRequestTyped(tL_resolveStarGiftOffer, new j0(i10, (org.telegram.ui.ActionBar.h2) this.f8999c, h, u1Var));
    }

    public i0(mt mtVar, int i7, int i10) {
        this.f8999c = mtVar;
        this.f8997a = i7;
        this.f8998b = i10;
    }
}
