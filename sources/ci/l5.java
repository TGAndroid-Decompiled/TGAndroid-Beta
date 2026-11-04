package ci;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class l5 {
    public final dg.b f5442a;
    public final TLRPC.TL_payments_paymentFormStarGift f5443b;
    public final dg.a f5444c;

    public l5(dg.b bVar, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift) {
        long j10;
        this.f5442a = bVar;
        this.f5443b = tL_payments_paymentFormStarGift;
        e9[][] e9VarArr = e9.S;
        if (tL_payments_paymentFormStarGift != null) {
            ArrayList<TLRPC.TL_labeledPrice> arrayList = tL_payments_paymentFormStarGift.invoice.prices;
            int size = arrayList.size();
            int i3 = 0;
            j10 = 0;
            while (i3 < size) {
                TLRPC.TL_labeledPrice tL_labeledPrice = arrayList.get(i3);
                i3++;
                j10 += tL_labeledPrice.amount;
            }
        } else {
            j10 = 0;
        }
        dg.b bVar2 = dg.b.f8925a;
        if (bVar == bVar2) {
            this.f5444c = dg.a.g(j10, bVar2);
            return;
        }
        dg.b bVar3 = dg.b.f8926b;
        if (bVar == bVar3) {
            this.f5444c = dg.a.i(j10, bVar3);
        } else {
            this.f5444c = dg.a.i(0L, bVar2);
        }
    }
}
