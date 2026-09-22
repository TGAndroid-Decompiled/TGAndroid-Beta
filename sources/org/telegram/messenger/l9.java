package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class l9 implements Runnable {
    public final int f16891a;
    public final MediaDataController f16892b;
    public final String f16893c;
    public final TLObject d;

    public l9(MediaDataController mediaDataController, String str, TLObject tLObject, int i10) {
        this.f16891a = i10;
        this.f16892b = mediaDataController;
        this.f16893c = str;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f16891a) {
            case 0:
                this.f16892b.lambda$fetchStickerSetInternal$41(this.f16893c, this.d);
                return;
            default:
                this.f16892b.lambda$verifyAnimatedStickerMessageInternal$69(this.f16893c, this.d);
                return;
        }
    }
}
