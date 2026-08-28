package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class j9 implements Runnable {
    public final int f20677a;
    public final MediaDataController f20678b;
    public final String f20679c;
    public final TLObject d;

    public j9(MediaDataController mediaDataController, String str, TLObject tLObject, int i9) {
        this.f20677a = i9;
        this.f20678b = mediaDataController;
        this.f20679c = str;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f20677a) {
            case 0:
                this.f20678b.lambda$fetchStickerSetInternal$41(this.f20679c, this.d);
                return;
            default:
                this.f20678b.lambda$verifyAnimatedStickerMessageInternal$69(this.f20679c, this.d);
                return;
        }
    }
}
