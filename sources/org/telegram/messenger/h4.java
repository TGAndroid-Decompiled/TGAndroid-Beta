package org.telegram.messenger;

import org.telegram.messenger.GiftAuctionController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class h4 implements Utilities.Callback2 {
    public final int f20216a;
    public final BaseController f20217b;
    public final Object f20218c;
    public final Object d;
    public final Object e;

    public h4(BaseController baseController, Object obj, Object obj2, Object obj3, int i10) {
        this.f20216a = i10;
        this.f20217b = baseController;
        this.f20218c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f20216a) {
            case 0:
                ((GiftAuctionController) this.f20217b).lambda$sendBid$9((Utilities.Callback2) this.f20218c, (GiftAuctionController.AuctionInternal) this.d, (TLRPC.TL_payments_getPaymentForm) this.e, (TLRPC.PaymentForm) obj, (TLRPC.TL_error) obj2);
                return;
            case 1:
                ((MediaDataController) this.f20217b).lambda$searchStickers$248((MediaDataController.SearchStickersKey) this.f20218c, (MediaDataController.SearchStickersResult) this.d, (Utilities.Callback) this.e, (TLRPC.messages_FoundStickers) obj, (TLRPC.TL_error) obj2);
                return;
            default:
                ((MediaDataController) this.f20217b).lambda$getStickerSet$38((String) this.f20218c, (Utilities.Callback) this.d, (TLRPC.InputStickerSet) this.e, (Boolean) obj, (TLRPC.TL_messages_stickerSet) obj2);
                return;
        }
    }
}
