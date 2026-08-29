package jh;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class j4 {
    public final kf.b f12313a;
    public final TLRPC.TL_payments_paymentFormStarGift f12314b;
    public final kf.a f12315c;

    public j4(kf.b bVar, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift) {
        long j10;
        this.f12313a = bVar;
        this.f12314b = tL_payments_paymentFormStarGift;
        s7[][] s7VarArr = s7.S;
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
        kf.b bVar2 = kf.b.f13635a;
        if (bVar == bVar2) {
            this.f12315c = kf.a.g(j10, bVar2);
            return;
        }
        kf.b bVar3 = kf.b.f13636b;
        if (bVar == bVar3) {
            this.f12315c = kf.a.i(j10, bVar3);
        } else {
            this.f12315c = kf.a.i(0L, bVar2);
        }
    }
}
