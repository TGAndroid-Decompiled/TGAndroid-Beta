package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class r9 implements RequestDelegate {
    public final int f17979a;
    public final MediaDataController f17980b;
    public final String f17981c;

    public r9(MediaDataController mediaDataController, String str, int i10) {
        this.f17979a = i10;
        this.f17980b = mediaDataController;
        this.f17981c = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17979a) {
            case 0:
                this.f17980b.lambda$fetchStickerSetInternal$42(this.f17981c, tLObject, tL_error);
                return;
            default:
                this.f17980b.lambda$verifyAnimatedStickerMessageInternal$70(this.f17981c, tLObject, tL_error);
                return;
        }
    }
}
