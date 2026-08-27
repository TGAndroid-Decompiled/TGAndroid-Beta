package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class a7 implements RequestDelegate {

    public final int f19681a;

    public final MediaDataController f19682b;

    public final String f19683c;

    public a7(MediaDataController mediaDataController, String str, int i10) {
        this.f19681a = i10;
        this.f19682b = mediaDataController;
        this.f19683c = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19681a) {
            case 0:
                this.f19682b.lambda$verifyAnimatedStickerMessageInternal$70(this.f19683c, tLObject, tL_error);
                break;
            default:
                this.f19682b.lambda$fetchStickerSetInternal$42(this.f19683c, tLObject, tL_error);
                break;
        }
    }
}
