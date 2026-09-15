package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class l9 implements Runnable {
    public final int f16657a;
    public final MediaDataController f16658b;
    public final String f16659c;
    public final TLObject d;

    public l9(MediaDataController mediaDataController, String str, TLObject tLObject, int i10) {
        this.f16657a = i10;
        this.f16658b = mediaDataController;
        this.f16659c = str;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f16657a) {
            case 0:
                this.f16658b.lambda$fetchStickerSetInternal$41(this.f16659c, this.d);
                return;
            default:
                this.f16658b.lambda$verifyAnimatedStickerMessageInternal$69(this.f16659c, this.d);
                return;
        }
    }
}
