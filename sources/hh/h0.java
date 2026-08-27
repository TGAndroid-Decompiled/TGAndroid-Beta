package hh;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.Components.lt;

public final class h0 implements org.telegram.ui.ActionBar.a2 {

    public final int f9366a;

    public final int f9367b;

    public final Object f9368c;

    public h0(int i10, int i11, org.telegram.ui.ActionBar.n2 n2Var) {
        this.f9366a = i10;
        this.f9367b = i11;
        this.f9368c = n2Var;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.f9368c;
        we.d dVarG = b2Var.g(-1, true, true);
        dVarG.d();
        TL_payments.TL_resolveStarGiftOffer tL_resolveStarGiftOffer = new TL_payments.TL_resolveStarGiftOffer();
        tL_resolveStarGiftOffer.offer_msg_id = this.f9366a;
        int i11 = this.f9367b;
        ConnectionsManager.getInstance(i11).sendRequestTyped(tL_resolveStarGiftOffer, new j0(i11, n2Var, dVarG, b2Var));
    }

    public h0(lt ltVar, int i10, int i11) {
        this.f9368c = ltVar;
        this.f9366a = i10;
        this.f9367b = i11;
    }
}
