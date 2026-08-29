package jh;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.Components.st;
public final class g0 implements org.telegram.ui.ActionBar.b2 {
    public final int f12088a;
    public final int f12089b;
    public final Object f12090c;

    public g0(int i10, int i11, org.telegram.ui.ActionBar.o2 o2Var) {
        this.f12088a = i10;
        this.f12089b = i11;
        this.f12090c = o2Var;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        ye.c g10 = c2Var.g(-1, true, true);
        g10.d();
        TL_payments.TL_resolveStarGiftOffer tL_resolveStarGiftOffer = new TL_payments.TL_resolveStarGiftOffer();
        tL_resolveStarGiftOffer.offer_msg_id = this.f12088a;
        int i11 = this.f12089b;
        ConnectionsManager.getInstance(i11).sendRequestTyped(tL_resolveStarGiftOffer, new i0(i11, (org.telegram.ui.ActionBar.o2) this.f12090c, g10, c2Var));
    }

    public g0(st stVar, int i10, int i11) {
        this.f12090c = stVar;
        this.f12088a = i10;
        this.f12089b = i11;
    }
}
