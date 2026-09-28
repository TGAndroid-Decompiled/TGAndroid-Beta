package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class j9 implements Runnable {
    public final int f16719a;
    public final MediaDataController f16720b;
    public final String f16721c;
    public final TLObject d;

    public j9(MediaDataController mediaDataController, String str, TLObject tLObject, int i10) {
        this.f16719a = i10;
        this.f16720b = mediaDataController;
        this.f16721c = str;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f16719a) {
            case 0:
                this.f16720b.lambda$fetchStickerSetInternal$41(this.f16721c, this.d);
                return;
            default:
                this.f16720b.lambda$verifyAnimatedStickerMessageInternal$69(this.f16721c, this.d);
                return;
        }
    }
}
