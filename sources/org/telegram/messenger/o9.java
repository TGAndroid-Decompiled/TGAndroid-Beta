package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class o9 implements RequestDelegate {
    public final int f18717a;
    public final MediaDataController f18718b;
    public final String f18719c;

    public o9(MediaDataController mediaDataController, String str, int i10) {
        this.f18717a = i10;
        this.f18718b = mediaDataController;
        this.f18719c = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18717a) {
            case 0:
                this.f18718b.lambda$fetchStickerSetInternal$42(this.f18719c, tLObject, tL_error);
                return;
            default:
                this.f18718b.lambda$verifyAnimatedStickerMessageInternal$70(this.f18719c, tLObject, tL_error);
                return;
        }
    }
}
