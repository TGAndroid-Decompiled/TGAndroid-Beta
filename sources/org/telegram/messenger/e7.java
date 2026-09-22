package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class e7 implements Runnable {
    public final int f16011a;
    public final MediaDataController f16012b;
    public final TLObject f16013c;

    public e7(MediaDataController mediaDataController, TLObject tLObject, int i10) {
        this.f16011a = i10;
        this.f16012b = mediaDataController;
        this.f16013c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f16011a) {
            case 0:
                this.f16012b.lambda$checkPremiumGiftStickers$75(this.f16013c);
                return;
            case 1:
                this.f16012b.lambda$loadReactions$13(this.f16013c);
                return;
            case 2:
                this.f16012b.lambda$checkTonGiftStickers$77(this.f16013c);
                return;
            case 3:
                this.f16012b.lambda$checkDefaultTopicIcons$81(this.f16013c);
                return;
            case 4:
                this.f16012b.lambda$clearRecentStickers$18(this.f16013c);
                return;
            default:
                this.f16012b.lambda$checkGenericAnimations$79(this.f16013c);
                return;
        }
    }
}
