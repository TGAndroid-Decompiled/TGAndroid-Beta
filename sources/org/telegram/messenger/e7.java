package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class e7 implements Runnable {
    public final int f17526a;
    public final MediaDataController f17527b;
    public final TLObject f17528c;

    public e7(MediaDataController mediaDataController, TLObject tLObject, int i10) {
        this.f17526a = i10;
        this.f17527b = mediaDataController;
        this.f17528c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f17526a) {
            case 0:
                this.f17527b.lambda$checkPremiumGiftStickers$75(this.f17528c);
                return;
            case 1:
                this.f17527b.lambda$loadReactions$13(this.f17528c);
                return;
            case 2:
                this.f17527b.lambda$checkTonGiftStickers$77(this.f17528c);
                return;
            case 3:
                this.f17527b.lambda$checkDefaultTopicIcons$81(this.f17528c);
                return;
            case 4:
                this.f17527b.lambda$clearRecentStickers$18(this.f17528c);
                return;
            default:
                this.f17527b.lambda$checkGenericAnimations$79(this.f17528c);
                return;
        }
    }
}
