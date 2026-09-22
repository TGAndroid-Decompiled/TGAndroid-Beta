package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class a7 implements RequestDelegate {
    public final int f15648a;
    public final MediaDataController f15649b;
    public final String f15650c;

    public a7(MediaDataController mediaDataController, String str, int i10) {
        this.f15648a = i10;
        this.f15649b = mediaDataController;
        this.f15650c = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f15648a) {
            case 0:
                this.f15649b.lambda$verifyAnimatedStickerMessageInternal$70(this.f15650c, tLObject, tL_error);
                return;
            default:
                this.f15649b.lambda$fetchStickerSetInternal$42(this.f15650c, tLObject, tL_error);
                return;
        }
    }
}
