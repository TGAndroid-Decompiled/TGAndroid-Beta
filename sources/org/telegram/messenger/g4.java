package org.telegram.messenger;

import org.telegram.messenger.GiftAuctionController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
public final class g4 implements Utilities.Callback2 {
    public final int f20133a = 0;
    public final GiftAuctionController f20134b;
    public final GiftAuctionController.AuctionInternal f20135c;
    public final Object d;

    public g4(GiftAuctionController giftAuctionController, GiftAuctionController.AuctionInternal auctionInternal, Utilities.Callback2 callback2) {
        this.f20134b = giftAuctionController;
        this.f20135c = auctionInternal;
        this.d = callback2;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f20133a) {
            case 0:
                this.f20134b.lambda$sendBid$8(this.f20135c, (Utilities.Callback2) this.d, (TLRPC.payments_PaymentResult) obj, (TLRPC.TL_error) obj2);
                return;
            default:
                this.f20134b.lambda$getOrRequestAcquiredGifts$11((Utilities.Callback) this.d, this.f20135c, (TL_payments.TL_StarGiftAuctionAcquiredGifts) obj, (TLRPC.TL_error) obj2);
                return;
        }
    }

    public g4(GiftAuctionController giftAuctionController, Utilities.Callback callback, GiftAuctionController.AuctionInternal auctionInternal) {
        this.f20134b = giftAuctionController;
        this.d = callback;
        this.f20135c = auctionInternal;
    }
}
