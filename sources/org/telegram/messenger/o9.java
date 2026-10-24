package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class o9 implements Runnable {
    public final int f19180a;
    public final MediaDataController f19181b;
    public final String f19182c;
    public final TLObject d;

    public o9(MediaDataController mediaDataController, String str, TLObject tLObject, int i10) {
        this.f19180a = i10;
        this.f19181b = mediaDataController;
        this.f19182c = str;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f19180a) {
            case 0:
                this.f19181b.lambda$fetchStickerSetInternal$41(this.f19182c, this.d);
                return;
            default:
                this.f19181b.lambda$verifyAnimatedStickerMessageInternal$69(this.f19182c, this.d);
                return;
        }
    }
}
