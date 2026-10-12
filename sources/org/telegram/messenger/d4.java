package org.telegram.messenger;

import org.telegram.messenger.GiftAuctionController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class d4 implements Utilities.Callback2 {
    public final int f17045a;
    public final BaseController f17046b;
    public final Object f17047c;
    public final Object d;
    public final Object e;

    public d4(BaseController baseController, Object obj, Object obj2, Object obj3, int i10) {
        this.f17045a = i10;
        this.f17046b = baseController;
        this.f17047c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f17045a) {
            case 0:
                ((GiftAuctionController) this.f17046b).lambda$sendBid$9((Utilities.Callback2) this.f17047c, (GiftAuctionController.AuctionInternal) this.d, (TLRPC.TL_payments_getPaymentForm) this.e, (TLRPC.PaymentForm) obj, (TLRPC.TL_error) obj2);
                return;
            case 1:
                ((MediaDataController) this.f17046b).lambda$searchStickers$248((MediaDataController.SearchStickersKey) this.f17047c, (MediaDataController.SearchStickersResult) this.d, (Utilities.Callback) this.e, (TLRPC.messages_FoundStickers) obj, (TLRPC.TL_error) obj2);
                return;
            default:
                ((MediaDataController) this.f17046b).lambda$getStickerSet$38((String) this.f17047c, (Utilities.Callback) this.d, (TLRPC.InputStickerSet) this.e, (Boolean) obj, (TLRPC.TL_messages_stickerSet) obj2);
                return;
        }
    }
}
