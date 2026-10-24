package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class p7 implements RequestDelegate {
    public final int f19246a;
    public final MediaDataController f19247b;

    public p7(MediaDataController mediaDataController, int i10) {
        this.f19246a = i10;
        this.f19247b = mediaDataController;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19246a) {
            case 0:
                this.f19247b.lambda$checkGenericAnimations$80(tLObject, tL_error);
                return;
            case 1:
                this.f19247b.lambda$preloadPremiumPreviewStickers$207(tLObject, tL_error);
                return;
            case 2:
                this.f19247b.lambda$clearRecentStickers$19(tLObject, tL_error);
                return;
            case 3:
                this.f19247b.lambda$loadPremiumPromo$8(tLObject, tL_error);
                return;
            case 4:
                this.f19247b.lambda$loadReactions$14(tLObject, tL_error);
                return;
            case 5:
                this.f19247b.lambda$checkPremiumGiftStickers$76(tLObject, tL_error);
                return;
            case 6:
                this.f19247b.lambda$loadDraftsIfNeed$188(tLObject, tL_error);
                return;
            case 7:
                this.f19247b.lambda$checkDefaultTopicIcons$82(tLObject, tL_error);
                return;
            case 8:
                this.f19247b.lambda$loadGroupStickerSet$46(tLObject, tL_error);
                return;
            default:
                this.f19247b.lambda$checkTonGiftStickers$78(tLObject, tL_error);
                return;
        }
    }
}
