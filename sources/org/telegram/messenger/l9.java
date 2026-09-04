package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class l9 implements Runnable {
    public final int f18252a;
    public final MediaDataController f18253b;
    public final String f18254c;
    public final TLObject d;

    public l9(MediaDataController mediaDataController, String str, TLObject tLObject, int i10) {
        this.f18252a = i10;
        this.f18253b = mediaDataController;
        this.f18254c = str;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f18252a) {
            case 0:
                this.f18253b.lambda$fetchStickerSetInternal$41(this.f18254c, this.d);
                return;
            default:
                this.f18253b.lambda$verifyAnimatedStickerMessageInternal$69(this.f18254c, this.d);
                return;
        }
    }
}
