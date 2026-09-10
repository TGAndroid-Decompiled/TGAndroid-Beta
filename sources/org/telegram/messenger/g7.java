package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class g7 implements RequestDelegate {
    public final int f15250a;
    public final MediaDataController f15251b;
    public final String f15252c;

    public g7(MediaDataController mediaDataController, String str, int i10) {
        this.f15250a = i10;
        this.f15251b = mediaDataController;
        this.f15252c = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f15250a) {
            case 0:
                this.f15251b.lambda$verifyAnimatedStickerMessageInternal$70(this.f15252c, tLObject, tL_error);
                return;
            default:
                this.f15251b.lambda$fetchStickerSetInternal$42(this.f15252c, tLObject, tL_error);
                return;
        }
    }
}
