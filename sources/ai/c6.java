package ai;

import android.content.Context;
import org.telegram.messenger.u10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.cm0;
import org.telegram.ui.el0;
public final class c6 implements u10 {
    public final int f547a = 0;
    public final dg.b f548b;
    public final TL_stars.TL_starGiftUnique f549c;
    public final long d;
    public final Object f550e;
    public final Object f551f;

    public c6(h6 h6Var, org.telegram.ui.ActionBar.s1 s1Var, dg.b bVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10) {
        this.f550e = h6Var;
        this.f551f = s1Var;
        this.f548b = bVar;
        this.f549c = tL_starGiftUnique;
        this.d = j10;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f547a) {
            case 0:
                h6 h6Var = (h6) this.f550e;
                TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift = (TLRPC.TL_payments_paymentFormStarGift) obj;
                ((org.telegram.ui.ActionBar.s1) this.f551f).dismiss();
                if (tL_payments_paymentFormStarGift != null) {
                    ci.l5 l5Var = new ci.l5(this.f548b, tL_payments_paymentFormStarGift);
                    Context context = h6Var.getContext();
                    org.telegram.ui.ActionBar.e6 e6Var = h6Var.J0;
                    int i3 = h6Var.f28583a;
                    StringBuilder sb2 = new StringBuilder();
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = this.f549c;
                    sb2.append(tL_starGiftUnique.title);
                    sb2.append(" #");
                    String l10 = k2.p1.l(tL_starGiftUnique.num, ',', sb2);
                    long j10 = this.d;
                    new ci.n5(context, e6Var, tL_starGiftUnique, l5Var, i3, j10, l10, true, new d6(h6Var, tL_starGiftUnique, j10, 0)).b();
                    return;
                }
                return;
            default:
                cm0.a0((cm0) this.f550e, this.f548b, this.f549c, this.d, (el0) this.f551f, (TLRPC.TL_payments_paymentFormStarGift) obj);
                return;
        }
    }

    public c6(cm0 cm0Var, dg.b bVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, el0 el0Var) {
        this.f550e = cm0Var;
        this.f548b = bVar;
        this.f549c = tL_starGiftUnique;
        this.d = j10;
        this.f551f = el0Var;
    }
}
