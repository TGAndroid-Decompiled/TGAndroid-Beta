package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.a80;
public final class o9 implements j20 {
    public final int f17240a = 1;
    public final x9 f17241b;
    public final u9 f17242c;
    public final Object d;

    public o9(x9 x9Var, u9 u9Var, a80 a80Var) {
        this.f17241b = x9Var;
        this.f17242c = u9Var;
        this.d = a80Var;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        switch (this.f17240a) {
            case 0:
                x9 x9Var = this.f17241b;
                u9 u9Var = this.f17242c;
                a80 a80Var = (a80) this.d;
                TLRPC.payments_PaymentResult payments_paymentresult = (TLRPC.payments_PaymentResult) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                u9Var.f18272f = false;
                if (payments_paymentresult instanceof TLRPC.TL_payments_paymentResult) {
                    Utilities.d.c(new e4(4, x9Var, (TLRPC.TL_payments_paymentResult) payments_paymentresult));
                    a80Var.a(Boolean.TRUE, null);
                    return;
                } else if (tL_error != null) {
                    a80Var.a(Boolean.FALSE, tL_error.text);
                    return;
                } else {
                    a80Var.a(Boolean.FALSE, null);
                    return;
                }
            default:
                x9 x9Var2 = this.f17241b;
                q20 q20Var = (q20) this.d;
                u9 u9Var2 = this.f17242c;
                TL_payments.TL_StarGiftAuctionAcquiredGifts tL_StarGiftAuctionAcquiredGifts = (TL_payments.TL_StarGiftAuctionAcquiredGifts) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                if (tL_StarGiftAuctionAcquiredGifts == null) {
                    x9Var2.getClass();
                    q20Var.a(null);
                    return;
                }
                x9Var2.getMessagesController().V3(tL_StarGiftAuctionAcquiredGifts.users, false);
                x9Var2.getMessagesController().P3(tL_StarGiftAuctionAcquiredGifts.chats, false);
                ArrayList<TL_stars.TL_StarGiftAuctionAcquiredGift> arrayList = tL_StarGiftAuctionAcquiredGifts.gifts;
                u9Var2.f18273g = arrayList;
                q20Var.a(arrayList);
                return;
        }
    }

    public o9(x9 x9Var, q20 q20Var, u9 u9Var) {
        this.f17241b = x9Var;
        this.d = q20Var;
        this.f17242c = u9Var;
    }
}
