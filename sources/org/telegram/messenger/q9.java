package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class q9 implements Runnable {
    public final int f18178a;
    public final MediaDataController f18179b;
    public final String f18180c;
    public final TLObject d;

    public q9(MediaDataController mediaDataController, String str, TLObject tLObject, int i10) {
        this.f18178a = i10;
        this.f18179b = mediaDataController;
        this.f18180c = str;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f18178a) {
            case 0:
                this.f18179b.lambda$fetchStickerSetInternal$41(this.f18180c, this.d);
                return;
            default:
                this.f18179b.lambda$verifyAnimatedStickerMessageInternal$69(this.f18180c, this.d);
                return;
        }
    }
}
