package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class l9 implements Runnable {
    public final int f18874a;
    public final MediaDataController f18875b;
    public final String f18876c;
    public final TLObject d;

    public l9(MediaDataController mediaDataController, String str, TLObject tLObject, int i10) {
        this.f18874a = i10;
        this.f18875b = mediaDataController;
        this.f18876c = str;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f18874a) {
            case 0:
                this.f18875b.lambda$fetchStickerSetInternal$41(this.f18876c, this.d);
                return;
            default:
                this.f18875b.lambda$verifyAnimatedStickerMessageInternal$69(this.f18876c, this.d);
                return;
        }
    }
}
