package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class j9 implements Runnable {
    public final int f18241a;
    public final MediaDataController f18242b;
    public final String f18243c;
    public final TLObject d;

    public j9(MediaDataController mediaDataController, String str, TLObject tLObject, int i10) {
        this.f18241a = i10;
        this.f18242b = mediaDataController;
        this.f18243c = str;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f18241a) {
            case 0:
                this.f18242b.lambda$fetchStickerSetInternal$41(this.f18243c, this.d);
                return;
            default:
                this.f18242b.lambda$verifyAnimatedStickerMessageInternal$69(this.f18243c, this.d);
                return;
        }
    }
}
