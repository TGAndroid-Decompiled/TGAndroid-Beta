package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class e7 implements Runnable {
    public final int f16023a;
    public final MediaDataController f16024b;
    public final TLObject f16025c;

    public e7(MediaDataController mediaDataController, TLObject tLObject, int i10) {
        this.f16023a = i10;
        this.f16024b = mediaDataController;
        this.f16025c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f16023a) {
            case 0:
                this.f16024b.lambda$checkPremiumGiftStickers$75(this.f16025c);
                return;
            case 1:
                this.f16024b.lambda$loadReactions$13(this.f16025c);
                return;
            case 2:
                this.f16024b.lambda$checkTonGiftStickers$77(this.f16025c);
                return;
            case 3:
                this.f16024b.lambda$checkDefaultTopicIcons$81(this.f16025c);
                return;
            case 4:
                this.f16024b.lambda$clearRecentStickers$18(this.f16025c);
                return;
            default:
                this.f16024b.lambda$checkGenericAnimations$79(this.f16025c);
                return;
        }
    }
}
