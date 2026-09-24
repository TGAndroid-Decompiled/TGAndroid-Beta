package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class l9 implements Runnable {
    public final int f16889a;
    public final MediaDataController f16890b;
    public final String f16891c;
    public final TLObject d;

    public l9(MediaDataController mediaDataController, String str, TLObject tLObject, int i10) {
        this.f16889a = i10;
        this.f16890b = mediaDataController;
        this.f16891c = str;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f16889a) {
            case 0:
                this.f16890b.lambda$fetchStickerSetInternal$41(this.f16891c, this.d);
                return;
            default:
                this.f16890b.lambda$verifyAnimatedStickerMessageInternal$69(this.f16891c, this.d);
                return;
        }
    }
}
