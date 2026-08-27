package hh;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

public final class k4 {

    public final hf.b f9578a;

    public final TLRPC.TL_payments_paymentFormStarGift f9579b;

    public final hf.a f9580c;

    public k4(hf.b bVar, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift) {
        long j10;
        this.f9578a = bVar;
        this.f9579b = tL_payments_paymentFormStarGift;
        u7[][] u7VarArr = u7.S;
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
        hf.b bVar2 = hf.b.f8921a;
        if (bVar == bVar2) {
            this.f9580c = hf.a.g(j10, bVar2);
            return;
        }
        hf.b bVar3 = hf.b.f8922b;
        if (bVar == bVar3) {
            this.f9580c = hf.a.i(j10, bVar3);
        } else {
            this.f9580c = hf.a.i(0L, bVar2);
        }
    }
}
