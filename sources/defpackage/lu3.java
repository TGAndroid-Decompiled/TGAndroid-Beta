package defpackage;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.d;
public final class lu3 implements ee {
    public final int a;
    public final int b;
    public final Object c;

    public lu3(int i, int i2, d dVar) {
        this.a = i;
        this.b = i2;
        this.c = dVar;
    }

    @Override
    public final void r(he heVar, int i) {
        k11 g = heVar.g(-1, true, true);
        g.d();
        TL_payments.TL_resolveStarGiftOffer tL_resolveStarGiftOffer = new TL_payments.TL_resolveStarGiftOffer();
        tL_resolveStarGiftOffer.offer_msg_id = this.a;
        int i2 = this.b;
        ConnectionsManager.getInstance(i2).sendRequestTyped(tL_resolveStarGiftOffer, new e(i2, (d) this.c, g, heVar));
    }

    public lu3(qu3 qu3Var, int i, int i2) {
        this.c = qu3Var;
        this.a = i;
        this.b = i2;
    }
}
