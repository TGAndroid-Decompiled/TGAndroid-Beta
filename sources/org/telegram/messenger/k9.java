package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class k9 implements Runnable {
    public final int f18172a;
    public final MediaDataController f18173b;
    public final String f18174c;
    public final TLObject d;

    public k9(MediaDataController mediaDataController, String str, TLObject tLObject, int i10) {
        this.f18172a = i10;
        this.f18173b = mediaDataController;
        this.f18174c = str;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f18172a) {
            case 0:
                this.f18173b.lambda$fetchStickerSetInternal$41(this.f18174c, this.d);
                return;
            default:
                this.f18173b.lambda$verifyAnimatedStickerMessageInternal$69(this.f18174c, this.d);
                return;
        }
    }
}
