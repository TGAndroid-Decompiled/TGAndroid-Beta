package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class j9 implements Runnable {
    public final int f16720a;
    public final MediaDataController f16721b;
    public final String f16722c;
    public final TLObject d;

    public j9(MediaDataController mediaDataController, String str, TLObject tLObject, int i10) {
        this.f16720a = i10;
        this.f16721b = mediaDataController;
        this.f16722c = str;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f16720a) {
            case 0:
                this.f16721b.lambda$fetchStickerSetInternal$41(this.f16722c, this.d);
                return;
            default:
                this.f16721b.lambda$verifyAnimatedStickerMessageInternal$69(this.f16722c, this.d);
                return;
        }
    }
}
