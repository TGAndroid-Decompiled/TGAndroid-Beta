package bi;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class h6 {
    public final cg.b f3997a;
    public final TLRPC.TL_payments_paymentFormStarGift f3998b;
    public final cg.a f3999c;

    public h6(cg.b bVar, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift) {
        long j3;
        this.f3997a = bVar;
        this.f3998b = tL_payments_paymentFormStarGift;
        ea[][] eaVarArr = ea.S;
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
        cg.b bVar2 = cg.b.f6160a;
        if (bVar == bVar2) {
            this.f3999c = cg.a.g(j3, bVar2);
            return;
        }
        cg.b bVar3 = cg.b.f6161b;
        if (bVar == bVar3) {
            this.f3999c = cg.a.i(j3, bVar3);
        } else {
            this.f3999c = cg.a.i(0L, bVar2);
        }
    }
}
