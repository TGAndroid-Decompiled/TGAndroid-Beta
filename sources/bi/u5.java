package bi;

import android.content.Context;
import org.telegram.messenger.z10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.im0;
import org.telegram.ui.kl0;
public final class u5 implements z10 {
    public final int f3899a = 0;
    public final cg.b f3900b;
    public final TL_stars.TL_starGiftUnique f3901c;
    public final long d;
    public final Object f3902e;
    public final Object f3903f;

    public u5(z5 z5Var, org.telegram.ui.ActionBar.t1 t1Var, cg.b bVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3) {
        this.f3902e = z5Var;
        this.f3903f = t1Var;
        this.f3900b = bVar;
        this.f3901c = tL_starGiftUnique;
        this.d = j3;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f3899a) {
            case 0:
                z5 z5Var = (z5) this.f3902e;
                TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift = (TLRPC.TL_payments_paymentFormStarGift) obj;
                ((org.telegram.ui.ActionBar.t1) this.f3903f).dismiss();
                if (tL_payments_paymentFormStarGift != null) {
                    di.c5 c5Var = new di.c5(this.f3900b, tL_payments_paymentFormStarGift);
                    Context context = z5Var.getContext();
                    org.telegram.ui.ActionBar.e6 e6Var = z5Var.J0;
                    int i7 = z5Var.f29679a;
                    StringBuilder sb2 = new StringBuilder();
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = this.f3901c;
                    sb2.append(tL_starGiftUnique.title);
                    sb2.append(" #");
                    String l10 = i5.c.l(tL_starGiftUnique.num, ',', sb2);
                    long j3 = this.d;
                    new di.e5(context, e6Var, tL_starGiftUnique, c5Var, i7, j3, l10, true, new v5(z5Var, tL_starGiftUnique, j3, 0)).b();
                    return;
                }
                return;
            default:
                im0.a0((im0) this.f3902e, this.f3900b, this.f3901c, this.d, (kl0) this.f3903f, (TLRPC.TL_payments_paymentFormStarGift) obj);
                return;
        }
    }

    public u5(im0 im0Var, cg.b bVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, kl0 kl0Var) {
        this.f3902e = im0Var;
        this.f3900b = bVar;
        this.f3901c = tL_starGiftUnique;
        this.d = j3;
        this.f3903f = kl0Var;
    }
}
