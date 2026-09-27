package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class e7 implements Runnable {
    public final int f16250a;
    public final MediaDataController f16251b;
    public final TLObject f16252c;

    public e7(MediaDataController mediaDataController, TLObject tLObject, int i10) {
        this.f16250a = i10;
        this.f16251b = mediaDataController;
        this.f16252c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f16250a) {
            case 0:
                this.f16251b.lambda$checkPremiumGiftStickers$75(this.f16252c);
                return;
            case 1:
                this.f16251b.lambda$loadReactions$13(this.f16252c);
                return;
            case 2:
                this.f16251b.lambda$checkTonGiftStickers$77(this.f16252c);
                return;
            case 3:
                this.f16251b.lambda$checkDefaultTopicIcons$81(this.f16252c);
                return;
            case 4:
                this.f16251b.lambda$clearRecentStickers$18(this.f16252c);
                return;
            default:
                this.f16251b.lambda$checkGenericAnimations$79(this.f16252c);
                return;
        }
    }
}
