package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class j9 implements Runnable {
    public final int f18689a;
    public final MediaDataController f18690b;
    public final String f18691c;
    public final TLObject d;

    public j9(MediaDataController mediaDataController, String str, TLObject tLObject, int i10) {
        this.f18689a = i10;
        this.f18690b = mediaDataController;
        this.f18691c = str;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f18689a) {
            case 0:
                this.f18690b.lambda$fetchStickerSetInternal$41(this.f18691c, this.d);
                return;
            default:
                this.f18690b.lambda$verifyAnimatedStickerMessageInternal$69(this.f18691c, this.d);
                return;
        }
    }
}
