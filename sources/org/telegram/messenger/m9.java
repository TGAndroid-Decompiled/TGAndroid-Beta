package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class m9 implements Runnable {
    public final int f17548a;
    public final MediaDataController f17549b;
    public final String f17550c;
    public final TLObject d;

    public m9(MediaDataController mediaDataController, String str, TLObject tLObject, int i10) {
        this.f17548a = i10;
        this.f17549b = mediaDataController;
        this.f17550c = str;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f17548a) {
            case 0:
                this.f17549b.lambda$fetchStickerSetInternal$41(this.f17550c, this.d);
                return;
            default:
                this.f17549b.lambda$verifyAnimatedStickerMessageInternal$69(this.f17550c, this.d);
                return;
        }
    }
}
