package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class a7 implements Runnable {
    public final int f17307a;
    public final MediaDataController f17308b;
    public final TLObject f17309c;

    public a7(MediaDataController mediaDataController, TLObject tLObject, int i10) {
        this.f17307a = i10;
        this.f17308b = mediaDataController;
        this.f17309c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f17307a) {
            case 0:
                this.f17308b.lambda$checkPremiumGiftStickers$75(this.f17309c);
                return;
            case 1:
                this.f17308b.lambda$loadReactions$13(this.f17309c);
                return;
            case 2:
                this.f17308b.lambda$checkTonGiftStickers$77(this.f17309c);
                return;
            case 3:
                this.f17308b.lambda$checkDefaultTopicIcons$81(this.f17309c);
                return;
            case 4:
                this.f17308b.lambda$clearRecentStickers$18(this.f17309c);
                return;
            default:
                this.f17308b.lambda$checkGenericAnimations$79(this.f17309c);
                return;
        }
    }
}
