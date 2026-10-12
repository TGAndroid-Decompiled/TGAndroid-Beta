package org.telegram.messenger;

import org.telegram.messenger.GiftAuctionController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class d4 implements Utilities.Callback2 {
    public final int f17372a;
    public final BaseController f17373b;
    public final Object f17374c;
    public final Object d;
    public final Object f17375e;

    public d4(BaseController baseController, Object obj, Object obj2, Object obj3, int i10) {
        this.f17372a = i10;
        this.f17373b = baseController;
        this.f17374c = obj;
        this.d = obj2;
        this.f17375e = obj3;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f17372a) {
            case 0:
                ((GiftAuctionController) this.f17373b).lambda$sendBid$9((Utilities.Callback2) this.f17374c, (GiftAuctionController.AuctionInternal) this.d, (TLRPC.TL_payments_getPaymentForm) this.f17375e, (TLRPC.PaymentForm) obj, (TLRPC.TL_error) obj2);
                return;
            case 1:
                ((MediaDataController) this.f17373b).lambda$searchStickers$248((MediaDataController.SearchStickersKey) this.f17374c, (MediaDataController.SearchStickersResult) this.d, (Utilities.Callback) this.f17375e, (TLRPC.messages_FoundStickers) obj, (TLRPC.TL_error) obj2);
                return;
            default:
                ((MediaDataController) this.f17373b).lambda$getStickerSet$38((String) this.f17374c, (Utilities.Callback) this.d, (TLRPC.InputStickerSet) this.f17375e, (Boolean) obj, (TLRPC.TL_messages_stickerSet) obj2);
                return;
        }
    }
}
