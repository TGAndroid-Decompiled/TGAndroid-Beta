package defpackage;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class ypa {
    public final oj a;
    public final TLRPC.TL_payments_paymentFormStarGift b;
    public final nj c;

    public ypa(oj ojVar, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift) {
        long j;
        this.a = ojVar;
        this.b = tL_payments_paymentFormStarGift;
        gta[][] gtaVarArr = gta.S;
        if (tL_payments_paymentFormStarGift != null) {
            ArrayList<TLRPC.TL_labeledPrice> arrayList = tL_payments_paymentFormStarGift.invoice.prices;
            int size = arrayList.size();
            int i = 0;
            j = 0;
            while (i < size) {
                TLRPC.TL_labeledPrice tL_labeledPrice = arrayList.get(i);
                i++;
                j += tL_labeledPrice.amount;
            }
        } else {
            j = 0;
        }
        oj ojVar2 = oj.a;
        if (ojVar == ojVar2) {
            this.c = nj.h(j, ojVar2);
            return;
        }
        oj ojVar3 = oj.b;
        if (ojVar == ojVar3) {
            this.c = nj.j(j, ojVar3);
        } else {
            this.c = nj.j(0L, ojVar2);
        }
    }
}
