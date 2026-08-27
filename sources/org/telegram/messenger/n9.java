package org.telegram.messenger;

import org.telegram.tgnet.TLObject;

public final class n9 implements Runnable {

    public final int f21049a;

    public final MediaDataController f21050b;

    public final String f21051c;
    public final TLObject d;

    public n9(MediaDataController mediaDataController, String str, TLObject tLObject, int i10) {
        this.f21049a = i10;
        this.f21050b = mediaDataController;
        this.f21051c = str;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f21049a) {
            case 0:
                this.f21050b.lambda$fetchStickerSetInternal$41(this.f21051c, this.d);
                break;
            default:
                this.f21050b.lambda$verifyAnimatedStickerMessageInternal$69(this.f21051c, this.d);
                break;
        }
    }
}
