package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class n9 implements Runnable {
    public final int f19042a;
    public final MediaDataController f19043b;
    public final String f19044c;
    public final TLObject d;

    public n9(MediaDataController mediaDataController, String str, TLObject tLObject, int i10) {
        this.f19042a = i10;
        this.f19043b = mediaDataController;
        this.f19044c = str;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f19042a) {
            case 0:
                this.f19043b.lambda$fetchStickerSetInternal$41(this.f19044c, this.d);
                return;
            default:
                this.f19043b.lambda$verifyAnimatedStickerMessageInternal$69(this.f19044c, this.d);
                return;
        }
    }
}
