package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class n9 implements Runnable {
    public final int f19108a;
    public final MediaDataController f19109b;
    public final String f19110c;
    public final TLObject d;

    public n9(MediaDataController mediaDataController, String str, TLObject tLObject, int i10) {
        this.f19108a = i10;
        this.f19109b = mediaDataController;
        this.f19110c = str;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f19108a) {
            case 0:
                this.f19109b.lambda$fetchStickerSetInternal$41(this.f19110c, this.d);
                return;
            default:
                this.f19109b.lambda$verifyAnimatedStickerMessageInternal$69(this.f19110c, this.d);
                return;
        }
    }
}
