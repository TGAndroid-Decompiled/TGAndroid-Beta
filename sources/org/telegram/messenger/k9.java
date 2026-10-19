package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class k9 implements Runnable {
    public final int f18780a;
    public final MediaDataController f18781b;
    public final String f18782c;
    public final TLObject d;

    public k9(MediaDataController mediaDataController, String str, TLObject tLObject, int i10) {
        this.f18780a = i10;
        this.f18781b = mediaDataController;
        this.f18782c = str;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f18780a) {
            case 0:
                this.f18781b.lambda$fetchStickerSetInternal$41(this.f18782c, this.d);
                return;
            default:
                this.f18781b.lambda$verifyAnimatedStickerMessageInternal$69(this.f18782c, this.d);
                return;
        }
    }
}
