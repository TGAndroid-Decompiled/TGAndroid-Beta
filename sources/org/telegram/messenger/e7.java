package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class e7 implements Runnable {
    public final int f17553a;
    public final MediaDataController f17554b;
    public final TLObject f17555c;

    public e7(MediaDataController mediaDataController, TLObject tLObject, int i10) {
        this.f17553a = i10;
        this.f17554b = mediaDataController;
        this.f17555c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f17553a) {
            case 0:
                this.f17554b.lambda$checkPremiumGiftStickers$75(this.f17555c);
                return;
            case 1:
                this.f17554b.lambda$loadReactions$13(this.f17555c);
                return;
            case 2:
                this.f17554b.lambda$checkTonGiftStickers$77(this.f17555c);
                return;
            case 3:
                this.f17554b.lambda$checkDefaultTopicIcons$81(this.f17555c);
                return;
            case 4:
                this.f17554b.lambda$clearRecentStickers$18(this.f17555c);
                return;
            default:
                this.f17554b.lambda$checkGenericAnimations$79(this.f17555c);
                return;
        }
    }
}
