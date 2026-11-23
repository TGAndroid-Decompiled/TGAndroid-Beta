package bi;

import android.content.Context;
import org.telegram.messenger.y10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.lm0;
import org.telegram.ui.nl0;
public final class g8 implements y10 {
    public final int f3621a = 0;
    public final long f3622b;
    public final Object f3623c;
    public final Object d;
    public final Object f3624e;
    public final Object f3625f;

    public g8(l8 l8Var, org.telegram.ui.ActionBar.t1 t1Var, cg.b bVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3) {
        this.f3623c = l8Var;
        this.d = t1Var;
        this.f3624e = bVar;
        this.f3625f = tL_starGiftUnique;
        this.f3622b = j3;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f3621a) {
            case 0:
                l8 l8Var = (l8) this.f3623c;
                cg.b bVar = (cg.b) this.f3624e;
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.f3625f;
                TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift = (TLRPC.TL_payments_paymentFormStarGift) obj;
                ((org.telegram.ui.ActionBar.t1) this.d).dismiss();
                if (tL_payments_paymentFormStarGift != null) {
                    di.f5 f5Var = new di.f5(bVar, tL_payments_paymentFormStarGift);
                    Context context = l8Var.getContext();
                    org.telegram.ui.ActionBar.h6 h6Var = l8Var.J0;
                    int i7 = l8Var.f30139a;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(tL_starGiftUnique.title);
                    sb2.append(" #");
                    String l10 = i5.c.l(tL_starGiftUnique.num, ',', sb2);
                    long j3 = this.f3622b;
                    new di.h5(context, h6Var, tL_starGiftUnique, f5Var, i7, j3, l10, true, new h8(l8Var, tL_starGiftUnique, j3, 0)).b();
                    return;
                }
                return;
            case 1:
                di.f6 f6Var = (di.f6) this.f3623c;
                TL_stars.starGiftDepositPayload stargiftdepositpayload = (TL_stars.starGiftDepositPayload) this.d;
                f2 f2Var = (f2) this.f3625f;
                f6Var.getClass();
                long longValue = ((Long) this.f3624e).longValue();
                f6Var.v1(this.f3622b, stargiftdepositpayload, longValue, (vf.b) obj, f2Var);
                return;
            default:
                lm0.a0((lm0) this.f3623c, (cg.b) this.f3624e, (TL_stars.TL_starGiftUnique) this.f3625f, this.f3622b, (nl0) this.d, (TLRPC.TL_payments_paymentFormStarGift) obj);
                return;
        }
    }

    public g8(di.f6 f6Var, long j3, TL_stars.starGiftDepositPayload stargiftdepositpayload, Long l10, f2 f2Var) {
        this.f3623c = f6Var;
        this.f3622b = j3;
        this.d = stargiftdepositpayload;
        this.f3624e = l10;
        this.f3625f = f2Var;
    }

    public g8(lm0 lm0Var, cg.b bVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, nl0 nl0Var) {
        this.f3623c = lm0Var;
        this.f3624e = bVar;
        this.f3625f = tL_starGiftUnique;
        this.f3622b = j3;
        this.d = nl0Var;
    }
}
