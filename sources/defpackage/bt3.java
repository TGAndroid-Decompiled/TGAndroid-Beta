package defpackage;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.d;
public final class bt3 implements ed {
    public final int a;
    public final int b;
    public final Object c;

    public bt3(int i, int i2, d dVar) {
        this.a = i;
        this.b = i2;
        this.c = dVar;
    }

    @Override
    public final void u(hd hdVar, int i) {
        c01 g = hdVar.g(-1, true, true);
        g.d();
        TL_payments.TL_resolveStarGiftOffer tL_resolveStarGiftOffer = new TL_payments.TL_resolveStarGiftOffer();
        tL_resolveStarGiftOffer.offer_msg_id = this.a;
        int i2 = this.b;
        ConnectionsManager.getInstance(i2).sendRequestTyped(tL_resolveStarGiftOffer, new e(i2, (d) this.c, g, hdVar));
    }

    public bt3(gt3 gt3Var, int i, int i2) {
        this.c = gt3Var;
        this.a = i;
        this.b = i2;
    }
}
