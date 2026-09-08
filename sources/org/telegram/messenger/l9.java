package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class l9 implements Runnable {
    public final int f18279a;
    public final MediaDataController f18280b;
    public final String f18281c;
    public final TLObject d;

    public l9(MediaDataController mediaDataController, String str, TLObject tLObject, int i10) {
        this.f18279a = i10;
        this.f18280b = mediaDataController;
        this.f18281c = str;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f18279a) {
            case 0:
                this.f18280b.lambda$fetchStickerSetInternal$41(this.f18281c, this.d);
                return;
            default:
                this.f18280b.lambda$verifyAnimatedStickerMessageInternal$69(this.f18281c, this.d);
                return;
        }
    }
}
