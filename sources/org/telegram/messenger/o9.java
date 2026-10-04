package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class o9 implements RequestDelegate {
    public final int f18761a;
    public final MediaDataController f18762b;
    public final String f18763c;

    public o9(MediaDataController mediaDataController, String str, int i10) {
        this.f18761a = i10;
        this.f18762b = mediaDataController;
        this.f18763c = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18761a) {
            case 0:
                this.f18762b.lambda$fetchStickerSetInternal$42(this.f18763c, tLObject, tL_error);
                return;
            default:
                this.f18762b.lambda$verifyAnimatedStickerMessageInternal$70(this.f18763c, tLObject, tL_error);
                return;
        }
    }
}
