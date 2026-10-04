package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class j9 implements Runnable {
    public final int f18235a;
    public final MediaDataController f18236b;
    public final String f18237c;
    public final TLObject d;

    public j9(MediaDataController mediaDataController, String str, TLObject tLObject, int i10) {
        this.f18235a = i10;
        this.f18236b = mediaDataController;
        this.f18237c = str;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f18235a) {
            case 0:
                this.f18236b.lambda$fetchStickerSetInternal$41(this.f18237c, this.d);
                return;
            default:
                this.f18236b.lambda$verifyAnimatedStickerMessageInternal$69(this.f18237c, this.d);
                return;
        }
    }
}
