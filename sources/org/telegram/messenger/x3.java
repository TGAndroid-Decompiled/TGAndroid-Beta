package org.telegram.messenger;

import org.telegram.messenger.GiftAuctionController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
public final class x3 implements Utilities.Callback2 {
    public final int f22080a = 0;
    public final GiftAuctionController f22081b;
    public final GiftAuctionController.AuctionInternal f22082c;
    public final Object d;

    public x3(GiftAuctionController giftAuctionController, GiftAuctionController.AuctionInternal auctionInternal, Utilities.Callback2 callback2) {
        this.f22081b = giftAuctionController;
        this.f22082c = auctionInternal;
        this.d = callback2;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f22080a) {
            case 0:
                this.f22081b.lambda$sendBid$8(this.f22082c, (Utilities.Callback2) this.d, (TLRPC.payments_PaymentResult) obj, (TLRPC.TL_error) obj2);
                return;
            default:
                this.f22081b.lambda$getOrRequestAcquiredGifts$11((Utilities.Callback) this.d, this.f22082c, (TL_payments.TL_StarGiftAuctionAcquiredGifts) obj, (TLRPC.TL_error) obj2);
                return;
        }
    }

    public x3(GiftAuctionController giftAuctionController, Utilities.Callback callback, GiftAuctionController.AuctionInternal auctionInternal) {
        this.f22081b = giftAuctionController;
        this.d = callback;
        this.f22082c = auctionInternal;
    }
}
