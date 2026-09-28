package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class o9 implements RequestDelegate {
    public final int f17184a;
    public final MediaDataController f17185b;
    public final String f17186c;

    public o9(MediaDataController mediaDataController, String str, int i10) {
        this.f17184a = i10;
        this.f17185b = mediaDataController;
        this.f17186c = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17184a) {
            case 0:
                this.f17185b.lambda$fetchStickerSetInternal$42(this.f17186c, tLObject, tL_error);
                return;
            default:
                this.f17185b.lambda$verifyAnimatedStickerMessageInternal$70(this.f17186c, tLObject, tL_error);
                return;
        }
    }
}
