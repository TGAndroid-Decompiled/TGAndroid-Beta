package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class a7 implements RequestDelegate {
    public final int f15661a;
    public final MediaDataController f15662b;
    public final String f15663c;

    public a7(MediaDataController mediaDataController, String str, int i10) {
        this.f15661a = i10;
        this.f15662b = mediaDataController;
        this.f15663c = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f15661a) {
            case 0:
                this.f15662b.lambda$verifyAnimatedStickerMessageInternal$70(this.f15663c, tLObject, tL_error);
                return;
            default:
                this.f15662b.lambda$fetchStickerSetInternal$42(this.f15663c, tLObject, tL_error);
                return;
        }
    }
}
