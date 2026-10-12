package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class m9 implements Runnable {
    public final int f17852a;
    public final MediaDataController f17853b;
    public final String f17854c;
    public final TLObject d;

    public m9(MediaDataController mediaDataController, String str, TLObject tLObject, int i10) {
        this.f17852a = i10;
        this.f17853b = mediaDataController;
        this.f17854c = str;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f17852a) {
            case 0:
                this.f17853b.lambda$fetchStickerSetInternal$41(this.f17854c, this.d);
                return;
            default:
                this.f17853b.lambda$verifyAnimatedStickerMessageInternal$69(this.f17854c, this.d);
                return;
        }
    }
}
