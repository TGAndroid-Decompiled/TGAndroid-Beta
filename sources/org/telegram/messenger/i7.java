package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class i7 implements RequestDelegate {
    public final int f16631a;
    public final MediaDataController f16632b;

    public i7(MediaDataController mediaDataController, int i10) {
        this.f16631a = i10;
        this.f16632b = mediaDataController;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f16631a) {
            case 0:
                this.f16632b.lambda$checkGenericAnimations$80(tLObject, tL_error);
                return;
            case 1:
                this.f16632b.lambda$preloadPremiumPreviewStickers$207(tLObject, tL_error);
                return;
            case 2:
                this.f16632b.lambda$clearRecentStickers$19(tLObject, tL_error);
                return;
            case 3:
                this.f16632b.lambda$loadPremiumPromo$8(tLObject, tL_error);
                return;
            case 4:
                this.f16632b.lambda$loadReactions$14(tLObject, tL_error);
                return;
            case 5:
                this.f16632b.lambda$checkPremiumGiftStickers$76(tLObject, tL_error);
                return;
            case 6:
                this.f16632b.lambda$loadDraftsIfNeed$188(tLObject, tL_error);
                return;
            case 7:
                this.f16632b.lambda$checkDefaultTopicIcons$82(tLObject, tL_error);
                return;
            case 8:
                this.f16632b.lambda$loadGroupStickerSet$46(tLObject, tL_error);
                return;
            default:
                this.f16632b.lambda$checkTonGiftStickers$78(tLObject, tL_error);
                return;
        }
    }
}
