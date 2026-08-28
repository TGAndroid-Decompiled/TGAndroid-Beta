package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class c7 implements Runnable {
    public final int f19922a;
    public final MediaDataController f19923b;
    public final TLObject f19924c;

    public c7(MediaDataController mediaDataController, TLObject tLObject, int i9) {
        this.f19922a = i9;
        this.f19923b = mediaDataController;
        this.f19924c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f19922a) {
            case 0:
                this.f19923b.lambda$checkPremiumGiftStickers$75(this.f19924c);
                return;
            case 1:
                this.f19923b.lambda$loadReactions$13(this.f19924c);
                return;
            case 2:
                this.f19923b.lambda$checkTonGiftStickers$77(this.f19924c);
                return;
            case 3:
                this.f19923b.lambda$checkDefaultTopicIcons$81(this.f19924c);
                return;
            case 4:
                this.f19923b.lambda$clearRecentStickers$18(this.f19924c);
                return;
            default:
                this.f19923b.lambda$checkGenericAnimations$79(this.f19924c);
                return;
        }
    }
}
