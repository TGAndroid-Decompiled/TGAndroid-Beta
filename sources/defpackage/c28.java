package defpackage;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class c28 implements qac {
    public final byte a = 0;
    public final Object b;
    public final Object c;
    public final long d;
    public final Object e;
    public final Object f;

    public c28(d38 d38Var, ok okVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j, a28 a28Var) {
        this.e = d38Var;
        this.b = okVar;
        this.c = tL_starGiftUnique;
        this.d = j;
        this.f = a28Var;
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
                ((d38) obj5).G0((ok) obj4, (TL_stars.TL_starGiftUnique) obj3, this.d, (a28) obj2, (TLRPC.TL_payments_paymentFormStarGift) obj);
                return;
            case 1:
                yb9 yb9Var = (yb9) obj5;
                ok okVar = (ok) obj4;
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj3;
                TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift = (TLRPC.TL_payments_paymentFormStarGift) obj;
                ((he) obj2).dismiss();
                if (tL_payments_paymentFormStarGift != null) {
                    yra yraVar = new yra(okVar, tL_payments_paymentFormStarGift);
                    Context context = yb9Var.getContext();
                    ylb ylbVar = yb9Var.J0;
                    int i = yb9Var.a;
                    StringBuilder sb = new StringBuilder();
                    sb.append(tL_starGiftUnique.title);
                    sb.append(" #");
                    String m = kt6.m(tL_starGiftUnique.num, ',', sb);
                    long j = this.d;
                    new asa(context, ylbVar, tL_starGiftUnique, yraVar, i, j, m, true, new fv4(yb9Var, tL_starGiftUnique, j, (byte) 5)).b();
                    return;
                }
                return;
            default:
                long longValue = ((Long) obj3).longValue();
                long j2 = this.d;
                ((wsa) obj5).j1(j2, (TL_stars.starGiftDepositPayload) obj4, longValue, (k11) obj, (yw4) obj2);
                return;
        }
    }

    public c28(yb9 yb9Var, he heVar, ok okVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j) {
        this.e = yb9Var;
        this.f = heVar;
        this.b = okVar;
        this.c = tL_starGiftUnique;
        this.d = j;
    }

    public c28(wsa wsaVar, long j, TL_stars.starGiftDepositPayload stargiftdepositpayload, Long l, yw4 yw4Var) {
        this.e = wsaVar;
        this.d = j;
        this.b = stargiftdepositpayload;
        this.c = l;
        this.f = yw4Var;
    }
}
