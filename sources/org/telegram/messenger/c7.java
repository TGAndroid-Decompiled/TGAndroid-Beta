package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class c7 implements Runnable {
    public final int f18021a;
    public final MediaDataController f18022b;
    public final TLObject f18023c;

    public c7(MediaDataController mediaDataController, TLObject tLObject, int i10) {
        this.f18021a = i10;
        this.f18022b = mediaDataController;
        this.f18023c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f18021a) {
            case 0:
                this.f18022b.lambda$checkPremiumGiftStickers$75(this.f18023c);
                return;
            case 1:
                this.f18022b.lambda$loadReactions$13(this.f18023c);
                return;
            case 2:
                this.f18022b.lambda$checkTonGiftStickers$77(this.f18023c);
                return;
            case 3:
                this.f18022b.lambda$checkDefaultTopicIcons$81(this.f18023c);
                return;
            case 4:
                this.f18022b.lambda$clearRecentStickers$18(this.f18023c);
                return;
            default:
                this.f18022b.lambda$checkGenericAnimations$79(this.f18023c);
                return;
        }
    }
}
