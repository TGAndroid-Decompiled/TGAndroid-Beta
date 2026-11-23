package di;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.Components.ot;
public final class i0 implements org.telegram.ui.ActionBar.q1 {
    public final int f8988a;
    public final int f8989b;
    public final Object f8990c;

    public i0(int i7, int i10, org.telegram.ui.ActionBar.g2 g2Var) {
        this.f8988a = i7;
        this.f8989b = i10;
        this.f8990c = g2Var;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        vf.b h = t1Var.h(-1, true, true);
        h.d();
        TL_payments.TL_resolveStarGiftOffer tL_resolveStarGiftOffer = new TL_payments.TL_resolveStarGiftOffer();
        tL_resolveStarGiftOffer.offer_msg_id = this.f8988a;
        int i10 = this.f8989b;
        ConnectionsManager.getInstance(i10).sendRequestTyped(tL_resolveStarGiftOffer, new j0(i10, (org.telegram.ui.ActionBar.g2) this.f8990c, h, t1Var));
    }

    public i0(ot otVar, int i7, int i10) {
        this.f8990c = otVar;
        this.f8988a = i7;
        this.f8989b = i10;
    }
}
