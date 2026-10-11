package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class j9 implements Runnable {
    public final int f18283a;
    public final MediaDataController f18284b;
    public final String f18285c;
    public final TLObject d;

    public j9(MediaDataController mediaDataController, String str, TLObject tLObject, int i10) {
        this.f18283a = i10;
        this.f18284b = mediaDataController;
        this.f18285c = str;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f18283a) {
            case 0:
                this.f18284b.lambda$fetchStickerSetInternal$41(this.f18285c, this.d);
                return;
            default:
                this.f18284b.lambda$verifyAnimatedStickerMessageInternal$69(this.f18285c, this.d);
                return;
        }
    }
}
