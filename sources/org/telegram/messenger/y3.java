package org.telegram.messenger;

import org.telegram.messenger.GiftAuctionController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
public final class y3 implements Utilities.Callback2 {
    public final int f17925a = 0;
    public final GiftAuctionController f17926b;
    public final GiftAuctionController.AuctionInternal f17927c;
    public final Object d;

    public y3(GiftAuctionController giftAuctionController, GiftAuctionController.AuctionInternal auctionInternal, Utilities.Callback2 callback2) {
        this.f17926b = giftAuctionController;
        this.f17927c = auctionInternal;
        this.d = callback2;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f17925a) {
            case 0:
                this.f17926b.lambda$sendBid$8(this.f17927c, (Utilities.Callback2) this.d, (TLRPC.payments_PaymentResult) obj, (TLRPC.TL_error) obj2);
                return;
            default:
                this.f17926b.lambda$getOrRequestAcquiredGifts$11((Utilities.Callback) this.d, this.f17927c, (TL_payments.TL_StarGiftAuctionAcquiredGifts) obj, (TLRPC.TL_error) obj2);
                return;
        }
    }

    public y3(GiftAuctionController giftAuctionController, Utilities.Callback callback, GiftAuctionController.AuctionInternal auctionInternal) {
        this.f17926b = giftAuctionController;
        this.d = callback;
        this.f17927c = auctionInternal;
    }
}
