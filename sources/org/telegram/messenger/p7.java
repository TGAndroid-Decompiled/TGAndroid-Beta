package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class p7 implements RequestDelegate {
    public final int f21235a;
    public final MediaDataController f21236b;

    public p7(MediaDataController mediaDataController, int i10) {
        this.f21235a = i10;
        this.f21236b = mediaDataController;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f21235a) {
            case 0:
                this.f21236b.lambda$checkGenericAnimations$80(tLObject, tL_error);
                return;
            case 1:
                this.f21236b.lambda$clearRecentStickers$19(tLObject, tL_error);
                return;
            case 2:
                this.f21236b.lambda$preloadPremiumPreviewStickers$206(tLObject, tL_error);
                return;
            case 3:
                this.f21236b.lambda$loadPremiumPromo$8(tLObject, tL_error);
                return;
            case 4:
                this.f21236b.lambda$loadReactions$14(tLObject, tL_error);
                return;
            case 5:
                this.f21236b.lambda$checkPremiumGiftStickers$76(tLObject, tL_error);
                return;
            case 6:
                this.f21236b.lambda$loadDraftsIfNeed$187(tLObject, tL_error);
                return;
            case 7:
                this.f21236b.lambda$checkDefaultTopicIcons$82(tLObject, tL_error);
                return;
            case 8:
                this.f21236b.lambda$loadGroupStickerSet$46(tLObject, tL_error);
                return;
            default:
                this.f21236b.lambda$checkTonGiftStickers$78(tLObject, tL_error);
                return;
        }
    }
}
