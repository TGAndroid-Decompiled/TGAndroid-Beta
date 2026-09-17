package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class k9 implements Runnable {
    public final int f18199a;
    public final MediaDataController f18200b;
    public final String f18201c;
    public final TLObject d;

    public k9(MediaDataController mediaDataController, String str, TLObject tLObject, int i10) {
        this.f18199a = i10;
        this.f18200b = mediaDataController;
        this.f18201c = str;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f18199a) {
            case 0:
                this.f18200b.lambda$fetchStickerSetInternal$41(this.f18201c, this.d);
                return;
            default:
                this.f18200b.lambda$verifyAnimatedStickerMessageInternal$69(this.f18201c, this.d);
                return;
        }
    }
}
