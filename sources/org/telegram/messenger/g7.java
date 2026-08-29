package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class g7 implements Runnable {
    public final int f20311a;
    public final MediaDataController f20312b;
    public final TLObject f20313c;

    public g7(MediaDataController mediaDataController, TLObject tLObject, int i10) {
        this.f20311a = i10;
        this.f20312b = mediaDataController;
        this.f20313c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f20311a) {
            case 0:
                this.f20312b.lambda$checkPremiumGiftStickers$75(this.f20313c);
                return;
            case 1:
                this.f20312b.lambda$loadReactions$13(this.f20313c);
                return;
            case 2:
                this.f20312b.lambda$checkTonGiftStickers$77(this.f20313c);
                return;
            case 3:
                this.f20312b.lambda$checkDefaultTopicIcons$81(this.f20313c);
                return;
            case 4:
                this.f20312b.lambda$clearRecentStickers$18(this.f20313c);
                return;
            default:
                this.f20312b.lambda$checkGenericAnimations$79(this.f20313c);
                return;
        }
    }
}
