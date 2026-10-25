package org.telegram.messenger;

import org.telegram.messenger.GiftAuctionController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
public final class f4 implements Utilities.Callback2 {
    public final int f20049a = 0;
    public final GiftAuctionController f20050b;
    public final GiftAuctionController.AuctionInternal f20051c;
    public final Object d;

    public f4(GiftAuctionController giftAuctionController, GiftAuctionController.AuctionInternal auctionInternal, Utilities.Callback2 callback2) {
        this.f20050b = giftAuctionController;
        this.f20051c = auctionInternal;
        this.d = callback2;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f20049a) {
            case 0:
                this.f20050b.lambda$sendBid$8(this.f20051c, (Utilities.Callback2) this.d, (TLRPC.payments_PaymentResult) obj, (TLRPC.TL_error) obj2);
                return;
            default:
                this.f20050b.lambda$getOrRequestAcquiredGifts$11((Utilities.Callback) this.d, this.f20051c, (TL_payments.TL_StarGiftAuctionAcquiredGifts) obj, (TLRPC.TL_error) obj2);
                return;
        }
    }

    public f4(GiftAuctionController giftAuctionController, Utilities.Callback callback, GiftAuctionController.AuctionInternal auctionInternal) {
        this.f20050b = giftAuctionController;
        this.d = callback;
        this.f20051c = auctionInternal;
    }
}
