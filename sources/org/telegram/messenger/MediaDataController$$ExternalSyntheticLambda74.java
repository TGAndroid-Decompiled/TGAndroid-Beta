package org.telegram.messenger;

import org.telegram.tgnet.TLObject;

public final class MediaDataController$$ExternalSyntheticLambda74 implements Runnable {
    public final int $r8$classId;
    public final MediaDataController f$0;
    public final TLObject f$1;

    public MediaDataController$$ExternalSyntheticLambda74(MediaDataController mediaDataController, TLObject tLObject, int i) {
        this.$r8$classId = i;
        this.f$0 = mediaDataController;
        this.f$1 = tLObject;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$checkDefaultTopicIcons$81(this.f$1);
                break;
            case 1:
                this.f$0.lambda$checkPremiumGiftStickers$75(this.f$1);
                break;
            case 2:
                this.f$0.lambda$loadReactions$13(this.f$1);
                break;
            case 3:
                this.f$0.lambda$checkTonGiftStickers$77(this.f$1);
                break;
            case 4:
                this.f$0.lambda$clearRecentStickers$18(this.f$1);
                break;
            default:
                this.f$0.lambda$checkGenericAnimations$79(this.f$1);
                break;
        }
    }
}
