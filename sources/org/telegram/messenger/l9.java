package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class l9 implements Runnable {
    public final int f16666a;
    public final MediaDataController f16667b;
    public final String f16668c;
    public final TLObject d;

    public l9(MediaDataController mediaDataController, String str, TLObject tLObject, int i10) {
        this.f16666a = i10;
        this.f16667b = mediaDataController;
        this.f16668c = str;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f16666a) {
            case 0:
                this.f16667b.lambda$fetchStickerSetInternal$41(this.f16668c, this.d);
                return;
            default:
                this.f16667b.lambda$verifyAnimatedStickerMessageInternal$69(this.f16668c, this.d);
                return;
        }
    }
}
