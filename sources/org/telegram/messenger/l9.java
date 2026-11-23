package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stars;
public final class l9 implements p10 {
    public final int f25455a = 0;
    public final u9 f25456b;
    public final r9 f25457c;
    public final Object d;

    public l9(u9 u9Var, r9 r9Var, bi.n nVar) {
        this.f25456b = u9Var;
        this.f25457c = r9Var;
        this.d = nVar;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        switch (this.f25455a) {
            case 0:
                u9 u9Var = this.f25456b;
                r9 r9Var = this.f25457c;
                bi.n nVar = (bi.n) this.d;
                TLRPC.payments_PaymentResult payments_paymentresult = (TLRPC.payments_PaymentResult) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                r9Var.f26662f = false;
                if (payments_paymentresult instanceof TLRPC.TL_payments_paymentResult) {
                    Utilities.d.c(new w3(4, u9Var, (TLRPC.TL_payments_paymentResult) payments_paymentresult));
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
                u9 u9Var2 = this.f25456b;
                w10 w10Var = (w10) this.d;
                r9 r9Var2 = this.f25457c;
                TL_payments.TL_StarGiftAuctionAcquiredGifts tL_StarGiftAuctionAcquiredGifts = (TL_payments.TL_StarGiftAuctionAcquiredGifts) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                if (tL_StarGiftAuctionAcquiredGifts == null) {
                    u9Var2.getClass();
                    w10Var.a(null);
                    return;
                }
                u9Var2.getMessagesController().f4(tL_StarGiftAuctionAcquiredGifts.users, false);
                u9Var2.getMessagesController().Z3(tL_StarGiftAuctionAcquiredGifts.chats, false);
                ArrayList<TL_stars.TL_StarGiftAuctionAcquiredGift> arrayList = tL_StarGiftAuctionAcquiredGifts.gifts;
                r9Var2.f26663g = arrayList;
                w10Var.a(arrayList);
                return;
        }
    }

    public l9(u9 u9Var, w10 w10Var, r9 r9Var) {
        this.f25456b = u9Var;
        this.d = w10Var;
        this.f25457c = r9Var;
    }
}
