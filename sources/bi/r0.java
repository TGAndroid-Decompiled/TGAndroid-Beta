package bi;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.Components.ju;
public final class r0 implements org.telegram.ui.ActionBar.b2 {
    public final int f5312a;
    public final int f5313b;
    public final Object f5314c;

    public r0(int i10, int i11, org.telegram.ui.ActionBar.r2 r2Var) {
        this.f5312a = i10;
        this.f5313b = i11;
        this.f5314c = r2Var;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        qf.c h = e2Var.h(-1, true, true);
        h.d();
        TL_payments.TL_resolveStarGiftOffer tL_resolveStarGiftOffer = new TL_payments.TL_resolveStarGiftOffer();
        tL_resolveStarGiftOffer.offer_msg_id = this.f5312a;
        int i11 = this.f5313b;
        ConnectionsManager.getInstance(i11).sendRequestTyped(tL_resolveStarGiftOffer, new v0(i11, (org.telegram.ui.ActionBar.r2) this.f5314c, h, e2Var));
    }

    public r0(ju juVar, int i10, int i11) {
        this.f5314c = juVar;
        this.f5312a = i10;
        this.f5313b = i11;
    }
}
