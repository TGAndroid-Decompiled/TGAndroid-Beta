package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class a7 implements RequestDelegate {
    public final int f17158a;
    public final MediaDataController f17159b;
    public final String f17160c;

    public a7(MediaDataController mediaDataController, String str, int i10) {
        this.f17158a = i10;
        this.f17159b = mediaDataController;
        this.f17160c = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17158a) {
            case 0:
                this.f17159b.lambda$verifyAnimatedStickerMessageInternal$70(this.f17160c, tLObject, tL_error);
                return;
            default:
                this.f17159b.lambda$fetchStickerSetInternal$42(this.f17160c, tLObject, tL_error);
                return;
        }
    }
}
