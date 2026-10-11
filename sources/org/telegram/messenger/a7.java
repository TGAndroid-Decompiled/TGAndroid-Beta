package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class a7 implements Runnable {
    public final int f17306a;
    public final MediaDataController f17307b;
    public final TLObject f17308c;

    public a7(MediaDataController mediaDataController, TLObject tLObject, int i10) {
        this.f17306a = i10;
        this.f17307b = mediaDataController;
        this.f17308c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f17306a) {
            case 0:
                this.f17307b.lambda$checkPremiumGiftStickers$75(this.f17308c);
                return;
            case 1:
                this.f17307b.lambda$loadReactions$13(this.f17308c);
                return;
            case 2:
                this.f17307b.lambda$checkTonGiftStickers$77(this.f17308c);
                return;
            case 3:
                this.f17307b.lambda$checkDefaultTopicIcons$81(this.f17308c);
                return;
            case 4:
                this.f17307b.lambda$clearRecentStickers$18(this.f17308c);
                return;
            default:
                this.f17307b.lambda$checkGenericAnimations$79(this.f17308c);
                return;
        }
    }
}
