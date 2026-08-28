package gh;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class m4 {
    public final gf.b f8543a;
    public final TLRPC.TL_payments_paymentFormStarGift f8544b;
    public final gf.a f8545c;

    public m4(gf.b bVar, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift) {
        long j10;
        this.f8543a = bVar;
        this.f8544b = tL_payments_paymentFormStarGift;
        v7[][] v7VarArr = v7.S;
        if (tL_payments_paymentFormStarGift != null) {
            ArrayList<TLRPC.TL_labeledPrice> arrayList = tL_payments_paymentFormStarGift.invoice.prices;
            int size = arrayList.size();
            int i9 = 0;
            j10 = 0;
            while (i9 < size) {
                TLRPC.TL_labeledPrice tL_labeledPrice = arrayList.get(i9);
                i9++;
                j10 += tL_labeledPrice.amount;
            }
        } else {
            j10 = 0;
        }
        gf.b bVar2 = gf.b.f7749a;
        if (bVar == bVar2) {
            this.f8545c = gf.a.g(j10, bVar2);
            return;
        }
        gf.b bVar3 = gf.b.f7750b;
        if (bVar == bVar3) {
            this.f8545c = gf.a.i(j10, bVar3);
        } else {
            this.f8545c = gf.a.i(0L, bVar2);
        }
    }
}
