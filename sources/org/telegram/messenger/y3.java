package org.telegram.messenger;

import org.telegram.messenger.GiftAuctionController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
public final class y3 implements Utilities.Callback2 {
    public final int f18154a = 0;
    public final GiftAuctionController f18155b;
    public final GiftAuctionController.AuctionInternal f18156c;
    public final Object d;

    public y3(GiftAuctionController giftAuctionController, GiftAuctionController.AuctionInternal auctionInternal, Utilities.Callback2 callback2) {
        this.f18155b = giftAuctionController;
        this.f18156c = auctionInternal;
        this.d = callback2;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f18154a) {
            case 0:
                this.f18155b.lambda$sendBid$8(this.f18156c, (Utilities.Callback2) this.d, (TLRPC.payments_PaymentResult) obj, (TLRPC.TL_error) obj2);
                return;
            default:
                this.f18155b.lambda$getOrRequestAcquiredGifts$11((Utilities.Callback) this.d, this.f18156c, (TL_payments.TL_StarGiftAuctionAcquiredGifts) obj, (TLRPC.TL_error) obj2);
                return;
        }
    }

    public y3(GiftAuctionController giftAuctionController, Utilities.Callback callback, GiftAuctionController.AuctionInternal auctionInternal) {
        this.f18155b = giftAuctionController;
        this.d = callback;
        this.f18156c = auctionInternal;
    }
}
