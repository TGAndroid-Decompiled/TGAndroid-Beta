package defpackage;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class f38 implements pcc {
    public final byte a = 0;
    public final Object b;
    public final Object c;
    public final long d;
    public final Object e;
    public final Object f;

    public f38(h48 h48Var, pj pjVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j, d38 d38Var) {
        this.e = h48Var;
        this.b = pjVar;
        this.c = tL_starGiftUnique;
        this.d = j;
        this.f = d38Var;
    }

    @Override
    public final void a(Object obj) {
        byte b = this.a;
        Object obj2 = this.f;
        Object obj3 = this.c;
        Object obj4 = this.b;
        Object obj5 = this.e;
        switch (b) {
            case 0:
                ((h48) obj5).G0((pj) obj4, (TL_stars.TL_starGiftUnique) obj3, this.d, (d38) obj2, (TLRPC.TL_payments_paymentFormStarGift) obj);
                return;
            case 1:
                md9 md9Var = (md9) obj5;
                pj pjVar = (pj) obj4;
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj3;
                TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift = (TLRPC.TL_payments_paymentFormStarGift) obj;
                ((id) obj2).dismiss();
                if (tL_payments_paymentFormStarGift != null) {
                    zta ztaVar = new zta(pjVar, tL_payments_paymentFormStarGift);
                    Context context = md9Var.getContext();
                    vnb vnbVar = md9Var.J0;
                    int i = md9Var.a;
                    StringBuilder sb = new StringBuilder();
                    sb.append(tL_starGiftUnique.title);
                    sb.append(" #");
                    String m = qu6.m(tL_starGiftUnique.num, ',', sb);
                    long j = this.d;
                    new bua(context, vnbVar, tL_starGiftUnique, ztaVar, i, j, m, true, new iv4(md9Var, tL_starGiftUnique, j, (byte) 5)).b();
                    return;
                }
                return;
            default:
                long longValue = ((Long) obj3).longValue();
                long j2 = this.d;
                ((wua) obj5).k1(j2, (TL_stars.starGiftDepositPayload) obj4, longValue, (l01) obj, (bx4) obj2);
                return;
        }
    }

    public f38(md9 md9Var, id idVar, pj pjVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j) {
        this.e = md9Var;
        this.f = idVar;
        this.b = pjVar;
        this.c = tL_starGiftUnique;
        this.d = j;
    }

    public f38(wua wuaVar, long j, TL_stars.starGiftDepositPayload stargiftdepositpayload, Long l, bx4 bx4Var) {
        this.e = wuaVar;
        this.d = j;
        this.b = stargiftdepositpayload;
        this.c = l;
        this.f = bx4Var;
    }
}
