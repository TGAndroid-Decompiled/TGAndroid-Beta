package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class c7 implements Runnable {
    public final int f18036a;
    public final MediaDataController f18037b;
    public final TLObject f18038c;

    public c7(MediaDataController mediaDataController, TLObject tLObject, int i10) {
        this.f18036a = i10;
        this.f18037b = mediaDataController;
        this.f18038c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f18036a) {
            case 0:
                this.f18037b.lambda$checkPremiumGiftStickers$75(this.f18038c);
                return;
            case 1:
                this.f18037b.lambda$loadReactions$13(this.f18038c);
                return;
            case 2:
                this.f18037b.lambda$checkTonGiftStickers$77(this.f18038c);
                return;
            case 3:
                this.f18037b.lambda$checkDefaultTopicIcons$81(this.f18038c);
                return;
            case 4:
                this.f18037b.lambda$clearRecentStickers$18(this.f18038c);
                return;
            default:
                this.f18037b.lambda$checkGenericAnimations$79(this.f18038c);
                return;
        }
    }
}
