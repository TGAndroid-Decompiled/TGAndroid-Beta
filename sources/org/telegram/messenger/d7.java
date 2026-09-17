package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class d7 implements Runnable {
    public final int f17479a;
    public final MediaDataController f17480b;
    public final TLObject f17481c;

    public d7(MediaDataController mediaDataController, TLObject tLObject, int i10) {
        this.f17479a = i10;
        this.f17480b = mediaDataController;
        this.f17481c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f17479a) {
            case 0:
                this.f17480b.lambda$checkPremiumGiftStickers$75(this.f17481c);
                return;
            case 1:
                this.f17480b.lambda$loadReactions$13(this.f17481c);
                return;
            case 2:
                this.f17480b.lambda$checkTonGiftStickers$77(this.f17481c);
                return;
            case 3:
                this.f17480b.lambda$checkDefaultTopicIcons$81(this.f17481c);
                return;
            case 4:
                this.f17480b.lambda$clearRecentStickers$18(this.f17481c);
                return;
            default:
                this.f17480b.lambda$checkGenericAnimations$79(this.f17481c);
                return;
        }
    }
}
