package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class l9 implements Runnable {
    public final int f16653a;
    public final MediaDataController f16654b;
    public final String f16655c;
    public final TLObject d;

    public l9(MediaDataController mediaDataController, String str, TLObject tLObject, int i10) {
        this.f16653a = i10;
        this.f16654b = mediaDataController;
        this.f16655c = str;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f16653a) {
            case 0:
                this.f16654b.lambda$fetchStickerSetInternal$41(this.f16655c, this.d);
                return;
            default:
                this.f16654b.lambda$verifyAnimatedStickerMessageInternal$69(this.f16655c, this.d);
                return;
        }
    }
}
