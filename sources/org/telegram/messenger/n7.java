package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class n7 implements RequestDelegate {

    public final int f21044a;

    public final MediaDataController f21045b;

    public n7(MediaDataController mediaDataController, int i10) {
        this.f21044a = i10;
        this.f21045b = mediaDataController;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f21044a) {
            case 0:
                this.f21045b.lambda$checkGenericAnimations$80(tLObject, tL_error);
                break;
            case 1:
                this.f21045b.lambda$clearRecentStickers$19(tLObject, tL_error);
                break;
            case 2:
                this.f21045b.lambda$preloadPremiumPreviewStickers$206(tLObject, tL_error);
                break;
            case 3:
                this.f21045b.lambda$loadPremiumPromo$8(tLObject, tL_error);
                break;
            case 4:
                this.f21045b.lambda$loadReactions$14(tLObject, tL_error);
                break;
            case 5:
                this.f21045b.lambda$checkPremiumGiftStickers$76(tLObject, tL_error);
                break;
            case 6:
                this.f21045b.lambda$loadDraftsIfNeed$187(tLObject, tL_error);
                break;
            case 7:
                this.f21045b.lambda$checkDefaultTopicIcons$82(tLObject, tL_error);
                break;
            case 8:
                this.f21045b.lambda$loadGroupStickerSet$46(tLObject, tL_error);
                break;
            default:
                this.f21045b.lambda$checkTonGiftStickers$78(tLObject, tL_error);
                break;
        }
    }
}
