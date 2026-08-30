package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class h7 implements Runnable {
    public final int f17370a;
    public final MediaDataController f17371b;
    public final TLObject f17372c;

    public h7(MediaDataController mediaDataController, TLObject tLObject, int i10) {
        this.f17370a = i10;
        this.f17371b = mediaDataController;
        this.f17372c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f17370a) {
            case 0:
                this.f17371b.lambda$checkPremiumGiftStickers$75(this.f17372c);
                return;
            case 1:
                this.f17371b.lambda$loadReactions$13(this.f17372c);
                return;
            case 2:
                this.f17371b.lambda$checkTonGiftStickers$77(this.f17372c);
                return;
            case 3:
                this.f17371b.lambda$checkDefaultTopicIcons$81(this.f17372c);
                return;
            case 4:
                this.f17371b.lambda$clearRecentStickers$18(this.f17372c);
                return;
            default:
                this.f17371b.lambda$checkGenericAnimations$79(this.f17372c);
                return;
        }
    }
}
