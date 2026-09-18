package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class l9 implements Runnable {
    public final int f16834a;
    public final MediaDataController f16835b;
    public final String f16836c;
    public final TLObject d;

    public l9(MediaDataController mediaDataController, String str, TLObject tLObject, int i10) {
        this.f16834a = i10;
        this.f16835b = mediaDataController;
        this.f16836c = str;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f16834a) {
            case 0:
                this.f16835b.lambda$fetchStickerSetInternal$41(this.f16836c, this.d);
                return;
            default:
                this.f16835b.lambda$verifyAnimatedStickerMessageInternal$69(this.f16836c, this.d);
                return;
        }
    }
}
