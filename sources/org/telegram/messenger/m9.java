package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class m9 implements Runnable {
    public final int f18262a;
    public final MediaDataController f18263b;
    public final String f18264c;
    public final TLObject d;

    public m9(MediaDataController mediaDataController, String str, TLObject tLObject, int i10) {
        this.f18262a = i10;
        this.f18263b = mediaDataController;
        this.f18264c = str;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f18262a) {
            case 0:
                this.f18263b.lambda$fetchStickerSetInternal$41(this.f18264c, this.d);
                return;
            default:
                this.f18263b.lambda$verifyAnimatedStickerMessageInternal$69(this.f18264c, this.d);
                return;
        }
    }
}
