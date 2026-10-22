package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class o9 implements Runnable {
    public final int f19117a;
    public final MediaDataController f19118b;
    public final String f19119c;
    public final TLObject d;

    public o9(MediaDataController mediaDataController, String str, TLObject tLObject, int i10) {
        this.f19117a = i10;
        this.f19118b = mediaDataController;
        this.f19119c = str;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f19117a) {
            case 0:
                this.f19118b.lambda$fetchStickerSetInternal$41(this.f19119c, this.d);
                return;
            default:
                this.f19118b.lambda$verifyAnimatedStickerMessageInternal$69(this.f19119c, this.d);
                return;
        }
    }
}
