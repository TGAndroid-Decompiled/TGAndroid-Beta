package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class j9 implements Runnable {
    public final int f18686a;
    public final MediaDataController f18687b;
    public final String f18688c;
    public final TLObject d;

    public j9(MediaDataController mediaDataController, String str, TLObject tLObject, int i10) {
        this.f18686a = i10;
        this.f18687b = mediaDataController;
        this.f18688c = str;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f18686a) {
            case 0:
                this.f18687b.lambda$fetchStickerSetInternal$41(this.f18688c, this.d);
                return;
            default:
                this.f18687b.lambda$verifyAnimatedStickerMessageInternal$69(this.f18688c, this.d);
                return;
        }
    }
}
