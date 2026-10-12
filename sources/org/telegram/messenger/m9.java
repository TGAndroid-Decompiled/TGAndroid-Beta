package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class m9 implements Runnable {
    public final int f18263a;
    public final MediaDataController f18264b;
    public final String f18265c;
    public final TLObject d;

    public m9(MediaDataController mediaDataController, String str, TLObject tLObject, int i10) {
        this.f18263a = i10;
        this.f18264b = mediaDataController;
        this.f18265c = str;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f18263a) {
            case 0:
                this.f18264b.lambda$fetchStickerSetInternal$41(this.f18265c, this.d);
                return;
            default:
                this.f18264b.lambda$verifyAnimatedStickerMessageInternal$69(this.f18265c, this.d);
                return;
        }
    }
}
