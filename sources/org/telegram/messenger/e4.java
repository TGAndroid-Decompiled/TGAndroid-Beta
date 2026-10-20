package org.telegram.messenger;

import org.telegram.messenger.GiftAuctionController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class e4 implements Utilities.Callback2 {
    public final int f18241a;
    public final BaseController f18242b;
    public final Object f18243c;
    public final Object d;
    public final Object e;

    public e4(BaseController baseController, Object obj, Object obj2, Object obj3, int i10) {
        this.f18241a = i10;
        this.f18242b = baseController;
        this.f18243c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f18241a) {
            case 0:
                ((GiftAuctionController) this.f18242b).lambda$sendBid$9((Utilities.Callback2) this.f18243c, (GiftAuctionController.AuctionInternal) this.d, (TLRPC.TL_payments_getPaymentForm) this.e, (TLRPC.PaymentForm) obj, (TLRPC.TL_error) obj2);
                return;
            case 1:
                ((MediaDataController) this.f18242b).lambda$searchStickers$248((MediaDataController.SearchStickersKey) this.f18243c, (MediaDataController.SearchStickersResult) this.d, (Utilities.Callback) this.e, (TLRPC.messages_FoundStickers) obj, (TLRPC.TL_error) obj2);
                return;
            default:
                ((MediaDataController) this.f18242b).lambda$getStickerSet$38((String) this.f18243c, (Utilities.Callback) this.d, (TLRPC.InputStickerSet) this.e, (Boolean) obj, (TLRPC.TL_messages_stickerSet) obj2);
                return;
        }
    }
}
