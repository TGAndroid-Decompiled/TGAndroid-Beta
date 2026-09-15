package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class e7 implements Runnable {
    public final int f16014a;
    public final MediaDataController f16015b;
    public final TLObject f16016c;

    public e7(MediaDataController mediaDataController, TLObject tLObject, int i10) {
        this.f16014a = i10;
        this.f16015b = mediaDataController;
        this.f16016c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f16014a) {
            case 0:
                this.f16015b.lambda$checkPremiumGiftStickers$75(this.f16016c);
                return;
            case 1:
                this.f16015b.lambda$loadReactions$13(this.f16016c);
                return;
            case 2:
                this.f16015b.lambda$checkTonGiftStickers$77(this.f16016c);
                return;
            case 3:
                this.f16015b.lambda$checkDefaultTopicIcons$81(this.f16016c);
                return;
            case 4:
                this.f16015b.lambda$clearRecentStickers$18(this.f16016c);
                return;
            default:
                this.f16015b.lambda$checkGenericAnimations$79(this.f16016c);
                return;
        }
    }
}
