package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class h7 implements Runnable {
    public final int f18500a;
    public final MediaDataController f18501b;
    public final TLObject f18502c;

    public h7(MediaDataController mediaDataController, TLObject tLObject, int i10) {
        this.f18500a = i10;
        this.f18501b = mediaDataController;
        this.f18502c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f18500a) {
            case 0:
                this.f18501b.lambda$checkPremiumGiftStickers$75(this.f18502c);
                return;
            case 1:
                this.f18501b.lambda$loadReactions$13(this.f18502c);
                return;
            case 2:
                this.f18501b.lambda$checkTonGiftStickers$77(this.f18502c);
                return;
            case 3:
                this.f18501b.lambda$checkDefaultTopicIcons$81(this.f18502c);
                return;
            case 4:
                this.f18501b.lambda$clearRecentStickers$18(this.f18502c);
                return;
            default:
                this.f18501b.lambda$checkGenericAnimations$79(this.f18502c);
                return;
        }
    }
}
