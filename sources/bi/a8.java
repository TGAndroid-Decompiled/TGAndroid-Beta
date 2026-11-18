package bi;

import android.content.Context;
import org.telegram.messenger.x10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.lm0;
import org.telegram.ui.nl0;
public final class a8 implements x10 {
    public final int f3417a = 0;
    public final long f3418b;
    public final Object f3419c;
    public final Object d;
    public final Object f3420e;
    public final Object f3421f;

    public a8(f8 f8Var, org.telegram.ui.ActionBar.u1 u1Var, cg.b bVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3) {
        this.f3419c = f8Var;
        this.d = u1Var;
        this.f3420e = bVar;
        this.f3421f = tL_starGiftUnique;
        this.f3418b = j3;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f3417a) {
            case 0:
                f8 f8Var = (f8) this.f3419c;
                cg.b bVar = (cg.b) this.f3420e;
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.f3421f;
                TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift = (TLRPC.TL_payments_paymentFormStarGift) obj;
                ((org.telegram.ui.ActionBar.u1) this.d).dismiss();
                if (tL_payments_paymentFormStarGift != null) {
                    di.f5 f5Var = new di.f5(bVar, tL_payments_paymentFormStarGift);
                    Context context = f8Var.getContext();
                    org.telegram.ui.ActionBar.i6 i6Var = f8Var.J0;
                    int i7 = f8Var.f30187a;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(tL_starGiftUnique.title);
                    sb2.append(" #");
                    String l10 = i5.c.l(tL_starGiftUnique.num, ',', sb2);
                    long j3 = this.f3418b;
                    new di.h5(context, i6Var, tL_starGiftUnique, f5Var, i7, j3, l10, true, new b8(f8Var, tL_starGiftUnique, j3, 0)).b();
                    return;
                }
                return;
            case 1:
                di.f6 f6Var = (di.f6) this.f3419c;
                TL_stars.starGiftDepositPayload stargiftdepositpayload = (TL_stars.starGiftDepositPayload) this.d;
                a2 a2Var = (a2) this.f3421f;
                f6Var.getClass();
                long longValue = ((Long) this.f3420e).longValue();
                f6Var.v1(this.f3418b, stargiftdepositpayload, longValue, (vf.b) obj, a2Var);
                return;
            default:
                lm0.a0((lm0) this.f3419c, (cg.b) this.f3420e, (TL_stars.TL_starGiftUnique) this.f3421f, this.f3418b, (nl0) this.d, (TLRPC.TL_payments_paymentFormStarGift) obj);
                return;
        }
    }

    public a8(di.f6 f6Var, long j3, TL_stars.starGiftDepositPayload stargiftdepositpayload, Long l10, a2 a2Var) {
        this.f3419c = f6Var;
        this.f3418b = j3;
        this.d = stargiftdepositpayload;
        this.f3420e = l10;
        this.f3421f = a2Var;
    }

    public a8(lm0 lm0Var, cg.b bVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, nl0 nl0Var) {
        this.f3419c = lm0Var;
        this.f3420e = bVar;
        this.f3421f = tL_starGiftUnique;
        this.f3418b = j3;
        this.d = nl0Var;
    }
}
