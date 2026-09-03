package org.telegram.messenger;

import org.telegram.messenger.GiftAuctionController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class b4 implements Utilities.Callback2 {
    public final int f18223a;
    public final BaseController f18224b;
    public final Object f18225c;
    public final Object d;
    public final Object f18226e;

    public b4(BaseController baseController, Object obj, Object obj2, Object obj3, int i10) {
        this.f18223a = i10;
        this.f18224b = baseController;
        this.f18225c = obj;
        this.d = obj2;
        this.f18226e = obj3;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f18223a) {
            case 0:
                ((GiftAuctionController) this.f18224b).lambda$sendBid$9((Utilities.Callback2) this.f18225c, (GiftAuctionController.AuctionInternal) this.d, (TLRPC.TL_payments_getPaymentForm) this.f18226e, (TLRPC.PaymentForm) obj, (TLRPC.TL_error) obj2);
                return;
            case 1:
                ((MediaDataController) this.f18224b).lambda$searchStickers$247((MediaDataController.SearchStickersKey) this.f18225c, (MediaDataController.SearchStickersResult) this.d, (Utilities.Callback) this.f18226e, (TLRPC.messages_FoundStickers) obj, (TLRPC.TL_error) obj2);
                return;
            default:
                ((MediaDataController) this.f18224b).lambda$getStickerSet$38((String) this.f18225c, (Utilities.Callback) this.d, (TLRPC.InputStickerSet) this.f18226e, (Boolean) obj, (TLRPC.TL_messages_stickerSet) obj2);
                return;
        }
    }
}
