package org.telegram.messenger;

import org.telegram.messenger.GiftAuctionController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class f4 implements Utilities.Callback2 {
    public final int f18322a;
    public final BaseController f18323b;
    public final Object f18324c;
    public final Object d;
    public final Object e;

    public f4(BaseController baseController, Object obj, Object obj2, Object obj3, int i10) {
        this.f18322a = i10;
        this.f18323b = baseController;
        this.f18324c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f18322a) {
            case 0:
                ((GiftAuctionController) this.f18323b).lambda$sendBid$9((Utilities.Callback2) this.f18324c, (GiftAuctionController.AuctionInternal) this.d, (TLRPC.TL_payments_getPaymentForm) this.e, (TLRPC.PaymentForm) obj, (TLRPC.TL_error) obj2);
                return;
            case 1:
                ((MediaDataController) this.f18323b).lambda$searchStickers$248((MediaDataController.SearchStickersKey) this.f18324c, (MediaDataController.SearchStickersResult) this.d, (Utilities.Callback) this.e, (TLRPC.messages_FoundStickers) obj, (TLRPC.TL_error) obj2);
                return;
            default:
                ((MediaDataController) this.f18323b).lambda$getStickerSet$38((String) this.f18324c, (Utilities.Callback) this.d, (TLRPC.InputStickerSet) this.e, (Boolean) obj, (TLRPC.TL_messages_stickerSet) obj2);
                return;
        }
    }
}
