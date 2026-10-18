package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class k9 implements Runnable {
    public final int f18777a;
    public final MediaDataController f18778b;
    public final String f18779c;
    public final TLObject d;

    public k9(MediaDataController mediaDataController, String str, TLObject tLObject, int i10) {
        this.f18777a = i10;
        this.f18778b = mediaDataController;
        this.f18779c = str;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f18777a) {
            case 0:
                this.f18778b.lambda$fetchStickerSetInternal$41(this.f18779c, this.d);
                return;
            default:
                this.f18778b.lambda$verifyAnimatedStickerMessageInternal$69(this.f18779c, this.d);
                return;
        }
    }
}
