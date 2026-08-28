package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class k7 implements RequestDelegate {
    public final int f20760a;
    public final MediaDataController f20761b;

    public k7(MediaDataController mediaDataController, int i9) {
        this.f20760a = i9;
        this.f20761b = mediaDataController;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f20760a) {
            case 0:
                this.f20761b.lambda$checkGenericAnimations$80(tLObject, tL_error);
                return;
            case 1:
                this.f20761b.lambda$clearRecentStickers$19(tLObject, tL_error);
                return;
            case 2:
                this.f20761b.lambda$preloadPremiumPreviewStickers$206(tLObject, tL_error);
                return;
            case 3:
                this.f20761b.lambda$loadPremiumPromo$8(tLObject, tL_error);
                return;
            case 4:
                this.f20761b.lambda$loadReactions$14(tLObject, tL_error);
                return;
            case 5:
                this.f20761b.lambda$checkPremiumGiftStickers$76(tLObject, tL_error);
                return;
            case 6:
                this.f20761b.lambda$loadDraftsIfNeed$187(tLObject, tL_error);
                return;
            case 7:
                this.f20761b.lambda$checkDefaultTopicIcons$82(tLObject, tL_error);
                return;
            case 8:
                this.f20761b.lambda$loadGroupStickerSet$46(tLObject, tL_error);
                return;
            default:
                this.f20761b.lambda$checkTonGiftStickers$78(tLObject, tL_error);
                return;
        }
    }
}
