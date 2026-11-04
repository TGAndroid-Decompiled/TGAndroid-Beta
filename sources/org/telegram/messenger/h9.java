package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stars;
public final class h9 implements n10 {
    public final int f22902a = 0;
    public final q9 f22903b;
    public final n9 f22904c;
    public final Object d;

    public h9(q9 q9Var, n9 n9Var, ai.r rVar) {
        this.f22903b = q9Var;
        this.f22904c = n9Var;
        this.d = rVar;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        switch (this.f22902a) {
            case 0:
                q9 q9Var = this.f22903b;
                n9 n9Var = this.f22904c;
                ai.r rVar = (ai.r) this.d;
                TLRPC.payments_PaymentResult payments_paymentresult = (TLRPC.payments_PaymentResult) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                n9Var.f24338f = false;
                if (payments_paymentresult instanceof TLRPC.TL_payments_paymentResult) {
                    Utilities.d.c(new b4(4, q9Var, (TLRPC.TL_payments_paymentResult) payments_paymentresult));
                    rVar.a(Boolean.TRUE, null);
                    return;
                } else if (tL_error != null) {
                    rVar.a(Boolean.FALSE, tL_error.text);
                    return;
                } else {
                    rVar.a(Boolean.FALSE, null);
                    return;
                }
            default:
                q9 q9Var2 = this.f22903b;
                u10 u10Var = (u10) this.d;
                n9 n9Var2 = this.f22904c;
                TL_payments.TL_StarGiftAuctionAcquiredGifts tL_StarGiftAuctionAcquiredGifts = (TL_payments.TL_StarGiftAuctionAcquiredGifts) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                if (tL_StarGiftAuctionAcquiredGifts == null) {
                    q9Var2.getClass();
                    u10Var.a(null);
                    return;
                }
                q9Var2.getMessagesController().Y3(tL_StarGiftAuctionAcquiredGifts.users, false);
                q9Var2.getMessagesController().S3(tL_StarGiftAuctionAcquiredGifts.chats, false);
                ArrayList<TL_stars.TL_StarGiftAuctionAcquiredGift> arrayList = tL_StarGiftAuctionAcquiredGifts.gifts;
                n9Var2.f24339g = arrayList;
                u10Var.a(arrayList);
                return;
        }
    }

    public h9(q9 q9Var, u10 u10Var, n9 n9Var) {
        this.f22903b = q9Var;
        this.d = u10Var;
        this.f22904c = n9Var;
    }
}
