package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class d7 implements Runnable {
    public final int f18156a;
    public final MediaDataController f18157b;
    public final TLObject f18158c;

    public d7(MediaDataController mediaDataController, TLObject tLObject, int i10) {
        this.f18156a = i10;
        this.f18157b = mediaDataController;
        this.f18158c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f18156a) {
            case 0:
                this.f18157b.lambda$checkPremiumGiftStickers$75(this.f18158c);
                return;
            case 1:
                this.f18157b.lambda$loadReactions$13(this.f18158c);
                return;
            case 2:
                this.f18157b.lambda$checkTonGiftStickers$77(this.f18158c);
                return;
            case 3:
                this.f18157b.lambda$checkDefaultTopicIcons$81(this.f18158c);
                return;
            case 4:
                this.f18157b.lambda$clearRecentStickers$18(this.f18158c);
                return;
            default:
                this.f18157b.lambda$checkGenericAnimations$79(this.f18158c);
                return;
        }
    }
}
