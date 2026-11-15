package di;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.Components.ft;
public final class i0 implements org.telegram.ui.ActionBar.q1 {
    public final int f8761a;
    public final int f8762b;
    public final Object f8763c;

    public i0(int i7, int i10, org.telegram.ui.ActionBar.e2 e2Var) {
        this.f8761a = i7;
        this.f8762b = i10;
        this.f8763c = e2Var;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        vf.b h = t1Var.h(-1, true, true);
        h.d();
        TL_payments.TL_resolveStarGiftOffer tL_resolveStarGiftOffer = new TL_payments.TL_resolveStarGiftOffer();
        tL_resolveStarGiftOffer.offer_msg_id = this.f8761a;
        int i10 = this.f8762b;
        ConnectionsManager.getInstance(i10).sendRequestTyped(tL_resolveStarGiftOffer, new k0(i10, (org.telegram.ui.ActionBar.e2) this.f8763c, h, t1Var));
    }

    public i0(ft ftVar, int i7, int i10) {
        this.f8763c = ftVar;
        this.f8761a = i7;
        this.f8762b = i10;
    }
}
