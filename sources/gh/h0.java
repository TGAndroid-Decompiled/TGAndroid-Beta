package gh;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.Components.mt;
public final class h0 implements org.telegram.ui.ActionBar.b2 {
    public final int f8188a;
    public final int f8189b;
    public final Object f8190c;

    public h0(int i9, int i10, org.telegram.ui.ActionBar.o2 o2Var) {
        this.f8188a = i9;
        this.f8189b = i10;
        this.f8190c = o2Var;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i9) {
        ve.d g10 = c2Var.g(-1, true, true);
        g10.d();
        TL_payments.TL_resolveStarGiftOffer tL_resolveStarGiftOffer = new TL_payments.TL_resolveStarGiftOffer();
        tL_resolveStarGiftOffer.offer_msg_id = this.f8188a;
        int i10 = this.f8189b;
        ConnectionsManager.getInstance(i10).sendRequestTyped(tL_resolveStarGiftOffer, new j0(i10, (org.telegram.ui.ActionBar.o2) this.f8190c, g10, c2Var));
    }

    public h0(mt mtVar, int i9, int i10) {
        this.f8190c = mtVar;
        this.f8188a = i9;
        this.f8189b = i10;
    }
}
