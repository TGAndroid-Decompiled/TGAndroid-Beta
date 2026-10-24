package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class h7 implements Runnable {
    public final int f18565a;
    public final MediaDataController f18566b;
    public final TLObject f18567c;

    public h7(MediaDataController mediaDataController, TLObject tLObject, int i10) {
        this.f18565a = i10;
        this.f18566b = mediaDataController;
        this.f18567c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f18565a) {
            case 0:
                this.f18566b.lambda$checkPremiumGiftStickers$75(this.f18567c);
                return;
            case 1:
                this.f18566b.lambda$loadReactions$13(this.f18567c);
                return;
            case 2:
                this.f18566b.lambda$checkTonGiftStickers$77(this.f18567c);
                return;
            case 3:
                this.f18566b.lambda$checkDefaultTopicIcons$81(this.f18567c);
                return;
            case 4:
                this.f18566b.lambda$clearRecentStickers$18(this.f18567c);
                return;
            default:
                this.f18566b.lambda$checkGenericAnimations$79(this.f18567c);
                return;
        }
    }
}
