package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class a7 implements RequestDelegate {
    public final int f15865a;
    public final MediaDataController f15866b;
    public final String f15867c;

    public a7(MediaDataController mediaDataController, String str, int i10) {
        this.f15865a = i10;
        this.f15866b = mediaDataController;
        this.f15867c = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f15865a) {
            case 0:
                this.f15866b.lambda$verifyAnimatedStickerMessageInternal$70(this.f15867c, tLObject, tL_error);
                return;
            default:
                this.f15866b.lambda$fetchStickerSetInternal$42(this.f15867c, tLObject, tL_error);
                return;
        }
    }
}
