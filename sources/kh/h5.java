package kh;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.vk;
import org.telegram.ui.gp0;
public final class h5 implements Utilities.Callback {
    public final int f10660a = 0;
    public final mf.b f10661b;
    public final TL_stars.TL_starGiftUnique f10662c;
    public final long d;
    public final Object e;
    public final Object f10663f;

    public h5(q5 q5Var, org.telegram.ui.ActionBar.d2 d2Var, mf.b bVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10) {
        this.e = q5Var;
        this.f10663f = d2Var;
        this.f10661b = bVar;
        this.f10662c = tL_starGiftUnique;
        this.d = j10;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f10660a) {
            case 0:
                q5.U((q5) this.e, (org.telegram.ui.ActionBar.d2) this.f10663f, this.f10661b, this.f10662c, this.d, (TLRPC.TL_payments_paymentFormStarGift) obj);
                return;
            default:
                gp0.U((gp0) this.e, this.f10661b, this.f10662c, this.d, (vk) this.f10663f, (TLRPC.TL_payments_paymentFormStarGift) obj);
                return;
        }
    }

    public h5(gp0 gp0Var, mf.b bVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, vk vkVar) {
        this.e = gp0Var;
        this.f10661b = bVar;
        this.f10662c = tL_starGiftUnique;
        this.d = j10;
        this.f10663f = vkVar;
    }
}
