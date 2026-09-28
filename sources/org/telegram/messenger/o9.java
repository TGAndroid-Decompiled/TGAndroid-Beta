package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class o9 implements RequestDelegate {
    public final int f17183a;
    public final MediaDataController f17184b;
    public final String f17185c;

    public o9(MediaDataController mediaDataController, String str, int i10) {
        this.f17183a = i10;
        this.f17184b = mediaDataController;
        this.f17185c = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17183a) {
            case 0:
                this.f17184b.lambda$fetchStickerSetInternal$42(this.f17185c, tLObject, tL_error);
                return;
            default:
                this.f17184b.lambda$verifyAnimatedStickerMessageInternal$70(this.f17185c, tLObject, tL_error);
                return;
        }
    }
}
