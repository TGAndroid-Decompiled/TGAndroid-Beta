package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class a7 implements Runnable {
    public final int f17342a;
    public final MediaDataController f17343b;
    public final TLObject f17344c;

    public a7(MediaDataController mediaDataController, TLObject tLObject, int i10) {
        this.f17342a = i10;
        this.f17343b = mediaDataController;
        this.f17344c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f17342a) {
            case 0:
                this.f17343b.lambda$checkPremiumGiftStickers$75(this.f17344c);
                return;
            case 1:
                this.f17343b.lambda$loadReactions$13(this.f17344c);
                return;
            case 2:
                this.f17343b.lambda$checkTonGiftStickers$77(this.f17344c);
                return;
            case 3:
                this.f17343b.lambda$checkDefaultTopicIcons$81(this.f17344c);
                return;
            case 4:
                this.f17343b.lambda$clearRecentStickers$18(this.f17344c);
                return;
            default:
                this.f17343b.lambda$checkGenericAnimations$79(this.f17344c);
                return;
        }
    }
}
