package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class s9 implements Runnable {
    public final int f16295a;
    public final MediaDataController f16296b;
    public final String f16297c;
    public final TLObject d;

    public s9(MediaDataController mediaDataController, String str, TLObject tLObject, int i10) {
        this.f16295a = i10;
        this.f16296b = mediaDataController;
        this.f16297c = str;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f16295a) {
            case 0:
                this.f16296b.lambda$fetchStickerSetInternal$41(this.f16297c, this.d);
                return;
            default:
                this.f16296b.lambda$verifyAnimatedStickerMessageInternal$69(this.f16297c, this.d);
                return;
        }
    }
}
