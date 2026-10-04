package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class o9 implements RequestDelegate {
    public final int f18758a;
    public final MediaDataController f18759b;
    public final String f18760c;

    public o9(MediaDataController mediaDataController, String str, int i10) {
        this.f18758a = i10;
        this.f18759b = mediaDataController;
        this.f18760c = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18758a) {
            case 0:
                this.f18759b.lambda$fetchStickerSetInternal$42(this.f18760c, tLObject, tL_error);
                return;
            default:
                this.f18759b.lambda$verifyAnimatedStickerMessageInternal$70(this.f18760c, tLObject, tL_error);
                return;
        }
    }
}
