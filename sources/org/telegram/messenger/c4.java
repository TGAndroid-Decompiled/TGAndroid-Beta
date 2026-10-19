package org.telegram.messenger;

import org.telegram.messenger.GiftAuctionController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
public final class c4 implements Utilities.Callback2 {
    public final int f18013a = 0;
    public final GiftAuctionController f18014b;
    public final GiftAuctionController.AuctionInternal f18015c;
    public final Object d;

    public c4(GiftAuctionController giftAuctionController, GiftAuctionController.AuctionInternal auctionInternal, Utilities.Callback2 callback2) {
        this.f18014b = giftAuctionController;
        this.f18015c = auctionInternal;
        this.d = callback2;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f18013a) {
            case 0:
                this.f18014b.lambda$sendBid$8(this.f18015c, (Utilities.Callback2) this.d, (TLRPC.payments_PaymentResult) obj, (TLRPC.TL_error) obj2);
                return;
            default:
                this.f18014b.lambda$getOrRequestAcquiredGifts$11((Utilities.Callback) this.d, this.f18015c, (TL_payments.TL_StarGiftAuctionAcquiredGifts) obj, (TLRPC.TL_error) obj2);
                return;
        }
    }

    public c4(GiftAuctionController giftAuctionController, Utilities.Callback callback, GiftAuctionController.AuctionInternal auctionInternal) {
        this.f18014b = giftAuctionController;
        this.d = callback;
        this.f18015c = auctionInternal;
    }
}
