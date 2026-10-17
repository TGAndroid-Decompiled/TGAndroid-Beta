package ai;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class h6 {
    public final ag.c f1425a;
    public final TLRPC.TL_payments_paymentFormStarGift f1426b;
    public final ag.a f1427c;

    public h6(ag.c cVar, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift) {
        long j10;
        this.f1425a = cVar;
        this.f1426b = tL_payments_paymentFormStarGift;
        fa[][] faVarArr = fa.S;
        if (tL_payments_paymentFormStarGift != null) {
            ArrayList<TLRPC.TL_labeledPrice> arrayList = tL_payments_paymentFormStarGift.invoice.prices;
            int size = arrayList.size();
            int i10 = 0;
            j10 = 0;
            while (i10 < size) {
                TLRPC.TL_labeledPrice tL_labeledPrice = arrayList.get(i10);
                i10++;
                j10 += tL_labeledPrice.amount;
            }
        } else {
            j10 = 0;
        }
        ag.c cVar2 = ag.c.f635a;
        if (cVar == cVar2) {
            this.f1427c = ag.a.g(j10, cVar2);
            return;
        }
        ag.c cVar3 = ag.c.f636b;
        if (cVar == cVar3) {
            this.f1427c = ag.a.i(j10, cVar3);
        } else {
            this.f1427c = ag.a.i(0L, cVar2);
        }
    }
}
