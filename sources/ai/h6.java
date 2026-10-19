package ai;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class h6 {
    public final ag.b f1406a;
    public final TLRPC.TL_payments_paymentFormStarGift f1407b;
    public final ag.a f1408c;

    public h6(ag.b bVar, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift) {
        long j10;
        this.f1406a = bVar;
        this.f1407b = tL_payments_paymentFormStarGift;
        ga[][] gaVarArr = ga.S;
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
        ag.b bVar2 = ag.b.f633a;
        if (bVar == bVar2) {
            this.f1408c = ag.a.g(j10, bVar2);
            return;
        }
        ag.b bVar3 = ag.b.f634b;
        if (bVar == bVar3) {
            this.f1408c = ag.a.i(j10, bVar3);
        } else {
            this.f1408c = ag.a.i(0L, bVar2);
        }
    }
}
