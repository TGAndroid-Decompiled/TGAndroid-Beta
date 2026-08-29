package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class c7 implements RequestDelegate {
    public final int f19880a;
    public final MediaDataController f19881b;
    public final String f19882c;

    public c7(MediaDataController mediaDataController, String str, int i10) {
        this.f19880a = i10;
        this.f19881b = mediaDataController;
        this.f19882c = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19880a) {
            case 0:
                this.f19881b.lambda$verifyAnimatedStickerMessageInternal$70(this.f19882c, tLObject, tL_error);
                return;
            default:
                this.f19881b.lambda$fetchStickerSetInternal$42(this.f19882c, tLObject, tL_error);
                return;
        }
    }
}
