package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class c7 implements Runnable {
    public final int f18033a;
    public final MediaDataController f18034b;
    public final TLObject f18035c;

    public c7(MediaDataController mediaDataController, TLObject tLObject, int i10) {
        this.f18033a = i10;
        this.f18034b = mediaDataController;
        this.f18035c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f18033a) {
            case 0:
                this.f18034b.lambda$checkPremiumGiftStickers$75(this.f18035c);
                return;
            case 1:
                this.f18034b.lambda$loadReactions$13(this.f18035c);
                return;
            case 2:
                this.f18034b.lambda$checkTonGiftStickers$77(this.f18035c);
                return;
            case 3:
                this.f18034b.lambda$checkDefaultTopicIcons$81(this.f18035c);
                return;
            case 4:
                this.f18034b.lambda$clearRecentStickers$18(this.f18035c);
                return;
            default:
                this.f18034b.lambda$checkGenericAnimations$79(this.f18035c);
                return;
        }
    }
}
