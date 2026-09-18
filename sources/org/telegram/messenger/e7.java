package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class e7 implements Runnable {
    public final int f16201a;
    public final MediaDataController f16202b;
    public final TLObject f16203c;

    public e7(MediaDataController mediaDataController, TLObject tLObject, int i10) {
        this.f16201a = i10;
        this.f16202b = mediaDataController;
        this.f16203c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f16201a) {
            case 0:
                this.f16202b.lambda$checkPremiumGiftStickers$75(this.f16203c);
                return;
            case 1:
                this.f16202b.lambda$loadReactions$13(this.f16203c);
                return;
            case 2:
                this.f16202b.lambda$checkTonGiftStickers$77(this.f16203c);
                return;
            case 3:
                this.f16202b.lambda$checkDefaultTopicIcons$81(this.f16203c);
                return;
            case 4:
                this.f16202b.lambda$clearRecentStickers$18(this.f16203c);
                return;
            default:
                this.f16202b.lambda$checkGenericAnimations$79(this.f16203c);
                return;
        }
    }
}
