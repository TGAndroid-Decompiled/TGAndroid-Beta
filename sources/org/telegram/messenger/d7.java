package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class d7 implements Runnable {
    public final int f17452a;
    public final MediaDataController f17453b;
    public final TLObject f17454c;

    public d7(MediaDataController mediaDataController, TLObject tLObject, int i10) {
        this.f17452a = i10;
        this.f17453b = mediaDataController;
        this.f17454c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f17452a) {
            case 0:
                this.f17453b.lambda$checkPremiumGiftStickers$75(this.f17454c);
                return;
            case 1:
                this.f17453b.lambda$loadReactions$13(this.f17454c);
                return;
            case 2:
                this.f17453b.lambda$checkTonGiftStickers$77(this.f17454c);
                return;
            case 3:
                this.f17453b.lambda$checkDefaultTopicIcons$81(this.f17454c);
                return;
            case 4:
                this.f17453b.lambda$clearRecentStickers$18(this.f17454c);
                return;
            default:
                this.f17453b.lambda$checkGenericAnimations$79(this.f17454c);
                return;
        }
    }
}
