package org.telegram.messenger;

import org.telegram.messenger.GiftAuctionController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class d4 implements Utilities.Callback2 {
    public final int f16742a;
    public final BaseController f16743b;
    public final Object f16744c;
    public final Object d;
    public final Object e;

    public d4(BaseController baseController, Object obj, Object obj2, Object obj3, int i10) {
        this.f16742a = i10;
        this.f16743b = baseController;
        this.f16744c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f16742a) {
            case 0:
                ((GiftAuctionController) this.f16743b).lambda$sendBid$9((Utilities.Callback2) this.f16744c, (GiftAuctionController.AuctionInternal) this.d, (TLRPC.TL_payments_getPaymentForm) this.e, (TLRPC.PaymentForm) obj, (TLRPC.TL_error) obj2);
                return;
            case 1:
                ((MediaDataController) this.f16743b).lambda$searchStickers$248((MediaDataController.SearchStickersKey) this.f16744c, (MediaDataController.SearchStickersResult) this.d, (Utilities.Callback) this.e, (TLRPC.messages_FoundStickers) obj, (TLRPC.TL_error) obj2);
                return;
            default:
                ((MediaDataController) this.f16743b).lambda$getStickerSet$38((String) this.f16744c, (Utilities.Callback) this.d, (TLRPC.InputStickerSet) this.e, (Boolean) obj, (TLRPC.TL_messages_stickerSet) obj2);
                return;
        }
    }
}
