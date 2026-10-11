package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class j9 implements Runnable {
    public final int f18247a;
    public final MediaDataController f18248b;
    public final String f18249c;
    public final TLObject d;

    public j9(MediaDataController mediaDataController, String str, TLObject tLObject, int i10) {
        this.f18247a = i10;
        this.f18248b = mediaDataController;
        this.f18249c = str;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f18247a) {
            case 0:
                this.f18248b.lambda$fetchStickerSetInternal$41(this.f18249c, this.d);
                return;
            default:
                this.f18248b.lambda$verifyAnimatedStickerMessageInternal$69(this.f18249c, this.d);
                return;
        }
    }
}
