package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class j7 implements Runnable {
    public final int f20413a;
    public final MediaDataController f20414b;
    public final TLObject f20415c;

    public j7(MediaDataController mediaDataController, TLObject tLObject, int i10) {
        this.f20413a = i10;
        this.f20414b = mediaDataController;
        this.f20415c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f20413a) {
            case 0:
                this.f20414b.lambda$checkPremiumGiftStickers$75(this.f20415c);
                return;
            case 1:
                this.f20414b.lambda$loadReactions$13(this.f20415c);
                return;
            case 2:
                this.f20414b.lambda$checkTonGiftStickers$77(this.f20415c);
                return;
            case 3:
                this.f20414b.lambda$checkDefaultTopicIcons$81(this.f20415c);
                return;
            case 4:
                this.f20414b.lambda$clearRecentStickers$18(this.f20415c);
                return;
            default:
                this.f20414b.lambda$checkGenericAnimations$79(this.f20415c);
                return;
        }
    }
}
