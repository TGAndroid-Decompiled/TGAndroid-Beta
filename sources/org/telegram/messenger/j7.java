package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class j7 implements RequestDelegate {
    public final int f18237a;
    public final MediaDataController f18238b;

    public j7(MediaDataController mediaDataController, int i10) {
        this.f18237a = i10;
        this.f18238b = mediaDataController;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18237a) {
            case 0:
                this.f18238b.lambda$checkGenericAnimations$80(tLObject, tL_error);
                return;
            case 1:
                this.f18238b.lambda$preloadPremiumPreviewStickers$207(tLObject, tL_error);
                return;
            case 2:
                this.f18238b.lambda$clearRecentStickers$19(tLObject, tL_error);
                return;
            case 3:
                this.f18238b.lambda$loadPremiumPromo$8(tLObject, tL_error);
                return;
            case 4:
                this.f18238b.lambda$loadReactions$14(tLObject, tL_error);
                return;
            case 5:
                this.f18238b.lambda$checkPremiumGiftStickers$76(tLObject, tL_error);
                return;
            case 6:
                this.f18238b.lambda$loadDraftsIfNeed$188(tLObject, tL_error);
                return;
            case 7:
                this.f18238b.lambda$checkDefaultTopicIcons$82(tLObject, tL_error);
                return;
            case 8:
                this.f18238b.lambda$loadGroupStickerSet$46(tLObject, tL_error);
                return;
            default:
                this.f18238b.lambda$checkTonGiftStickers$78(tLObject, tL_error);
                return;
        }
    }
}
