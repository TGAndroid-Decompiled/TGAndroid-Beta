package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class a7 implements RequestDelegate {
    public final int f15625a;
    public final MediaDataController f15626b;
    public final String f15627c;

    public a7(MediaDataController mediaDataController, String str, int i10) {
        this.f15625a = i10;
        this.f15626b = mediaDataController;
        this.f15627c = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f15625a) {
            case 0:
                this.f15626b.lambda$verifyAnimatedStickerMessageInternal$70(this.f15627c, tLObject, tL_error);
                return;
            default:
                this.f15626b.lambda$fetchStickerSetInternal$42(this.f15627c, tLObject, tL_error);
                return;
        }
    }
}
