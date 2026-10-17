package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class k7 implements RequestDelegate {
    public final int f18761a;
    public final MediaDataController f18762b;

    public k7(MediaDataController mediaDataController, int i10) {
        this.f18761a = i10;
        this.f18762b = mediaDataController;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18761a) {
            case 0:
                this.f18762b.lambda$checkGenericAnimations$80(tLObject, tL_error);
                return;
            case 1:
                this.f18762b.lambda$preloadPremiumPreviewStickers$207(tLObject, tL_error);
                return;
            case 2:
                this.f18762b.lambda$clearRecentStickers$19(tLObject, tL_error);
                return;
            case 3:
                this.f18762b.lambda$loadPremiumPromo$8(tLObject, tL_error);
                return;
            case 4:
                this.f18762b.lambda$loadReactions$14(tLObject, tL_error);
                return;
            case 5:
                this.f18762b.lambda$checkPremiumGiftStickers$76(tLObject, tL_error);
                return;
            case 6:
                this.f18762b.lambda$loadDraftsIfNeed$188(tLObject, tL_error);
                return;
            case 7:
                this.f18762b.lambda$checkDefaultTopicIcons$82(tLObject, tL_error);
                return;
            case 8:
                this.f18762b.lambda$loadGroupStickerSet$46(tLObject, tL_error);
                return;
            default:
                this.f18762b.lambda$checkTonGiftStickers$78(tLObject, tL_error);
                return;
        }
    }
}
