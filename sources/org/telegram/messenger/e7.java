package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class e7 implements Runnable {
    public final int f16241a;
    public final MediaDataController f16242b;
    public final TLObject f16243c;

    public e7(MediaDataController mediaDataController, TLObject tLObject, int i10) {
        this.f16241a = i10;
        this.f16242b = mediaDataController;
        this.f16243c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f16241a) {
            case 0:
                this.f16242b.lambda$checkPremiumGiftStickers$75(this.f16243c);
                return;
            case 1:
                this.f16242b.lambda$loadReactions$13(this.f16243c);
                return;
            case 2:
                this.f16242b.lambda$checkTonGiftStickers$77(this.f16243c);
                return;
            case 3:
                this.f16242b.lambda$checkDefaultTopicIcons$81(this.f16243c);
                return;
            case 4:
                this.f16242b.lambda$clearRecentStickers$18(this.f16243c);
                return;
            default:
                this.f16242b.lambda$checkGenericAnimations$79(this.f16243c);
                return;
        }
    }
}
