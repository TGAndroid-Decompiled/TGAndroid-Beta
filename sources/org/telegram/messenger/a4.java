package org.telegram.messenger;

import org.telegram.messenger.GiftAuctionController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class a4 implements Utilities.Callback2 {
    public final int f17298a;
    public final BaseController f17299b;
    public final Object f17300c;
    public final Object d;
    public final Object f17301e;

    public a4(BaseController baseController, Object obj, Object obj2, Object obj3, int i10) {
        this.f17298a = i10;
        this.f17299b = baseController;
        this.f17300c = obj;
        this.d = obj2;
        this.f17301e = obj3;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f17298a) {
            case 0:
                ((GiftAuctionController) this.f17299b).lambda$sendBid$9((Utilities.Callback2) this.f17300c, (GiftAuctionController.AuctionInternal) this.d, (TLRPC.TL_payments_getPaymentForm) this.f17301e, (TLRPC.PaymentForm) obj, (TLRPC.TL_error) obj2);
                return;
            case 1:
                ((MediaDataController) this.f17299b).lambda$searchStickers$248((MediaDataController.SearchStickersKey) this.f17300c, (MediaDataController.SearchStickersResult) this.d, (Utilities.Callback) this.f17301e, (TLRPC.messages_FoundStickers) obj, (TLRPC.TL_error) obj2);
                return;
            default:
                ((MediaDataController) this.f17299b).lambda$getStickerSet$38((String) this.f17300c, (Utilities.Callback) this.d, (TLRPC.InputStickerSet) this.f17301e, (Boolean) obj, (TLRPC.TL_messages_stickerSet) obj2);
                return;
        }
    }
}
