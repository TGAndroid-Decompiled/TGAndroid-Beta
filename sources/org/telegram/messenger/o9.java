package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class o9 implements RequestDelegate {
    public final int f17200a;
    public final MediaDataController f17201b;
    public final String f17202c;

    public o9(MediaDataController mediaDataController, String str, int i10) {
        this.f17200a = i10;
        this.f17201b = mediaDataController;
        this.f17202c = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17200a) {
            case 0:
                this.f17201b.lambda$fetchStickerSetInternal$42(this.f17202c, tLObject, tL_error);
                return;
            default:
                this.f17201b.lambda$verifyAnimatedStickerMessageInternal$70(this.f17202c, tLObject, tL_error);
                return;
        }
    }
}
