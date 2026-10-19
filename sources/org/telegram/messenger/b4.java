package org.telegram.messenger;

import org.telegram.messenger.GiftAuctionController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
public final class b4 implements Utilities.Callback2 {
    public final int f17924a = 0;
    public final GiftAuctionController f17925b;
    public final GiftAuctionController.AuctionInternal f17926c;
    public final Object d;

    public b4(GiftAuctionController giftAuctionController, GiftAuctionController.AuctionInternal auctionInternal, Utilities.Callback2 callback2) {
        this.f17925b = giftAuctionController;
        this.f17926c = auctionInternal;
        this.d = callback2;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f17924a) {
            case 0:
                this.f17925b.lambda$sendBid$8(this.f17926c, (Utilities.Callback2) this.d, (TLRPC.payments_PaymentResult) obj, (TLRPC.TL_error) obj2);
                return;
            default:
                this.f17925b.lambda$getOrRequestAcquiredGifts$11((Utilities.Callback) this.d, this.f17926c, (TL_payments.TL_StarGiftAuctionAcquiredGifts) obj, (TLRPC.TL_error) obj2);
                return;
        }
    }

    public b4(GiftAuctionController giftAuctionController, Utilities.Callback callback, GiftAuctionController.AuctionInternal auctionInternal) {
        this.f17925b = giftAuctionController;
        this.d = callback;
        this.f17926c = auctionInternal;
    }
}
