package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class r9 implements RequestDelegate {
    public final int f18755a;
    public final MediaDataController f18756b;
    public final String f18757c;

    public r9(MediaDataController mediaDataController, String str, int i10) {
        this.f18755a = i10;
        this.f18756b = mediaDataController;
        this.f18757c = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18755a) {
            case 0:
                this.f18756b.lambda$fetchStickerSetInternal$42(this.f18757c, tLObject, tL_error);
                return;
            default:
                this.f18756b.lambda$verifyAnimatedStickerMessageInternal$70(this.f18757c, tLObject, tL_error);
                return;
        }
    }
}
