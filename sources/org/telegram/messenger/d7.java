package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class d7 implements Runnable {
    public final int f17056a;
    public final MediaDataController f17057b;
    public final TLObject f17058c;

    public d7(MediaDataController mediaDataController, TLObject tLObject, int i10) {
        this.f17056a = i10;
        this.f17057b = mediaDataController;
        this.f17058c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f17056a) {
            case 0:
                this.f17057b.lambda$checkPremiumGiftStickers$75(this.f17058c);
                return;
            case 1:
                this.f17057b.lambda$loadReactions$13(this.f17058c);
                return;
            case 2:
                this.f17057b.lambda$checkTonGiftStickers$77(this.f17058c);
                return;
            case 3:
                this.f17057b.lambda$checkDefaultTopicIcons$81(this.f17058c);
                return;
            case 4:
                this.f17057b.lambda$clearRecentStickers$18(this.f17058c);
                return;
            default:
                this.f17057b.lambda$checkGenericAnimations$79(this.f17058c);
                return;
        }
    }
}
