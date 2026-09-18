package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class a7 implements RequestDelegate {
    public final int f15837a;
    public final MediaDataController f15838b;
    public final String f15839c;

    public a7(MediaDataController mediaDataController, String str, int i10) {
        this.f15837a = i10;
        this.f15838b = mediaDataController;
        this.f15839c = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f15837a) {
            case 0:
                this.f15838b.lambda$verifyAnimatedStickerMessageInternal$70(this.f15839c, tLObject, tL_error);
                return;
            default:
                this.f15838b.lambda$fetchStickerSetInternal$42(this.f15839c, tLObject, tL_error);
                return;
        }
    }
}
