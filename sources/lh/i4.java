package lh;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class i4 {
    public final lf.b f12569a;
    public final TLRPC.TL_payments_paymentFormStarGift f12570b;
    public final lf.a f12571c;

    public i4(lf.b bVar, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift) {
        long j10;
        this.f12569a = bVar;
        this.f12570b = tL_payments_paymentFormStarGift;
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
        lf.b bVar2 = lf.b.f12056a;
        if (bVar == bVar2) {
            this.f12571c = lf.a.g(j10, bVar2);
            return;
        }
        lf.b bVar3 = lf.b.f12057b;
        if (bVar == bVar3) {
            this.f12571c = lf.a.i(j10, bVar3);
        } else {
            this.f12571c = lf.a.i(0L, bVar2);
        }
    }
}
