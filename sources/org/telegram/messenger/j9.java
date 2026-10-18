package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class j9 implements Runnable {
    public final int f18692a;
    public final MediaDataController f18693b;
    public final String f18694c;
    public final TLObject d;

    public j9(MediaDataController mediaDataController, String str, TLObject tLObject, int i10) {
        this.f18692a = i10;
        this.f18693b = mediaDataController;
        this.f18694c = str;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f18692a) {
            case 0:
                this.f18693b.lambda$fetchStickerSetInternal$41(this.f18694c, this.d);
                return;
            default:
                this.f18693b.lambda$verifyAnimatedStickerMessageInternal$69(this.f18694c, this.d);
                return;
        }
    }
}
