package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class a7 implements RequestDelegate {
    public final int f15880a;
    public final MediaDataController f15881b;
    public final String f15882c;

    public a7(MediaDataController mediaDataController, String str, int i10) {
        this.f15880a = i10;
        this.f15881b = mediaDataController;
        this.f15882c = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f15880a) {
            case 0:
                this.f15881b.lambda$verifyAnimatedStickerMessageInternal$70(this.f15882c, tLObject, tL_error);
                return;
            default:
                this.f15881b.lambda$fetchStickerSetInternal$42(this.f15882c, tLObject, tL_error);
                return;
        }
    }
}
