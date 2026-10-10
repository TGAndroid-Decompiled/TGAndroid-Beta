package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class o9 implements RequestDelegate {
    public final int f18721a;
    public final MediaDataController f18722b;
    public final String f18723c;

    public o9(MediaDataController mediaDataController, String str, int i10) {
        this.f18721a = i10;
        this.f18722b = mediaDataController;
        this.f18723c = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18721a) {
            case 0:
                this.f18722b.lambda$fetchStickerSetInternal$42(this.f18723c, tLObject, tL_error);
                return;
            default:
                this.f18722b.lambda$verifyAnimatedStickerMessageInternal$70(this.f18723c, tLObject, tL_error);
                return;
        }
    }
}
