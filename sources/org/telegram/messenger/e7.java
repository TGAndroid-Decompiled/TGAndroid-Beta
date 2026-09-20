package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class e7 implements Runnable {
    public final int f16242a;
    public final MediaDataController f16243b;
    public final TLObject f16244c;

    public e7(MediaDataController mediaDataController, TLObject tLObject, int i10) {
        this.f16242a = i10;
        this.f16243b = mediaDataController;
        this.f16244c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f16242a) {
            case 0:
                this.f16243b.lambda$checkPremiumGiftStickers$75(this.f16244c);
                return;
            case 1:
                this.f16243b.lambda$loadReactions$13(this.f16244c);
                return;
            case 2:
                this.f16243b.lambda$checkTonGiftStickers$77(this.f16244c);
                return;
            case 3:
                this.f16243b.lambda$checkDefaultTopicIcons$81(this.f16244c);
                return;
            case 4:
                this.f16243b.lambda$clearRecentStickers$18(this.f16244c);
                return;
            default:
                this.f16243b.lambda$checkGenericAnimations$79(this.f16244c);
                return;
        }
    }
}
