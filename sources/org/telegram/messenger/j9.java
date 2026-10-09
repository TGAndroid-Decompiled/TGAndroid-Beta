package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class j9 implements Runnable {
    public final int f18238a;
    public final MediaDataController f18239b;
    public final String f18240c;
    public final TLObject d;

    public j9(MediaDataController mediaDataController, String str, TLObject tLObject, int i10) {
        this.f18238a = i10;
        this.f18239b = mediaDataController;
        this.f18240c = str;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f18238a) {
            case 0:
                this.f18239b.lambda$fetchStickerSetInternal$41(this.f18240c, this.d);
                return;
            default:
                this.f18239b.lambda$verifyAnimatedStickerMessageInternal$69(this.f18240c, this.d);
                return;
        }
    }
}
