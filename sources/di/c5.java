package di;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class c5 {
    public final cg.b f8303a;
    public final TLRPC.TL_payments_paymentFormStarGift f8304b;
    public final cg.a f8305c;

    public c5(cg.b bVar, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift) {
        long j3;
        this.f8303a = bVar;
        this.f8304b = tL_payments_paymentFormStarGift;
        v8[][] v8VarArr = v8.S;
        if (tL_payments_paymentFormStarGift != null) {
            ArrayList<TLRPC.TL_labeledPrice> arrayList = tL_payments_paymentFormStarGift.invoice.prices;
            int size = arrayList.size();
            int i7 = 0;
            j3 = 0;
            while (i7 < size) {
                TLRPC.TL_labeledPrice tL_labeledPrice = arrayList.get(i7);
                i7++;
                j3 += tL_labeledPrice.amount;
            }
        } else {
            j3 = 0;
        }
        cg.b bVar2 = cg.b.f4987a;
        if (bVar == bVar2) {
            this.f8305c = cg.a.g(j3, bVar2);
            return;
        }
        cg.b bVar3 = cg.b.f4988b;
        if (bVar == bVar3) {
            this.f8305c = cg.a.i(j3, bVar3);
        } else {
            this.f8305c = cg.a.i(0L, bVar2);
        }
    }
}
