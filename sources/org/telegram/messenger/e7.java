package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class e7 implements Runnable {
    public final int f16257a;
    public final MediaDataController f16258b;
    public final TLObject f16259c;

    public e7(MediaDataController mediaDataController, TLObject tLObject, int i10) {
        this.f16257a = i10;
        this.f16258b = mediaDataController;
        this.f16259c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f16257a) {
            case 0:
                this.f16258b.lambda$checkPremiumGiftStickers$75(this.f16259c);
                return;
            case 1:
                this.f16258b.lambda$loadReactions$13(this.f16259c);
                return;
            case 2:
                this.f16258b.lambda$checkTonGiftStickers$77(this.f16259c);
                return;
            case 3:
                this.f16258b.lambda$checkDefaultTopicIcons$81(this.f16259c);
                return;
            case 4:
                this.f16258b.lambda$clearRecentStickers$18(this.f16259c);
                return;
            default:
                this.f16258b.lambda$checkGenericAnimations$79(this.f16259c);
                return;
        }
    }
}
