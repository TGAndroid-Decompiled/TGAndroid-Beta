package bi;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.Components.ys;
public final class r0 implements org.telegram.ui.ActionBar.r1 {
    public final int f4601a;
    public final int f4602b;
    public final Object f4603c;

    public r0(int i7, int i10, org.telegram.ui.ActionBar.f2 f2Var) {
        this.f4601a = i7;
        this.f4602b = i10;
        this.f4603c = f2Var;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        vf.b h = u1Var.h(-1, true, true);
        h.d();
        TL_payments.TL_resolveStarGiftOffer tL_resolveStarGiftOffer = new TL_payments.TL_resolveStarGiftOffer();
        tL_resolveStarGiftOffer.offer_msg_id = this.f4601a;
        int i10 = this.f4602b;
        ConnectionsManager.getInstance(i10).sendRequestTyped(tL_resolveStarGiftOffer, new v0(i10, (org.telegram.ui.ActionBar.f2) this.f4603c, h, u1Var));
    }

    public r0(ys ysVar, int i7, int i10) {
        this.f4603c = ysVar;
        this.f4601a = i7;
        this.f4602b = i10;
    }
}
