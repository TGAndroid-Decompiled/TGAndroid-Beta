package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class j9 implements Runnable {
    public final int f18242a;
    public final MediaDataController f18243b;
    public final String f18244c;
    public final TLObject d;

    public j9(MediaDataController mediaDataController, String str, TLObject tLObject, int i10) {
        this.f18242a = i10;
        this.f18243b = mediaDataController;
        this.f18244c = str;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f18242a) {
            case 0:
                this.f18243b.lambda$fetchStickerSetInternal$41(this.f18244c, this.d);
                return;
            default:
                this.f18243b.lambda$verifyAnimatedStickerMessageInternal$69(this.f18244c, this.d);
                return;
        }
    }
}
