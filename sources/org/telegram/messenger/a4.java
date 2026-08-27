package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

public final class a4 implements Utilities.Callback2 {

    public final int f19668a;

    public final BaseController f19669b;

    public final Object f19670c;
    public final Object d;

    public final Object f19671e;

    public a4(BaseController baseController, Object obj, Object obj2, Object obj3, int i10) {
        this.f19668a = i10;
        this.f19669b = baseController;
        this.f19670c = obj;
        this.d = obj2;
        this.f19671e = obj3;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f19668a) {
            case 0:
                ((GiftAuctionController) this.f19669b).lambda$sendBid$9((Utilities.Callback2) this.f19670c, (GiftAuctionController.AuctionInternal) this.d, (TLRPC.TL_payments_getPaymentForm) this.f19671e, (TLRPC.PaymentForm) obj, (TLRPC.TL_error) obj2);
                break;
            case 1:
                ((MediaDataController) this.f19669b).lambda$searchStickers$247((MediaDataController.SearchStickersKey) this.f19670c, (MediaDataController.SearchStickersResult) this.d, (Utilities.Callback) this.f19671e, (TLRPC.messages_FoundStickers) obj, (TLRPC.TL_error) obj2);
                break;
            default:
                ((MediaDataController) this.f19669b).lambda$getStickerSet$38((String) this.f19670c, (Utilities.Callback) this.d, (TLRPC.InputStickerSet) this.f19671e, (Boolean) obj, (TLRPC.TL_messages_stickerSet) obj2);
                break;
        }
    }
}
