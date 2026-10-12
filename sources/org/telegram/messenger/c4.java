package org.telegram.messenger;

import org.telegram.messenger.GiftAuctionController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
public final class c4 implements Utilities.Callback2 {
    public final int f16930a = 0;
    public final GiftAuctionController f16931b;
    public final GiftAuctionController.AuctionInternal f16932c;
    public final Object d;

    public c4(GiftAuctionController giftAuctionController, GiftAuctionController.AuctionInternal auctionInternal, Utilities.Callback2 callback2) {
        this.f16931b = giftAuctionController;
        this.f16932c = auctionInternal;
        this.d = callback2;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f16930a) {
            case 0:
                this.f16931b.lambda$sendBid$8(this.f16932c, (Utilities.Callback2) this.d, (TLRPC.payments_PaymentResult) obj, (TLRPC.TL_error) obj2);
                return;
            default:
                this.f16931b.lambda$getOrRequestAcquiredGifts$11((Utilities.Callback) this.d, this.f16932c, (TL_payments.TL_StarGiftAuctionAcquiredGifts) obj, (TLRPC.TL_error) obj2);
                return;
        }
    }

    public c4(GiftAuctionController giftAuctionController, Utilities.Callback callback, GiftAuctionController.AuctionInternal auctionInternal) {
        this.f16931b = giftAuctionController;
        this.d = callback;
        this.f16932c = auctionInternal;
    }
}
