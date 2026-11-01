package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.z70;
public final class p9 implements k20 {
    public final int f17573a = 1;
    public final y9 f17574b;
    public final v9 f17575c;
    public final Object d;

    public p9(y9 y9Var, v9 v9Var, z70 z70Var) {
        this.f17574b = y9Var;
        this.f17575c = v9Var;
        this.d = z70Var;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        switch (this.f17573a) {
            case 0:
                y9 y9Var = this.f17574b;
                v9 v9Var = this.f17575c;
                z70 z70Var = (z70) this.d;
                TLRPC.payments_PaymentResult payments_paymentresult = (TLRPC.payments_PaymentResult) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                v9Var.f18601f = false;
                if (payments_paymentresult instanceof TLRPC.TL_payments_paymentResult) {
                    Utilities.d.c(new e4(4, y9Var, (TLRPC.TL_payments_paymentResult) payments_paymentresult));
                    z70Var.a(Boolean.TRUE, null);
                    return;
                } else if (tL_error != null) {
                    z70Var.a(Boolean.FALSE, tL_error.text);
                    return;
                } else {
                    z70Var.a(Boolean.FALSE, null);
                    return;
                }
            default:
                y9 y9Var2 = this.f17574b;
                r20 r20Var = (r20) this.d;
                v9 v9Var2 = this.f17575c;
                TL_payments.TL_StarGiftAuctionAcquiredGifts tL_StarGiftAuctionAcquiredGifts = (TL_payments.TL_StarGiftAuctionAcquiredGifts) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                if (tL_StarGiftAuctionAcquiredGifts == null) {
                    y9Var2.getClass();
                    r20Var.a(null);
                    return;
                }
                y9Var2.getMessagesController().V3(tL_StarGiftAuctionAcquiredGifts.users, false);
                y9Var2.getMessagesController().P3(tL_StarGiftAuctionAcquiredGifts.chats, false);
                ArrayList<TL_stars.TL_StarGiftAuctionAcquiredGift> arrayList = tL_StarGiftAuctionAcquiredGifts.gifts;
                v9Var2.f18602g = arrayList;
                r20Var.a(arrayList);
                return;
        }
    }

    public p9(y9 y9Var, r20 r20Var, v9 v9Var) {
        this.f17574b = y9Var;
        this.d = r20Var;
        this.f17575c = v9Var;
    }
}
