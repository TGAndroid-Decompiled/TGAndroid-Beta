package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stars;
public final class m9 implements r10 {
    public final int f25542a = 0;
    public final v9 f25543b;
    public final s9 f25544c;
    public final Object d;

    public m9(v9 v9Var, s9 s9Var, bi.n nVar) {
        this.f25543b = v9Var;
        this.f25544c = s9Var;
        this.d = nVar;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        switch (this.f25542a) {
            case 0:
                v9 v9Var = this.f25543b;
                s9 s9Var = this.f25544c;
                bi.n nVar = (bi.n) this.d;
                TLRPC.payments_PaymentResult payments_paymentresult = (TLRPC.payments_PaymentResult) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                s9Var.f26775f = false;
                if (payments_paymentresult instanceof TLRPC.TL_payments_paymentResult) {
                    Utilities.d.c(new w3(4, v9Var, (TLRPC.TL_payments_paymentResult) payments_paymentresult));
                    nVar.a(Boolean.TRUE, null);
                    return;
                } else if (tL_error != null) {
                    nVar.a(Boolean.FALSE, tL_error.text);
                    return;
                } else {
                    nVar.a(Boolean.FALSE, null);
                    return;
                }
            default:
                v9 v9Var2 = this.f25543b;
                y10 y10Var = (y10) this.d;
                s9 s9Var2 = this.f25544c;
                TL_payments.TL_StarGiftAuctionAcquiredGifts tL_StarGiftAuctionAcquiredGifts = (TL_payments.TL_StarGiftAuctionAcquiredGifts) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                if (tL_StarGiftAuctionAcquiredGifts == null) {
                    v9Var2.getClass();
                    y10Var.a(null);
                    return;
                }
                v9Var2.getMessagesController().f4(tL_StarGiftAuctionAcquiredGifts.users, false);
                v9Var2.getMessagesController().Z3(tL_StarGiftAuctionAcquiredGifts.chats, false);
                ArrayList<TL_stars.TL_StarGiftAuctionAcquiredGift> arrayList = tL_StarGiftAuctionAcquiredGifts.gifts;
                s9Var2.f26776g = arrayList;
                y10Var.a(arrayList);
                return;
        }
    }

    public m9(v9 v9Var, y10 y10Var, s9 s9Var) {
        this.f25543b = v9Var;
        this.d = y10Var;
        this.f25544c = s9Var;
    }
}
