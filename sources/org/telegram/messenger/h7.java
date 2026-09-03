package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class h7 implements Runnable {
    public final int f17350a;
    public final MediaDataController f17351b;
    public final TLObject f17352c;

    public h7(MediaDataController mediaDataController, TLObject tLObject, int i10) {
        this.f17350a = i10;
        this.f17351b = mediaDataController;
        this.f17352c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f17350a) {
            case 0:
                this.f17351b.lambda$checkPremiumGiftStickers$75(this.f17352c);
                return;
            case 1:
                this.f17351b.lambda$loadReactions$13(this.f17352c);
                return;
            case 2:
                this.f17351b.lambda$checkTonGiftStickers$77(this.f17352c);
                return;
            case 3:
                this.f17351b.lambda$checkDefaultTopicIcons$81(this.f17352c);
                return;
            case 4:
                this.f17351b.lambda$clearRecentStickers$18(this.f17352c);
                return;
            default:
                this.f17351b.lambda$checkGenericAnimations$79(this.f17352c);
                return;
        }
    }
}
