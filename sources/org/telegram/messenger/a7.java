package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class a7 implements RequestDelegate {
    public final int f15869a;
    public final MediaDataController f15870b;
    public final String f15871c;

    public a7(MediaDataController mediaDataController, String str, int i10) {
        this.f15869a = i10;
        this.f15870b = mediaDataController;
        this.f15871c = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f15869a) {
            case 0:
                this.f15870b.lambda$verifyAnimatedStickerMessageInternal$70(this.f15871c, tLObject, tL_error);
                return;
            default:
                this.f15870b.lambda$fetchStickerSetInternal$42(this.f15871c, tLObject, tL_error);
                return;
        }
    }
}
