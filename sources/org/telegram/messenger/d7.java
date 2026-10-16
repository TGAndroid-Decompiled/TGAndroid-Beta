package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class d7 implements Runnable {
    public final int f16753a;
    public final MediaDataController f16754b;
    public final TLObject f16755c;

    public d7(MediaDataController mediaDataController, TLObject tLObject, int i10) {
        this.f16753a = i10;
        this.f16754b = mediaDataController;
        this.f16755c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f16753a) {
            case 0:
                this.f16754b.lambda$checkPremiumGiftStickers$75(this.f16755c);
                return;
            case 1:
                this.f16754b.lambda$loadReactions$13(this.f16755c);
                return;
            case 2:
                this.f16754b.lambda$checkTonGiftStickers$77(this.f16755c);
                return;
            case 3:
                this.f16754b.lambda$checkDefaultTopicIcons$81(this.f16755c);
                return;
            case 4:
                this.f16754b.lambda$clearRecentStickers$18(this.f16755c);
                return;
            default:
                this.f16754b.lambda$checkGenericAnimations$79(this.f16755c);
                return;
        }
    }
}
