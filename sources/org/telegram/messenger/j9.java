package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class j9 implements Runnable {
    public final int f18240a;
    public final MediaDataController f18241b;
    public final String f18242c;
    public final TLObject d;

    public j9(MediaDataController mediaDataController, String str, TLObject tLObject, int i10) {
        this.f18240a = i10;
        this.f18241b = mediaDataController;
        this.f18242c = str;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f18240a) {
            case 0:
                this.f18241b.lambda$fetchStickerSetInternal$41(this.f18242c, this.d);
                return;
            default:
                this.f18241b.lambda$verifyAnimatedStickerMessageInternal$69(this.f18242c, this.d);
                return;
        }
    }
}
