package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class a7 implements RequestDelegate {
    public final int f15652a;
    public final MediaDataController f15653b;
    public final String f15654c;

    public a7(MediaDataController mediaDataController, String str, int i10) {
        this.f15652a = i10;
        this.f15653b = mediaDataController;
        this.f15654c = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f15652a) {
            case 0:
                this.f15653b.lambda$verifyAnimatedStickerMessageInternal$70(this.f15654c, tLObject, tL_error);
                return;
            default:
                this.f15653b.lambda$fetchStickerSetInternal$42(this.f15654c, tLObject, tL_error);
                return;
        }
    }
}
