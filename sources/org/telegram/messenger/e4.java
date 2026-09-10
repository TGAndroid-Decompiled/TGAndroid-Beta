package org.telegram.messenger;

import org.telegram.messenger.GiftAuctionController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class e4 implements Utilities.Callback2 {
    public final int f15043a;
    public final BaseController f15044b;
    public final Object f15045c;
    public final Object d;
    public final Object e;

    public e4(BaseController baseController, Object obj, Object obj2, Object obj3, int i10) {
        this.f15043a = i10;
        this.f15044b = baseController;
        this.f15045c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f15043a) {
            case 0:
                ((GiftAuctionController) this.f15044b).lambda$sendBid$9((Utilities.Callback2) this.f15045c, (GiftAuctionController.AuctionInternal) this.d, (TLRPC.TL_payments_getPaymentForm) this.e, (TLRPC.PaymentForm) obj, (TLRPC.TL_error) obj2);
                return;
            case 1:
                ((MediaDataController) this.f15044b).lambda$searchStickers$247((MediaDataController.SearchStickersKey) this.f15045c, (MediaDataController.SearchStickersResult) this.d, (Utilities.Callback) this.e, (TLRPC.messages_FoundStickers) obj, (TLRPC.TL_error) obj2);
                return;
            default:
                ((MediaDataController) this.f15044b).lambda$getStickerSet$38((String) this.f15045c, (Utilities.Callback) this.d, (TLRPC.InputStickerSet) this.e, (Boolean) obj, (TLRPC.TL_messages_stickerSet) obj2);
                return;
        }
    }
}
