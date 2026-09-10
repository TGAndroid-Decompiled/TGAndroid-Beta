package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class k7 implements Runnable {
    public final int f15594a;
    public final MediaDataController f15595b;
    public final TLObject f15596c;

    public k7(MediaDataController mediaDataController, TLObject tLObject, int i10) {
        this.f15594a = i10;
        this.f15595b = mediaDataController;
        this.f15596c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f15594a) {
            case 0:
                this.f15595b.lambda$checkPremiumGiftStickers$75(this.f15596c);
                return;
            case 1:
                this.f15595b.lambda$loadReactions$13(this.f15596c);
                return;
            case 2:
                this.f15595b.lambda$checkTonGiftStickers$77(this.f15596c);
                return;
            case 3:
                this.f15595b.lambda$checkDefaultTopicIcons$81(this.f15596c);
                return;
            case 4:
                this.f15595b.lambda$clearRecentStickers$18(this.f15596c);
                return;
            default:
                this.f15595b.lambda$checkGenericAnimations$79(this.f15596c);
                return;
        }
    }
}
