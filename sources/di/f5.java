package di;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class f5 {
    public final cg.b f8791a;
    public final TLRPC.TL_payments_paymentFormStarGift f8792b;
    public final cg.a f8793c;

    public f5(cg.b bVar, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift) {
        long j3;
        this.f8791a = bVar;
        this.f8792b = tL_payments_paymentFormStarGift;
        y8[][] y8VarArr = y8.S;
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
        cg.b bVar2 = cg.b.f5305a;
        if (bVar == bVar2) {
            this.f8793c = cg.a.h(j3, bVar2);
            return;
        }
        cg.b bVar3 = cg.b.f5306b;
        if (bVar == bVar3) {
            this.f8793c = cg.a.j(j3, bVar3);
        } else {
            this.f8793c = cg.a.j(0L, bVar2);
        }
    }
}
