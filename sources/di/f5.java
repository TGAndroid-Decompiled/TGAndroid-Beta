package di;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class f5 {
    public final cg.b f8764a;
    public final TLRPC.TL_payments_paymentFormStarGift f8765b;
    public final cg.a f8766c;

    public f5(cg.b bVar, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift) {
        long j3;
        this.f8764a = bVar;
        this.f8765b = tL_payments_paymentFormStarGift;
        x8[][] x8VarArr = x8.S;
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
        cg.b bVar2 = cg.b.f5273a;
        if (bVar == bVar2) {
            this.f8766c = cg.a.h(j3, bVar2);
            return;
        }
        cg.b bVar3 = cg.b.f5274b;
        if (bVar == bVar3) {
            this.f8766c = cg.a.j(j3, bVar3);
        } else {
            this.f8766c = cg.a.j(0L, bVar2);
        }
    }
}
