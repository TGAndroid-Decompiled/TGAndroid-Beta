package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class h7 implements Runnable {
    public final int f18834a;
    public final MediaDataController f18835b;
    public final TLObject f18836c;

    public h7(MediaDataController mediaDataController, TLObject tLObject, int i10) {
        this.f18834a = i10;
        this.f18835b = mediaDataController;
        this.f18836c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f18834a) {
            case 0:
                this.f18835b.lambda$checkPremiumGiftStickers$75(this.f18836c);
                return;
            case 1:
                this.f18835b.lambda$loadReactions$13(this.f18836c);
                return;
            case 2:
                this.f18835b.lambda$checkTonGiftStickers$77(this.f18836c);
                return;
            case 3:
                this.f18835b.lambda$checkDefaultTopicIcons$81(this.f18836c);
                return;
            case 4:
                this.f18835b.lambda$clearRecentStickers$18(this.f18836c);
                return;
            default:
                this.f18835b.lambda$checkGenericAnimations$79(this.f18836c);
                return;
        }
    }
}
