package ci;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.Components.xs;
public final class m0 implements org.telegram.ui.ActionBar.p1 {
    public final int f5528a;
    public final int f5529b;
    public final Object f5530c;

    public m0(int i3, int i10, org.telegram.ui.ActionBar.d2 d2Var) {
        this.f5528a = i3;
        this.f5529b = i10;
        this.f5530c = d2Var;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        sf.b h = s1Var.h(-1, true, true);
        h.d();
        TL_payments.TL_resolveStarGiftOffer tL_resolveStarGiftOffer = new TL_payments.TL_resolveStarGiftOffer();
        tL_resolveStarGiftOffer.offer_msg_id = this.f5528a;
        int i10 = this.f5529b;
        ConnectionsManager.getInstance(i10).sendRequestTyped(tL_resolveStarGiftOffer, new o0(i10, (org.telegram.ui.ActionBar.d2) this.f5530c, h, s1Var));
    }

    public m0(xs xsVar, int i3, int i10) {
        this.f5530c = xsVar;
        this.f5528a = i3;
        this.f5529b = i10;
    }
}
