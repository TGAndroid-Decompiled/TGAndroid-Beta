package bi;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class d6 {
    public final bg.b f4492a;
    public final TLRPC.TL_payments_paymentFormStarGift f4493b;
    public final bg.a f4494c;

    public d6(bg.b bVar, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift) {
        long j10;
        this.f4492a = bVar;
        this.f4493b = tL_payments_paymentFormStarGift;
        ca[][] caVarArr = ca.S;
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
        bg.b bVar2 = bg.b.f3980a;
        if (bVar == bVar2) {
            this.f4494c = bg.a.g(j10, bVar2);
            return;
        }
        bg.b bVar3 = bg.b.f3981b;
        if (bVar == bVar3) {
            this.f4494c = bg.a.i(j10, bVar3);
        } else {
            this.f4494c = bg.a.i(0L, bVar2);
        }
    }
}
