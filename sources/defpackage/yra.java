package defpackage;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class yra {
    public final ok a;
    public final TLRPC.TL_payments_paymentFormStarGift b;
    public final nk c;

    public yra(ok okVar, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift) {
        long j;
        this.a = okVar;
        this.b = tL_payments_paymentFormStarGift;
        jva[][] jvaVarArr = jva.S;
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
        ok okVar2 = ok.a;
        if (okVar == okVar2) {
            this.c = nk.h(j, okVar2);
            return;
        }
        ok okVar3 = ok.b;
        if (okVar == okVar3) {
            this.c = nk.j(j, okVar3);
        } else {
            this.c = nk.j(0L, okVar2);
        }
    }
}
