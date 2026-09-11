package org.telegram.messenger;

import org.telegram.messenger.GiftAuctionController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class y3 implements Utilities.Callback2 {
    public final int f19697a;
    public final BaseController f19698b;
    public final Object f19699c;
    public final Object d;
    public final Object f19700e;

    public y3(BaseController baseController, Object obj, Object obj2, Object obj3, int i10) {
        this.f19697a = i10;
        this.f19698b = baseController;
        this.f19699c = obj;
        this.d = obj2;
        this.f19700e = obj3;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f19697a) {
            case 0:
                ((GiftAuctionController) this.f19698b).lambda$sendBid$9((Utilities.Callback2) this.f19699c, (GiftAuctionController.AuctionInternal) this.d, (TLRPC.TL_payments_getPaymentForm) this.f19700e, (TLRPC.PaymentForm) obj, (TLRPC.TL_error) obj2);
                return;
            case 1:
                ((MediaDataController) this.f19698b).lambda$searchStickers$247((MediaDataController.SearchStickersKey) this.f19699c, (MediaDataController.SearchStickersResult) this.d, (Utilities.Callback) this.f19700e, (TLRPC.messages_FoundStickers) obj, (TLRPC.TL_error) obj2);
                return;
            default:
                ((MediaDataController) this.f19698b).lambda$getStickerSet$38((String) this.f19699c, (Utilities.Callback) this.d, (TLRPC.InputStickerSet) this.f19700e, (Boolean) obj, (TLRPC.TL_messages_stickerSet) obj2);
                return;
        }
    }
}
