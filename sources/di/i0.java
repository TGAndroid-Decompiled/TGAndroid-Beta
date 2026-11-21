package di;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.Components.ot;
public final class i0 implements org.telegram.ui.ActionBar.q1 {
    public final int f9022a;
    public final int f9023b;
    public final Object f9024c;

    public i0(int i7, int i10, org.telegram.ui.ActionBar.g2 g2Var) {
        this.f9022a = i7;
        this.f9023b = i10;
        this.f9024c = g2Var;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        vf.b h = t1Var.h(-1, true, true);
        h.d();
        TL_payments.TL_resolveStarGiftOffer tL_resolveStarGiftOffer = new TL_payments.TL_resolveStarGiftOffer();
        tL_resolveStarGiftOffer.offer_msg_id = this.f9022a;
        int i10 = this.f9023b;
        ConnectionsManager.getInstance(i10).sendRequestTyped(tL_resolveStarGiftOffer, new j0(i10, (org.telegram.ui.ActionBar.g2) this.f9024c, h, t1Var));
    }

    public i0(ot otVar, int i7, int i10) {
        this.f9024c = otVar;
        this.f9022a = i7;
        this.f9023b = i10;
    }
}
