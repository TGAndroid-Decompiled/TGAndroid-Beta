package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;

public final class GiftAuctionController$$ExternalSyntheticLambda0 implements Utilities.Callback2 {
    public final int $r8$classId = 0;
    public final GiftAuctionController f$0;
    public final GiftAuctionController.AuctionInternal f$1;
    public final Object f$2;

    public GiftAuctionController$$ExternalSyntheticLambda0(GiftAuctionController giftAuctionController, GiftAuctionController.AuctionInternal auctionInternal, Utilities.Callback2 callback2) {
        this.f$0 = giftAuctionController;
        this.f$1 = auctionInternal;
        this.f$2 = callback2;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$sendBid$8(this.f$1, (Utilities.Callback2) this.f$2, (TLRPC.payments_PaymentResult) obj, (TLRPC.TL_error) obj2);
                break;
            default:
                GiftAuctionController giftAuctionController = this.f$0;
                GiftAuctionController.AuctionInternal auctionInternal = this.f$1;
                giftAuctionController.lambda$getOrRequestAcquiredGifts$11((Utilities.Callback) this.f$2, auctionInternal, (TL_payments.TL_StarGiftAuctionAcquiredGifts) obj, (TLRPC.TL_error) obj2);
                break;
        }
    }

    public GiftAuctionController$$ExternalSyntheticLambda0(GiftAuctionController giftAuctionController, Utilities.Callback callback, GiftAuctionController.AuctionInternal auctionInternal) {
        this.f$0 = giftAuctionController;
        this.f$2 = callback;
        this.f$1 = auctionInternal;
    }
}
