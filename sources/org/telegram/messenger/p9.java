package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class p9 implements Runnable {
    public final int f20940a;
    public final MediaDataController f20941b;
    public final String f20942c;
    public final TLObject d;

    public p9(MediaDataController mediaDataController, String str, TLObject tLObject, int i10) {
        this.f20940a = i10;
        this.f20941b = mediaDataController;
        this.f20942c = str;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f20940a) {
            case 0:
                this.f20941b.lambda$fetchStickerSetInternal$41(this.f20942c, this.d);
                return;
            default:
                this.f20941b.lambda$verifyAnimatedStickerMessageInternal$69(this.f20942c, this.d);
                return;
        }
    }
}
