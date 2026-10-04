package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class i7 implements RequestDelegate {
    public final int f18140a;
    public final MediaDataController f18141b;

    public i7(MediaDataController mediaDataController, int i10) {
        this.f18140a = i10;
        this.f18141b = mediaDataController;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18140a) {
            case 0:
                this.f18141b.lambda$checkGenericAnimations$80(tLObject, tL_error);
                return;
            case 1:
                this.f18141b.lambda$preloadPremiumPreviewStickers$207(tLObject, tL_error);
                return;
            case 2:
                this.f18141b.lambda$clearRecentStickers$19(tLObject, tL_error);
                return;
            case 3:
                this.f18141b.lambda$loadPremiumPromo$8(tLObject, tL_error);
                return;
            case 4:
                this.f18141b.lambda$loadReactions$14(tLObject, tL_error);
                return;
            case 5:
                this.f18141b.lambda$checkPremiumGiftStickers$76(tLObject, tL_error);
                return;
            case 6:
                this.f18141b.lambda$loadDraftsIfNeed$188(tLObject, tL_error);
                return;
            case 7:
                this.f18141b.lambda$checkDefaultTopicIcons$82(tLObject, tL_error);
                return;
            case 8:
                this.f18141b.lambda$loadGroupStickerSet$46(tLObject, tL_error);
                return;
            default:
                this.f18141b.lambda$checkTonGiftStickers$78(tLObject, tL_error);
                return;
        }
    }
}
