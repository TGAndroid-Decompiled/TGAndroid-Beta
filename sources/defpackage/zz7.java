package defpackage;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class zz7 implements p8c {
    public final byte a = 0;
    public final Object b;
    public final Object c;
    public final long d;
    public final Object e;
    public final Object f;

    public zz7(a18 a18Var, oj ojVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j, xz7 xz7Var) {
        this.e = a18Var;
        this.b = ojVar;
        this.c = tL_starGiftUnique;
        this.d = j;
        this.f = xz7Var;
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
                ((a18) obj5).F0((oj) obj4, (TL_stars.TL_starGiftUnique) obj3, this.d, (xz7) obj2, (TLRPC.TL_payments_paymentFormStarGift) obj);
                return;
            case 1:
                y99 y99Var = (y99) obj5;
                oj ojVar = (oj) obj4;
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj3;
                TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift = (TLRPC.TL_payments_paymentFormStarGift) obj;
                ((hd) obj2).dismiss();
                if (tL_payments_paymentFormStarGift != null) {
                    ypa ypaVar = new ypa(ojVar, tL_payments_paymentFormStarGift);
                    Context context = y99Var.getContext();
                    wjb wjbVar = y99Var.J0;
                    int i = y99Var.a;
                    StringBuilder sb = new StringBuilder();
                    sb.append(tL_starGiftUnique.title);
                    sb.append(" #");
                    String m = ls6.m(tL_starGiftUnique.num, ',', sb);
                    long j = this.d;
                    new aqa(context, wjbVar, tL_starGiftUnique, ypaVar, i, j, m, true, new et4(y99Var, tL_starGiftUnique, j, (byte) 5)).b();
                    return;
                }
                return;
            default:
                long longValue = ((Long) obj3).longValue();
                long j2 = this.d;
                ((vqa) obj5).j1(j2, (TL_stars.starGiftDepositPayload) obj4, longValue, (c01) obj, (xu4) obj2);
                return;
        }
    }

    public zz7(y99 y99Var, hd hdVar, oj ojVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j) {
        this.e = y99Var;
        this.f = hdVar;
        this.b = ojVar;
        this.c = tL_starGiftUnique;
        this.d = j;
    }

    public zz7(vqa vqaVar, long j, TL_stars.starGiftDepositPayload stargiftdepositpayload, Long l, xu4 xu4Var) {
        this.e = vqaVar;
        this.d = j;
        this.b = stargiftdepositpayload;
        this.c = l;
        this.f = xu4Var;
    }
}
