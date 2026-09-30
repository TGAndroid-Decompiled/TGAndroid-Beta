package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class j9 implements Runnable {
    public final int f16736a;
    public final MediaDataController f16737b;
    public final String f16738c;
    public final TLObject d;

    public j9(MediaDataController mediaDataController, String str, TLObject tLObject, int i10) {
        this.f16736a = i10;
        this.f16737b = mediaDataController;
        this.f16738c = str;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f16736a) {
            case 0:
                this.f16737b.lambda$fetchStickerSetInternal$41(this.f16738c, this.d);
                return;
            default:
                this.f16737b.lambda$verifyAnimatedStickerMessageInternal$69(this.f16738c, this.d);
                return;
        }
    }
}
