package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class l9 implements Runnable {
    public final int f18871a;
    public final MediaDataController f18872b;
    public final String f18873c;
    public final TLObject d;

    public l9(MediaDataController mediaDataController, String str, TLObject tLObject, int i10) {
        this.f18871a = i10;
        this.f18872b = mediaDataController;
        this.f18873c = str;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f18871a) {
            case 0:
                this.f18872b.lambda$fetchStickerSetInternal$41(this.f18873c, this.d);
                return;
            default:
                this.f18872b.lambda$verifyAnimatedStickerMessageInternal$69(this.f18873c, this.d);
                return;
        }
    }
}
