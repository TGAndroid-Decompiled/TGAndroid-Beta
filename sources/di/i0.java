package di;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.Components.ot;
public final class i0 implements org.telegram.ui.ActionBar.q1 {
    public final int f9025a;
    public final int f9026b;
    public final Object f9027c;

    public i0(int i7, int i10, org.telegram.ui.ActionBar.g2 g2Var) {
        this.f9025a = i7;
        this.f9026b = i10;
        this.f9027c = g2Var;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        vf.b h = t1Var.h(-1, true, true);
        h.d();
        TL_payments.TL_resolveStarGiftOffer tL_resolveStarGiftOffer = new TL_payments.TL_resolveStarGiftOffer();
        tL_resolveStarGiftOffer.offer_msg_id = this.f9025a;
        int i10 = this.f9026b;
        ConnectionsManager.getInstance(i10).sendRequestTyped(tL_resolveStarGiftOffer, new j0(i10, (org.telegram.ui.ActionBar.g2) this.f9027c, h, t1Var));
    }

    public i0(ot otVar, int i7, int i10) {
        this.f9027c = otVar;
        this.f9025a = i7;
        this.f9026b = i10;
    }
}
