package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class q9 implements Runnable {
    public final int f18204a;
    public final MediaDataController f18205b;
    public final String f18206c;
    public final TLObject d;

    public q9(MediaDataController mediaDataController, String str, TLObject tLObject, int i10) {
        this.f18204a = i10;
        this.f18205b = mediaDataController;
        this.f18206c = str;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f18204a) {
            case 0:
                this.f18205b.lambda$fetchStickerSetInternal$41(this.f18206c, this.d);
                return;
            default:
                this.f18205b.lambda$verifyAnimatedStickerMessageInternal$69(this.f18206c, this.d);
                return;
        }
    }
}
