package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class MediaDataController$$ExternalSyntheticLambda19 implements RequestDelegate {
    public final int $r8$classId;
    public final MediaDataController f$0;

    public MediaDataController$$ExternalSyntheticLambda19(MediaDataController mediaDataController, int i) {
        this.$r8$classId = i;
        this.f$0 = mediaDataController;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$preloadPremiumPreviewStickers$206(tLObject, tL_error);
                break;
            case 1:
                this.f$0.lambda$checkGenericAnimations$80(tLObject, tL_error);
                break;
            case 2:
                this.f$0.lambda$clearRecentStickers$19(tLObject, tL_error);
                break;
            case 3:
                this.f$0.lambda$loadPremiumPromo$8(tLObject, tL_error);
                break;
            case 4:
                this.f$0.lambda$loadReactions$14(tLObject, tL_error);
                break;
            case 5:
                this.f$0.lambda$checkPremiumGiftStickers$76(tLObject, tL_error);
                break;
            case 6:
                this.f$0.lambda$loadDraftsIfNeed$187(tLObject, tL_error);
                break;
            case 7:
                this.f$0.lambda$checkDefaultTopicIcons$82(tLObject, tL_error);
                break;
            case 8:
                this.f$0.lambda$loadGroupStickerSet$46(tLObject, tL_error);
                break;
            default:
                this.f$0.lambda$checkTonGiftStickers$78(tLObject, tL_error);
                break;
        }
    }
}
