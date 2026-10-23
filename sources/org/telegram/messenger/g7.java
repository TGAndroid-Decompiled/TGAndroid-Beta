package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class g7 implements Runnable {
    public final int f18489a;
    public final MediaDataController f18490b;
    public final TLObject f18491c;

    public g7(MediaDataController mediaDataController, TLObject tLObject, int i10) {
        this.f18489a = i10;
        this.f18490b = mediaDataController;
        this.f18491c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f18489a) {
            case 0:
                this.f18490b.lambda$checkPremiumGiftStickers$75(this.f18491c);
                return;
            case 1:
                this.f18490b.lambda$loadReactions$13(this.f18491c);
                return;
            case 2:
                this.f18490b.lambda$checkTonGiftStickers$77(this.f18491c);
                return;
            case 3:
                this.f18490b.lambda$checkDefaultTopicIcons$81(this.f18491c);
                return;
            case 4:
                this.f18490b.lambda$clearRecentStickers$18(this.f18491c);
                return;
            default:
                this.f18490b.lambda$checkGenericAnimations$79(this.f18491c);
                return;
        }
    }
}
