package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class q7 implements RequestDelegate {
    public final int f19760a;
    public final MediaDataController f19761b;

    public q7(MediaDataController mediaDataController, int i10) {
        this.f19760a = i10;
        this.f19761b = mediaDataController;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19760a) {
            case 0:
                this.f19761b.lambda$checkGenericAnimations$80(tLObject, tL_error);
                return;
            case 1:
                this.f19761b.lambda$clearRecentStickers$19(tLObject, tL_error);
                return;
            case 2:
                this.f19761b.lambda$preloadPremiumPreviewStickers$206(tLObject, tL_error);
                return;
            case 3:
                this.f19761b.lambda$loadPremiumPromo$8(tLObject, tL_error);
                return;
            case 4:
                this.f19761b.lambda$loadReactions$14(tLObject, tL_error);
                return;
            case 5:
                this.f19761b.lambda$checkPremiumGiftStickers$76(tLObject, tL_error);
                return;
            case 6:
                this.f19761b.lambda$loadDraftsIfNeed$187(tLObject, tL_error);
                return;
            case 7:
                this.f19761b.lambda$checkDefaultTopicIcons$82(tLObject, tL_error);
                return;
            case 8:
                this.f19761b.lambda$loadGroupStickerSet$46(tLObject, tL_error);
                return;
            default:
                this.f19761b.lambda$checkTonGiftStickers$78(tLObject, tL_error);
                return;
        }
    }
}
