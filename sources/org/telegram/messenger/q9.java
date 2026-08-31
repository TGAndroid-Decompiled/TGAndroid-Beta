package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class q9 implements Runnable {
    public final int f19763a;
    public final MediaDataController f19764b;
    public final String f19765c;
    public final TLObject d;

    public q9(MediaDataController mediaDataController, String str, TLObject tLObject, int i10) {
        this.f19763a = i10;
        this.f19764b = mediaDataController;
        this.f19765c = str;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f19763a) {
            case 0:
                this.f19764b.lambda$fetchStickerSetInternal$41(this.f19765c, this.d);
                return;
            default:
                this.f19764b.lambda$verifyAnimatedStickerMessageInternal$69(this.f19765c, this.d);
                return;
        }
    }
}
