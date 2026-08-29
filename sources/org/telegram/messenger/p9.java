package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class p9 implements Runnable {
    public final int f21240a;
    public final MediaDataController f21241b;
    public final String f21242c;
    public final TLObject d;

    public p9(MediaDataController mediaDataController, String str, TLObject tLObject, int i10) {
        this.f21240a = i10;
        this.f21241b = mediaDataController;
        this.f21242c = str;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f21240a) {
            case 0:
                this.f21241b.lambda$fetchStickerSetInternal$41(this.f21242c, this.d);
                return;
            default:
                this.f21241b.lambda$verifyAnimatedStickerMessageInternal$69(this.f21242c, this.d);
                return;
        }
    }
}
