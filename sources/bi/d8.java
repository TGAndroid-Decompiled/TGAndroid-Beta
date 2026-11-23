package bi;

import android.content.Context;
import org.telegram.messenger.y10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.lm0;
import org.telegram.ui.nl0;
public final class d8 implements y10 {
    public final int f3560a = 0;
    public final long f3561b;
    public final Object f3562c;
    public final Object d;
    public final Object f3563e;
    public final Object f3564f;

    public d8(i8 i8Var, org.telegram.ui.ActionBar.t1 t1Var, cg.b bVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3) {
        this.f3562c = i8Var;
        this.d = t1Var;
        this.f3563e = bVar;
        this.f3564f = tL_starGiftUnique;
        this.f3561b = j3;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f3560a) {
            case 0:
                i8 i8Var = (i8) this.f3562c;
                cg.b bVar = (cg.b) this.f3563e;
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.f3564f;
                TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift = (TLRPC.TL_payments_paymentFormStarGift) obj;
                ((org.telegram.ui.ActionBar.t1) this.d).dismiss();
                if (tL_payments_paymentFormStarGift != null) {
                    di.f5 f5Var = new di.f5(bVar, tL_payments_paymentFormStarGift);
                    Context context = i8Var.getContext();
                    org.telegram.ui.ActionBar.h6 h6Var = i8Var.J0;
                    int i7 = i8Var.f30173a;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(tL_starGiftUnique.title);
                    sb2.append(" #");
                    String l10 = i5.c.l(tL_starGiftUnique.num, ',', sb2);
                    long j3 = this.f3561b;
                    new di.h5(context, h6Var, tL_starGiftUnique, f5Var, i7, j3, l10, true, new e8(i8Var, tL_starGiftUnique, j3, 0)).b();
                    return;
                }
                return;
            case 1:
                di.f6 f6Var = (di.f6) this.f3562c;
                TL_stars.starGiftDepositPayload stargiftdepositpayload = (TL_stars.starGiftDepositPayload) this.d;
                e2 e2Var = (e2) this.f3564f;
                f6Var.getClass();
                long longValue = ((Long) this.f3563e).longValue();
                f6Var.v1(this.f3561b, stargiftdepositpayload, longValue, (vf.b) obj, e2Var);
                return;
            default:
                lm0.a0((lm0) this.f3562c, (cg.b) this.f3563e, (TL_stars.TL_starGiftUnique) this.f3564f, this.f3561b, (nl0) this.d, (TLRPC.TL_payments_paymentFormStarGift) obj);
                return;
        }
    }

    public d8(di.f6 f6Var, long j3, TL_stars.starGiftDepositPayload stargiftdepositpayload, Long l10, e2 e2Var) {
        this.f3562c = f6Var;
        this.f3561b = j3;
        this.d = stargiftdepositpayload;
        this.f3563e = l10;
        this.f3564f = e2Var;
    }

    public d8(lm0 lm0Var, cg.b bVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, nl0 nl0Var) {
        this.f3562c = lm0Var;
        this.f3563e = bVar;
        this.f3564f = tL_starGiftUnique;
        this.f3561b = j3;
        this.d = nl0Var;
    }
}
