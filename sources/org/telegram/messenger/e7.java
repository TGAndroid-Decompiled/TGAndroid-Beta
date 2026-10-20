package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class e7 implements Runnable {
    public final int f18252a;
    public final MediaDataController f18253b;
    public final TLObject f18254c;

    public e7(MediaDataController mediaDataController, TLObject tLObject, int i10) {
        this.f18252a = i10;
        this.f18253b = mediaDataController;
        this.f18254c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f18252a) {
            case 0:
                this.f18253b.lambda$checkPremiumGiftStickers$75(this.f18254c);
                return;
            case 1:
                this.f18253b.lambda$loadReactions$13(this.f18254c);
                return;
            case 2:
                this.f18253b.lambda$checkTonGiftStickers$77(this.f18254c);
                return;
            case 3:
                this.f18253b.lambda$checkDefaultTopicIcons$81(this.f18254c);
                return;
            case 4:
                this.f18253b.lambda$clearRecentStickers$18(this.f18254c);
                return;
            default:
                this.f18253b.lambda$checkGenericAnimations$79(this.f18254c);
                return;
        }
    }
}
