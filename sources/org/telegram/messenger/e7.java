package org.telegram.messenger;

import org.telegram.tgnet.TLObject;

public final class e7 implements Runnable {

    public final int f20113a;

    public final MediaDataController f20114b;

    public final TLObject f20115c;

    public e7(MediaDataController mediaDataController, TLObject tLObject, int i10) {
        this.f20113a = i10;
        this.f20114b = mediaDataController;
        this.f20115c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f20113a) {
            case 0:
                this.f20114b.lambda$checkPremiumGiftStickers$75(this.f20115c);
                break;
            case 1:
                this.f20114b.lambda$loadReactions$13(this.f20115c);
                break;
            case 2:
                this.f20114b.lambda$checkTonGiftStickers$77(this.f20115c);
                break;
            case 3:
                this.f20114b.lambda$checkDefaultTopicIcons$81(this.f20115c);
                break;
            case 4:
                this.f20114b.lambda$clearRecentStickers$18(this.f20115c);
                break;
            default:
                this.f20114b.lambda$checkGenericAnimations$79(this.f20115c);
                break;
        }
    }
}
