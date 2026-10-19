package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class o9 implements RequestDelegate {
    public final int f19160a;
    public final MediaDataController f19161b;
    public final String f19162c;

    public o9(MediaDataController mediaDataController, String str, int i10) {
        this.f19160a = i10;
        this.f19161b = mediaDataController;
        this.f19162c = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19160a) {
            case 0:
                this.f19161b.lambda$fetchStickerSetInternal$42(this.f19162c, tLObject, tL_error);
                return;
            default:
                this.f19161b.lambda$verifyAnimatedStickerMessageInternal$70(this.f19162c, tLObject, tL_error);
                return;
        }
    }
}
