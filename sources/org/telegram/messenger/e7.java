package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class e7 implements Runnable {
    public final int f16256a;
    public final MediaDataController f16257b;
    public final TLObject f16258c;

    public e7(MediaDataController mediaDataController, TLObject tLObject, int i10) {
        this.f16256a = i10;
        this.f16257b = mediaDataController;
        this.f16258c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f16256a) {
            case 0:
                this.f16257b.lambda$checkPremiumGiftStickers$75(this.f16258c);
                return;
            case 1:
                this.f16257b.lambda$loadReactions$13(this.f16258c);
                return;
            case 2:
                this.f16257b.lambda$checkTonGiftStickers$77(this.f16258c);
                return;
            case 3:
                this.f16257b.lambda$checkDefaultTopicIcons$81(this.f16258c);
                return;
            case 4:
                this.f16257b.lambda$clearRecentStickers$18(this.f16258c);
                return;
            default:
                this.f16257b.lambda$checkGenericAnimations$79(this.f16258c);
                return;
        }
    }
}
