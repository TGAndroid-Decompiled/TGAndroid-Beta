package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class a7 implements RequestDelegate {
    public final int f15884a;
    public final MediaDataController f15885b;
    public final String f15886c;

    public a7(MediaDataController mediaDataController, String str, int i10) {
        this.f15884a = i10;
        this.f15885b = mediaDataController;
        this.f15886c = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f15884a) {
            case 0:
                this.f15885b.lambda$verifyAnimatedStickerMessageInternal$70(this.f15886c, tLObject, tL_error);
                return;
            default:
                this.f15885b.lambda$fetchStickerSetInternal$42(this.f15886c, tLObject, tL_error);
                return;
        }
    }
}
