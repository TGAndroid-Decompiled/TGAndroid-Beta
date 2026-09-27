package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class a7 implements RequestDelegate {
    public final int f15874a;
    public final MediaDataController f15875b;
    public final String f15876c;

    public a7(MediaDataController mediaDataController, String str, int i10) {
        this.f15874a = i10;
        this.f15875b = mediaDataController;
        this.f15876c = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f15874a) {
            case 0:
                this.f15875b.lambda$verifyAnimatedStickerMessageInternal$70(this.f15876c, tLObject, tL_error);
                return;
            default:
                this.f15875b.lambda$fetchStickerSetInternal$42(this.f15876c, tLObject, tL_error);
                return;
        }
    }
}
