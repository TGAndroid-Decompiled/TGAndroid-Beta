package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class o9 implements RequestDelegate {
    public final int f19161a;
    public final MediaDataController f19162b;
    public final String f19163c;

    public o9(MediaDataController mediaDataController, String str, int i10) {
        this.f19161a = i10;
        this.f19162b = mediaDataController;
        this.f19163c = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19161a) {
            case 0:
                this.f19162b.lambda$fetchStickerSetInternal$42(this.f19163c, tLObject, tL_error);
                return;
            default:
                this.f19162b.lambda$verifyAnimatedStickerMessageInternal$70(this.f19163c, tLObject, tL_error);
                return;
        }
    }
}
