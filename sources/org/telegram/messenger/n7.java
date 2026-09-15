package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class n7 implements RequestDelegate {
    public final int f16826a;
    public final MediaDataController f16827b;

    public n7(MediaDataController mediaDataController, int i10) {
        this.f16826a = i10;
        this.f16827b = mediaDataController;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f16826a) {
            case 0:
                this.f16827b.lambda$checkGenericAnimations$80(tLObject, tL_error);
                return;
            case 1:
                this.f16827b.lambda$clearRecentStickers$19(tLObject, tL_error);
                return;
            case 2:
                this.f16827b.lambda$preloadPremiumPreviewStickers$206(tLObject, tL_error);
                return;
            case 3:
                this.f16827b.lambda$loadPremiumPromo$8(tLObject, tL_error);
                return;
            case 4:
                this.f16827b.lambda$loadReactions$14(tLObject, tL_error);
                return;
            case 5:
                this.f16827b.lambda$checkPremiumGiftStickers$76(tLObject, tL_error);
                return;
            case 6:
                this.f16827b.lambda$loadDraftsIfNeed$187(tLObject, tL_error);
                return;
            case 7:
                this.f16827b.lambda$checkDefaultTopicIcons$82(tLObject, tL_error);
                return;
            case 8:
                this.f16827b.lambda$loadGroupStickerSet$46(tLObject, tL_error);
                return;
            default:
                this.f16827b.lambda$checkTonGiftStickers$78(tLObject, tL_error);
                return;
        }
    }
}
