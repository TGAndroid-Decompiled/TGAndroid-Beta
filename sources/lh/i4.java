package lh;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class i4 {
    public final mf.b f12585a;
    public final TLRPC.TL_payments_paymentFormStarGift f12586b;
    public final mf.a f12587c;

    public i4(mf.b bVar, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift) {
        long j10;
        this.f12585a = bVar;
        this.f12586b = tL_payments_paymentFormStarGift;
        t7[][] t7VarArr = t7.S;
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
        mf.b bVar2 = mf.b.f13930a;
        if (bVar == bVar2) {
            this.f12587c = mf.a.g(j10, bVar2);
            return;
        }
        mf.b bVar3 = mf.b.f13931b;
        if (bVar == bVar3) {
            this.f12587c = mf.a.i(j10, bVar3);
        } else {
            this.f12587c = mf.a.i(0L, bVar2);
        }
    }
}
