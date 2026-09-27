package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class l9 implements Runnable {
    public final int f16898a;
    public final MediaDataController f16899b;
    public final String f16900c;
    public final TLObject d;

    public l9(MediaDataController mediaDataController, String str, TLObject tLObject, int i10) {
        this.f16898a = i10;
        this.f16899b = mediaDataController;
        this.f16900c = str;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f16898a) {
            case 0:
                this.f16899b.lambda$fetchStickerSetInternal$41(this.f16900c, this.d);
                return;
            default:
                this.f16899b.lambda$verifyAnimatedStickerMessageInternal$69(this.f16900c, this.d);
                return;
        }
    }
}
