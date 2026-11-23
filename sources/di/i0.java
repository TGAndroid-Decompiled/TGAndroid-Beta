package di;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.Components.mt;
public final class i0 implements org.telegram.ui.ActionBar.q1 {
    public final int f8986a;
    public final int f8987b;
    public final Object f8988c;

    public i0(int i7, int i10, org.telegram.ui.ActionBar.g2 g2Var) {
        this.f8986a = i7;
        this.f8987b = i10;
        this.f8988c = g2Var;
    }

    @Override
    public void i(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        vf.b h = t1Var.h(-1, true, true);
        h.d();
        TL_payments.TL_resolveStarGiftOffer tL_resolveStarGiftOffer = new TL_payments.TL_resolveStarGiftOffer();
        tL_resolveStarGiftOffer.offer_msg_id = this.f8986a;
        int i10 = this.f8987b;
        ConnectionsManager.getInstance(i10).sendRequestTyped(tL_resolveStarGiftOffer, new j0(i10, (org.telegram.ui.ActionBar.g2) this.f8988c, h, t1Var));
    }

    public i0(mt mtVar, int i7, int i10) {
        this.f8988c = mtVar;
        this.f8986a = i7;
        this.f8987b = i10;
    }
}
