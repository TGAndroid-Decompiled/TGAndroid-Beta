package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class l9 implements Runnable {
    public final int f16646a;
    public final MediaDataController f16647b;
    public final String f16648c;
    public final TLObject d;

    public l9(MediaDataController mediaDataController, String str, TLObject tLObject, int i10) {
        this.f16646a = i10;
        this.f16647b = mediaDataController;
        this.f16648c = str;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f16646a) {
            case 0:
                this.f16647b.lambda$fetchStickerSetInternal$41(this.f16648c, this.d);
                return;
            default:
                this.f16647b.lambda$verifyAnimatedStickerMessageInternal$69(this.f16648c, this.d);
                return;
        }
    }
}
