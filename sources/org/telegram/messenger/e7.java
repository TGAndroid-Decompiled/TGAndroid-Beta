package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class e7 implements Runnable {
    public final int f16002a;
    public final MediaDataController f16003b;
    public final TLObject f16004c;

    public e7(MediaDataController mediaDataController, TLObject tLObject, int i10) {
        this.f16002a = i10;
        this.f16003b = mediaDataController;
        this.f16004c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f16002a) {
            case 0:
                this.f16003b.lambda$checkPremiumGiftStickers$75(this.f16004c);
                return;
            case 1:
                this.f16003b.lambda$loadReactions$13(this.f16004c);
                return;
            case 2:
                this.f16003b.lambda$checkTonGiftStickers$77(this.f16004c);
                return;
            case 3:
                this.f16003b.lambda$checkDefaultTopicIcons$81(this.f16004c);
                return;
            case 4:
                this.f16003b.lambda$clearRecentStickers$18(this.f16004c);
                return;
            default:
                this.f16003b.lambda$checkGenericAnimations$79(this.f16004c);
                return;
        }
    }
}
