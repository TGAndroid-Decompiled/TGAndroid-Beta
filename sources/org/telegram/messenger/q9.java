package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class q9 implements Runnable {
    public final int f21029a;
    public final MediaDataController f21030b;
    public final String f21031c;
    public final TLObject d;

    public q9(MediaDataController mediaDataController, String str, TLObject tLObject, int i10) {
        this.f21029a = i10;
        this.f21030b = mediaDataController;
        this.f21031c = str;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f21029a) {
            case 0:
                this.f21030b.lambda$fetchStickerSetInternal$41(this.f21031c, this.d);
                return;
            default:
                this.f21030b.lambda$verifyAnimatedStickerMessageInternal$69(this.f21031c, this.d);
                return;
        }
    }
}
