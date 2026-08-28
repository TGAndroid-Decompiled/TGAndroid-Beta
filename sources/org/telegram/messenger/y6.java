package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class y6 implements RequestDelegate {
    public final int f22213a;
    public final MediaDataController f22214b;
    public final String f22215c;

    public y6(MediaDataController mediaDataController, String str, int i9) {
        this.f22213a = i9;
        this.f22214b = mediaDataController;
        this.f22215c = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f22213a) {
            case 0:
                this.f22214b.lambda$verifyAnimatedStickerMessageInternal$70(this.f22215c, tLObject, tL_error);
                return;
            default:
                this.f22214b.lambda$fetchStickerSetInternal$42(this.f22215c, tLObject, tL_error);
                return;
        }
    }
}
