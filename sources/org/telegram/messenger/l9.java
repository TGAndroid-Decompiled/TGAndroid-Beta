package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class l9 implements Runnable {
    public final int f16876a;
    public final MediaDataController f16877b;
    public final String f16878c;
    public final TLObject d;

    public l9(MediaDataController mediaDataController, String str, TLObject tLObject, int i10) {
        this.f16876a = i10;
        this.f16877b = mediaDataController;
        this.f16878c = str;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f16876a) {
            case 0:
                this.f16877b.lambda$fetchStickerSetInternal$41(this.f16878c, this.d);
                return;
            default:
                this.f16877b.lambda$verifyAnimatedStickerMessageInternal$69(this.f16878c, this.d);
                return;
        }
    }
}
