package org.telegram.messenger;

import org.telegram.messenger.GiftAuctionController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class g4 implements Utilities.Callback2 {
    public final int f20135a;
    public final BaseController f20136b;
    public final Object f20137c;
    public final Object d;
    public final Object e;

    public g4(BaseController baseController, Object obj, Object obj2, Object obj3, int i10) {
        this.f20135a = i10;
        this.f20136b = baseController;
        this.f20137c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f20135a) {
            case 0:
                ((GiftAuctionController) this.f20136b).lambda$sendBid$9((Utilities.Callback2) this.f20137c, (GiftAuctionController.AuctionInternal) this.d, (TLRPC.TL_payments_getPaymentForm) this.e, (TLRPC.PaymentForm) obj, (TLRPC.TL_error) obj2);
                return;
            case 1:
                ((MediaDataController) this.f20136b).lambda$searchStickers$248((MediaDataController.SearchStickersKey) this.f20137c, (MediaDataController.SearchStickersResult) this.d, (Utilities.Callback) this.e, (TLRPC.messages_FoundStickers) obj, (TLRPC.TL_error) obj2);
                return;
            default:
                ((MediaDataController) this.f20136b).lambda$getStickerSet$38((String) this.f20137c, (Utilities.Callback) this.d, (TLRPC.InputStickerSet) this.e, (Boolean) obj, (TLRPC.TL_messages_stickerSet) obj2);
                return;
        }
    }
}
