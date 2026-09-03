package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class q9 implements Runnable {
    public final int f19765a;
    public final MediaDataController f19766b;
    public final String f19767c;
    public final TLObject d;

    public q9(MediaDataController mediaDataController, String str, TLObject tLObject, int i10) {
        this.f19765a = i10;
        this.f19766b = mediaDataController;
        this.f19767c = str;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f19765a) {
            case 0:
                this.f19766b.lambda$fetchStickerSetInternal$41(this.f19767c, this.d);
                return;
            default:
                this.f19766b.lambda$verifyAnimatedStickerMessageInternal$69(this.f19767c, this.d);
                return;
        }
    }
}
