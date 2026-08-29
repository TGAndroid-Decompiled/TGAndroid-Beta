package org.telegram.messenger;

import org.telegram.messenger.GiftAuctionController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class a4 implements Utilities.Callback2 {
    public final int f19664a;
    public final BaseController f19665b;
    public final Object f19666c;
    public final Object d;
    public final Object f19667e;

    public a4(BaseController baseController, Object obj, Object obj2, Object obj3, int i10) {
        this.f19664a = i10;
        this.f19665b = baseController;
        this.f19666c = obj;
        this.d = obj2;
        this.f19667e = obj3;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f19664a) {
            case 0:
                ((GiftAuctionController) this.f19665b).lambda$sendBid$9((Utilities.Callback2) this.f19666c, (GiftAuctionController.AuctionInternal) this.d, (TLRPC.TL_payments_getPaymentForm) this.f19667e, (TLRPC.PaymentForm) obj, (TLRPC.TL_error) obj2);
                return;
            case 1:
                ((MediaDataController) this.f19665b).lambda$searchStickers$247((MediaDataController.SearchStickersKey) this.f19666c, (MediaDataController.SearchStickersResult) this.d, (Utilities.Callback) this.f19667e, (TLRPC.messages_FoundStickers) obj, (TLRPC.TL_error) obj2);
                return;
            default:
                ((MediaDataController) this.f19665b).lambda$getStickerSet$38((String) this.f19666c, (Utilities.Callback) this.d, (TLRPC.InputStickerSet) this.f19667e, (Boolean) obj, (TLRPC.TL_messages_stickerSet) obj2);
                return;
        }
    }
}
