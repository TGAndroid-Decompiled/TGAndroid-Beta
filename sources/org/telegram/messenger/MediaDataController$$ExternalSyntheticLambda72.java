package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

public final class MediaDataController$$ExternalSyntheticLambda72 implements Utilities.Callback2 {
    public final int $r8$classId;
    public final BaseController f$0;
    public final Object f$1;
    public final Object f$2;
    public final Object f$3;

    public MediaDataController$$ExternalSyntheticLambda72(BaseController baseController, Object obj, Object obj2, Object obj3, int i) {
        this.$r8$classId = i;
        this.f$0 = baseController;
        this.f$1 = obj;
        this.f$2 = obj2;
        this.f$3 = obj3;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                ((MediaDataController) this.f$0).lambda$searchStickers$247((MediaDataController.SearchStickersKey) this.f$1, (MediaDataController.SearchStickersResult) this.f$2, (Utilities.Callback) this.f$3, (TLRPC.messages_FoundStickers) obj, (TLRPC.TL_error) obj2);
                break;
            case 1:
                GiftAuctionController giftAuctionController = (GiftAuctionController) this.f$0;
                GiftAuctionController.AuctionInternal auctionInternal = (GiftAuctionController.AuctionInternal) this.f$2;
                TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = (TLRPC.TL_payments_getPaymentForm) this.f$3;
                giftAuctionController.lambda$sendBid$9((Utilities.Callback2) this.f$1, auctionInternal, tL_payments_getPaymentForm, (TLRPC.PaymentForm) obj, (TLRPC.TL_error) obj2);
                break;
            default:
                MediaDataController mediaDataController = (MediaDataController) this.f$0;
                TLRPC.InputStickerSet inputStickerSet = (TLRPC.InputStickerSet) this.f$2;
                mediaDataController.lambda$getStickerSet$38((String) this.f$1, (Utilities.Callback) this.f$3, inputStickerSet, (Boolean) obj, (TLRPC.TL_messages_stickerSet) obj2);
                break;
        }
    }

    public MediaDataController$$ExternalSyntheticLambda72(MediaDataController mediaDataController, String str, Utilities.Callback callback, TLRPC.InputStickerSet inputStickerSet) {
        this.$r8$classId = 2;
        this.f$0 = mediaDataController;
        this.f$1 = str;
        this.f$3 = callback;
        this.f$2 = inputStickerSet;
    }
}
