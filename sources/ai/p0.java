package ai;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.Components.iu;
public final class p0 implements org.telegram.ui.ActionBar.a2 {
    public final int f1994a;
    public final int f1995b;
    public final Object f1996c;

    public p0(int i10, int i11, org.telegram.ui.ActionBar.n2 n2Var) {
        this.f1994a = i10;
        this.f1995b = i11;
        this.f1996c = n2Var;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        pf.c g10 = b2Var.g(-1, true, true);
        g10.d();
        TL_payments.TL_resolveStarGiftOffer tL_resolveStarGiftOffer = new TL_payments.TL_resolveStarGiftOffer();
        tL_resolveStarGiftOffer.offer_msg_id = this.f1994a;
        int i11 = this.f1995b;
        ConnectionsManager.getInstance(i11).sendRequestTyped(tL_resolveStarGiftOffer, new u0(i11, (org.telegram.ui.ActionBar.n2) this.f1996c, g10, b2Var));
    }

    public p0(iu iuVar, int i10, int i11) {
        this.f1996c = iuVar;
        this.f1994a = i10;
        this.f1995b = i11;
    }
}
