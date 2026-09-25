package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class l9 implements Runnable {
    public final int f16904a;
    public final MediaDataController f16905b;
    public final String f16906c;
    public final TLObject d;

    public l9(MediaDataController mediaDataController, String str, TLObject tLObject, int i10) {
        this.f16904a = i10;
        this.f16905b = mediaDataController;
        this.f16906c = str;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f16904a) {
            case 0:
                this.f16905b.lambda$fetchStickerSetInternal$41(this.f16906c, this.d);
                return;
            default:
                this.f16905b.lambda$verifyAnimatedStickerMessageInternal$69(this.f16906c, this.d);
                return;
        }
    }
}
