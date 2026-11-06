package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stars;
public final class n9 implements v10 {
    public final int f24143a = 1;
    public final w9 f24144b;
    public final t9 f24145c;
    public final Object d;

    public n9(w9 w9Var, t9 t9Var, ii.g0 g0Var) {
        this.f24144b = w9Var;
        this.f24145c = t9Var;
        this.d = g0Var;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        switch (this.f24143a) {
            case 0:
                w9 w9Var = this.f24144b;
                t9 t9Var = this.f24145c;
                ii.g0 g0Var = (ii.g0) this.d;
                TLRPC.payments_PaymentResult payments_paymentresult = (TLRPC.payments_PaymentResult) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                t9Var.f25591f = false;
                if (payments_paymentresult instanceof TLRPC.TL_payments_paymentResult) {
                    Utilities.d.c(new b4(4, w9Var, (TLRPC.TL_payments_paymentResult) payments_paymentresult));
                    g0Var.a(Boolean.TRUE, null);
                    return;
                } else if (tL_error != null) {
                    g0Var.a(Boolean.FALSE, tL_error.text);
                    return;
                } else {
                    g0Var.a(Boolean.FALSE, null);
                    return;
                }
            default:
                w9 w9Var2 = this.f24144b;
                c20 c20Var = (c20) this.d;
                t9 t9Var2 = this.f24145c;
                TL_payments.TL_StarGiftAuctionAcquiredGifts tL_StarGiftAuctionAcquiredGifts = (TL_payments.TL_StarGiftAuctionAcquiredGifts) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                if (tL_StarGiftAuctionAcquiredGifts == null) {
                    w9Var2.getClass();
                    c20Var.a(null);
                    return;
                }
                w9Var2.getMessagesController().Y3(tL_StarGiftAuctionAcquiredGifts.users, false);
                w9Var2.getMessagesController().S3(tL_StarGiftAuctionAcquiredGifts.chats, false);
                ArrayList<TL_stars.TL_StarGiftAuctionAcquiredGift> arrayList = tL_StarGiftAuctionAcquiredGifts.gifts;
                t9Var2.f25592g = arrayList;
                c20Var.a(arrayList);
                return;
        }
    }

    public n9(w9 w9Var, c20 c20Var, t9 t9Var) {
        this.f24144b = w9Var;
        this.d = c20Var;
        this.f24145c = t9Var;
    }
}
