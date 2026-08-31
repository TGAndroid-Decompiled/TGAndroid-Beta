package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class h7 implements Runnable {
    public final int f18832a;
    public final MediaDataController f18833b;
    public final TLObject f18834c;

    public h7(MediaDataController mediaDataController, TLObject tLObject, int i10) {
        this.f18832a = i10;
        this.f18833b = mediaDataController;
        this.f18834c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f18832a) {
            case 0:
                this.f18833b.lambda$checkPremiumGiftStickers$75(this.f18834c);
                return;
            case 1:
                this.f18833b.lambda$loadReactions$13(this.f18834c);
                return;
            case 2:
                this.f18833b.lambda$checkTonGiftStickers$77(this.f18834c);
                return;
            case 3:
                this.f18833b.lambda$checkDefaultTopicIcons$81(this.f18834c);
                return;
            case 4:
                this.f18833b.lambda$clearRecentStickers$18(this.f18834c);
                return;
            default:
                this.f18833b.lambda$checkGenericAnimations$79(this.f18834c);
                return;
        }
    }
}
