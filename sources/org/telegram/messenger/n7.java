package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class n7 implements RequestDelegate {
    public final int f16822a;
    public final MediaDataController f16823b;

    public n7(MediaDataController mediaDataController, int i10) {
        this.f16822a = i10;
        this.f16823b = mediaDataController;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f16822a) {
            case 0:
                this.f16823b.lambda$checkGenericAnimations$80(tLObject, tL_error);
                return;
            case 1:
                this.f16823b.lambda$clearRecentStickers$19(tLObject, tL_error);
                return;
            case 2:
                this.f16823b.lambda$preloadPremiumPreviewStickers$206(tLObject, tL_error);
                return;
            case 3:
                this.f16823b.lambda$loadPremiumPromo$8(tLObject, tL_error);
                return;
            case 4:
                this.f16823b.lambda$loadReactions$14(tLObject, tL_error);
                return;
            case 5:
                this.f16823b.lambda$checkPremiumGiftStickers$76(tLObject, tL_error);
                return;
            case 6:
                this.f16823b.lambda$loadDraftsIfNeed$187(tLObject, tL_error);
                return;
            case 7:
                this.f16823b.lambda$checkDefaultTopicIcons$82(tLObject, tL_error);
                return;
            case 8:
                this.f16823b.lambda$loadGroupStickerSet$46(tLObject, tL_error);
                return;
            default:
                this.f16823b.lambda$checkTonGiftStickers$78(tLObject, tL_error);
                return;
        }
    }
}
